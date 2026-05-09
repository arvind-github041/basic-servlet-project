package Mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		
		int firstNumber =Integer.parseInt(str1);
		int secNumber =Integer.parseInt(str2);
		int sum =0;
		
		
		String operation = request.getParameter("button"); 
		int op = Integer.parseInt(operation);
		
		if(op == 1) {
			sum = firstNumber + secNumber;
		}else if(op == 2) {
			 sum = firstNumber - secNumber;
		}else if(op == 3) {
			 sum = firstNumber * secNumber;
		}else {
			 sum = firstNumber / secNumber;
		}
		
		//response.setContentType("text/html");

		//response.getWriter().println("<h1>Sum = " + sum + "</h1>");
		response.getWriter().append("result "+ sum);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
