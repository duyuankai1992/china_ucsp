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
            //显示角色详细信息  有悬浮
            function showDetail(flag, a) {
                var detailDiv = a.parentNode.getElementsByTagName("div")[0];
                if (flag) {
                    detailDiv.style.display = "block";
                }
                else
                    detailDiv.style.display = "none";
            }
            //重置密码
            function resetPwd() {
                alert("请至少选择一条数据！");
                //document.getElementById("operate_result_info").style.display = "block";
            }
            //删除
            function deleteAdmin() {
                var r = window.confirm("确定要删除此管理员吗？");
                document.getElementById("operate_result_info").style.display = "block";
            }
            //全选
            function selectAdmins(inputObj) {
                var inputArray = document.getElementById("datalist").getElementsByTagName("input");
                for (var i = 1; i < inputArray.length; i++) {
                    if (inputArray[i].type == "checkbox") {
                        inputArray[i].checked = inputObj.checked;
                    }
                }
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
            <form action="admin/findByPage.do" method="get" id="conditionForm">
            <input type="hidden" id="currentPage" name="currentPage">
                <!--查询-->
                <div class="search_add">
                    <div>
                        模块：
                        <select id="selModules"  name="privilegeId" class="select_search">
                          <option value="-1">全部</option>                           
                           
                            <c:forEach items="${listPrivileges}" var="lp">
                            	<option value="${lp.id }" 
                            		<c:if test="${lp.id==adminPage.privilegeId }">
                            			selected
                            		</c:if>
                            	>
                            	${lp.name}
                            	</option>
                            
                            </c:forEach>
                        </select>
                    </div>
                    <div>角色：<input type="text" name="roleName" value="${adminPage.roleName}" class="text_search width200" /></div>
                    <div><input type="button" value="搜索" onclick="findByCondition(1)" class="btn_search"/></div>
                    <input type="button" value="密码重置" class="btn_add" onclick="resetPwd();" />
                    <input type="button" value="增加" class="btn_add" onclick="window.location.href='admin/toAdd.do?adminId=${lr.id}'" />
                </div>
                <!--删除和密码重置的操作提示-->
                <div id="operate_result_info" class="operate_fail">
                    <img src="images/close.png" onclick="this.parentNode.style.display='none';" />
                    <span>删除失败！数据并发错误。</span><!--密码重置失败！数据并发错误。-->
                </div> 
                <!--数据区域：用表格展示数据-->     
                <div id="data">            
                    <table id="datalist">
                        <tr>
                            <th class="th_select_all">
                                <input type="checkbox" onclick="selectAdmins(this);" />
                                <span>全选</span>
                            </th>
                            <th>管理员ID</th>
                            <th>姓名</th>
                            <th>登录名</th>
                            <th>电话</th>
                            <th>电子邮件</th>
                            <th>授权日期</th>
                            <th class="width100">拥有角色</th>
                            <th></th>
                        </tr>
						<c:forEach items="${listAdmin }" var="la">
                        <tr>
                            <td><input type="checkbox" value="${la.id}"/></td>
                            <td>${la.id}</td>
                            <td>${la.name }</td>
                            <td>${la.admin_code }</td>
                            <td>${la.telephone }</td>
                            <td>${la.email }</td>
                            <td>${la.enrolldate}</td>
                            <td>                         	
                                <c:forEach items="${la.listRole}" var="llr" varStatus="vs">
	                               <c:choose>
	                                	<c:when test="${la.listRole.size()>1}">
	                                		<a class="summary"  onmouseover="showDetail(true,this);" onmouseout="showDetail(false,this);">
	                                			<c:if test="${vs.index==0 }">
	                                				${llr.name}...
	                                			</c:if>
	                                		</a>
	                                		 <!--浮动的详细信息-->
			                                <div class="detail_info">
			                                	<c:forEach items="${la.listRole}" var="llr" varStatus="vs">
			                                		<c:choose>
			                                			<c:when test="${vs.last}">
			                                				${llr.name}
			                                			</c:when>
			                                			<c:otherwise>
			                                				${llr.name},
			                                			</c:otherwise>
			                                		</c:choose>
			                                	</c:forEach>
			                                </div>
	                                	</c:when>
	                                	<c:otherwise>
	                                		${llr.name}
	                                	</c:otherwise>
	                                </c:choose>
                                </c:forEach>
                               
                            </td>
                            <td class="td_modi">
                                <input type="button" value="修改" class="btn_modify" onclick="window.location.href='admin/toUpdate.do?adminId=${lr.id}'" />
                                <input type="button" value="删除" class="btn_delete" onclick="deleteAdmin(${lr.id});" />
                            </td>
                        </tr>
                        </c:forEach>
                       
                    </table>
                </div>
                <!--分页-->
                <div id="pages">
        	         <a href="javascript:;" onclick="findByCondition(${adminPage.prePage})">上一页</a>            
                    <c:forEach begin="1" end="${adminPage.maxPage }" var="pageNum">
                    	<c:choose>
                    		<c:when test="${pageNum==adminPage.currentPage }">
                    			<a href="javascript:;" onclick="findByCondition(${pageNum})"  class="current_page">${pageNum }</a>
                    		</c:when>
                    		<c:otherwise>
                    			<a href="javascript:;" onclick="findByCondition(${pageNum})">${pageNum }</a>
                    		</c:otherwise>
                    	</c:choose>
                    </c:forEach>
                    <a href="javascript:;" onclick="findByCondition(${adminPage.nextPage})">上一页</a> 
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
    