<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Create an account</title>
<link href="<c:url value="/resources/home/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
</head>

<body>
	
	<div class="container">
		<c:url var="addAction" value="/addAccount"></c:url>
		<form:form action="${addAction}" method="POST" commandName="accForm"
			class="form-signin">
			<h2 class="form-signin-heading">Create your account</h2>

			<div class="form-group">
				<form:input type="text" path="userName" class="form-control"
					placeholder="Username" autofocus="true"></form:input>
				<form:errors path="userName"></form:errors>
			</div>


			<div class="form-group">
				<form:input type="password" path="passWord" class="form-control"
					placeholder="Password"></form:input>
				<form:errors path="passWord"></form:errors>
			</div>

			<div class="form-group">
				<form:input type="password" path="confirmPassword"
					class="form-control" placeholder="Confirm your password"></form:input>
				<form:errors path="confirmPassword" value="${error}"></form:errors>
			</div>

			<div class="form-group">
				<form:input type="email" path="emailAddress" class="form-control"
					placeholder="Email Address"></form:input>
			</div>

			<div class="form-group">
				<form:select path="roles.roleId" class="form-control">
					<c:forEach var="role" items="${listRole}">
						<form:option value="${role.roleId }">
							<c:out value="${role.roleName}" />
						</form:option>
					</c:forEach>
				</form:select>
			</div>

			<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
		</form:form>

	</div>
	<!-- /container -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>