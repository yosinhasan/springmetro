<!-- === BEGIN HEADER === -->
<%@ include file="/WEB-INF/jspf/directive/page.jspf"%>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf"%>
<html>
<%@ include file="/WEB-INF/jspf/head.jspf"%>
<body>
	<!-- === END HEADER === -->
	<!-- === BEGIN CONTENT === -->
	<div id="content" class="container">
		<div class="row margin-vert-30">
			<div class="col-md-12">
				<div class="error-404-page text-center">
					<h2>404!</h2>
					<h3>The page can not be found</h3>
					<p>
						The page you are looking for might have been removed, <br>
						had its name changed or is temporarily unavailable.
					</p>
					<form class="form-search search-404">
						<div class="input-append">
							<input type="text" class="span2 search-query">
							<button type="submit" class="btn btn-primary">Search</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- === END CONTENT === -->
	<!-- === BEGIN FOOTER === -->
</body>
</html>
<!-- === END FOOTER === -->