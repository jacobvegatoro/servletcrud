package awl.modulo4.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.ClienteDao;
import awl.modulo4.model.Cliente;

/**
 * Servlet implementation class AgregarCliente
 */
@WebServlet("/AgregarCliente")
public class AgregarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("CrearCliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre = request.getParameter("nombre");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String correo = request.getParameter("correo");
		String rubro = request.getParameter("rubro");
		String direccion = request.getParameter("direccion");
		
		Cliente cli = new Cliente(nombre,telefono,correo,rubro,direccion);
		ClienteDao clientedao = new ClienteDao();
		
		boolean agregar = false;
		agregar = clientedao.agregar(cli);
		
		String mensaje = "";
		
		if (agregar)
			mensaje = "El cliente ha sido agregado exitosamente.";
		else
			mensaje = "Ocurri� un error al procesar la solicitud";
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("CrearCliente.jsp").forward(request, response);		
		
	}

}
