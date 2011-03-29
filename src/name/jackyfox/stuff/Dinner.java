package name.jackyfox.stuff;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dinner
 */
public class Dinner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Date dateNow = new Date ();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        StringBuilder time = new StringBuilder( format.format( dateNow ) );
        
		out.println("It's " + time + " now");
		out.close();
	}

}
