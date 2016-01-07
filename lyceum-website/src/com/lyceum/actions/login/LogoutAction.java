package com.lyceum.actions.login;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class LogoutAction implements Action, SessionAware{

	private Map<String,Object>sessionMap;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		sessionMap.clear();
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		// TODO Auto-generated method stub
		this.sessionMap = sessionMap;
	}

}