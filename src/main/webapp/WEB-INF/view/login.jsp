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
		<div class="container">
			<div class="row margin-vert-30">
				<!-- Login Box -->
				<div class="col-md-6 col-md-offset-3 col-sm-offset-3">
					<form class="login-page" method="post" action="checkuser">
						<div class="login-header margin-bottom-30">
							<h2><spring:message code="loginTip"/></h2>
						</div>
						<div class="input-group margin-bottom-20">
							<span class="input-group-addon"><i class="fa fa-user"></i></span>
							<input name="username" placeholder="Username" class="form-control" type="text">
						</div>
						<div class="input-group margin-bottom-20">
							<span class="input-group-addon"><i class="fa fa-lock"></i></span>
							<input name="password" placeholder="Password" class="form-control"
								type="password">
						</div>
						<div class="row">
							<div class="col-md-6">
								<label class="checkbox"><input type="checkbox"><spring:message code="stayTip"/>
									</label>
							</div>
							<div class="col-md-6">
								<button class="btn btn-primary pull-right" type="submit"><spring:message code="login"/></button>
							</div>
						</div>
						<hr>
						<h4><spring:message code="forgetPassword"/></h4>
						<p>
							<a href="#"><spring:message code="clickHere" /></a>
						</p>
					</form>
				</div>
				<!-- End Login Box -->
			</div>
		</div>
	</div>
	<!-- === END CONTENT === -->
	<!-- === BEGIN FOOTER === -->
	<%@ include file="/WEB-INF/jspf/footer.jspf"%>
</body>
</html>
<!-- === END FOOTER === -->