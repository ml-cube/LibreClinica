<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<fmt:setBundle basename="org.akaza.openclinica.i18n.words" var="resword"/>
<fmt:setBundle basename="org.akaza.openclinica.i18n.licensing" var="licensing"/>

<!-- start of include/footer.jsp -->
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>

<script type="text/javascript" src="${pageContext.request.contextPath}/includes/wz_tooltip/wz_tooltip.js"></script>
<table class="footer_table">
    <tr>
        <td class="footer_left">
	        <a href="https://i3lung.eu/" target="new"><fmt:message key="openclinica_portal" bundle="${resword}"/></a> |
	        <a href="http://13.37.139.158:3000/" target="new"><fmt:message key="help" bundle="${resword}"/></a> |   
	     	<a href="${pageContext.request.contextPath}/Contact"><fmt:message key="contact" bundle="${resword}"/></a>
        </td>
        <td class="footer_middle" >
			<fmt:message key="footer.license.1" bundle="${licensing}"/>
			<fmt:message key="footer.license.2" bundle="${licensing}"/>
			<fmt:message key="footer.license.3" bundle="${licensing}"/>
		</td>
        <td class="footer_right" >
            <c:set var="tooltip"><fmt:message key="footer.tooltip" bundle="${licensing}"/></c:set>
            <div id="footer_tooltip">
                <c:choose>
                    <c:when test="${empty tooltip}">
                        <span style="color: #789EC5;"  >
                            <fmt:message key="footer.edition.2" bundle="${licensing}" />
                        </span>
                    </c:when>
                    <c:otherwise>
                        <span onmouseover="Tip('<fmt:message key="footer.tooltip" bundle="${licensing}"/>')" onmouseout="UnTip()" style="color: #789EC5;"  >
                            <fmt:message key="footer.edition.2" bundle="${licensing}" />
                        </span>
                    </c:otherwise>
                </c:choose>
                </div>
             <div  id="version"><fmt:message key="Version_release" bundle="${licensing}"/></div>
        </td>
    </tr>
</table>

<!-- end of include/footer.jsp -->
</body>
</html>
