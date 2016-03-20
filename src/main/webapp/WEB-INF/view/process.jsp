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
                            <h3 class="panel-title"><spring:message code="info"/></h3>
                            <form class="form-inline processForm" method="POST" action="<%=request.getServletContext().getContextPath()%>/app/uploadFile"
                                  enctype="multipart/form-data">
                                <div class="form-group">
                                    <label class="sr-only" for="file">Choose file</label>
                                    <input type="file" name="file" id="file" value="choose file">
                                </div>
                                <button class="btn btn-primary" type="submit">
                                    <i class="fa fa-bar-chart-o"></i> <spring:message code="process"/>
                                </button>
                            </form>

                        </div>
                        <div class="panel-body">
                            <div>
                                <div id="dataentity"></div>
                            </div>
                            <div>
                                <div id="horizontal"></div>
                            </div>
                            <br>
                            <div>
                                <c:forEach items="${marks }" var="item">
                                    <blockquote class="processFile">
                                        <p><b>${item }</b></p>
                                    </blockquote>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div>

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
<c:if test="${horizontal != null && vertical != null}">
    <script type="text/javascript">
        google.charts.load('current', {'packages': ['corechart']});
        google.charts.setOnLoadCallback(drawChart);
        function drawChart() {
            var data = google.visualization.arrayToDataTable([
                        ['x', 'vert'],
                        <c:forEach items="${vertical}" var="entry">
                        ['${entry.getKey()}', ${entry.getValue()}],
                        </c:forEach>
                    ]
            );
            var data2 = google.visualization.arrayToDataTable([
                        ['x', 'hor'],
                        <c:forEach items="${horizontal}" var="entry">
                        ['${entry.getKey()}', ${entry.getValue()}],
                        </c:forEach>
                    ]
            );

            var options = {
                title: 'Performance',
                hAxis: {title: 'x', titleTextStyle: {color: '#333'}},
                vAxis: {minValue: 0}
            };

            var chart = new google.visualization.AreaChart(document.getElementById('dataentity'));
            var chart2 = new google.visualization.AreaChart(document.getElementById('horizontal'));
            chart.draw(data, options);
            chart2.draw(data2, options);
        }
    </script>
</c:if>
</body>
</html>
<!-- === END FOOTER === -->
