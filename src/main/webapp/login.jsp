<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<% 
	pageContext.setAttribute("APP_PATH",request.getContextPath()); 
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery.min.js"></script>
<!-- 引入bootStrap样式和js -->
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	
<form class="form-horizontal" style="margin-top: 200px;">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-5 control-label">用户名</label>
    <div class="col-sm-2">
      <input type="text" class="form-control text-center" id="inputEmail3" placeholder="----请输入用户名----">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-5 control-label">密码</label>
    <div class="col-sm-2">
      <input type="password" class="form-control text-center" id="inputPassword3" placeholder="----请输入密码----">
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-5 col-sm-1">
      <button type="submit" class="btn btn-default">登录</button>
    </div>
    <div class="col-sm-offset-0 col-sm-1">
      <button type="reset" class="btn btn-default">重置</button>
    </div>
    
  </div>
</form>

	<script type="text/javascript">
		$(function(){
			
		})
		
		
		
	</script>
</body>
</html>



































