package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WSServlet")
public class WSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WSServlet() {
        super();
    }
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*doGet(request, response);*/;
		Soap soap = new Soap();
		
		PrintWriter out = response.getWriter();
		String value = request.getParameter("value").toString();
		if(value.equals("")){
			out.write("error: Please, provide a value!");  
		}else{
			//Gets a bit ugly here, I was supposed to fix these
			//parts after getting it running but I didn't get
			//the Soap.java part to work.
			int arvo = Integer.parseInt(value);
			int result;
			result = soap.addAmount(arvo, 10);
			System.out.println(result);
			out.write(result); 			
		}
					 
		out.flush();
	    out.close();
	}

}
