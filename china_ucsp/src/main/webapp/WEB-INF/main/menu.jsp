<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

           <ul id="menu">
	<c:choose>
		<c:when test="${currentModule==0}">
			<li><a href="index.html" class="index_on"></a></li>
		</c:when>
		<c:otherwise>
			<li><a href="index.html" class="index_off"></a></li>
		</c:otherwise>
	</c:choose>
	<c:forEach items="${listPrivileges}" var="pri">             		
       <c:forEach items="${privilegeIds }" var="pid">       			
            <c:if test="${pri.id==1 }">
				<c:if test="${pid==pri.id}">
					<c:choose>
						<c:when test="${currentModule==1}">
							<li><a href="role/findByPage.do" class="role_on"></a></li>
						</c:when>
						<c:otherwise>
							<li><a href="role/findByPage.do" class="role_off"></a></li>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:if>
			<c:if test="${pri.id==2 }">
				<c:if test="${pid==pri.id}">
					<c:choose>
						<c:when test="${currentModule==2}">
							<li><a href="admin/findByPage.do" class="admin_on"></a></li>
						</c:when>
						<c:otherwise>
							<li><a href="admin/findByPage.do" class="admin_off"></a></li>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:if>
			<c:if test="${pri.id==3 }">
				<c:if test="${pid==pri.id}">
					<c:choose>
						<c:when test="${currentModule==3}">
							<li><a href="fee/findByPage.do" class="fee_on"></a></li>
						</c:when>
						<c:otherwise>
							<li><a href="fee/findByPage.do" class="fee_off"></a></li>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:if>

			<c:if test="${pri.id==4 }">
				<c:if test="${pid==pri.id}">
					<c:choose>
						<c:when test="${currentModule==4}">
							<li><a href="account/findByPage.do" class="account_on"></a></li>
						</c:when>
						<c:otherwise>
							<li><a href="account/findByPage.do" class="account_off"></a></li>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:if>

			<c:if test="${pri.id==5 }">
				<c:if test="${pid==pri.id}">
					<c:choose>
						<c:when test="${currentModule==5}">
							<li><a href="service/service_list.html" class="service_on"></a></li>
						</c:when>
						<c:otherwise>
							<li><a href="service/service_list.html" class="service_off"></a></li>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:if>

			<c:if test="${pri.id==6 }">
				<c:if test="${pid==pri.id}">
					<c:choose>
						<c:when test="${currentModule==6}">
							<li><a href="bill/bill_list.html" class="bill_on"></a></li>
						</c:when>
						<c:otherwise>
							<li><a href="bill/bill_list.html" class="bill_off"></a></li>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:if>

			<c:if test="${pri.id==7 }">
				<c:if test="${pid==pri.id}">
					<c:choose>
						<c:when test="${currentModule==5}">
							<li><a href="report/report_list.html" class="report_on"></a></li>
						</c:when>
						<c:otherwise>
							<li><a href="report/report_list.html" class="report_off"></a></li>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:if>
		</c:forEach>
	</c:forEach>

	<li><a href="admin/findByIf.do" class="information_off"></a></li>
	<li><a href="admin/findByPa.do" class="password_off"></a></li>
</ul>

    