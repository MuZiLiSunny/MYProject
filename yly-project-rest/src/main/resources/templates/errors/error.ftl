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
			<th colspan="2" style="color: red;">出错了</th>
		</tr>
		<tr>
			<th nowrap="nowrap">错误类型</th>
			<td>${errorDescription.errorType}</td>
		</tr>
		<tr>
			<th nowrap="nowrap">错误类</th>
			<td>${errorDescription.errorClass}</td>
		</tr>
		<tr>
			<th nowrap="nowrap">错误码</th>
			<td>${errorDescription.errorCode}</td>
		</tr>
		<#if errorDescription.validationErrors??>
		<tr>
			<th nowrap="nowrap">校验信息</th>
			<td>${errorDescription.validationErrors}</td>
		</tr>
		</#if>
		<tr>
			<th nowrap="nowrap">错误信息</th>
			<td>${errorDescription.errorMessage}</td>
		</tr>
		<tr>
			<th nowrap="nowrap">错误描述</th>
			<td>${errorDescription.errorDescription?replace("\n","<BR/>")}</td>
		</tr>
		<tr>
			<th nowrap="nowrap">错误堆栈</th>
			<td>${errorDescription.errorStackTrace}</td>
		</tr>
	</table>
</body>
</html>