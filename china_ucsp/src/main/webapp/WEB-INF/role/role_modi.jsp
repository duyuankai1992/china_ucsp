<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
 <head>
 	<base href="<%=request.getContextPath()%>/"/>
 	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>育知同创－China-UCSP</title>
        <link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" />
        <script type="text/javascript">
            //保存成功的提示消息
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
           <%@include file="../main/menu.jsp" %>
        </div>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">           
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success">保存成功！</div>
            <form action="role/update.do" method="post" class="main_form">
                <div class="text_info clearfix"><span>角色名称：</span></div>
                <div class="input_info">
                	<input type="hidden" name="id" value="${role.id}"/>
                    <input type="text" name="name" value="${role.name}" class="width200"/>
                    <span class="required">*</span>
                    <div class="validate_msg_medium error_msg">不能为空，且为20长度的字母、数字和汉字的组合</div>
                </div>                    
                <div class="text_info clearfix"><span>设置权限：</span></div>
                <div class="input_info_high">
                    <div class="input_info_scroll">
                        <ul>
                        
                        	<c:forEach items="${listPrivilege}" var="lp">
                        		<li><input type="checkbox" name="privilegeIds" value="${lp.id}" 
                        		
                        		<c:forEach items="${listPrivilegeId}" var="rpid">
                        			<c:if test="${lp.id==rpid}">
                        				checked
                        			</c:if>
                        		</c:forEach>
                        		
                        		/>${lp.name}</li>
                        	</c:forEach>
                           
                        </ul>
                    </div>
                    <span class="required">*</span>
                    <div class="validate_msg_tiny">至少选择一个权限</div>
                </div>
                <div class="button_info clearfix">
                    <input type="submit" value="确认更新" class="btn_save"/>
                    <input type="button" value="取消" class="btn_save" />
                </div>
            </form> 
        </div>
        <!--主要区域结束-->
        <div id="footer">
            <span>[打造互联网高端培训品牌，开创职业教育培训新纪元]</span>
            <br />
            <span>版权所有(C)北京育知同创科技有限公司 </span>
        </div>
    </body>
</html>
 	 
    