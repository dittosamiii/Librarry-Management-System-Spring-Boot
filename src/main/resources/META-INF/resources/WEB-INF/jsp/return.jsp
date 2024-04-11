<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="style/style.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@ include file="common/header.jspf"%>

<div class="container">
	<form:form method="post" modelAttribute="fine">
		<h2>Return Form:</h2>
			Issue Date: <form:input type="date" path="issueDate"
			required="required" />
			Return Date: <form:input type="date" path="returnDate"
			required="required" />
			Returned Date: <form:input type="date" path="returnedDate"
			required="required" />
		<pre>${errorMessage}</pre>
		<br>
		<input type="submit" class="btn btn-success" />
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>