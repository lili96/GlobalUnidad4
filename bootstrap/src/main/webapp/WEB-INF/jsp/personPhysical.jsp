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
					<li><a href="new-personPhysical">New Person Physical</a></li>
					<li><a href="all-personPhysicals">All Person Physcials</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Person Physical Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_PERSONPHYSICALS'}">
			<div class="container text-center" id="personPhysicalsDiv">
				<h3>My PERSON PHYSICALS</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Opt Blood Type</th>
								<th>Height</th>
								<th>Weight</th>
								<th>Opt Eye Color</th>
								<th>Opt Skin Color</th>
								<th>Opt Hair Color</th>
								<th>Injuries</th>
								<th>Comments</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="personPhysical" items="${personPhysicals}">
								<tr>
									<td>${personPhysical.id}</td>
									<td>${personPhysical.optBloodType}</td>
									<td>${personPhysical.height}</td>
									<td>${personPhysical.weight}</td>
									<td>${personPhysical.optEyeColor}</td>
									<td>${personPhysical.optSkinColor}</td>
									<td>${personPhysical.optHairColor}</td>
									<td>${personPhysical.injuries}</td>
									<td>${personPhysical.comments}</td>
							
									
									<td><a href="update-personPhysical?id=${personPhysical.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-personPhysical?id=${personPhysical.id}"> <span
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
				<h3>Manage Person Physical</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-personPhysical">
					<input type="hidden" name="id" value="${personPhysical.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">Opt Blood Type:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="optBloodType"
								value="${personPhysical.optBloodType}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Height:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="height"
								value="${personPhysical.height}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">Weight:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="weight"
								value="${personPhysical.weight}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Opt Eye Color:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="optEyeColor"
								value="${personPhysical.optEyeColor}" />
						</div>
					</div>
					
						<div class="form-group">
						<label class="control-label col-sm-3">Opt Skin Color:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="optSkinColor"
								value="${personPhysical.optSkinColor}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Opt Hair Color:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="optHairColor"
								value="${personPhysical.optHairColor}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Injuries:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="injuries"
								value="${personPhysical.injuries}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Comments:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="comments"
								value="${personPhysical.comments}" />
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