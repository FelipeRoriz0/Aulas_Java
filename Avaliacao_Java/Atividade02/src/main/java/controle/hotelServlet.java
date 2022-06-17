package controle;

import java.io.IOException;
//import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/hotelServlet")
public class hotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public hotelServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String test = request.getParameter("dias");

		int noite = 0;
		double conta = 0;
		noite = Integer.parseInt(test);

		for (int i = 1; i <= noite; i++) {
			conta += (100 / i);
		}

		//if (!Objects.isNull(noite)) {
			response.sendRedirect("menu.jsp");
			session.setAttribute("conta", conta);
		//}

	}
}
