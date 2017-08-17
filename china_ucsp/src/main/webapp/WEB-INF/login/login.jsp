<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
 	<base href="<%=request.getContextPath()%>/"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>育知同创－China-UCSP</title>
    <link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" /> 
    <script type="text/javascript" src="js/jquery-3.0.0.js"></script>
    <script type="text/javascript">
         <!---->
    	$(function(){
    		$("#checkCodeImg").click(function(){
    			$("#checkCodeImg").get(0).src = "login/getCode.do?time="+new Date().getTime();
    		}); 
    		
    		$("#loginbtn").click(function(){
    			var admin_code = $("#admin_code").val();
    			var password = $("#password").val();
    			var code = $("#checkCode").val();
    			$(".required").html("");
    			
    			if(admin_code==""){
    				$(".required").eq(0).html("账号不能为空！");
    				return ;
    			}
    			if(password==""){
    				$(".required").eq(1).html("密码不能为空！");
    				return ;
    			}
    			if(code==""){
    				$(".required").eq(2).html("验证码不能为空！");
    				return ;
    			}
    			$.ajax({
    				type:"POST",
    				url:"login/login.do",
    				data:$("#loginForm").serialize(),
    				success:function(data){
    					
    					if(data==0){
    						$(".required").eq(0).html("无此账号！");
    						return;
    					}
    					if(data==1){
    						$(".required").eq(1).html("密码错误！");
    						return;
    					}
    					if(data==2){
    						$(".required").eq(2).html("验证码错误！");
    						return;
    					}
    					window.location.href="login/toIndex.do";
    				}
    			});
    		});
    	});
    	
    	
    
    </script>
 </head>
    <body class="index">
        <div class="login_box">
        	<form method="post" id="loginForm">
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input name="admin_code" id="admin_code" type="text" class="width150" /></td>
                    <td class="login_error_info"><span class="required"></span></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input name="password" id="password" type="password" class="width150" /></td>
                    <td><span class="required"></span></td>
                </tr>
                <tr>
                    <td class="login_info">验证码：</td>
                    <td class="width70"><input name="checkCode" id="checkCode" type="text" class="width70" /></td>
                    <td><img src="login/getCode.do" alt="验证码" title="点击更换" id="checkCodeImg"/></td>  
                    <td><span class="required"></span></td>              
                </tr>            
                <tr>
                    <td></td>
                    <td class="login_button" colspan="2">
                        <a href="javascript:;"><img src="images/login_btn.png" id="loginbtn"/></a>
                    </td>    
                    <td><span class="required"></span></td>                
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>