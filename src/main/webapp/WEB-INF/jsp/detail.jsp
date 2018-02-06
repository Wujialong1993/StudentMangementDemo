<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>StudentInformationManagementSystem</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">

    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="../../js/detail.js"></script>
</head>
<body>

<div class="container">
    <br>
	<div class="row">
		<table class="table table-bordered table-hover table-striped">
            <thead>
                <tr class="info">
                    <th>
                        <h4><span class="label label-default">编号</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">姓名</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">性别</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">年龄</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">年级</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">语文成绩</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">数学成绩</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">体育成绩</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-danger">添加</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-danger">修改</span></h4>
                    </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <input type="text" class="form-control" id="0-0" readonly="true">
                    </td>
                    <td>
                        <input type="text" class="form-control" id="0-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" id="0-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" id="0-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" id="0-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" id="0-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" id="0-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" id="0-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="添加" id="0-8"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="0-9" disabled="true"></input>
                    </td>
                </tr>
			</tbody>
		</table>
	</div>
    <div class="row">
        <table class="table table-bordered table-hover table-striped">
            <thead>
                <tr class="info">
                    <th>
                        <h4><span class="label label-default">编号</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">姓名</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">性别</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">年龄</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">年级</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">语文成绩</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">数学成绩</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-primary">体育成绩</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-danger">修改</span></h4>
                    </th>
                    <th>
                        <h4><span class="label label-danger">删除</span></h4>
                    </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="1-0">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="1-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="1-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="1-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="1-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="1-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="1-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="1-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="1-8" disabled="true"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="删除" id="1-9" disabled="true"></input>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="2-0">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="2-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="2-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="2-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="2-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="2-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="2-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="2-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="2-8" disabled="true"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="删除" id="2-9" disabled="true"></input>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="3-0">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="3-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="3-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="3-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="3-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="3-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="3-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="3-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="3-8" disabled="true"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="删除" id="3-9" disabled="true"></input>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="4-0">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="4-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="4-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="4-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="4-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="4-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="4-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="4-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="4-8" disabled="true"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="删除" id="4-9" disabled="true"></input>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="5-0">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="5-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="5-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="5-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="5-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="5-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="5-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="5-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="5-8" disabled="true"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="删除" id="5-9" disabled="true"></input>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="6-0">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="6-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="6-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="6-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="6-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="6-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="6-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="6-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="6-8" disabled="true"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="删除" id="6-9" disabled="true"></input>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="7-0">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="7-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="7-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="7-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="7-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="7-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="7-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="7-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="7-8" disabled="true"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="删除" id="7-9" disabled="true"></input>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="8-0">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="8-1">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="8-2">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="8-3">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="8-4">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="8-5">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="8-6">
                    </td>
                    <td>
                        <input type="text" class="form-control" readonly="true" id="8-7">
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="修改" id="8-8" disabled="true"></input>
                    </td>
                    <td>
                        <input type="button" class="btn btn-default" value="删除" id="8-9" disabled="true"></input>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
    <div class="row">
        <nav style="text-align: right">
            <ul class="pagination">
                <li><a href="javascript:void(0)" id="homePage">首页</a></li>
                <li><a href="javascript:void(0)" id="endPage">尾页</a></li>
                <li><a href="javascript:void(0)">.</a></li>
                <li><a href="javascript:void(0)" id="previousPage">上一页</a></li>
                <li><a href="javascript:void(0)" id="nextPage">下一页</a></li>
                <li><a href="javascript:void(0)">.</a></li>
                <li><a href="javascript:void(0)">第</a></li>
                <li><a href="javascript:void(0)" id="currentPage">1</a></li>
                <li><a href="javascript:void(0)">页</a></li>
                <li><a href="javascript:void(0)">.</a></li>
                <li><a href="javascript:void(0)">共</a></li>
                <li><a href="javascript:void(0)" id="totalPage">0</a></li>
                <li><a href="javascript:void(0)">页</a></li>
            </ul>
        </nav>
    </div>
</div>

</body>
</html>
