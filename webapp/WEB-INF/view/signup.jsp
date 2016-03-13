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
			<!-- Register Box -->
			<div class="col-md-6 col-md-offset-3 col-sm-offset-3">
				<form class="signup-page">
					<div class="signup-header">
						<h2>Register a new account</h2>
						<p>
							Already a member? Click <a href="#">HERE</a> to login to your
							account.
						</p>
					</div>
					<label>First Name</label> <input
						class="form-control margin-bottom-20" type="text"> <label>Last
						Name</label> <input class="form-control margin-bottom-20" type="text">

					<label>Email Address <span class="color-red">*</span></label> <input
						class="form-control margin-bottom-20" type="text">
					<div class="row">
						<div class="col-sm-6">
							<label>Password <span class="color-red">*</span></label> <input
								class="form-control margin-bottom-20" type="password">
						</div>
						<div class="col-sm-6">
							<label>Confirm Password <span class="color-red">*</span></label>
							<input class="form-control margin-bottom-20" type="password">
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-lg-8">
							<label class="checkbox"> <input type="checkbox">
								I read the <a href="#">Terms and Conditions</a>
							</label>
						</div>
						<div class="col-lg-4 text-right">
							<button class="btn btn-primary" type="submit">Register</button>
						</div>
					</div>
				</form>
			</div>
			<!-- End Register Box -->
		</div>
	</div>


	<!-- === END CONTENT === -->
	<!-- === BEGIN FOOTER === -->
	<%@ include file="/WEB-INF/jspf/footer.jspf"%>
</body>
</html>
<!-- === END FOOTER === -->