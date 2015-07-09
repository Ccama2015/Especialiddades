package unsa.edu;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Lista extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Especialidad.class);

		String temp = "";

			
			try{
				List<Especialidad> profe = (List<Especialidad>)q.execute(temp);
					out.println("<br><br><table border='1' width='100%' class='listar_registros'><tr>"
							+ "<th> NOMBRES </th><th> APELLIDOS </th><th> ESPECIALIDAD </th><th> MENSION </th></tr>");
							
							
					for(Especialidad p:profe){
						out.print("<tr>");
						out.println("<td>"+  p.getNombre()+ "</td>"+"<td>"+  p.getApellidos()+ "</td>"+"<td>"+  p.getEspecialidades()+ "</td>" + "<td>"+p.getMension() + "</td>");
														
												out.print("</tr>");
					}
					out.println("</table>");
			}catch(Exception e){
				out.println("Ups .. ERROR");
			}
				finally{
					 q.closeAll();
			}
	}
}