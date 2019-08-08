<html>
<head>
<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
<script type="text/javascript" src="/webjars/miniui/miniui.js"></script>
<link rel="stylesheet" type="text/css" href="/webjars/miniui/themes/default/miniui.css" />
<link rel="stylesheet" type="text/css" href="/webjars/miniui/themes/icons.css" />

</head>
<body>
	<h1>FormLayout 表单布局</h1>

	<h4>单列多行${date}</h4>
	<table border="0" cellpadding="1" cellspacing="2">
		<tr>
			<td style="width: 60px;">姓名：</td>
			<td style="width: 100px"><input name="name" class="mini-textbox" value="${name}"/>
			</td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input name="pwd" class="mini-password" /></td>
		</tr>
		<tr>
			<td>生日：</td>
			<td><input name="birthday" class="mini-datepicker" /></td>
		</tr>
	</table>

	<h4>多列多行</h4>
	<table border="0" cellpadding="1" cellspacing="2"
		style="width: 100%; table-layout: fixed;">
		<tr>
			<td style="width: 60px;">姓名：</td>
			<td style="width: 50%"><input name="name" class="mini-textbox"
				style="width: 100%;" /></td>
			<td style="width: 60px;">地址：</td>
			<td style="width: 50%"><input name="addr" class="mini-textbox"
				style="width: 100%;" /></td>
		</tr>
		<tr>
			<td>性别：</td>
			<td><input name="gender" class="mini-radiobuttonlist"
				data="[{id: 1, text: '男'}, {id: 2, text: '女'}]" /></td>
			<td>年龄：</td>
			<td><input name="age" class="mini-spinner" style="width: 100%;" />
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><input name="remarks" class="mini-textarea"
				style="width: 100%; height: 60px;" /></td>
		</tr>
	</table>



	<script type="text/javascript">
		mini.parse();
	</script>

	<div class="description">
		<h3>Description</h3>
		<p>表单布局使用HTML的table标签元素，可以实现任意多列多行的布局效果。</p>
	</div>
</body>
</html>