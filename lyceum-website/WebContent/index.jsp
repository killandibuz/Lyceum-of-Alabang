<!DOCTYPE html>
<html>
<head>
  <!--Import Google Icon Font-->
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--Import materialize.css-->
  <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/materialize.min.css"  media="screen,projection"/>

  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

	<nav>
		<div class="nav-wrapper white">
		  <a href="#!" class="brand-logo left"><img src="<%=request.getContextPath()%>/pictures/icon.png"> </a>
		  <ul class="right hide-on-med-and-down">
		    <li><a href="about.jsp" class="yellow-text text-darken-2"><i class="material-icons left">info</i>ABOUT</a></li>
		  </ul>
		</div>
	</nav>
 
</head>

<body>
<p id="prelude">
	<h1 class="white-text light" style="text-shadow: 2px 2px 8px #000000;">Physical Education</h1>
	<h5 class="grey-text text-lighten-3 light" style="text-shadow: 2px 2px 4px #000000;">Learn through your computer!</h5>
	<br><br><br><br><br><br><br><br><br><br><br>
</p>

	<div class="row white z-depth-4" id="LogInBg">
		<h4 class="col s12 yellow-text text-darken-2"> Log In</h4>
		<form class="col s12">
			<div class="row">
				<div class="input-field col s12">
					<input id="first_name" type="text" class="validate">
					<label for="first_name">Username</label>
				</div>

				<div class="input-field col s12">
					<input id="last_name" type="password" class="validate">
					<label for="last_name">Password</label>
				</div>

				<div class="col s6">
					<a class="waves-effect waves-light btn light-green darken-3" href="student-sign-up.jsp"><i class="material-icons right">assignment</i>register</a>
				</div>

				<div class="col s6">
					<button class="btn waves-effect waves-light" type="submit" name="action">LOG IN
					<i class="material-icons right">send</i>
					</button>
				</div>

				<div class="col s12">
					<p>
						
					</p>
				</div>

				<div class="col s12">
					<a href="#">Forgot password?</a>
				</div>
			</div>
		</form>
	</div>

	<div class="row white" id="icons">
	  <div class="col s12 m4">
	    <div class="icon-block">
	      <h2 class="center yellow-text text-darken-2"><i class="material-icons large">flash_on</i></h2>
	      <h5 class="center">Speeds up development</h5>

	      <p class="light">We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.</p>
	    </div>
	  </div>

	  <div class="col s12 m4">
	    <div class="icon-block">
	      <h2 class="center yellow-text text-darken-2"><i class="material-icons large">group</i></h2>
	      <h5 class="center">User Experience Focused</h5>

	      <p class="light">By utilizing elements and principles of Material Design, we were able to create a framework that incorporates components and animations that provide more feedback to users. Additionally, a single underlying responsive system across all platforms allow for a more unified user experience.</p>
	    </div>
	  </div>

	  <div class="col s12 m4">
	    <div class="icon-block">
	      <h2 class="center yellow-text text-darken-2"><i class="material-icons large">settings</i></h2>
	      <h5 class="center">Easy to work with</h5>

	      <p class="light">We have provided detailed documentation as well as specific code examples to help new users get started. We are also always open to feedback and can answer any questions a user may have about Materialize.</p>
	    </div>
	  </div>
	</div>

	<style type="text/css">
	 body {
	 	background-size: cover;
	    background-image:url('<%=request.getContextPath()%>/pictures/Login2.jpg');
	    background-repeat: no-repeat;
	    background-attachment: fixed;
	}


	#LogInBg{
		border-radius: 10px;
		width: 600px;
		height: 300px;
		position: absolute;
		right: 0;
		top: 20%;
	}

	#prelude{
		position: absolute;
		left: 5%;

	}

	</style>
  <!--Import jQuery before materialize.js-->
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="js/materialize.min.js"></script>
</body>
<footer class="page-footer yellow darken-2">
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
        