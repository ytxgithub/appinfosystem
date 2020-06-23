<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
        <!-- page content -->
        <div class="right_col" role="main">
        	<div class="row">
        		<div class="col-md-12">
        			<div class="alert alert-info">
        				欢迎${sessionScope.DEV_USER.devname },进入APP开发管理系统
        			</div>
        		</div>
        	</div>
			<div class="row">
				<div class="col-md-10 col-md-offset-1">
					<div class="panel panel-warning" style="margin-bottom: 60px">
						<div class="panel-heading">
							<h4>新增APP基础信息</h4>
						</div>
						<div class="panel-body">
							<fm:form action="${pageContext.request.contextPath}/appinfo/newapp" method="post" modelAttribute="appInfo"
							  class="form-horizontal" enctype="multipart/form-data">
								
								<div class="form-group">
									<label class="control-label col-md-2">软件名称</label>
									<div class="col-md-10">
										<fm:input path="softwarename" type="text" class="form-control"/>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">APK名称</label>
									<div class="col-md-10">
										<fm:input path="apkname" type="text" class="form-control"/>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">支持的ROM</label>
									<div class="col-md-10">
										<fm:input path="supportrom" type="text" class="form-control"/>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">界面语言</label>
									<div class="col-md-10">
										<fm:input path="interfacelanguage" type="text" class="form-control"/>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">软件大小</label>
									<div class="col-md-10">
										<fm:input path="softwaresize" type="text" class="form-control"/>
									</div>
								</div>
								
								
								<div class="form-group">
									<label class="control-label col-md-2">所属平台</label>
									<div class="col-md-10">
										<fm:select id="flatformid" class="form-control" path="flatformid">
											
										</fm:select>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">一级分类</label>
									<div class="col-md-10">
										<fm:select id="categoryLevel1" class="form-control" path="categorylevel1">
											
										</fm:select>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">二级分类</label>
									<div class="col-md-10">
										<fm:select id="categoryLevel2" class="form-control" path="categorylevel2">
											
										</fm:select>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">三级分类</label>
									<div class="col-md-10">
										<fm:select id="categoryLevel3" class="form-control" path="categorylevel3">
											
										</fm:select>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">APP状态</label>
									<div class="col-md-10">
										<div class="form-control-static">待审核</div>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">应用简介</label>
									<div class="col-md-10">
										<fm:textarea class="form-control" path="appinfo" rows="6"></fm:textarea>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-2">LOGO图片</label>
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
	<script type="text/javascript">
		/* 所属平台 */
	$(document).ready(function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/data/list",
			dataType:"json",
			success:function(data){
				$.each(data,function(i){
					$("#flatformid").append("<option value="+data[i].valueid+">"+data[i].valuename+"</option>")
				});
			}
		});
		/* 一级分类 */
		$.ajax({
			url:"${pageContext.request.contextPath}/category/l1",
			dataType:"json",
			success:function(data){
				$("#categoryLevel2").append("<option value='0'>二级分类</option>");
				$("#categoryLevel3").append("<option value='0'>三级分类</option>");
				$.each(data,function(i){
					$("#categoryLevel1").append("<option value="+data[i].id+">"+data[i].categoryname+"</option>")
				});
			}
		});
		/* 二级分类   选择一级分类的时候 二级三级分类清空*/
		$("#categoryLevel1").change(function() {
			if ($(this).val() != 0) {
				$.ajax({
					url : "${pageContext.request.contextPath}/category/l2",
					type : "post",
					dataType : "json",
					data : {
						parentId : $(this).val()
					},
					success : function(data) {
						$("#categoryLevel2").html("");
						$("#categoryLevel2").append("<option value='0'>二级分类</option>");
						$("#categoryLevel3").html("");
						$("#categoryLevel3").append("<option value='0'>三级分类</option>");
						$.each(data, function(i) {
							$("#categoryLevel2").append("<option value=" + data[i].id + ">" + data[i].categoryname + "</option>");
						});
					}
				});
			} else {
				$("#categoryLevel2").html("");
				$("#categoryLevel2").append("<option value='0'>二级分类</option>");
				$("#categoryLevel3").html("");
				$("#categoryLevel3").append("<option value='0'>三级分类</option>");
			}

		});

		/* 三级分类  选择二级分类 三级分类清空*/
		$("#categoryLevel2").change(function() {
			if ($(this).val() != 0) {
				$.ajax({
					url : "${pageContext.request.contextPath}/category/l3",
					type : "post",
					dataType : "json",
					data : {
						parentId : $(this).val()
					},
					success : function(data) {
						$("#categoryLevel3").html("");
						$("#categoryLevel3").append("<option value='0'>三级分类</option>");
						$.each(data, function(i) {
							$("#categoryLevel3").append("<option value=" + data[i].id + ">" + data[i].categoryname + "</option>");
						});
					}
				});
			} else {
				$("#categoryLevel3").html("");
				$("#categoryLevel3").append("<option value='0'>三级分类</option>");
			}
		});
		
	});
	</script>
  </body>
</html>

