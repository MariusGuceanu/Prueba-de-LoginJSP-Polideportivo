package modelo.DTO;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.*;

/**
 * Servlet implementation class ModificarUsaurio
 */
@WebServlet("/ModificarUsuario")
public class ModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModificarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("usuario", UsuarioModelo.cargarUsuario(request.getParameter("id")));
		request.getRequestDispatcher("ModificarForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if(request.getSession().getAttribute("usuarioLogeado") != null) {
			
			ModeloRol mr = new ModeloRol();
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String contrasena = request.getParameter("contrasena");

			Date fecha_nac = null;

			try {
				fecha_nac = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha_nac"));
			} catch (ParseException e) {
				e.printStackTrace();
			}

			Usuario usuario = new Usuario();

			usuario.setId(id);
			usuario.setNombre(nombre);
			usuario.setContrasena(contrasena);
			usuario.setFecha_nac(fecha_nac);
			Rol rol = mr.cargarRol(Integer.parseInt(request.getParameter("rol")));
			usuario.setRol(rol);

			UsuarioModelo.modificarUsuario(usuario);

			response.sendRedirect(request.getContextPath() + "/VerUsuarios");
		
		} else {
			response.sendRedirect("/Login");
		}
	}
}
