<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>흥해지역아동센터</title>

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800|Montserrat:300,400,700" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="vendor/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="vendor/venobox/venobox.css" rel="stylesheet">
  <link href="vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="vendor/boxicons/css/boxicons.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Reveal - v2.2.0
  * Template URL: https://bootstrapmade.com/reveal-bootstrap-corporate-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Top Bar ======= -->
  <section id="topbar" class="d-none d-lg-block">
    <div class="container clearfix">
      <div class="contact-info float-left">
        <i class="fa fa-envelope-o"></i> <a href="mailto:contacthh@naver.com">contacthh@naver.com</a>
        <i class="fa fa-phone"></i> 054 0101 0202
      </div>
    </div>
  </section><!-- End Top Bar-->

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <h1><a href="/"><span>흥해</span>지역아동센터</a></h1>
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="/">메인</a></li>
          <li><a href="#about">소개</a></li>
          <li><a href="#contact">오시는 길</a></li>
          <li><a href="notice/list">공지게시판</a></li>
          <li class="menu-has-children"><a>학습현황</a>
            <ul>
              <li><a href="progress/1">1학년</a></li>
              <li><a href="progress/2">2학년</a></li>
              <li><a href="progress/3">3학년</a></li>
              <li><a href="progress/4">4학년</a></li>
              <li><a href="progress/5">5학년</a></li>
              <li><a href="progress/6">6학년</a></li>
            </ul>
          </li>
          <li><a href="qna/list">질문게시판</a></li>
          <li><a class="btn btn-outline-info" href="manage">관리자</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- End Header -->

  <!-- ======= Intro Section ======= -->
  <section id="intro">

    <div class="intro-content">
      <h2><span>흥해</span>지역아동센터<br></h2>
      <p>흥해지역아동센터 홈페이지입니다.</p>
    </div>

    <div id="intro-carousel" class="owl-carousel">
      <div class="item" style="background-image: url('https://i.imgur.com/YmgC6bz.jpg');"></div>
      <div class="item" style="background-image: url('https://i.imgur.com/irfQmEf.jpg');"></div>
      <div class="item" style="background-image: url('https://i.imgur.com/PxlI2Nb.jpg');"></div>
    </div>

  </section><!-- End Intro Section -->

  <main id="main">

    <!-- ======= About Section ======= -->
    <section id="about" class="wow fadeInUp">
      <div class="container">
        <div class="row">
          <div class="col-lg-6 about-img">
            <img src="https://i.imgur.com/oxg1jBu.jpg" alt="">
          </div>

          <div class="col-lg-6 content">
            <h2>흥해지역아동센터</h2>
            <h3>흥해 지역의 아이들을 위한 아동복지 서비스를 제공하는 시설입니다. 보호가 필요한 아이들에게 방과 후 열린 공간을 제공합니다.</h3>

          </div>
        </div>

      </div>
    </section><!-- End About Section -->

    <!-- ======= Contact Section ======= -->
    <section id="contact" class="wow fadeInUp">
      <div class="container">
        <div class="section-header">
          <h2>오시는 길</h2>
          <div class="content container mb-4">
          	<!-- * 카카오맵 - 지도퍼가기 -->
			<!-- 1. 지도 노드 -->
			<div id="daumRoughmapContainer1607765920814" class="root_daum_roughmap root_daum_roughmap_landing"></div>
			
			<!--
				2. 설치 스크립트
				* 지도 퍼가기 서비스를 2개 이상 넣을 경우, 설치 스크립트는 하나만 삽입합니다.
			-->
			<script charset="UTF-8" class="daum_roughmap_loader_script" src="https://ssl.daumcdn.net/dmaps/map_js_init/roughmapLoader.js"></script>
			
			<!-- 3. 실행 스크립트 -->
			<script charset="UTF-8">
				new daum.roughmap.Lander({
					"timestamp" : "1607765920814",
					"key" : "23g35",
					"mapWidth" : "640",
					"mapHeight" : "360"
				}).render();
			</script>
	      </div>
          <p>버스로 들꽃마을정류장에서 하차, 롯데칠성음료쪽으로 380m 직진, 오른쪽으로 300m 길을 따라 오시면 흥해지역아동센터가 나옵니다.</p>
        </div>

        <div class="row contact-info">

          <div class="col-md-4">
            <div class="contact-address">
              <i class="ion-ios-location-outline"></i>
              <h3>주소</h3>
              <address>경상북도 포항시 북구 흥해읍 칠포로 330</address>
            </div>
          </div>

          <div class="col-md-4">
            <div class="contact-phone">
              <i class="ion-ios-telephone-outline"></i>
              <h3>전화번호</h3>
              <p>054 0101 0202</p>
            </div>
          </div>

          <div class="col-md-4">
            <div class="contact-email">
              <i class="ion-ios-email-outline"></i>
              <h3>이메일</h3>
              <p><a href="mailto:contacthh@naver.com">contacthh@naver.com</a></p>
            </div>
          </div>

        </div>
      </div>

    </section><!-- End Contact Section -->

  </main><!-- End #main -->

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
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="vendor/php-email-form/validate.js"></script>
  <script src="vendor/wow/wow.min.js"></script>
  <script src="vendor/venobox/venobox.min.js"></script>
  <script src="vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="vendor/jquery-sticky/jquery.sticky.js"></script>
  <script src="vendor/superfish/superfish.min.js"></script>
  <script src="vendor/hoverIntent/hoverIntent.js"></script>
  <script src="vendor/isotope-layout/isotope.pkgd.min.js"></script>

  <!-- Template Main JS File -->
  <script src="js/main.js"></script>

</body>

</html>
