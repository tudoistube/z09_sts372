<!-- 과제24-2.L.3. /z09_sts372/src/main/webapp/WEB-INF/views/testExcel.jsp 생성함. -->

<!-- 과제22-7.CSS, Javascript 준비. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 169p. -->
<%@ page session="false" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<%@include file="zinclude/header.jsp" %>

    <!-- Main content -->
    <section class="content">
      <div class="row">
      <!-- left column -->
      <div class="col-md-12">
        <!-- general form elements -->
		<div class="box">
            <div class="box-header with-border">
              <h1 class="box-title">Spring MVC Excel View Demo (Apache POI)</h1>
        	  <h3><a href="/web/downloadExcel">Download Excel Document</a></h3>
            </div>
        </div>
      </div><!--/.col (left) -->
      </div>   <!-- /.row -->
    </section><!-- /.content -->

    
<%@include file="zinclude/footer.jsp" %>