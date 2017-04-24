import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Gson gson=new Gson();
		request.setCharacterEncoding("UTF8");
        response.setCharacterEncoding("UTF8");
        //System.out.println(request.getParameter("datafromtestFile"));
        PrintWriter out= response.getWriter();
        String happyString=request.getParameter("datafromtestFile");
        if(happyString.equals("aa"))
        {
        HashMap<String,String> map1=new HashMap<>();
        map1.put("id", "1");
        map1.put("name","tom");
        map1.put("birthday","1996-06-16");
        //response.getWriter().print(happyString);
        out.print(gson.toJson(map1));
        }
        else
        {
        	out.print("no");
        }
	}
}
