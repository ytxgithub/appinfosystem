<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp" %>

        <!-- page content -->
         <div class="right_col" role="main">
			<div class="row">
				<div class="col-md-12">
					<div class="alert alert-info">
						<h4>欢迎${sessionScope.DEV_USER.devname },进入APP开发管理系统</h4>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="panel panel-warning">
						<div class="panel-heading">
							<h4>开发者修改密码</h4>
						</div>
						<div class="panel-body">
							<form action="${pageContext.request.contextPath }/dev/change_password" class="form-horizontal">
								<div class="form-group">
									<label class="col-md-2 control-label">请输入新密码</label>
									<div class="col-md-8">
										<input type="hidden" name="devid" value="${sessionScope.DEV_USER.id }"/>
										<input type="password" class="form-control" name="devpassword" />
									</div>
									<div class="col-md-2">
										<button type="submit" class="btn btn-success">修改密码</button>
									</div>
								</div>
								
							</form>
						</div>
					</div>
				</div>
			</div>
        </div>
        <!-- /page content -->
<%@ include file="./commons/foot.jsp" %>
  </body>
</html>

