<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo Add Form</title>
</head>
<body>
<h1>Todo Add Form</h1>
<form:form modelAttribute="todo" action="save" method="post">
<!-- fieldset>legend+p>label+form:select#category -->
<fieldset>
<legend>Add a Todo</legend>
<!-- (p>label+form:input#title)*3 -->
<p>
<label for="user">User Name:</label>
<form:input id="user" path="user" />
</p>
<p>
<label for="description">Description:</label>
<form:input id="description" path="description" />
</p>
<p>
<label for="targetDate">Target Date:</label>
<form:input id="targetDate" path="targetDate" />
</p>
<p>
<label for="starMeter">Star Meter:</label>
<form:input id="starMeter" path="starMeter" />
</p>
<!-- p#id>input#reset+input#submit -->
<p id="id">
<input type="reset" id="reset" />
<input type="submit" id="submit" value="Add Todo"/>
</p>
</fieldset>
</form:form>
</body>
</html>