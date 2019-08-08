<!DOCTYPE html>
<html>
<head>
<style>
<!--
body,td,th{
font-family: "宋体",Arial;
font-size: 12px;
}
table {
	border-collapse: collapse;
}

th, td {
	border: 1px solid gray;
}
-->
</style>
</head>
<body>
	<table align="center" border="0" cellpadding="10" cellspacing="0"
		style="border: 1px solid black; width: 60%;margin-top: 100px">	
		<tr>
			<td>${errorDescription.errorStatus}</td>
		</tr>
		<tr>
			<td>${errorDescription.errorType}</td>
		</tr>
		<tr>
			<td>${errorDescription.errorMessage}</td>
		</tr>
	</table>
</body>
</html>