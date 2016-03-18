<!-- === BEGIN HEADER === -->
<%@ include file="/WEB-INF/jspf/directive/page.jspf"%>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf"%>
<html>
<%@ include file="/WEB-INF/jspf/head.jspf"%>
<body>
	<%@ include file="/WEB-INF/jspf/header.jspf"%>
	<!-- === END HEADER === -->
	<!-- === BEGIN CONTENT === -->
	<div id="content" class="container">
		<div class="row margin-vert-30">
			<!-- Begin Sidebar Menu -->
			<div class="col-md-3">
				<%@ include file="/WEB-INF/jspf/left.jspf"%>
			</div>
			<!-- End Sidebar Menu -->

			<div class="col-md-9">
				<!-- Paragraph and Heading Examples -->
				<div class="row">
					<!-- Paragraph Examples -->
					<div class="col-md-12">
						<div class="headline">

							<h2>
								<spring:message code="welcome" />
							</h2>
						</div>
						<div style="width: 800px;">
							<div id="dataentity"></div>
						</div>
						<div style="width: 800px;">
							<div id="horizontal"></div>
						</div>
						<div>

							<c:forEach items="${marks }" var="item">
								<p>${item }</p>
							</c:forEach>
						</div>
						<div class="clearfix margin-bottom-10"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- === END CONTENT === -->
	<!-- === BEGIN FOOTER === -->
	<%@ include file="/WEB-INF/jspf/footer.jspf"%>
	<script type="text/javascript">
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);
function drawChart() {
	var data = google.visualization.arrayToDataTable([
      ['x', 'vert'],
		<c:forEach items="${vertical}" var="entry">
		[ '${entry.getKey()}', ${entry.getValue()} ],
		</c:forEach>
	]
  );
	var data2 = google.visualization.arrayToDataTable([
    ['x', 'hor'],
  		<c:forEach items="${horizontal}" var="entry">
  		[ '${entry.getKey()}', ${entry.getValue()} ],
  		</c:forEach>
   	]
    );

  var options = {
    title: 'Performance',
    hAxis: {title: 'x',  titleTextStyle: {color: '#333'}},
    vAxis: {minValue: 0}
  };

  var chart = new google.visualization.AreaChart(document.getElementById('dataentity'));
  var chart2 = new google.visualization.AreaChart(document.getElementById('horizontal'));
  chart.draw(data, options);
  chart2.draw(data2, options);
}


</script>

</body>
</html>
<!-- === END FOOTER === -->
