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
            //排序按钮的点击事件
            function sort(btnObj) {
                if (btnObj.className == "sort_desc")
                    btnObj.className = "sort_asc";
                else
                    btnObj.className = "sort_desc";
            }

            //启用
            function startFee() {
                var r = window.confirm("确定要启用此资费吗？资费启用后将不能修改和删除。");
                document.getElementById("operate_result_info").style.display = "block";
            }
            //删除
            function deleteFee() {
                var r = window.confirm("确定要删除此资费吗？");
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
            <form action="fee/findByPage.do" method="post" id="conditionForm">
                 <input type="hidden" id="currentPage" name="currentPage">
                <!--排序-->
                <div class="search_add">
                    <div>
                        <input type="button" value="基费" class="sort_asc" onclick="window.location.href='fee/sortByBaseCost.do'" />
                        <input type="button" value="时长" class="sort_asc" onclick="window.location.href='fee/sortByBaseDuration.do'"  />
                    </div>
                    <input type="button" value="增加" class="btn_add" onclick="window.location.href='fee/toAdd.do?costID=${la.id}'" />
                </div> 
                <!--启用操作的操作提示-->
                <div id="operate_result_info" class="operate_success">
                    <img src="images/close.png" onclick="this.parentNode.style.display='none';" />
                    删除成功！
                </div>    
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
                        <tr>
                            <th>资费ID</th>
                            <th class="width100">资费名称</th>
                            <th>基本时长</th>
                            <th>基本费用</th>
                            <th>单位费用</th>
                            <th>创建时间</th>
                            <th>开通时间</th>
                            <th>备注</th>
                            <th class="width50">状态</th>
                            <th class="width200"></th>
                        </tr> 
                                          
                        <c:forEach items="${listCost}" var="la">
                        <tr>
                          
                            <td>${la.id}</td>
                            <td>${la.name }</td>
                            <td>${la.base_duration}</td>
                            <td>${la.base_cost }</td>
                            <td>${la.unit_cost }</td>
                            <td>${la.creatime}</td>
                            <td>${la.startime}</td>
                            <td>${la.descr}</td>
                            <td>${la.status}</td>
                            
                            <td>                                
                                <input type="button" value="启用" class="btn_start" onclick="startFee();" />
                                <input type="button" value="修改" class="btn_modify" onclick="window.location.href='fee/toUpdate.do?id=${la.id}'" />
                                <input type="button" value="删除" class="btn_delete" onclick="window.location.href='fee/todelete.do?costID=${la.id}'" />
                            </td>
                            
                        </tr>
                        </c:forEach>  
                    </table>
                    <p>业务说明：<br />
                    1、创建资费时，状态为暂停，记载创建时间；<br />
                    2、暂停状态下，可修改，可删除；<br />
                    3、开通后，记载开通时间，且开通后不能修改、不能再停用、也不能删除；<br />
                    4、业务账号修改资费时，在下月底统一触发，修改其关联的资费ID（此触发动作由程序处理）
                    </p>
                </div>
                <!--分页-->
                <div id="pages">
        	         <a href="javascript:;" onclick="findByCondition(${costPage.prePage})">上一页</a>            
                    <c:forEach begin="1" end="${costPage.maxPage }" var="pageNum">
                    	<c:choose>
                    		<c:when test="${pageNum==costPage.currentPage }">
                    			<a href="javascript:;" onclick="findByCondition(${pageNum})"  class="current_page">${pageNum }</a>
                    		</c:when>
                    		<c:otherwise>
                    			<a href="javascript:;" onclick="findByCondition(${pageNum})">${pageNum }</a>
                    		</c:otherwise>
                    	</c:choose>
                    </c:forEach>
                    <a href="javascript:;" onclick="findByCondition(${costPage.nextPage})">下一页</a> 
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
 	
    