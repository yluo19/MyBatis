<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>慕课网用户管理中心</title>
    <link rel="stylesheet" href="lib/css/bootstrap.min.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
    <script src="lib/js/bootstrap.min.js"></script>
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="page-header">
                <h1>慕课网后台管理系统 <small>用户数据管理中心</small></h1>
            </div>
        </div>
        <div class="row" style="width: 100%">
            <div class="jumbotron">
                <h1>MyBatis基础入门课程</h1>
                <p>通过一个项目完成基础部分的学习</p>
                <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
            </div>
        </div>

        <div class="row">
            <table class="table table-hover table-striped">
                <tr>
                    <th>用户编号</th>
                    <th>登录账号</th>
                    <th>用户昵称</th>
                    <th>邮箱</th>
                    <th>联系方式</th>
                    <th>账号创建时间</th>
                    <th>用户状态</th>
                    <th>操作</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td>admin</td>
                    <td>小木</td>
                    <td>xiaomu@gmail.com</td>
                    <td>1888888888</td>
                    <td>2018-10-14</td>
                    <td>正常</td>
                    <td>
                        <a href="">查看</a>
                        <a href="">修改</a>
                        <a href="">删除</a>

                    </td>
                </tr>
            </table>
        </div>
    </div>
</body>
</html>
