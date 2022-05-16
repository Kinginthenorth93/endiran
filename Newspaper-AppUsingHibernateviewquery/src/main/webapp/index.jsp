<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
<header style="color: navy;margin: 0% ; text-align: center">
<h1>Welcome to Newspaper Application</h1>
</header>
<pre>
<form action="news.abc">
Name:<input type="text" name="NewspaperName" placeholder="EnterNewspaperName"><br>
Price:<input type="text" name="Price" placeholder="EnterPrice"><br>
Language:<input type="text" name="Language" placeholder="EnterLanguage"><br>
No of pages:<input type="text" name="Noofpages" placeholder="EnterPagenumer"><br>

<input type="Submit" value="Save" style="color: red;background-color: black">
</form>
</pre>
<form action="searchNewspaper.abc">
<label>SearchNewspaperDetailsbyNewspaper name:</label>
<input type="text" name="searchNewspaper">
<input type="submit" value="searchNewspaper" style="color: green">


<a href="getAllNewspaper.abc">viewNewspaperDetails</a> <br>


</form>


</body>
</html>