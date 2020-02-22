package zyh.AServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/AServlet")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ��ȡ���� num1��num2
		String s1 = request.getParameter("num1");
		String s2 = request.getParameter("num2");
		//ת����������
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		//����
		int sum = num1 + num2;
		//���÷�������
		request.setAttribute("result", sum);
		request.getRequestDispatcher("/jiafatest/result.jsp").forward(request, response);
		
	}
	

}
