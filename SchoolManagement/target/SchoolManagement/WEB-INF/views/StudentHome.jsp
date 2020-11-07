<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT HOME</title>
<meta name="description" content="School Management Sign-in page">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="links.jsp"%>
</head>
<body>
<!-- ============================================================== -->
	<!-- main wrapper -->
<!-- ============================================================== -->
	<%@include file="header.jsp"%>
	<!-- ============================================================== -->
			<!-- Blank Page -->
	<!-- ============================================================== -->
	        <div class="content mt-3">
            <div class="animated fadeIn">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card scroll">
                            <div class="card-header bg-dark">
                                <strong class="card-title text-light">Student List</strong>
                                <div class="col col-md-2 float-right">
                                	<a href="addstudent.htm" class="form-control form-control-sm bg-success text-white mx-auto">Add New Student</a>
                                </div>
                            </div>
                            <div class="card-body">
                                <table id="bootstrap-data-table-export" class="table table-striped table-bordered">
                                	<thead>
                                        <tr>
                                        	<th>GR No.</th>
                                            <th>First Name</th>
                                            <th>Middle Name</th>
                                            <th>Last Name</th>
                                            <th>Gender</th>
                                            <th>Class</th>
                                            <th>City</th>
                                        </tr>
                                    </thead>
                                    <tbody id="tableBody">
                                    	<c:forEach items="${students}" var="row">               
    										<tr>
                                        		<td>${row.studGeneralNo }</td>
                                            	<td>${row.firstName }</td>
                                            	<td>${row.middleName }</td>
                                            	<td>${row.lastName }</td>
                                            	<td>${row.gender }</td>
                                            	<td>${row.admissionClass }</td>
                                            	<td>${row.address.city }</td>
                                        	</tr>
     									 </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!-- .animated -->
        </div><!-- .content -->

    <!-- Right Panel -->
    <script src="vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="vendors/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="vendors/datatables.net-buttons-bs4/js/buttons.bootstrap4.min.js"></script>
    <script src="vendors/jszip/dist/jszip.min.js"></script>
    <script src="vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="vendors/pdfmake/build/vfs_fonts.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.colVis.min.js"></script>
    <script src="assets/js/init-scripts/data-table/datatables-init.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    

</body>
</html>