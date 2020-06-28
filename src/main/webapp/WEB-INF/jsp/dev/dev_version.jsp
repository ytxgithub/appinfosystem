<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
        <!-- page content -->
				<div class="right_col" role="main">
					<div class="row">
						<div class="col-md-12">
							<div class="panel panel-info">
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
								</div>
							</div>

							<div class="panel panel-warning">
								<div class="panel-heading">
									<h4>增加APP版本信息</h4>
								</div>
								<div class="panel-body">
									<fm:form action="${pageContext.request.contextPath }/appversion/newversion" modelAttribute="appVersion"
									 method="post" class="form-horizontal" enctype="multipart/form-data">
									 <fm:hidden path="appid"/>
										<div class="form-group">
											<label class="control-label col-md-2">版本号</label>
											<div class="col-md-10">
												<fm:input path="versionno" type="text" class="form-control"/>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-2">版本大小</label>
											<div class="col-md-10">
												<fm:input path="versionsize" type="text" class="form-control"/>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-2">发布状态</label>
											<div class="col-md-10">
												<div class="form-control-static">预发布</div>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-2">版本简介</label>
											<div class="col-md-10">
												<fm:textarea path="versioninfo" class="form-control" rows="6"></fm:textarea>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-md-2">APK文件</label>
											<div class="col-md-10">
												<input type="file" name="file" class="form-control" />
											</div>
										</div>
										<div class="form-group">
											<div class="col-md-10 col-md-offset-2">
												<button type="submit" class="btn btn-success">保存</button>
												<a class="btn btn-danger" href="${pageContext.request.contextPath }/appinfo/applist">返回</a>
											</div>
										</div>
									</fm:form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- /page content -->
<%@ include file="./commons/foot.jsp" %>
  </body>
</html>

