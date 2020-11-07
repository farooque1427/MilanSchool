<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGN-IN</title>
<meta name="description" content="School Management Sign-in page">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="links.jsp"%>
</head>
<body class="bg-dark"
	style="background-image: url('smsbackground.jpg'); background-attachment: fixed;">
	<div class="sufee-login d-flex align-content-center flex-wrap">
		<div class="container">
			<div class="login-logo" style="margin-top: 50px">
				<h2 class="text-white"
					style="font-family: Stencil; font-size: 250%;">Mohammadiya
					Urdu Primary School Kannad.</h2>
			</div>
			<div class="col-md-6 offset-md-3">
				<div class="login-content"
					style="background-color: rgba(0, 0, 0, 50%)">
					<div class="login-form col-8 offset-md-2 "
						style="background-color: rgba(0, 0, 0, 50%)">
						<form action="signin.htm" method="post">
							<div class="register-link m-t-15 text-center">
								<h3 class="text text-white" style="font-family: Stencil;">LOGIN</h3>
							</div>
							<hr>
							<div>${message}</div>
							<div class="form-group">
								<label class="text text-white">User Name</label> <input
									name="username" type="text" class="form-control"
									required="required" placeholder="User Name">
							</div>
							<div class="form-group">
								<label class="text text-white">Password</label> <input
									name="password" type="password" class="form-control"
									required="required" placeholder="Password">
							</div>
							<div class="checkbox">
								<label class="text text-white"> <input type="checkbox">
									Remember Me
								</label> <label class="pull-right"> <a href="#">Forgotten
										Password?</a>
								</label>

							</div>
							<button type="submit" class="btn btn-primary">Sign in</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
