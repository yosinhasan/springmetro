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
                                <spring:message code="settings"/>
                            </h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal">
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">Delta horizontal</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="dH" value="${settings.getDeltaHorizontal()}" class="
                                               form-control" placeholder="Delta horizontal">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">Delta vertical</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="dV" value="${settings.getDeltaVertical()}"
                                               class="form-control" placeholder="Delta vertical">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">Coefficient horizontal</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="cH" value="${settings.getCoefficientHorizontal()}"
                                               class="form-control" placeholder="Coefficient horizontal">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">Coefficient vertical</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="cV" value="${settings.getCoefficientVertical()}"
                                               class="form-control" placeholder="Coefficient vertical">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">Length</label>
                                    <div class="col-sm-10">
                                        <input type="text" name="length" value="${settings.getLength()}"
                                               class="form-control" placeholder="Length">
                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-10">
                                        <button class="btn btn-lg btn-primary" type="button">
                                            <i class="fa fa-cogs"></i><spring:message
                                                code="save"/>
                                        </button>
                                    </div>
                                </div>
                            </form>

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
