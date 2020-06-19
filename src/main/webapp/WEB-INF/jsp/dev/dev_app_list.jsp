<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp" %>
<div class="right_col" role="main">
	<div class="row">
		<div class="col-md-12">
			<!-- 搜索表单 -->
			<div class="panel panel-warning">
				<div class="panel-heading">
					<h4>搜索应用</h4>
				</div>
				<div class="panel-body">
					<form action="" class="form-horizontal">
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">软件名称</label>
							<div class="col-md-8">
								<input type="text" class="form-control">
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">APP名称</label>
							<div class="col-md-8">
								<input type="text" class="form-control">
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">所属平台</label>
							<div class="col-md-8">
								<select id="select" class="form-control">
									<option value="0">所属平台</option>
								</select>
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">一级分类</label>
							<div class="col-md-8">
								<select id="level1" class="form-control">
									<option value="0">一级分类</option>
								</select>
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">二级分类</label>
							<div class="col-md-8">
								<select id="level2" class="form-control">
								
								</select>
							</div>
						</div>
						<div class="form-group col-md-3">
							<label class="control-label col-md-4">三级分类</label>
							<div class="col-md-8">
								<select id="level3" class="form-control">
									
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
									<tr>
										<td>表格数据</td>
										<td>表格数据</td>
										<td>表格数据</td>
										<td>表格数据</td>
										<td>表格数据</td>
										<td>表格数据</td>
										<td>表格数据</td>
										<td>表格数据</td>
										<td>
											<div class="btn-group dropdown">
												<button type="button" class="btn btn-danger">选择操作</button>
												<button type="button"
													class="btn btn-warning dropdown-toggle"
													data-toggle="dropdown">
													<span class="caret"></span>
												</button>
												<ul class="dropdown-menu">
													<li><a href="#">操作</a></li>
													<li><a href="#">操作</a></li>
													<li><a href="#">操作</a></li>
													<li><a href="#">操作</a></li>
												</ul>
											</div>
										</td>
									</tr>
								</tbody>
							</table>
							<ul class="pagination pull-right">
								<li><a href="#"> <span>&laquo;</span>
								</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#" aria-label="Next"> <span>&raquo;</span>
								</a></li>
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
<script>
	/* 所属平台 */
	$(document).ready(function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/data/list",
			dataType:"json",
			success:function(data){
				$.each(data,function(i){
					$("#select").append("<option value="+data[i].valueid+">"+data[i].valuename+"</option>")
				});
			}
		});
		/* 一级分类 */
		$.ajax({
			url:"${pageContext.request.contextPath}/category/l1",
			dataType:"json",
			success:function(data){
				$("#level2").append("<option value='0'>二级分类</option>");
				$("#level3").append("<option value='0'>三级分类</option>");
				$.each(data,function(i){
					$("#level1").append("<option value="+data[i].id+">"+data[i].categoryname+"</option>")
				});
			}
		});
		/* 二级分类 */
		$("#level1").change(function(){
			$.ajax({
			url:"${pageContext.request.contextPath}/category/l2",
			type:"post",
			dataType:"json",
			data:{parentId:$(this).val()},
			success:function(data){
				$("#level2").html("");
				$("#level2").append("<option value='0'>二级分类</option>");
				$.each(data,function(i){
					$("#level2").append("<option value="+data[i].id+">"+data[i].categoryname+"</option>");
				});
			}
		});
	});
	
	/* 三级分类 */
		$("#level2").change(function(){
			$.ajax({
			url:"${pageContext.request.contextPath}/category/l3",
			type:"post",
			dataType:"json",
			data:{parentId:$(this).val()},
			success:function(data){
				$("#level3").html("");
				$("#level3").append("<option value='0'>三级分类</option>");
				$.each(data,function(i){
					$("#level3").append("<option value="+data[i].id+">"+data[i].categoryname+"</option>");
				});
			}
		});
	});
});
</script>
	</body>
</html>