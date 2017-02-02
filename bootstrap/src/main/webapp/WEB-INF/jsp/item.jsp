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
					<li><a href="new-item">New Item</a></li>
					<li><a href="all-items">All Items</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Item</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_ITEMS'}">
			<div class="container text-center" id="itemsDiv">
				<h3>My Items</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Unit</th>
								<th>Type</th>
								<th>Barcode</th>
								<th>Maximun</th>
								<th>Minimun</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${items}">
								<tr>
									<td>${item.id}</td>
									<td>${item.name}</td>
									<td>${item.unit}</td>
									<td>${item.type}</td>
									<td>${item.barcode}</td>
									<td>${item.maximum}</td>
									<td>${item.minimum}</td>
									
									<td><a href="update-item?id=${item.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-item?id=${item.id}"> <span
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
				<h3>Manage Item</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-item">
					<input type="hidden" name="id" value="${item.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">Name:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="name"
								value="${item.name}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">Unit:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="unit"
								value="${item.unit}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-3">type:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="type"
								value="${item.type}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Barcode:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="barcode"
								value="${item.barcode}" />
						</div>
					</div>
					
						<div class="form-group">
						<label class="control-label col-sm-3">Maximun:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="maximum"
								value="${item.maximum}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">Minimum:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="minimum"
								value="${item.minimum}" />
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