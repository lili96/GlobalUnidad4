<%@page language="java" contentType="text/html; charset=UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>Boot Sample | Home</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Bootsample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-location">New Location</a></li>
					<li><a href="all-locations">All Locations</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Location Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_LOCATIONS'}">
			<div class="container text-center" id="locationsDiv">
				<h3>My Locations</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Parent</th>
								<th>Opt Location Type</th>
								<th>Name</th>
								<th>Iso Code</th>
								<th>Description</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="location" items="${locations}">
								<tr>
									<td>${location.id}</td>
									<td>${location.parent}</td>
									<td>${location.optLocationType}</td>
									<td>${location.name}</td>
									<td>${location.isoCode}</td>
									<td>${location.description}</td>
									
									<td><a href="update-location?id=${location.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-location?id=${location.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Location</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-location">
					<input type="hidden" name="id" value="${location.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">Parent:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="parent"
								value="${location.parent}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Opt Location Type:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="optLocationType"
								value="${location.optLocationType}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Name:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="name"
								value="${location.name}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">IsoCode:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="isoCode"
								value="${location.isoCode}" />
						</div>
					</div>
					
						<div class="form-group">
						<label class="control-label col-sm-3">Description:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="description"
								value="${location.description}" />
						</div>
					</div>
					
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>

				</form>
			</div>
		</c:when>
	</c:choose>
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
</body>
</html>