package com.kh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PizzaServlet
 */
@WebServlet("/confirmPizza.do")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1) 전달값 중에 한글이 있을 경우 반드시 인코딩 처리(POST방식일 경우)
		
		// 2) 요청시 전달한 값을 뽑기 및 데이터 가공 처리 => 변수에 기록
		// request.getParmeter("키") : String형의 값
		// request.getParmeterValues("키") : String[] 배열
		
		// 주문자 정보 
		String userName = request.getParameter("userName"); // "홍길동"
		String phone = request.getParameter("phone"); // "01012345678"
		String address = request.getParameter("address"); // "서울시 ~~"
		String message = request.getParameter("message"); // "빨리~~" / ""
		
		// 주문 정보
		String pizza = request.getParameter("pizza"); // "~~피자"
		String[] topping = request.getParameterValues("topping"); // ["치즈", "파인애플",~~] / null
		String[] sides = request.getParameterValues("side"); // ["치킨", "파인애플 샤베트"~~] / null
		String payment = request.getParameter("payment"); // "card"
		
		// 3) 요청처리
		// 보통의 흐름 : Controller - Service - DAO - DB
		
		// 사용자가 보게 될 내용을 처리 : 가격
		int price = 0;
		
		// 피자 가격 + 토핑 추가시 가격 + 사이드 추가시 가격 = 총 결제할 금액
		// 페퍼로니 피자 : 10,000
		// 고구마  피자 : 12,000
		// 마르게리따 피자 : 9,000
		// 콤비네이션 피자 : 4,500
		// 하와이안 피자 : 15,000
		// 민트초코 피자 : 40,000
		
		switch(pizza) { // 피자의 가격
		case "페퍼로니 피자" : 
			price += 10000; 
			break;
		case "고구마 피자" : 
			price += 12000; 
			break;
		case "마르게리따 피자" : 
			price += 9000; 
			break;
		case "콤비네이션 피자" : 
			price += 4500; 
			break;
		case "하와이안 피자" : 
			price += 15000; 
			break;
		case "민트초코 피자" : 
			price += 40000; 
			break;
		}
		
		
		// 토핑 추가 시 가격 추가
		
//		치즈 3000
//		올리브 1000
//		할라피뇨 2000
//		피망 500
//		시금치 100
//		살라미 3000
//		파인애플 2000
		
		if(topping != null) {
			for(int i = 0; i < topping.length; i++) {
				switch(topping[i]) {
				case "치즈" : 
				case "살라미" : 
					price += 3000;
					break;
				case "올리브" : 
					price += 1000;
					break;
				case "할라피뇨" : 
				case "파인애플" : 
					price += 2000;
					break;
				case "피망" : 
					price += 500;
					break;
				case "시금치" : 
					price += 100;
					break;
				}
			}
		}
		
		
//		치킨 4000
//		오븐스파게티 5000
//		치즈스파게티 6000
//		치즈볼 5000
//		피클 200
//		떡볶이 6000
//		파인애플샤베트 5000
		
		
		if(sides != null) {
			for(int i = 0; i < sides.length; i++) {
				switch(sides[i]) {
				case "오븐스파게티" : 
				case "치즈볼" :
				case "파인애플샤베트" :
					price += 5000;
					break;
				case "치즈스파게티" :
				case "떡볶이" :
					price += 6000;
					break;
				case "치킨" : 
					price += 4000;
					break;
				case "피클" : 
					price += 200;
					break;
				}
			}
		}
		
		// 4) 요청처리 후 사용자가 보게될 응답페이지 만들기 또는 JSP에게 위임
		// 스텝1 : request의 attribute영역에 응답페이지에 피요한 값 담기
		request.setAttribute("userName", userName);
		request.setAttribute("phone", phone);
		request.setAttribute("address", address);
		request.setAttribute("message", message);
		
		request.setAttribute("pizza", pizza);
		request.setAttribute("topping", topping);
		request.setAttribute("sides", sides);
		request.setAttribute("payment", payment);
		
		request.setAttribute("price", price);
		
		// 스텝2 : RequestDispatcher 객체 생성(위임할 JSP파일의 경로 기술)
		// request.getRequestDispatcher() 호출하면 반환
		RequestDispatcher view = request.getRequestDispatcher("views/05_PizzaPayment.jsp");
		
		view.forward(request,response);
		
		
		
		
		
		
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
