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
				<ul class="list-group sidebar-nav" id="sidebar-nav">
					<!-- Components -->
					<li class="list-group-item list-toggle"><a
						class="accordion-toggle" href="#collapse-components"
						data-toggle="collapse"><spring:message code="data" /></a>
						<ul id="collapse-components" class="collapse">
							<li><a href="features-labels.html"><i class="fa fa-tags"></i>
									<spring:message code="process" /></a></li>
							<li><a href="features-labels.html"><i class="fa fa-tags"></i>
									<spring:message code="show" /></a></li>
							<li><a href="features-labels.html"><i class="fa fa-tags"></i>
									<spring:message code="save" /></a></li>
							<li><a href="features-labels.html"><i class="fa fa-tags"></i>
									<spring:message code="delete" /></a></li>
						</ul></li>
					<!-- End Components -->
					<!-- Testimonials -->
					<li class="list-group-item"><a
						href="features-testimonials.html"><spring:message
								code="archive" /></a></li>
					<!-- Components -->
					<li class="list-group-item list-toggle"><a
						class="accordion-toggle" href="#collapse-user"
						data-toggle="collapse"><spring:message code="user" /></a>
						<ul id="collapse-user" class="collapse">
							<li><a href="features-labels.html"><i class="fa fa-tags"></i>
									<spring:message code="edit" /></a></li>
							<li><a href="features-labels.html"><i class="fa fa-tags"></i>
									<spring:message code="delete" /></a></li>
						</ul></li>
					<!-- End Components -->
					<li class="list-group-item list-toggle"><a
						class="accordion-toggle" href="#collapse-settings"
						data-toggle="collapse"><spring:message code="settings" /></a>
						<ul id="collapse-settings" class="collapse">
							<li class="list-group-item list-toggle"><a class="accordion-toggle" href="#collapse-locale"
								data-toggle="collapse"><spring:message code="locale" /></a>
								<ul id="collapse-locale" class="collapse">
									<li><a href="?lang=en"><i
											class="fa fa-tags"></i> <spring:message code="en" /></a></li>
									<li><a href="?lang=ru"><i
											class="fa fa-tags"></i> <spring:message code="ru" /></a></li>
								</ul></li>
							<li class="list-group-item"><a
								href="features-testimonials.html"><spring:message
										code="settingsData" /></a></li>

						</ul></li>
					<!-- End Components -->
					<li class="list-group-item"><a
						href="features-testimonials.html"><spring:message
								code="logout" /></a></li>

					<!-- End Testimonials -->
				</ul>
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

						<p class="lead">Here will be something soon :))</p>
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