package www.inacap.cl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Respuestas.do")
public class Respuestas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombrePersona = request.getParameter("nombre");
		String comuna = request.getParameter("comuna");
		String telefono = request.getParameter("telefono");
		String mail = request.getParameter("mail");
		String sYr= request.getParameter("historia");
		
		if (nombrePersona=="") {nombrePersona="Anonimo";};
		
		
		request.setAttribute("nombre", nombrePersona);
		request.setAttribute("comuna", comuna);
		request.setAttribute("telefono", telefono);
		request.setAttribute("mail", mail);
		request.setAttribute("SugYRecl",sYr);
		
		
		
		RequestDispatcher dp = request.getRequestDispatcher("Usuario.jsp");
		dp.forward(request, response);
		
		
	}


}