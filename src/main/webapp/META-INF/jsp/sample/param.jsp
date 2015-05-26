<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String baseDir = request.getContextPath();
%>
<!doctype html>
<html>
<head>
<title>sample/param</title>
<link rel="stylesheet" href="<%=baseDir%>/static/sample.css">
</head>
<body>
	<table class="c-table" border="1" cellspacing="1" cellpadding="2">
		<tr>
			<td colspan="2">
			<pre class="java">@RequestMapping("/sample/param")
public void (Model model) {
    model.addAttribute("data", this);
}
</pre></td>
		</tr>
		<tr>
			<td width="80">baseDir:</td>
			<td data-value="/spring-mvc"><%=baseDir%></td>
		</tr>
		<tr>
			<td>控制器:</td>
			<td data-value="org.ionnic.app.home.controller.Sample">${data}</td>
		</tr>
		<tr>
			<td>拦截器:</td>
			<td data-value="org.ionnic.core.support.Intercepter">${control}</td>
		</tr>
	</table>
	<script src="<%=baseDir%>/static/sample.js"></script>
	<script type="text/javascript">
		
	</script>
</body>
</html>

