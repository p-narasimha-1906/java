<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Reports Applications</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3 class="pb-3 pt-3">Reports Applications</h3>
		<form:form action="search" modelAttribute="req" method="POST">
			<table>
				<tr>
					<td>PlanName:</td>
					<td><form:select path="planName">
							<form:option value="">-select-</form:option>
							<form:options items="${names}" />
						</form:select></td>

					<td>PlanStatus:</td>
					<td><form:select path="planStatus">
							<form:option value="">-select-</form:option>
							<form:options items="${status}" />
						</form:select></td>

					<td>Gender:</td>
					<td><form:select path="gender">
							<form:option value="">-select-</form:option>
							<form:option value="Male">-Male-</form:option>
							<form:option value="Female">-Female-</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td class="pd-3 pt-3">StartDate:</td>
					<td class="pd-3 pt-3"><form:input type="date" path="startDate" /></td>

					<td class="pd-3 pt-3">EndDate:</td>
					<td class="pd-3 pt-3"><form:input type="date" path="endDate" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Search"
						class="btn btn-primary" /></td>
				</tr>
			</table>
		</form:form>
		<hr />
		<table class="table table-white table-hover">
			<thead>
				<tr>
					<th>S.No</th>
					<th>CitizenName</th>
					<th>PlanName</th>
					<th>PlanStatus</th>
					<th>Gender</th>
					<th>StartDate</th>
					<th>EndDate</th>
					<th>BenifitAmt</th>
					<th>TerminatedDate</th>
					<th>TerminatedReason</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${plans}" var="plan" varStatus="index">
					<tr>
						<td>${index.count}</td>
						<td>${plan.citizenName}</td>
						<td>${plan.planName}</td>
						<td>${plan.planStatus}</td>
						<td>${plan.gender}</td>
						<td>${plan.planStartDate}</td>
						<td>${plan.planEndDate}</td>
						<td>${plan.benifitAmt}</td>
						<td>${plan.denialReason}</td>
						<td>${plan.terminatedDate}</td>
						<td>${plan.terminatedReason}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr />
		Export:<a href="">Excel</a> <a href="">Pdf</a>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>