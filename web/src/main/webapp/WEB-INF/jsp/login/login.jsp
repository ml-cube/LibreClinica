<%@ include file="/WEB-INF/jsp/taglibs.jsp" %>
<%@ page import="org.springframework.web.servlet.support.RequestContextUtils" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.akaza.openclinica.service.otp.TwoFactorService" %>

<!-- For Mantis Issue 6099 -->
<jsp:useBean scope='session' id='userBean' class='org.akaza.openclinica.bean.login.UserAccountBean'/>

<c:if test="${userBean.name!=''}">
	<c:redirect url="/MainMenu"/>
</c:if>
<!-- End of 6099-->

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setBundle basename="org.akaza.openclinica.i18n.notes" var="restext"/>
<fmt:setBundle basename="org.akaza.openclinica.i18n.workflow" var="resworkflow"/>
<fmt:setBundle basename="org.akaza.openclinica.i18n.words" var="resword"/>
<fmt:setBundle basename="org.akaza.openclinica.i18n.format" var="resformat"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title><fmt:message key="openclinica" bundle="${resword}"/></title>	
	<meta http-equiv="Content-type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=8" />
    
    <link rel="shortcut icon" type="image/x-icon" href="<c:url value='/images/favicon.ico'/>">
	<link rel="stylesheet" href="<c:url value='/includes/styles.css'/>" type="text/css"/>
	
	<script type="text/JavaScript" language="JavaScript" src="<c:url value='/includes/jmesa/jquery.min.js'/>"></script>
	<script type="text/JavaScript" language="JavaScript" src="<c:url value='/includes/jmesa/jquery-migrate-1.1.1.js'/>"></script>
	<script type="text/javascript" language="JavaScript" src="<c:url value='/includes/jmesa/jquery.blockUI.js'/>"></script>
	<script type="text/JavaScript" language="JavaScript" src="<c:url value='/includes/global_functions_javascript.js'/>"></script>
	<script type="text/JavaScript" language="JavaScript" src="<c:url value='/includes/ua-parser.min.js'/>"></script>
</head>

<%
ApplicationContext appContext = RequestContextUtils.findWebApplicationContext(request);
TwoFactorService factorService = (TwoFactorService) appContext.getBean("factorService");

request.setAttribute("factorService", factorService);
session.setAttribute("factorService", factorService);
%>

<body  onload="document.getElementById('username').focus();">
<!-- start of login/login.jsp -->
 
    <div class="login_BG">

    <!-- I3LUNG logo -->
	<%String ua = request.getHeader( "User-Agent" );
	String temp = "";
	String iev = "";
	if( ua != null && ua.indexOf( "MSIE" ) != -1 ) {
		temp = ua.substring(ua.indexOf( "MSIE" ),ua.length());
		iev = temp.substring(4, temp.indexOf(";"));
		iev = iev.trim();
	}
	if(iev.length() > 1 && Double.valueOf(iev)<7) {%>
	<div ID="logoIE6">&nbsp;</div>
	<%} else {%>
    <div ID="logo">&nbsp;</div>
  	<%}%>
    <!-- end I3LUNG logo -->
        <table>

    <script type="text/javascript">
        var parser = new UAParser();
        var showMessage = false;

        if (parser.getBrowser().name != 'Firefox' && parser.getBrowser().name !='Chrome') {
            showMessage = true;
        }

        if (showMessage) {
            document.write(
                "<tr><td align='center'><h4>" +
                " <fmt:message key="choose_browser" bundle="${restext}"/>" +
                "</h4></td></tr>"
            );
        }
    </script>
            </table>
        
	<table class="loginBoxes">
    	<tr>
        	<td class="loginBox_T">&nbsp;</td>
		</tr>
		<tr>
            <td class="loginBox">
            <div id="loginBox">
            <!-- Login box contents -->
                <div id="login">
                    <form action="<c:url value='/j_spring_security_check'/>" method="post">
                        <h1><fmt:message key="login" bundle="${resword}"/></h1>
                        <b><fmt:message key="user_name" bundle="${resword}"/></b>
                        <div class="formfieldM_BG">
                            <input type="text" id="username" name="j_username" class="formfieldM" />
                        </div>

                        <b><fmt:message key="password" bundle="${resword}"/></b>
                        <div class="formfieldM_BG">
                            <input type="password" id="j_password" name="j_password"  class="formfieldM" autocomplete="off" />
                        </div>

                        <c:if test="${factorService.twoFactorActivated}">
                            <b><fmt:message key="factor" bundle="${resword}"/></b>
                            <div class="formfieldM_BG">
                                <input type="text" id="j_factor" name="j_factor"  class="formfieldM" autocomplete="off" />
                            </div>
                        </c:if>

                        <input type="submit" name="submit" value="<fmt:message key='login' bundle='${resword}'/>" class="loginbutton" />
                        <a href="#" id="requestPassword"> <fmt:message key="forgot_password" bundle="${resword}"/></a>
                   </form>
                   <br/><jsp:include page="../login-include/login-alertbox.jsp"/>
                   <%-- <a href="<c:url value="/RequestPassword"/>"> <fmt:message key="forgot_password" bundle="${resword}"/></a> --%>
               	</div>
            </div>
		</td>
      </tr>
    </table>

    <script type="text/javascript">
        document.getElementById('username').setAttribute( 'autocomplete', 'off' );
        document.getElementById('j_password').setAttribute( 'autocomplete', 'off' );

        jQuery(document).ready(function() {
            jQuery('#requestPassword').click(function() {
                jQuery.blockUI({ message: jQuery('#requestPasswordForm'), css:{left: "200px", top:"180px", textAlign:"left" } });
            });

            jQuery('#cancel').click(function() {
                jQuery.unblockUI();
                return false;
            });
        });

    </script>

    <div id="requestPasswordForm" style="display:none;"><c:import url="requestPasswordPop.jsp" /></div> <!-- this is in fact the reset-password-dialog -->
    
</div>

<!-- end of login/login.jsp -->
<jsp:include page="../login-include/login-footer.jsp"/>
