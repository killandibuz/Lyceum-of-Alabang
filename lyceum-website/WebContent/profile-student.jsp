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
		<li><a href="#!">Log out</a></li>
		<li class="divider"></li>
		<li><a href="#!">Anything</a></li>
	</ul>
	<nav>
		<div class="nav-wrapper white">
		  <a href="#!" class="brand-logo left"><img src="<%=request.getContextPath()%>/pictures/icon.png" class="banner"> </a>
		  <ul class="right hide-on-med-and-down">
		    <li><a href="home-student.jsp" class="yellow-text text-darken-2">BOARD<i class="material-icons left">list</i></a></li>
		    <li><a href="grades.jsp" class="yellow-text text-darken-2">GRADES<i class="material-icons left">grade</i></a></li>
		    <li><a href="quiz.jsp" class="yellow-text text-darken-2">QUIZZES<i class="material-icons left">assignment</i></a></li>
		    <li><a href="message.jsp" class="yellow-text text-darken-2">MESSAGES<i class="material-icons left">email</i></a></li>
		    <li>
			    <a href="about.jsp" class="yellow-text text-darken-2 small dropdown-button" data-activates="dropdown1">
			    <img src="<%=request.getContextPath()%>/pictures/pictureSample.jpg" class="circle" alt="picture" height="42" width="42" align="middle"></a>
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
			<h3 class="white-text light" align="center">PROFILE</h3>
		</header>  
		<article class="main">    
			<div class="container">
        <div class="row">
          <form action="#" class="col s12">
              <div class="row">
                  <div class="col s12" align="center">
                    <img src="<%=request.getContextPath()%>/pictures/pictureSample.jpg" class="circle" width="300" height="300">
                  </div>

                  <div class="col s8" align="center">
                      <div class="file-field input-field">
                        <div class="btn">
                          <span>File</span>
                          <input type="file">
                        </div>
                        <div class="file-path-wrapper">
                          <input class="file-path validate" type="text">
                        </div>
                      </div>
                  </div>
              </div>

              <div class="row">
                <h3 class="light col s12">About</h3>
                <div class="input-field col s12">
                         <textarea id="textarea1" class="materialize-textarea"></textarea>
                         <label for="textarea1">Textarea</label>
                </div>
              </div>

              <div class="row">
                <h3 class="light col s12">Hobbies</h3>
                <div class="input-field col s12">
                         <textarea id="textarea1" class="materialize-textarea"></textarea>
                         <label for="textarea1">Textarea</label>
                </div>
              </div>
              
            </form>
        </div>   
      </div>
		</article>  

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
    .banner{
      width: 91%;
      height: 91%;
    }

  	.header{
      background-color: white;
    }

  	.main {
  	  text-align: left;
  	  background: white;
      margin: 10px;
      width: 100%;
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
  	  .main    { order: 1; }
  	  .aside-2 { order: 2; }
  	  .footer  { order: 3; }
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
        