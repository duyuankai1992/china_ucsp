<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
 	<base href="<%=request.getContextPath()%>/"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>育知同创－China-UCSP</title>
        <link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" />
        <script language="javascript" type="text/javascript">
            //保存成功的提示信息
            function showResult() {
                showResultDiv(true);
                window.setTimeout("showResultDiv(false);", 3000);
            }
            function showResultDiv(flag) {
                var divResult = document.getElementById("save_result_info");
                if (flag)
                    divResult.style.display = "block";
                else
                    divResult.style.display = "none";
            }
        </script>
    </head>
    <body>
        <!--Logo区域开始-->
        <div id="header">
            <img src="images/logo.png" alt="logo" class="left"/>
            <a href="#">[退出]</a>            
        </div>
        <!--Logo区域结束-->
        <!--导航区域开始-->
        <div id="navi">                        
            <%@ include file="../main/menu.jsp" %>
        </div>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success">保存成功！</div><!--保存失败，数据并发错误！-->
            <form action="" method="" class="main_form">
                <div class="text_info clearfix"><span>管理员账号：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="admin" /></div>
                <div class="text_info clearfix"><span>角色：</span></div>
                <div class="input_info">
                    <input type="text" readonly="readonly" class="readonly width400" value="账单管理员，业务账号" />
                </div>
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input type="text" value="陈川" />
                    <span class="required"></span>
										<!--
                    <div class="validate_msg_long error_msg"></div>
										-->
                </div>
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" value="13892345678" />
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="text_info clearfix"><span>Email：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" value="aa@aa.com" />
                    <div class="validate_msg_medium"></div>
                </div>
                <div class="text_info clearfix"><span>创建时间：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="2012/12/12 13:10:34"/></div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" onclick="showResult();" />
                    <input type="button" value="取消" class="btn_save" />
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
            <p>[打造互联网高端培训品牌，开创职业教育培训新纪元]</p>            
            <p>版权所有(C)北京育知同创科技有限公司 </p>
        </div>
    </body>
</html>
    