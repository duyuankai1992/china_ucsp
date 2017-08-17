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
        <script language="javascript" type="text/javascript">
            function deleteRole(i) {
                var r = window.confirm("确定要删除此角色吗？");
              if(r)
            	  location.href="role/delete.do?id="+i;
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
            <form action="" method="">
                <!--查询-->
                <div class="search_add">
                    <input type="button" value="增加" class="btn_add" onclick="window.location.href='role/toAdd.do?roleId=${lr.id}'" />
                </div>  
                <!--删除的操作提示-->
                <div id="operate_result_info" class="operate_success">
                    <img src="images/close.png" onclick="this.parentNode.style.display='none';" />
                    删除成功！
                </div> <!--删除错误！该角色被使用，不能删除。-->
                <!--数据区域：用表格展示数据-->     
                <div id="data">                      
                    <table id="datalist">
                        <tr>                            
                            <th>角色 ID</th>
                            <th>角色名称</th>
                            <th class="width600">拥有的权限</th>
                            <th class="td_modi"></th>
                        </tr>                      
                       
                       <c:forEach items="${listRole}" var="lr">
                       	<tr>
                            <td>${lr.id}</td>
                            <td>${lr.name}</td>
                            <td>
                            	<c:forEach items="${lr.listPrivilege}" var="lp" varStatus="vs">
                            		<c:choose>
                            			<c:when test="${vs.last}">
                            				${lp.name}
                            			</c:when>
                            			<c:otherwise>
                            				${lp.name}、
                            			</c:otherwise>
                            		</c:choose>
                            	</c:forEach>
							</td>
                            <td>
                                <input type="button" value="修改" class="btn_modify" onclick="window.location.href='role/toUpdate.do?roleId=${lr.id}'"/>
                                <input type="button" value="删除" class="btn_delete" onclick="deleteRole(${lr.id});" />
                            </td>
                        </tr>
                       </c:forEach>
                    </table>
                </div> 
                <!--分页-->
                <div id="pages">
        	        <a href="role/findByPage.do?currentPage=${rolePage.prePage}">上一页</a>
        	        <c:forEach var="pageNum" begin="1" end="${rolePage.maxPage}">
        	        	<c:choose>
        	        		<c:when test="${pageNum==rolePage.currentPage }">
        	        			<a href="role/findByPage.do?currentPage=${pageNum}" class="current_page">${pageNum}</a>
        	        		</c:when>
        	        		<c:otherwise>
        	        			<a href="role/findByPage.do?currentPage=${pageNum}">${pageNum}</a>
        	        		</c:otherwise>
        	        	</c:choose>
        	        </c:forEach>                    
                    <a href="role/findByPage.do?currentPage=${rolePage.nextPage}">下一页</a>
                </div>
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">
            <p>[打造互联网高端培训品牌，开创职业教育培训新纪元。]</p>
            <p>版权所有(C)北京育知同创科技有限公司 </p>
        </div>
    </body>
</html>
    