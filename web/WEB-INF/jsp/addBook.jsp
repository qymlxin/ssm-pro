<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2021/6/10
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示页面</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1 style="text-align: center">
                        <small>添加书籍</small>
                    </h1>
                </div>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label for="bkname">书籍名称：</label>
                <input type="text" class="form-control" name="bookName" id="bkname" required>
            </div>
            <div class="form-group">
                <label for="bkco">书籍数量：</label>
                <input type="text" class="form-control" name="bookCounts" id="bkco" required>
            </div>
            <div class="form-group">
                <label for="det">书籍描述：</label>
                <input type="text" class="form-control" name="detail" id="det" required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control" value="添加">
            </div>
        </form>

    </div>

</body>
</html>
