<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DASHBOARD</title>
<meta name="description" content="School Management Sign-in page">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="links.jsp"%>
</head>
<body>
	<%@include file="header.jsp"%>
	<!-- ============================================================== -->
	<!-- ADD STUDENT -->
	<!-- ============================================================== -->
	<div class="content mt-3">
		<div class="animated fadeIn">
			<div class="row">
				<!-- Students Count -->
				<div class="col-xl-3 col-lg-6">
					<div class="card">
						<div class="card-body">
							<div class="stat-widget-one">
								<div class="stat-icon dib">
									<i class="ti-user text-success border-success"></i>
								</div>
								<div class="stat-content dib">
									<div class="stat-text">
										<a href="studenthome.htm"><strong class="text-success">Total Students</strong></a>
									</div>
									<div class="stat-digit">${totalStudent}</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- End Student Count -->
				<!-- Staff Count -->
				<div class="col-xl-3 col-lg-6">
					<div class="card">
						<div class="card-body">
							<div class="stat-widget-one">
								<div class="stat-icon dib">
									<i class="ti-user text-primary border-primary"></i>
								</div>
								<div class="stat-content dib">
									<div class="stat-text">
										<a href="#"><strong class="text-primary">Total Staff</strong></a>
										</div>
									<div class="stat-digit">10</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- End Staff Count -->
			</div>
		</div>
	</div>
</body>
</html>