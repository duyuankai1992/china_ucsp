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
        <script language="javascript" type="text/javascript">
            //删除
            function deleteAccount() {
                var r = window.confirm("确定要删除此账务账号吗？\r\n删除后将不能恢复，且会删除其下属的所有业务账号。");
                document.getElementById("operate_result_info").style.display = "block";
            }
            //开通或暂停
            function setState() {
                var r = window.confirm("确定要开通此账务账号吗？");
                document.getElementById("operate_result_info").style.display = "block";
            }
            
function findByCondition(currentPage){
            	
            	var currentPageHidden = $("#currentPage");
            	currentPageHidden.val(currentPage);
            	$("#conditionForm").get(0).submit();
            	
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
            <form action="" method="" id="conditionForm">
             <input type="hidden" id="currentPage" name="currentPage">
                <!--查询-->
                <div class="search_add">                        
                    <div>身份证：<input type="text" value="不验证" class="text_search" /></div>                            
                    <div>姓名：<input type="text" class="width70 text_search" value="不验证" /></div>
                    <div>登录名：<input type="text"  value="不验证" class="text_search"" /></div>
                    <div>
                        状态：
                        <select class="select_search">
                            <option>全部</option>
                            <option>开通</option>
                            <option>暂停</option>
                            <option>删除</option>
                        </select>
                    </div>
                    <div><input type="button" value="搜索" class="btn_search" /></div>
                    <input type="button" value="增加" class="btn_add" onclick="window.location.href='account/toAdd.do'" />
                </div>  
                <!--删除等的操作提示-->
                <div id="operate_result_info" class="operate_success">
                    <img src="images/close.png" onclick="this.parentNode.style.display='none';" />
                    删除成功，且已删除其下属的业务账号！
                </div>   
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
                    <tr>
                        <th>账号ID</th>
                        <th>姓名</th>
                        <th class="width150">身份证</th>
                        <th>登录名</th>
                        <th>状态</th>
                        <th class="width100">创建日期</th>
                        <th class="width150">上次登录时间</th>                                                        
                        <th class="width200"></th>
                    </tr>
                    
                    
                         <c:forEach items="${listaccount}" var="la">
                        <tr>
                          
                            <td>${la.id}</td>
                            <td>${la.REAL_NAME }</td>
                            <td>${la.IDCARD_NO}</td>
                            <td>${la.LOGIN_NAME }</td>
                            <td>${la.STATUS }</td>
                            <td>${la.CREATIME}</td>
                            <td>${la.LAST_LOGIN_TIME}</td>  
                                                                                                                      
                        <td class="td_modi">
                            <input type="button" value="暂停" class="btn_pause" onclick="setState();" />
                            <input type="button" value="修改" class="btn_modify" onclick= "window.location.href='account/toUpade.do?id=${la.id}'"/>
                            <input type="button" value="删除" class="btn_delete" onclick="window.location.href='account/delete.do?id=${la.id}'"  />
                        </td>
                    </tr>
                    
                 </c:forEach>  
                               
                </table>
                <p>业务说明：<br />
                1、创建则开通，记载创建时间；<br />
                2、暂停后，记载暂停时间；<br />
                3、重新开通后，删除暂停时间；<br />
                4、删除后，记载删除时间，标示为删除，不能再开通、修改、删除；<br />
                5、暂停账务账号，同时暂停下属的所有业务账号；<br />                
                6、暂停后重新开通账务账号，并不同时开启下属的所有业务账号，需要在业务账号管理中单独开启；<br />
                7、删除账务账号，同时删除下属的所有业务账号。</p>
                </div>                   
                <!--分页-->
                 <div id="pages">
        	         <a href="javascript:;" onclick="findByCondition(${accountPage.prePage})">上一页</a>            
                    <c:forEach begin="1" end="${accountPage.maxPage }" var="pageNum">
                    	<c:choose>
                    		<c:when test="${pageNum==accountPage.currentPage }">
                    			<a href="javascript:;" onclick="findByCondition(${pageNum})"  class="current_page">${pageNum }</a>
                    		</c:when>
                    		<c:otherwise>
                    			<a href="javascript:;" onclick="findByCondition(${pageNum})">${pageNum }</a>
                    		</c:otherwise>
                    	</c:choose>
                    </c:forEach>
                    <a href="javascript:;" onclick="findByCondition(${accountPage.nextPage})">下一页</a> 
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
    