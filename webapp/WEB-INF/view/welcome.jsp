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
						<div class="clearfix margin-bottom-10"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- === END CONTENT === -->
	<!-- === BEGIN FOOTER === -->
	<%@ include file="/WEB-INF/jspf/footer.jspf"%>
</body>
</html>
<!-- === END FOOTER === -->
