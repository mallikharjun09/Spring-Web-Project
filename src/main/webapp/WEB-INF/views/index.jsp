<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
  <div class="container">
	<h2 class="bg-danger text-white text-center">List of Books</h2>
	<table class="table-bordered border-danger ">
		<thead class="text-danger">
		   <tr>
			<th class="text-center p-2">Product Id</th>
			<th class="text-center p-2">Product Name</th>
			<th class="text-center p-2">Product Cost</th>
			</tr>
		</thead>
		<tbody class="table-striped">
	<c:forEach var="p" items="${pros}">
		<tr>
			<td class="text-center p-2">${p.productId}</td>
			<td class="p-2">${p.productName}</td>
			<td class="text-center p-2">${p.productCost}</td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
</body>
</html>