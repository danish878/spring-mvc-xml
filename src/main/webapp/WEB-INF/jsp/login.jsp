<%--
  Created by IntelliJ IDEA.
  User: Danish
  Date: 6/29/2019
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../layout/taglib.jsp"%>

<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <form:form class="form-signin" method="post" action='${pageContext.request.contextPath}/login'>
                <%--    <form class="form-signin" method="post" action='<spring:url value="/login" />'>--%>
                <h2 class="form-signin-heading text-center">SIGN IN</h2>
                <p>
                    <label for="username" class="sr-only">Username</label>
                    <input type="text" id="username" name="username" class="form-control" placeholder="Username" required=""
                           autofocus="">
                </p>
                <p>
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" id="password" name="password" class="form-control" placeholder="Password"
                           required="">
                </p>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
                <%--        <input type="hidden" name="_csrf" value="${_csrf.token}"/>--%>
                <%--    </form>--%>
            </form:form>
        </div>
    </div>
</div>