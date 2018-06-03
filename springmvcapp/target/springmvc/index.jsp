<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
	<form:form method="post" modelAttribute="myUserBean">
				<label class="col-sm-2 control-label">UserName</label>
				<div class="col-sm-10">
					<form:input path="fname" type="text" class="form-control " id="name" placeholder="Name" />
				</div>

				<label class="col-sm-2 control-label">Password</label>
				<div class="col-sm-10">
					<form:input path="lname" type="text" class="form-control " id="name" placeholder="Name" />
				</div>
		
		
   </form:form>
    </body>
</html>

