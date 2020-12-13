<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>[관리자]공지게시판 : 흥해지역아동센터</title>

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800|Montserrat:300,400,700" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="../../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="../../vendor/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="../../vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="../../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="../../vendor/venobox/venobox.css" rel="stylesheet">
  <link href="../../vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="../../vendor/boxicons/css/boxicons.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="../../css/style.css" rel="stylesheet">
	<script>
		function delete_ok(id){
			var a = confirm("정말로 삭제하겠습니까?");
			if(a) location.href='deleteok/' + id;
		}
	</script>
  <!-- =======================================================
  * Template Name: Reveal - v2.2.0
  * Template URL: https://bootstrapmade.com/reveal-bootstrap-corporate-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <h1><a href="/"><span>흥해</span>지역아동센터[관리자]</a></h1>
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li><a href="../../manage/notice/list">공지게시판</a></li>
          <li class="menu-has-children"><a>학습현황</a>
            <ul>
              <li><a href="../../manage/progress/1">1학년</a></li>
              <li><a href="../../manage/progress/2">2학년</a></li>
              <li><a href="../../manage/progress/3">3학년</a></li>
              <li><a href="../../manage/progress/4">4학년</a></li>
              <li><a href="../../manage/progress/5">5학년</a></li>
              <li><a href="../../manage/progress/6">6학년</a></li>
            </ul>
          </li>
          <li class="menu-active"><a>질문게시판</a></li>
          <li><a class="btn btn-outline-info" href="../../">관리자 나가기</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- End Header -->
  <main id="main">
	<section id="notice">
		<div class="container">
		  <div class="content">
		  	<div class="section-header">
				<h2>질문게시판</h2>
			</div>
			<table id="list" class="table">
				<thead>
					<tr>
						<th style="width:5%;">번호</th>
						<th style="width:15%;">날짜</th>
						<th style="width:10%;">이름</th>
						<th style="width:60%;">제목</th>
						<th style="width:10%;">답변</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="u">
						<tr>
							<td><a href="read/${u.id}" style="display:block;color:black;">${u.id}</a></td>
							<td><a href="read/${u.id}" style="display:block;color:black;">${u.postdate_f}</a></td>
							<td><a href="read/${u.id}" style="display:block;color:black;">${u.name}</a></td>
							<td><a href="read/${u.id}" style="display:block;color:black;">${u.title}</a></td>
							<td>
								<c:if test="${u.answer_id ne 1 }">완료</c:if>
								<c:if test="${u.answer_id eq 1 }"><a href="answer/${u.id}" class="btn btn-primary btn-sm">등록</a></c:if>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		  </div>
		</div>
	</section>
  </main>
	
	  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <div class="copyright">
        템플릿: &copy; Copyright <strong>Reveal</strong>. All Rights Reserved
      </div>
      <div class="credits">
        <!--
        All the links in the footer should remain intact.
        You can delete the links only if you purchased the pro version.
        Licensing information: https://bootstrapmade.com/license/
        Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Reveal
      -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- Vendor JS Files -->
  <script src="../vendor/jquery/jquery.min.js"></script>
  <script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="../vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="../vendor/php-email-form/validate.js"></script>
  <script src="../vendor/wow/wow.min.js"></script>
  <script src="../vendor/venobox/venobox.min.js"></script>
  <script src="../vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="../vendor/jquery-sticky/jquery.sticky.js"></script>
  <script src="../vendor/superfish/superfish.min.js"></script>
  <script src="../vendor/hoverIntent/hoverIntent.js"></script>
  <script src="../vendor/isotope-layout/isotope.pkgd.min.js"></script>

  <!-- Template Main JS File -->
  <script src="../js/main.js"></script>
  
</body>
</html>