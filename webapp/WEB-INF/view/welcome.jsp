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
						data-toggle="collapse">Components</a>
						<ul id="collapse-components" class="collapse">
							<li><span class="badge">New</span> <a
								href="features-labels.html"><i class="fa fa-tags"></i>
									Labels</a></li>
							<li><a href="features-panels.html"><i
									class="fa fa-columns"></i> Panels</a></li>
						</ul></li>
					<!-- End Components -->
					<!-- Testimonials -->
					<li class="list-group-item"><a
						href="features-testimonials.html">Testimonials</a></li>
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

						<p class="lead">Lorem ipsum dolor sit amet, noster eirmod
							recusabo ex sit. Senserit abhorreant ei mei, an per fabulas
							graecis splendide, euismod omnesque appetere quo ad. Adhuc
							malorum vel eu, malis pertinacia efficiendi ut quo, ei platonem
							salutatus instructior vim. Nec ne dicit accusata, ius ex vitae
							consequuntur.</p>
						<pre class="prettyprint lang-html">&lt;p class=&quot;lead&quot;&gt; ... &lt;/p&gt;</pre>
						<hr>
						<p>
							<strong>Lorem ipsum dolor sit amet, noster eirmod
								recusabo ex sit. Senserit abhorreant ei mei, an per fabulas
								graecis splendide, euismod omnesque appetere quo ad. Adhuc
								malorum vel eu, malis pertinacia efficiendi ut quo, ei platonem
								salutatus instructior vim. Nec ne dicit accusata, ius ex vitae
								consequuntur.</strong>
						</p>
						<pre class="prettyprint lang-html">&lt;p&gt;&lt;strong&gt; ... &lt;/strong&gt;&lt;/p&gt;</pre>
						<hr>
						<p>Lorem ipsum dolor sit amet, noster eirmod recusabo ex sit.
							Senserit abhorreant ei mei, an per fabulas graecis splendide,
							euismod omnesque appetere quo ad. Adhuc malorum vel eu, malis
							pertinacia efficiendi ut quo, ei platonem salutatus instructior
							vim. Nec ne dicit accusata, ius ex vitae consequuntur.</p>
						<pre class="prettyprint lang-html">&lt;p&gt; ... &lt;/p&gt;</pre>
						<hr>
						<p>
							<em>Lorem ipsum dolor sit amet, noster eirmod recusabo ex
								sit. Senserit abhorreant ei mei, an per fabulas graecis
								splendide, euismod omnesque appetere quo ad. Adhuc malorum vel
								eu, malis pertinacia efficiendi ut quo, ei platonem salutatus
								instructior vim. Nec ne dicit accusata, ius ex vitae
								consequuntur.</em>
						</p>
						<pre class="prettyprint lang-html">&lt;p&gt;&lt;em&gt; ... &lt;/em&gt;&lt;/p&gt;</pre>
						<hr>
						<p>
							<small>Lorem ipsum dolor sit amet, noster eirmod recusabo
								ex sit. Senserit abhorreant ei mei, an per fabulas graecis
								splendide, euismod omnesque appetere quo ad. Adhuc malorum vel
								eu, malis pertinacia efficiendi ut quo, ei platonem salutatus
								instructior vim. Nec ne dicit accusata, ius ex vitae
								consequuntur.</small>
						</p>
						<pre class="prettyprint lang-html">&lt;p&gt;&lt;small&gt; ... &lt;/small&gt;&lt;/p&gt;</pre>
						<hr>
					</div>
					<!-- Heading Examples -->
					<div class="col-md-12">
						<div class="headline">
							<h2>Headings</h2>
						</div>
						<h1>
							H1 Heading <small>Secondary text</small>
						</h1>
						<h2>
							H2 Heading <small>Secondary text</small>
						</h2>
						<h3>
							H3 Heading <small>Secondary text</small>
						</h3>
						<h4>
							H4 Heading <small>Secondary text</small>
						</h4>
						<h5>
							H5 Heading <small>Secondary text</small>
						</h5>
						<h6>
							H6 Heading <small>Secondary text</small>
						</h6>
						<pre class="prettyprint lang-html margin-top-30">&lt;h1&gt;H1 Heading &lt;small&gt;Secondary text&lt;/small&gt;&lt;/h1&gt;
&lt;h2&gt;H2 Heading &lt;small&gt;Secondary text&lt;/small&gt;&lt;/h2&gt;
&lt;h3&gt;H3 Heading &lt;small&gt;Secondary text&lt;/small&gt;&lt;/h3&gt;
&lt;h4&gt;H4 Heading &lt;small&gt;Secondary text&lt;/small&gt;&lt;/h4&gt;
&lt;h5&gt;H5 Heading &lt;small&gt;Secondary text&lt;/small&gt;&lt;/h5&gt;
&lt;h6&gt;H6 Heading &lt;small&gt;Secondary text&lt;/small&gt;&lt;/h6&gt;</pre>
						<hr>

					</div>
				</div>
				<!--/row-->
				<!-- End Paragraph and Heading Examples -->
				<!-- Dropcaps -->
				<div class="row">
					<div class="col-md-12">
						<h2>Dropcaps</h2>
						<p class="dropcap">Lorem ipsum dolor sit amet, noster eirmod
							recusabo ex sit. Senserit abhorreant ei mei, an per fabulas
							graecis splendide, euismod omnesque appetere quo ad. Adhuc
							malorum vel eu, malis pertinacia efficiendi ut quo, ei platonem
							salutatus instructior vim. Nec ne dicit accusata, ius ex vitae
							consequuntur.</p>
						<pre class="prettyprint lang-html">&lt;p class=&quot;dropcap&quot;&gt; ... &lt;/p&gt;</pre>
						<hr>
						<p class="dropcap-box">Lorem ipsum dolor sit amet, noster
							eirmod recusabo ex sit. Senserit abhorreant ei mei, an per
							fabulas graecis splendide, euismod omnesque appetere quo ad.
							Adhuc malorum vel eu, malis pertinacia efficiendi ut quo, ei
							platonem salutatus instructior vim. Nec ne dicit accusata, ius ex
							vitae consequuntur.</p>
						<pre class="prettyprint lang-html">&lt;p class=&quot;dropcap-box&quot;&gt; ... &lt;/p&gt;</pre>
						<hr>
						<p class="dropcap-circle">Lorem ipsum dolor sit amet, noster
							eirmod recusabo ex sit. Senserit abhorreant ei mei, an per
							fabulas graecis splendide, euismod omnesque appetere quo ad.
							Adhuc malorum vel eu, malis pertinacia efficiendi ut quo, ei
							platonem salutatus instructior vim. Nec ne dicit accusata, ius ex
							vitae consequuntur.</p>
						<pre class="prettyprint lang-html">&lt;p class=&quot;dropcap-circle&quot;&gt; ... &lt;/p&gt;</pre>
						<hr>
					</div>
				</div>
				<!--/row-->
				<!-- End Dropcaps -->
				<!-- Descriptions and Lists -->
				<!-- Descriptions -->
				<div class="row margin-bottom-30">
					<!-- Description List -->
					<div class="col-md-6">
						<div class="headline">
							<h2>Description</h2>
						</div>
						<dl>
							<dt>Description lists</dt>
							<dd>A description list is perfect for defining terms.</dd>
							<dt>Euismod</dt>
							<dd>Vestibulum id ligula porta felis euismod semper eget
								lacinia odio sem nec elit.</dd>
							<dd>Donec id elit non mi porta gravida at eget metus.</dd>
							<dt>Malesuada porta</dt>
							<dd>Etiam porta sem malesuada magna mollis euismod.</dd>
						</dl>
					</div>
					<!-- End Description List -->
					<!-- Horizontal Description -->
					<div class="col-md-6">
						<div class="headline">
							<h2>Horizontal Description</h2>
						</div>
						<dl class="dl-horizontal">
							<dt>Description lists</dt>
							<dd>A description list is perfect for defining terms.</dd>
							<dt>Euismod</dt>
							<dd>Vestibulum id ligula porta felis</dd>
							<dd>Donec id elit non mi porta gravida at eget metus.</dd>
							<dt>Malesuada porta</dt>
							<dd>Etiam porta sem malesuada magna mollis euismod.</dd>
							<dt>Felis euismod semper eget lacinia</dt>
							<dd>Fusce dapibus, tellus ac cursus commodo, tortor mauris
								condimentum</dd>
						</dl>
					</div>
					<!-- End Horizontal Description -->
				</div>
				<!--/row-->
				<div class="row">
					<hr class="margin-top-0">
				</div>
				<!-- End Descriptions -->
				<!-- Ordered and Unordered Lists -->
				<div class="row">
					<!-- Unordered Lists -->
					<div class="col-md-6">
						<div class="headline">
							<h2>Unordered Lists</h2>
						</div>
						<ul>
							<li>Lorem ipsum dolor sit amet</li>
							<li>Consectetur adipiscing elit</li>
							<li>Integer molestie lorem at massa</li>
							<li>Facilisis in pretium nisl aliquet</li>
							<li>Nulla volutpat aliquam velit
								<ul>
									<li>Phasellus iaculis neque</li>
									<li>Purus sodales ultricies</li>
									<li>Vestibulum laoreet porttitor</li>
									<li>Ac tristique libero volutpat at</li>
								</ul>
							</li>
							<li>Faucibus porta lacus fringilla vel</li>
							<li>Aenean sit amet erat nunc</li>
							<li>Eget porttitor lorem</li>
						</ul>
						<pre class="prettyprint lang-html">&lt;ul&gt;
    &lt;li&gt; ... &lt;/li&gt;
    &lt;li&gt; ... &lt;/li&gt;
    &lt;li&gt; ... &lt;/li&gt;
&lt;/ul&gt;</pre>
					</div>
					<!-- Ordered Lists -->
					<div class="col-md-6">
						<div class="headline">
							<h2>Ordered Lists</h2>
						</div>
						<ol>
							<li>Lorem ipsum dolor sit amet</li>
							<li>Consectetur adipiscing elit</li>
							<li>Integer molestie lorem at massa</li>
							<li>Facilisis in pretium nisl aliquet</li>
							<li>Nulla volutpat aliquam velit
								<ol>
									<li>Phasellus iaculis neque</li>
									<li>Purus sodales ultricies</li>
									<li>Vestibulum laoreet porttitor</li>
									<li>Ac tristique libero volutpat at</li>
								</ol>
							</li>
							<li>Faucibus porta lacus fringilla vel</li>
							<li>Aenean sit amet erat nunc</li>
							<li>Eget porttitor lorem</li>
						</ol>
						<pre class="prettyprint lang-html">&lt;ol&gt;
    &lt;li&gt; ... &lt;/li&gt;
    &lt;li&gt; ... &lt;/li&gt;
    &lt;li&gt; ... &lt;/li&gt;
&lt;/ol&gt;</pre>
					</div>
				</div>
				<!--/row-->
				<div class="row">
					<hr>
				</div>
				<div class="row">
					<!-- End Ordered and Unordered Lists -->
					<!-- Inline Lists -->
					<div class="col-md-12">
						<div class="headline">
							<h2>Inline Lists</h2>
						</div>
						<ul class="list-inline">
							<li>1. <a href="#">Home</a></li>
							<li>2. <a href="#">About</a></li>
							<li>3. <a href="#">Services</a></li>
							<li>4. <a href="#">Work</a></li>
							<li>5. <a href="#">Blog</a></li>
							<li>6. <a href="#">Portfolio</a></li>
							<li>7. <a href="#">Contacts</a></li>
						</ul>
						<pre class="prettyprint lang-html">&lt;ul class=&quot;list-inline&quot;&gt;
    &lt;li&gt; ... &lt;/li&gt;
    &lt;li&gt; ... &lt;/li&gt;
    &lt;li&gt; ... &lt;/li&gt;
&lt;/ul&gt;</pre>
					</div>
					<!-- End Inline Lists -->
				</div>
				<!--/row-->
				<!-- End Descriptions and Lists -->

				<div class="clearfix margin-bottom-10"></div>
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