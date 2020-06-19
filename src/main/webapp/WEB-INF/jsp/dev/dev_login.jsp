<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>APP信息管理系统-开发者平台</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath }/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath }/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath }/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="${pageContext.request.contextPath }/vendors/animate.css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath }/build/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form action="${pageContext.request.contextPath }/dev_login" method="post">
              <h1>APP开发者平台</h1>
              <div>
                <input type="text" class="form-control" name="devcode" placeholder="Username" required="" />
              </div>
              <div>
                <input type="password" class="form-control" name="devpassword" placeholder="Password" required="" />
              </div>
              <div>
                <button class="btn btn-success submit btn-block" type="submit">登录</button>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">
                  <a href="#signup" class="to_register"> 注册成为开发者 </a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-paw"></i> APP信息管理平台</h1>
                  <p>©2020 北大青鸟北资第一学院BS3T272</p>
                </div>
              </div>
            </form>
          </section>
        </div>

        <div id="register" class="animate form registration_form">
          <section class="login_content">
            <form>
              <h1>注册成为开发者</h1>
              <div>
                <input type="text" class="form-control" placeholder="Username" required="" />
              </div>
              <div>
                <input type="email" class="form-control" placeholder="Email" required="" />
              </div>
              <div>
                <input type="password" class="form-control" placeholder="Password" required="" />
              </div>
              <div>
                <a class="btn btn-danger submit btn-block" href="index.html">立即注册</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">
                  <a href="#signin" class="to_register"> 登录 </a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-paw"></i> APP信息管理平台</h1>
                  <p>©2020 北大青鸟北资第一学院BS3T272</p>
                </div>
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
  </body>
</html>
