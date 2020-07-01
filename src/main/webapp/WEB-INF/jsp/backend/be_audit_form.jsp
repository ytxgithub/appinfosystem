<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp"%>

<div class="right_col" role="main">
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-warning">
				<div class="panel-heading">
					<h4>欢迎${sessionScope.BE_USER.username },进入APP开发管理系统</h4>
				</div>
				<div class="panel-body">
					<form action="" class="form-horizontal">

						<div class="form-group">
							<label class="control-label col-md-2">软件名称</label>
							<div class="col-md-10">
								<input type="text" class="form-control"
									value=${appInfo.softwarename } disabled>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">APK名称</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.apkname }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">支持的ROM</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.supportrom }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">界面语言</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.interfacelanguage }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">软件大小</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.softwaresize }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">下载次数</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.downloads }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">所属平台</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.flatformName }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">一级分类</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.categorylevel1Name }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">二级分类</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.categorylevel2Name }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">三级分类</label>
							<div class="col-md-10">
								<input type="text" class="form-control" disabled
									value="${appInfo.categorylevel3Name }">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">APP状态</label>
							<div class="col-md-10">
								<div class="form-control-static">
									${appInfo.statusName}</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">应用简介</label>
							<div class="col-md-10">
								<textarea class="form-control" rows="6" disabled>
													${appInfo.appinfo }
												</textarea>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">LOGO图片</label>
							<div class="col-md-10">
								<img
									src="${pageContext.request.contextPath }/uploads/${appInfo.logopicpath}"
									alt="" class="thumbnail">
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-10 col-md-offset-2">
								<a href="${pageContext.request.contextPath }/backend/audit?appid=${appInfo.id}&pass=true" class="btn btn-success">审核通过</a>
								<a href="${pageContext.request.contextPath }/backend/audit?appid=${appInfo.id}&pass=false" class="btn btn-danger">审核不通过</a>
								<a href="${pageContext.request.contextPath }/backend/list" class="btn btn-info">返回</a>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="panel panel-success" style="margin-bottom: 60px;">
				<div class="panel-heading">
					<h4>APP最新版本信息</h4>
				</div>
				<div class="panel-body">
					<form action="" method="post" class="form-horizontal">
						<div class="form-group">
							<label class="control-label col-md-2">版本号</label>
							<div class="col-md-10">
								<input type="text" value="${appVersion.versionno }" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">版本大小</label>
							<div class="col-md-10">
								<input type="text" value="${appVersion.versionsize }" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">发布状态</label>
							<div class="col-md-10">
								<div class="form-control-static">${appVersion.publishstatusName }</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">版本简介</label>
							<div class="col-md-10">
								<textarea class="form-control" rows="6">${appVersion.versioninfo }</textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">APK文件</label>
							<div class="col-md-10">
								<div class="form-control-static">
									<a href="${pageContext.request.contextPath }/download?filename=${appVersion.apkfilename}">${appVersion.apkfilename }</a>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- footer content -->
<footer>
	<div class="pull-right">北大青鸟北资第一学院BS3T272班SSM项目</div>
	<div class="clearfix"></div>
</footer>
<!-- /footer content -->
<%@ include file="./commons/foot.jsp"%>

</body>
</html>

