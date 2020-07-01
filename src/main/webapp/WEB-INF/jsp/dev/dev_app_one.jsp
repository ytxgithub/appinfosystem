<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!-- page content -->
				<div class="right_col" role="main">
					<div class="row">
						<div class="col-md-12">
							<div class="alert alert-info">
								欢迎${sessionScope.DEV_USER.devname },进入APP开发管理系统</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-10 col-md-offset-1">
							<div class="panel panel-warning">
								<div class="panel-heading">
									<h4>查看APP基础信息</h4>
								</div>
								<div class="panel-body">
									<form action="" class="form-horizontal">
										<div class="form-group">
											<label class="control-label col-md-2">软件名称</label>
											<div class="col-md-10">
												<input type="text" class="form-control" value=${appInfo.softwarename } disabled>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">APK名称</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.apkname }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">支持的ROM</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.supportrom }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">界面语言</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.interfacelanguage }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">软件大小</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.softwaresize }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">下载次数</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.downloads }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">所属平台</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.flatformName }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">一级分类</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.categorylevel1Name }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">二级分类</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.categorylevel2Name }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">三级分类</label>
											<div class="col-md-10">
												<input type="text" class="form-control" disabled value="${appInfo.categorylevel3Name }">
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">APP状态</label>
											<div class="col-md-10">
												<div class="form-control-static" disabled>
													${appInfo.statusName }
												</div>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">应用简介</label>
											<div class="col-md-10">
												<textarea class="form-control" rows="6" disabled="true">
													${appInfo.appinfo }
												</textarea>
											</div>
										</div>

										<div class="form-group">
											<label class="control-label col-md-2">LOGO图片</label>
											<div class="col-md-10">
												<img src="${pageContext.request.contextPath }/uploads/${appInfo.logopicpath}" alt="" class="thumbnail">
											</div>
										</div>
									</form>
								</div>
							</div>
							<div class="panel panel-info" style="margin-bottom: 60px;">
								<div class="panel-heading">
									<h4>APP版本历史信息</h4>
								</div>
								<div class="panel-body">
									<table class="table table-hover table-striped table-bordered">
										<tr>
											<th>软件名称</th>
											<th>版本号</th>
											<th>版本大小</th>
											<th>发布状态</th>
											<th>APP文件下载</th>
											<th>最新更新日期</th>
										</tr>
										<c:forEach items="${versionList }" var="appVersion">
										 	<tr>
												<td>${appInfo.softwarename }</td>
												<td>${appVersion.versionno }</td>
												<td>${appVersion.versionsize }</td>
												<td>${appVersion.publishstatusName }</td>
												<c:choose>
													<c:when test="${appVersion.apkfilename==null }">
														<td>没有文件</td>
													</c:when>
													<c:when test="${appVersion.apkfilename!=null or appVersion.apkfilename!=''  }">
														<td><a href="${pageContext.request.contextPath }/uploads/${appVersion.apkfilename}">下载文件</a></td>
													</c:when>
												</c:choose>
												<td>${appVersion.modifydate }</td>
											</tr>
										</c:forEach>
									</table>
									<div class="col-md-6 col-md-offset-3">
										<a href="${pageContext.request.contextPath }/appinfo/applist" class="btn btn-success btn-block">返回</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- /page content -->
        
       
<%@ include file="./commons/foot.jsp" %>
  </body>
</html>

