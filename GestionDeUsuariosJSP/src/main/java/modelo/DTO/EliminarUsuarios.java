package modelo.DTO;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.Conexion;
import modelo.DAO.Usuario;
import modelo.DAO.UsuarioModelo;

/**
 * Servlet implementation class EliminarUsuarios
 */
@WebServlet("/EliminarUsuarios")
public class EliminarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getSession().getAttribute("usuarioLogeado") != null) {
			UsuarioModelo um = new UsuarioModelo();
			Conexion.conectar();
			
			int id = Integer.parseInt(request.getParameter("id"));
			um.eliminarUsuario(id);
			
			Conexion.cerrar();
			
			request.getRequestDispatcher("VerUsuarios").forward(request, response);
		
		} else {
			response.sendRedirect("/Login");
		}
;	}

}
