package net.cal.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cal
 */
@WebServlet("/cal") // cái này như là cái id của servlet, như bên jsp nó gọi action url tới cái này thì khi request sẽ chạy đến file này 
public class cal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("a")); // cái này là lấy dữ liệu nhập vào bên jsp, theo cái tên 
		int b = Integer.parseInt(request.getParameter("b"));
		int c = a+b;
		request.setAttribute("c", c); // lệnh này là t đưa dữ liệu vào cai page mà t đẩy data ra
		request.getRequestDispatcher("login.jsp").forward(request, response);// lệnh này như kiểu chuyển file á, nhưng mà nó có đẩy thêm dữ liệu như trên 
		//response.sendRedirect(getServletInfo()); lệnh này cũng là chuyển file nhưng k đẩy data
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
