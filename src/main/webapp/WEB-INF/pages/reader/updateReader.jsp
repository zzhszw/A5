<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="utf-8">
    <title>修改图书</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui-v2.5.5/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" media="all">
    <style>
        body {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<div class="layui-form layuimini-form">
    <input type="hidden" name="id"   value="${info.id}">
    <div class="layui-form-item">
        <label class="layui-form-label required">读者卡号</label>
        <div class="layui-input-block">
            <input type="text" name="readerNumber" lay-reqtext="读者卡号不能为空" value="${info.readerNumber}"
                   autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">用户名</label>
        <div class="layui-input-block">
            <input type="text" name="username" lay-reqtext="用户名不能为空" value="${info.username}" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">头像</label>
        <div class="layui-input-block">
            <input type="text" name="avatar" value="${info.avatar}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">真实姓名</label>
        <div class="layui-input-block">
            <input type="text" name="realName" lay-reqtext="真实姓名不能为空" value="${info.realName}"
                   autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label required">性别</label>
        <div class="layui-input-block">
            <input type="radio" name="sex"  value="男" title="男"  ${"男" eq info.sex ?"checked='checked'":''} />
            <input type="radio" name="sex"  value="女" title="女"  ${"女" eq info.sex ?"checked='checked'":''} />
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label required">出生日期</label>
        <div class="layui-input-block">
            <input type="text" name="birthday" id="date" lay-verify="required"  value="<fmt:formatDate value='${info.birthday}' pattern='yyyy-MM-dd'/>" class="layui-input" autocomplete="off">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label required">联系方式</label>
        <div class="layui-input-block">
            <input type="text" name="tel" lay-verify="required"  class="layui-input" value="${info.tel}" autocomplete="off">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label required">邮箱地址</label>
        <div class="layui-input-block">
            <input type="text" name="email" autocomplete="off" value="${info.email}"  class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-normal" lay-submit lay-filter="saveBtn">确认修改</button>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/lib/layui-v2.5.5/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form','laydate'], function () {
        var form = layui.form,
            layer = layui.layer,
            laydate=layui.laydate,
            $ = layui.$;

        //日期
        laydate.render({
            elem: '#date',
            trigger:'click'
        });

        //监听提交
        form.on('submit(saveBtn)', function (data) {
            var datas=data.field;//form单中的数据信息
            //向后台发送数据提交添加
            $.ajax({
                url:"updateReaderSubmit",
                type:"POST",
                //data:datas,
                contentType:'application/json',
                data:JSON.stringify(datas),
                success:function(result){
                    if(result.code==0){//如果成功
                        layer.msg('修改成功',{
                            icon:6,
                            time:500
                        },function(){
                            parent.window.location.reload();
                            var iframeIndex = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(iframeIndex);
                        })
                    }else{
                        layer.msg("修改失败");
                    }
                }
            })
            return false;
        });
    });
</script>
</body>
</html>

