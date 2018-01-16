<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="row">
		<!-- to display the side bar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>

		</div>
		<!-- to display the actual products -->
		<div class="col-md-9">
			<!-- adding the breadcrumb component of Bootstrap -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts==true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"> <a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts==true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>

		</div>

	</div>



</div>