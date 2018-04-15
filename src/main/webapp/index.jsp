<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<div style="width: 200px;height: 400px;margin: 0px auto" >
    <form action="/test.do" method="post">
        <h2>请上传Excel!</h2>
        用户名： <input name="user_name" type="text"><br>
        性 别：  <input name="sex" type="text"><br><br>
        <input type="file"><br><br>
        <div style="width: 150px">
        <input type="reset" value="重置" width="40px" style="float: left">
        <input type="submit" value="提交" width="40px" style="float: right">
        </div>
    </form>
</div>

</body>
</html>
