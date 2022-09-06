<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userName = (String)request.getAttribute("userName");
	String phone = (String)request.getAttribute("phone");
	String address = (String)request.getAttribute("address");
	String message = (String)request.getAttribute("message");
	
	String pizza = (String)request.getAttribute("pizza");
	String[] topping = (String[])request.getAttribute("topping");
	String[] sides = (String[])request.getAttribute("sides");
	String payment = (String)request.getAttribute("payment");
	
	
	int price = (int)request.getAttribute("price");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>피자 결제 페이지</title>
</head>
<body>

    <h1>피자 결제 페이지</h1>

    <h2>주문 내역</h2>

    <h4>주문자 정보</h4>

    <!-- client 작성한 value값은 XXX으로 표현하겠음 . -->

    <ul>
        <li>성함 : <%= userName %></li>
        <li>전화번호 : <%= phone %></li>
        <li>주소 : <%= address %></li>

		<% if(message.equals("")){ %>
        	<!-- case1. 요청사항을 작성하지 않은 경우 -->
        	<li>요청사항 : 작성안함</li>
		<% } else { %>
        	<!-- case2. 요청사항을 작성한 경우 -->
        	<li>요청사항 : <%= message %></li>
        <% } %>
    </ul>

    <br>
    <h4>[ 주문 정보 ]</h4>

    <ul>
        <li>피자 : <%= pizza %></li>

        <!-- 피망, 올리브, 파인애플....-->
		
		<% if(topping == null) { %>
        	<!-- case1. 토핑을 선택하지 않았을 경우 -->
        	<li>토핑 : 선택안함</li>
		<% } else {  %>
       		<!-- case1. 토핑을 선택했을 경우 -->
        	<li> 토핑 : <%= String.join(",", topping) %></li>
		<% } %>
		
		<% if(sides == null) { %>
        	<!-- case1. 사이드를 선택하지 않았을 경우 -->
        	<li>사이드 : 선택안함</li>
		<% } else { %>	
        	<!-- case1. 사이드를 선택했을 경우 -->
        	<li> 사이드 : <%= String.join("," , sides) %></li>
		<% } %>
		
		<% if(payment.equals("cash")) { %>
        	<!-- case 1. 현금을 선택했을 경우 -->
        	<li>경제방식 : 현금</li>
        <% } else { %>
        	<!-- case 1. 카드를 선택했을 경우 -->
        	<li>결제방식 : 카드</li>
        <% } %>

    </ul>

    <br>

    <h3>위와 같이 주문하셨습니다.</h3>
    <h2>총 가격 : <%= price %>원 입니다.</h2>

</body>
</html>