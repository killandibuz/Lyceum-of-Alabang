package com.lyceum.actions.home;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
 
public class FileUploadAction extends ActionSupport implements
        ServletRequestAware,Action {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File userImage;
    private String userImageContentType;
    private String userImageFileName;
 
    private ServletRequest servletRequest;
 
	public String execute() {
        try {
        	System.out.println("HERE AT UPLOADACTION..."+File.separator);
            String filePath = servletRequest.getServletContext().getRealPath(File.separator);
            System.out.println("Server path:" + filePath);
            File fileToCreate = new File(filePath, this.userImageFileName);
 
            FileUtils.copyFile(this.userImage, fileToCreate);
        } catch (Exception e) {
        	addActionError(e.getMessage());
            e.printStackTrace();
 
            return INPUT;
        }
        return SUCCESS;
    }
 
    public File getUserImage() {
        return userImage;
    }
 
    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }
 
    public String getUserImageContentType() {
        return userImageContentType;
    }
 
    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }
 
    public String getUserImageFileName() {
        return userImageFileName;
    }
 
    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		this.servletRequest = servletRequest;
	}
}
