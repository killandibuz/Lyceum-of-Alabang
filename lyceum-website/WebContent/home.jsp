<!DOCTYPE html>
<html>
<head>
  <!--Import Google Icon Font-->
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--Import materialize.css-->
  <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/materialize.min.css"  media="screen,projection"/>

  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

	<ul id="dropdown1" class="dropdown-content">
		<li><a href="#!">Settings</a></li>
		<li class="divider"></li>
		<li><a href="<%=request.getContextPath()%>/logout">Log out</a></li>
		<li class="divider"></li>
		<li><a href="#!">Anything</a></li>
	</ul>
	<nav>
		<div class="nav-wrapper white">
		  <a href="#!" class="brand-logo left"><img src="<%=request.getContextPath()%>/pictures/icon.png"> </a>
		  <ul class="right hide-on-med-and-down">
		    <li class="yellow darken-2"><a href="home.jsp" class="white-text text-darken-2">BOARD<i class="material-icons left">list</i></a></li>
		    <li><a href="grades.jsp" class="yellow-text text-darken-2">GRADES<i class="material-icons left">grade</i></a></li>
		    <li><a href="quiz.jsp" class="yellow-text text-darken-2">QUIZZES<i class="material-icons left">assignment</i></a></li>
		    <li><a href="message.jsp" class="yellow-text text-darken-2">MESSAGES<i class="material-icons left">email</i></a></li>
		    <li>
			    <a href="about.jsp" class="yellow-text text-darken-2 small dropdown-button" data-activates="dropdown1">
			    <img src="${pageContext.request.contextPath}/display_photos/${student.strDisplayPhoto}" class="circle" alt="picture" height="42" width="42" align="middle"></a>
		    </li>
		  </ul>
		</div>

		<script type="text/javascript">
		$( document ).ready(function){
			$(".dropdown-button").dropdown();        
		}
		</script>
	</nav>
</head>

<body class="blue-grey lighten-5">
	<div class="wrapper">  
		<header class="header yellow darken-2">
			<h4 class="white-text light col s12">CORK BOARD</h4>
		</header>  
		<article class="main">    
			<div class="col s12" style="margin: 10px;">
      

	      <div class="row white">
	        <form class="col s12">
	          <div class="row">
	            <div class="input-field col s12">
	              <textarea id="icon_prefix2" class="materialize-textarea" length="160"></textarea>
	              <label for="icon_prefix2">Post something...</label>
	            </div>

	            <div class="row">
	            	<div class="col s8">
	            		<div class="file-field input-field">
	            	     <div class="btn green">
	            	       <i class="material-icons">attach_file</i>
	            	       <input type="file" multiple>
	            	     </div>
	            	     <div class="file-path-wrapper">
	            	       <input class="file-path validate" type="text" placeholder="Upload one or more files">
	            	     </div>
	            	 </div>
	            	</div>
	            	<div class="col s4">
	            	<button class="waves-effect waves-dark btn-large" type="submit" name="action" align="bottom">Submit
	            	  <i class="material-icons right">send</i>
	            	</button>            	
	            	</div>
	            </div>
	          </div>
	        </form>
	      </div>
            
        <ul class="collection">
           <li class="collection-item avatar">
             <img src="${pageContext.request.contextPath}/display_photos/${student.strDisplayPhoto}" alt="" class="circle" width="42" height="42">
             <span class="title"><strong>Juan D. Makakamot</strong></span>
             <p>Ang kati kati na! Di ko na kaya! Urgh!<br>
                11:11pm, Jan 2, 2016
             </p>
             <div class="fixed-action-btn horizontal secondary-content">
                 <a class="btn-floating btn-large red">
                   <i class="material-icons large">mode_edit</i>
                 </a>
                 <ul>
                   <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li>
                   <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
                   <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
                   <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
                 </ul>
              </div>
           </li>
           <li class="collection-item avatar">
             <i class="material-icons circle">account_circle</i>
             <span class="title"><strong>Mariang Palad</strong></span>
             <p>Eto na oh <br>
                10:16pm, Jan 1, 2016
             </p>
             <img src="<%=request.getContextPath()%>/pictures/background1.jpg" height="50%" width="50%">
              <div class="fixed-action-btn horizontal secondary-content">
                 <a class="btn-floating btn-large red">
                   <i class="large material-icons">mode_edit</i>
                 </a>
                 <ul>
                   <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li>
                   <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
                   <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
                   <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
                 </ul>
              </div>
             
           </li>
           <li class="collection-item avatar">
             <i class="material-icons circle">account_circle</i>
             <span class="title">Title</span>
             <p>First Line <br>
                Second Line
             </p>
              <div class="fixed-action-btn horizontal secondary-content">
                 <a class="btn-floating btn-large red">
                   <i class="large material-icons">mode_edit</i>
                 </a>
                 <ul>
                   <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li>
                   <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
                   <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
                   <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
                 </ul>
              </div>
            
           </li>
           <li class="collection-item avatar">
             <i class="material-icons circle">account_circle</i>
             <span class="title">Title</span>
             <p>First Line <br>
                Second Line
             </p>
              <div class="fixed-action-btn horizontal secondary-content">
                 <a class="btn-floating btn-large red">
                   <i class="large material-icons">mode_edit</i>
                 </a>
                 <ul>
                   <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li>
                   <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
                   <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
                   <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
                 </ul>
              </div>
         
           </li>
           <li class="collection-item avatar">
             <i class="material-icons circle">account_circle</i>
             <span class="title">Title</span>
             <p>First Line <br>
                Second Line
             </p>
              <div class="fixed-action-btn horizontal secondary-content">
                 <a class="btn-floating btn-large red">
                   <i class="large material-icons">mode_edit</i>
                 </a>
                 <ul>
                   <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li>
                   <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
                   <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
                   <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
                 </ul>
              </div>
             
           </li>
           <li class="collection-item avatar">
             <i class="material-icons circle">account_circle</i>
             <span class="title">Title</span>
             <p>First Line <br>
                Second Line
             </p>
              <div class="fixed-action-btn horizontal secondary-content">
                 <a class="btn-floating btn-large red">
                   <i class="large material-icons">mode_edit</i>
                 </a>
                 <ul>
                   <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li>
                   <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
                   <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
                   <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
                 </ul>
              </div>
             
           </li>
           <li class="collection-item avatar">
             <i class="material-icons circle">account_circle</i>
             <span class="title">Title</span>
             <p>First Line <br>
                Second Line
             </p>
              <div class="fixed-action-btn horizontal secondary-content">
                 <a class="btn-floating btn-large red">
                   <i class="large material-icons">mode_edit</i>
                 </a>
                 <ul>
                   <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></a></li>
                   <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
                   <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
                   <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
                 </ul>
              </div>
             
           </li>
         </ul>
      </div>
		</article>  
		<aside class="aside aside-1 white">
			<div class="col s12 row">
			  <p>
			    <img src="${pageContext.request.contextPath}/display_photos/${student.strDisplayPhoto}" class="circle center-align" width="150" height="150" style="display: block; margin-left: auto; margin-right: auto;">
			  </p>
		
			  <h5 class="col s12 yellow-text text-darken-4 light">${student.name}</h5>
			  <h6 class="col s12 light">Student No: ${student.strStudentCode}</h6>
			  <h6 class="col s12 light"><strong>About</strong></h6>
			  <p class="col s12 light">
			    Wala lang, nagiisip pa ko ng ilalagay dito blah blash kahit ano basta
			  </p>
			</div>
		</aside>
		<aside class="aside aside-2">
			<h3 class="yellow-text text-darken-2 col s12 light">Tutorials</h3>
			<a class="col s12" href="#">
			  <i class="material-icons large center-align yellow-text text-darken-2 " style="display: block; margin-left: auto; margin-rght: auto;">live_tv</i>
			</a>
			<h5 class="col s12 light">Watch Video Tuorials Online!</h5>
		</aside>

  <style type="text/css">
  	@import "compass/css3";

  	.wrapper {
  	  display: -webkit-box;
  	  display: -moz-box;
  	  display: -ms-flexbox;
  	  display: -webkit-flex;
  	  display: flex;  
  	
  	  -webkit-flex-flow: row wrap;
  	  flex-flow: row wrap;
  	}

  	.wrapper > * {
  	  padding: 10px;
  	  flex: 1 100%;
  	}

  	.header {
  	  background: blue;
  	}

  	.main {
  	  text-align: left;
  	  background: transparent;
  	}

  	.aside-1 {
  	  background: green;
  	  width: 30px;
  	  margin: 10px;
  	}

  	.aside-2 {
  	  background: white;
  	  width: 70px;
  	  margin: 10px;
  	  text-align: center;

  	}


  	@media all and (min-width: 600px) {
  	  .aside { flex: 1 auto; }
  	}

  	@media all and (min-width: 800px) {
  	  .main    { flex: 3 0px; }
  	  .aside-1 { order: 1; } 
  	  .main    { order: 2; }
  	  .aside-2 { order: 3; }
  	  .footer  { order: 4; }
  	}

  
  </style>
  <!--Import jQuery before materialize.js-->
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="<%=request.getContextPath()%>/js/materialize.min.js"></script>
</body>
<footer class="footer page-footer yellow darken-2">
          <div class="container">
            <div class="row">
              <div class="col l6 s12 yellow darken-2">
                <h5 class="white-text">Follow us!</h5>
                <p class="grey-text text-lighten-4">Like, share, learn!</p>
              </div>
              <div class="col l4 offset-l2 s12 yellow darken-2">
                <h5 class="white-text">Links</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="#!">www.facebook.com/LyceumOfAlabang</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">www.twitter.com/@lyceumOfAlabang</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">www.LyceumofAlabang.edu</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">www.instagram.com/@LyceumOfAlabang</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
            (c) 2015 Copyright
            <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
            </div>
          </div>
  </footer>
</html>
        