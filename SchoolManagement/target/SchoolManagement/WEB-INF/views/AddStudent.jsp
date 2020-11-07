<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD NEW STUDENT</title>
<meta name="description" content="School Management Sign-in page">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="links.jsp"%>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
</head>
<body onload="getAllClasses();">
	<!-- ============================================================== -->
	<!-- main wrapper -->
	<!-- ============================================================== -->
	<%@include file="header.jsp"%>
	<!-- ============================================================== -->
	<!-- ADD STUDENT -->
	<!-- ============================================================== -->
	<div class="content mt-3">
		<div class="animated fadeIn">
			<div>
				${ErrorMsg}
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="card shadow">
						<div class="card-header bg-dark">
							<strong class="card-title text-light">Student Profile</strong>
						</div>
						<div class="card-body">
							<form action="addnewstudent.htm" method="post">
								<div class="col col-sm-9 col-md-9 col-lg-9">
									<!-- ROW -->
									<div class="row">
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="studGeneralNo">*General Number:</label> 
											<input type="text" class="form-control form-control-sm" name="studGeneralNo" id="studGeneralNo" required="required">
										</div>
										<div class="col col-sm-12 col-md-6 col-lg-6">
											<label for="saralId">Student Saral ID:</label> 
											<input type="text" class="form-control form-control-sm" name="saralId" id="saralId">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="admissionDate">Admission Date.</label> 
											<input type="date" class="form-control form-control-sm" name="admissionDate" id="admissionDate">
										</div>
									</div>
									<!-- ROW END -->
									<!-- ROW -->
									<div class="row mt-4">
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="firstName">First Name:</label>
											<input type="text" class="form-control form-control-sm" name="firstName" id="firstName">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="middleName">Middle Name:</label> 
											<input type="text" class="form-control form-control-sm" name="middleName" id="middleName">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="lastName">Last Name:</label> 
											<input type="text" class="form-control form-control-sm" name="lastName" id="lastName">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="motherName">Mother Name:</label> 
											<input type="text" class="form-control form-control-sm" name="motherName" id="motherName">
										</div>
									</div>
									<!-- ROW END -->
									<!-- ROW -->
									<div class="row mt-3">
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="birthDate">D.O.B.</label> 
											<input type="date" class="form-control form-control-sm" name="birthDate" id="birthDate">
										</div>
										<div class="col col-sm-12 col-md-6 col-lg-6">
											<label for="dobInWords">D.O.B(in words):</label> 
											<input type="text" class="form-control form-control-sm" name="dobInWords" id="dobInWords">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="birthPlace">Birth Place:</label> 
											<input type="text" class="form-control form-control-sm" name="birthPlace" id="birthPlace">
										</div>
									</div>
									<!-- ROW END -->
									<!-- ROW -->
									<div class="row mt-3">
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="gender">Gender:</label> 
											<select class="form-control form-control-sm" name="gender" id="gender">
												<option value="Male">Male</option>
												<option value="Female">Female</option>
											</select>
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="religion">Religion:</label>
											<select class="form-control form-control-sm" name="religion" id="religion">
												<option value="Budh">Budh</option>
												<option value="Chirstion">Chirstion</option>
												<option value="Hindu">Hindu</option>
												<option value="Jain">Jain</option>
												<option value="Muslim">Muslim</option>
												<option value="Sikh">Sikh</option>
											</select>
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="castCategory">Category:</label> 
											<select class="form-control form-control-sm" name="castCategory" id="castCategory">
												<option value="SC">SC</option>
												<option value="ST">ST</option>
												<option value="NT">NT</option>
												<option value="VJ">VJ</option>
												<option value="OBC">OBC</option>
												<option value="SBC">SBC</option>
												<option value="Mino">Mino</option>
												<option value="Other">Other</option>
											</select>
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="nationality">Nationality:</label> 
											<input type="text" class="form-control form-control-sm" name="nationality" id="nationality" value="Indian">
										</div>
									</div>
									<!-- ROW END -->
									<!-- ROW -->
									<div class="row mt-4">
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="mobileNumber1">Mobile Number #1:</label> 
											<input type="text" class="form-control form-control-sm" name="mobileNumber1" id="mobileNumber1">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="mobileNumber2">Mobile Number #2:</label> 
											<input type="text" class="form-control form-control-sm" name="mobileNumber2" id="mobileNumber2">
										</div>
									</div>
									<!-- ROW END -->
									<!-- ROW -->
									<div class="row mt-4">
										<div class="col col-sm-12 col-md-6 col-lg-6">
											<label for="lastSchool">Last School Name:</label> 
											<input type="text" class="form-control form-control-sm" name="lastSchool" id="lastSchool">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="admissionClass">Admission Class:</label> 
											<select class="form-control form-control-sm" name="admissionClass" id="admissionClass">
											</select>
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="classDivision">Class Division:</label> 
											<select class="form-control form-control-sm" name="classDivision" id="classDivision">
												<option value="A">A</option>
												<option value="B">B</option>
												<option value="C">C</option>
											</select>
										</div>
									</div>
									<!-- ROW END -->
									<!-- ROW -->
									<div class="row mt-4">
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="address1">Address #1:</label> 
											<input type="text" class="form-control form-control-sm" name="address1" id="address1">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="address2">Address #2:</label> 
											<input type="text" class="form-control form-control-sm" name="address2" id="address2">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="city">City:</label> 
											<input type="text" class="form-control form-control-sm" name="city" id="city">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="pinCode">Pin Code:</label> 
											<input type="text" class="form-control form-control-sm" name="pinCode" id="pinCode">
										</div>
									</div>
									<!-- ROW END -->
									<!-- ROW -->
									<div class="row mt-4">
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="accHolder">Acc. Holder:</label> 
											<input type="text" class="form-control form-control-sm" name="accHolder" id="accHolder">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="bankAccNo">Bank Acc. No. :</label> 
											<input type="text" class="form-control form-control-sm" name="bankAccNo" id="bankAccNo">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="bankBranch">Bank Branch:</label> 
											<input type="text" class="form-control form-control-sm" name="bankBranch" id="bankBranch">
										</div>
										<div class="col col-sm-12 col-md-3 col-lg-3">
											<label for="bankIFSC">Bank IFSC:</label> 
											<input type="text" class="form-control form-control-sm" name="bankIFSC" id="bankIFSC">
										</div>
									</div>
									<!-- ROW END -->
								</div>
								<div class="col col-sm-3 col-md-3 col-lg-3">
									<div class="row h-50">
										<label class="mx-auto">Student Photo</label>
									</div>
									<div class="row mx-auto">
										<div class="col col-10 mx-auto border" style="height: 190px">
											<img src="" id="profile-img-tag" class="mx-auto" style="height: 100%; width: auto">
										</div>
									</div>
									<div class="row mt-2">
										<div class="col">
											<input type='file' name="file" id="profile-img" class="form-control-file mt-6 form-control-sm" />
										</div>
									</div>
								</div>
								<div class="col col-xs-12 col-sm-12 col-md-12 col-lg-12">
									<!-- ROW -->
									<div class="row mt-4">
										<div class="col col-sm-12 col-md-12 col-lg-12">
											<div class="col col-2 float-right">
												<input type="submit" class="form-control form-control-sm float-right bg-success text-white">
											</div>
										</div>
									</div>
									<!-- ROW END -->
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- .animated -->
	</div>
	<!-- .content -->
	</div>
	<!-- ============================================================== -->
	<!-- Right Panel -->
	<!-- ============================================================== -->
	<script type="text/javascript">
		//function to get all classes.
		function getAllClasses(){
			$.get("getAllClasses.htm", function(responseJson) {
				console.log(responseJson);
		        var $select = $("#admissionClass");
		        $select.find("option").remove();  
		        $.each(responseJson.allStudents, function(index, category) {
		        $("<option>").val(category.ClassID).text(category.Class).appendTo($select);
		        });                   
		 
		    });

			}
		//function to change profile pic.
		function readURL(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();
				reader.onload = function(e) {
					$('#profile-img-tag').attr('src', e.target.result);
				}
				reader.readAsDataURL(input.files[0]);
			}
		}
		$("#profile-img").change(function() {
			readURL(this);
		});

		$("#birthDate").change(function() {
			var dob = $("#birthDate").val();
			
		});
	</script>
	<script>
    $(document).on("click", "#buttonLoad", function() {
    
    });
</script>
</body>
</html>