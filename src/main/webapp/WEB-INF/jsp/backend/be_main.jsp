<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./commons/head.jsp" %>

        <!-- page content -->
         <div class="right_col" role="main">
        	<div class="row">
        		<div class="col-md-12">
        			<div class="alert alert-info">
        				欢迎${sessionScope.BE_USER.username },进入APP开发管理系统
        			</div>
        		</div>
        	</div>
			
        </div>
        <!-- /page content -->
<%@ include file="./commons/foot.jsp" %>
        
  </body>
</html>

