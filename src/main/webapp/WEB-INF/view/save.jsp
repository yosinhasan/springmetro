<!-- === BEGIN HEADER === -->
<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>
<html>
<%@ include file="/WEB-INF/jspf/head.jspf" %>
<body>
<%@ include file="/WEB-INF/jspf/header.jspf" %>
<!-- === END HEADER === -->
<!-- === BEGIN CONTENT === -->
<div id="content" class="container">
    <div class="row margin-vert-30">
        <!-- Begin Sidebar Menu -->
        <div class="col-md-3">
            <%@ include file="/WEB-INF/jspf/left.jspf" %>
        </div>
        <!-- End Sidebar Menu -->

        <div class="col-md-9">
            <!-- Paragraph and Heading Examples -->
            <div class="row">
                <!-- Paragraph Examples -->
                <div class="col-md-12">
                    <div class="panel panel-primary invert">
                        <div class="panel-heading">
                            <h3 class="panel-title">
                                <spring:message code="showFilesTip"/>
                            </h3>
                        </div>
                        <div class="panel-body">
                            <ul class="showFiles">
                                <c:forEach items="${files}" var="item">
                                    <li><a href="/app/export?id=${item.getId()}" class="btn btn-primary" type="button">
                                        <i class="fa fa-database"></i> ${item.getName()}
                                    </a></li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="clearfix margin-bottom-10"></div>
            </div>
        </div>
    </div>
</div>
</div>
<!-- === END CONTENT === -->
<!-- === BEGIN FOOTER === -->
<%@ include file="/WEB-INF/jspf/footer.jspf" %>
</body>
</html>
<!-- === END FOOTER === -->
