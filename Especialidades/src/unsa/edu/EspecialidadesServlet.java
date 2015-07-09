package unsa.edu;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EspecialidadesServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		      
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		String especialidades = req.getParameter("especialidades");
		String mension = req.getParameter("mension");
		String nombre = req.getParameter("nombre");
		String apellidos = req.getParameter("apellidos");
		
		try {
			Especialidad alu = new Especialidad(mension,especialidades,nombre,apellidos);
			pm.makePersistent(alu);
			resp.getWriter().print("GUARDADO\n");
		} catch (Exception e) {
			resp.getWriter().print("ERROR");
		} finally {
			pm.close();
		}
	}
}
