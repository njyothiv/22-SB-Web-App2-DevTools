<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Book Data </h2>


<p> Book Id: ${book.bookId} </p>

<br>
<p> Book Name: ${book.bookName} </p>
<br>
<p> Book Price: ${book.bookPrice} </p>



<table border="1">
<tr>
	<th> Book Id </th>
	<th> Book Name </th>
	<th> Book Price </th>
</tr>
	
		<tr>
			<td> ${booksList.get(0).bookId}	</td>
			<td> ${booksList.get(0).bookName}	</td>
			<td> ${booksList.get(0).bookPrice}	</td>
		</tr>			


		<tr>
			<td> ${booksList.get(1).bookId}	</td>
			<td> ${booksList.get(1).bookName}	</td>
			<td> ${booksList.get(1).bookPrice}	</td>
		</tr>			

		<tr>
			<td> ${booksList.get(2).bookId}	</td>
			<td> ${booksList.get(2).bookName}	</td>
			<td> ${booksList.get(2).bookPrice}	</td>
		</tr>			

		<tr>
			<td> ${booksList.get(3).bookId}	</td>
			<td> ${booksList.get(3).bookName}	</td>
			<td> ${booksList.get(3).bookPrice}	</td>
		</tr>			

</table>
</body>
</html>