<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Title</title>
		<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="../static/css/font-awesome.min.css">
		<script type="application/javascript" src="../static/js/jquery-3.5.1.min.js"></script>
		<script type="application/javascript" src="../static/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12">含元殿</div>
			</div>
			<div class="row">
				<nav class="navbar navbar-default" role="navigation">
					<div class="container-fluid">
						<div>
							<!--向左对齐-->
							<ul class="nav navbar-nav navbar-left">
								<li>
									<a href="user/index">
										<i class="fa fa-users"></i>&nbsp;
										用户信息
									</a>
								</li>
								<!-- 根据角色信息判断是否是超级管理员，还是管理员 -->
								<c:if test="${(sessionScope.user.role.id ==1)||(sessionScope.user.role.id ==2)}">
									<li>
										<a href="role/index">
											<i class="fa fa-key"></i>&nbsp;
											角色信息
										</a>
									</li>
								</c:if>
								<!-- 循环菜单集合，显示菜单信息 -->
								<c:forEach items="${menuList}" var="menu">
									<li class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown">
											<i class="${menu.icon}"></i>&nbsp;
												${menu.text}
											<b class="caret"></b>
										</a>
										<ul class="dropdown-menu">
											<c:forEach items="${menu.children}" var="child">
												<li>
													<a href="javascript:openFrame('${child.url}');">
														<i class="${child.icon}"></i>&nbsp;
															${child.text}
													</a>
												</li>
											</c:forEach>
										</ul>
									</li>
								</c:forEach>
							</ul>
							<!--向右对齐-->
							<ul class="nav navbar-nav navbar-right">
								<li>
									<a href="#">
										<i class="fa fa-user"></i>&nbsp;
										${sessionScope.user.name}
									</a>
								</li>
								<li>
									<a href="user/logout">
										<i class="fa fa-sign-out"></i>&nbsp;
										退出
									</a>
								</li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</body>
</html>
