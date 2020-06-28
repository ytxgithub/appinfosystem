<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<div class="right_col" role="main">
	<div class="row">
        		<div class="col-md-12">
        			<div class="alert alert-info">
        				欢迎${sessionScope.DEV_USER.devname },进入APP开发管理系统
        			</div>
        		</div>
        	</div>
	<div class="row">
		<div class="col-md-12">
			<!-- 搜索表单 -->
			<div class="panel panel-warning">
				<div class="panel-heading">
					<h4>搜索应用</h4>
				</div>
				<div class="panel-body">
					<form action="${pageContext.request.contextPath }/appinfo/applist" method="get" class="form-horizontal">
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">软件名称</label>
							<div class="col-md-8">
								<input type="text" value="${appinfo.softwarename }" name="softwarename" class="form-control">
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">APP名称</label>
							<div class="col-md-8">
								<input type="text" name="apkname" value="${appinfo.apkname }"  class="form-control">
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">所属平台</label>
							<div class="col-md-8">
								<select id="flatformid" name="flatformid" class="form-control">
									<option value="0">所属平台</option>
								</select>
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">一级分类</label>
							<div class="col-md-8">
								<select id="categoryLevel1" name="categorylevel1" class="form-control">
									
								</select>
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">二级分类</label>
							<div class="col-md-8">
								<select id="categoryLevel2" name="categorylevel2" class="form-control">
								
								</select>
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">三级分类</label>
							<div class="col-md-8">
								<select id="categoryLevel3" name="categorylevel3" class="form-control">
									
								</select>
							</div>
						</div>
						<div class="form-group col-md-3">
							<div class="col-md-8 col-md-offset-4">
								<button type="submit" class="btn btn-success btn-block">搜索应用</button>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="panel panel-success">
				<div class="panel-heading">
					<h4>应用列表</h4>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-12">
							<table class="table table-bordered table-hover table-striped">
								<thead>
									<tr class="bg-blue-sky">
										<th>软件名称</th>
										<th>APK名称</th>
										<th>软件大小</th>
										<th>所属平台</th>
										<th>所属分类</th>
										<th>状态</th>
										<th>下载次数</th>
										<th>最新版本号</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="appInfo" items="${appInfoList }">
										<tr>
										<td>${appInfo.softwarename }</td>
											<td>${appInfo.apkname }</td>
											<td>${appInfo.softwaresize }</td>
											<td>${appInfo.flatformName }</td>
											<td>${appInfo.categorylevel1Name }->${appInfo.categorylevel2Name }->${appInfo.categorylevel3Name }</td>
											<td>
												<c:choose>
													<c:when test="${appInfo.status==1 }">
														<span class="label label-primary">${appInfo.statusName }</span>
													</c:when>
													<c:when test="${appInfo.status==2 }">
														<span class="label label-success">${appInfo.statusName }</span>
													</c:when>
													<c:when test="${appInfo.status==3 }">
														<span class="label label-info">${appInfo.statusName }</span>
													</c:when>
													<c:when test="${appInfo.status==4 }">
														<span class="label label-warning">${appInfo.statusName }</span>
													</c:when>
													<c:when test="${appInfo.status==5 }">
														<span class="label label-danger">${appInfo.statusName }</span>
													</c:when>
												</c:choose>
											
											</td>
											<td>${appInfo.downloads }</td>
											<td>${appInfo.versionName }</td>
										<td>
											<div class="btn-group dropdown">
												<button type="button" class="btn btn-danger">选择操作</button>
												<button type="button"
													class="btn btn-warning dropdown-toggle"
													data-toggle="dropdown">
													<span class="caret"></span>
												</button>
												<ul class="dropdown-menu">
													<li><a href="${pageContext.request.contextPath }/appinfo/updateapp_form?appid=${appInfo.id}">修改app信息</a></li>
													<li><a href="${pageContext.request.contextPath }/appversion/newversion_form?appid=${appInfo.id}">增加版本</a></li>
													<li><a href="${pageContext.request.contextPath }/appversion/modify_form?appid=${appInfo.id}">修改最新版本</a></li>
													<li><a href="${pageContext.request.contextPath }/appinfo/showappinfo?appid=${appInfo.id}">查看app信息</a></li>
														<c:if test="${appInfo.status != 4 }">
															<li><a href="${pageContext.request.contextPath }/appinfo/delete?appid=${appInfo.id}">删除app</a></li>
														</c:if>
														
														<c:if test="${appInfo.status ==2 or appInfo.status ==5 }">
															<li><a href="${pageContext.request.contextPath }/appinfo/on_sale?appid=${appInfo.id}">上架</a></li>
														</c:if>
														
														<c:if test="${appInfo.status ==4}">
															<li><a href="${pageContext.request.contextPath }/appinfo/off_sale?appid=${appInfo.id}">下架</a></li>
														</c:if>
												</ul>
											</div>
										</td>
									</tr>
									</c:forEach>
								</tbody>
							</table>
							
							<ul class="pagination pull-right">
								<c:choose>
									<c:when test="${param.pageIndex != null and param.pageIndex > 1 }">
										<li><a href="?pageIndex=${param.pageIndex - 1 }${par}"> <span>&laquo;</span>
										</a></li>
									</c:when>
									<c:otherwise>
										<li class="disabled"><a href="#"> <span>&laquo;</span>
										</a></li>
									</c:otherwise>
								</c:choose>
								<c:forEach begin="1" end="${pageCount }" step="1" var="i">
									<li><a href="?pageIndex=${i }${par}">${i }</a></li>
								</c:forEach>
								<c:choose>
									<c:when
										test="${param.pageIndex != null and param.pageIndex < pageCount }">
										<li><a href="?pageIndex=${param.pageIndex + 1 }${par}"> <span>&raquo;</span>
										</a></li>
									</c:when>
									<c:otherwise>
										<li class="disabled"><a href="#"> <span>&raquo;</span>
										</a></li>
									</c:otherwise>
								</c:choose>

							</ul>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- /page content -->
<%@ include file="./commons/foot.jsp" %>
<script src="${pageContext.request.contextPath }/js2/fenlei.js">
	
</script>
	</body>
</html>