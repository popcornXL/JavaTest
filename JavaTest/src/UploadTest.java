import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadTest
 */
@MultipartConfig(location="D:/update")
@WebServlet("/UploadTest")

public class UploadTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
		      throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("utf-8");
		String name=new String(req.getParameter("name"));
		//String file1=new String(req.getParameter("file").getBytes( "ISO-8859-1"), "UTF-8");
		
		PrintWriter out= resp.getWriter();
		Part part =req.getPart("file");
		
			String filename =getFilename(part);
			//writeTo(filename,part);
			part.write(filename);
			String filename2=filename;
			String temp[] = filename2.replaceAll("\\\\","/").split("/");
		    String fileName3 = "";
		    if(temp.length > 1){
		        fileName3 = temp[temp.length - 1];
		    }
		    out.println("filename"+filename+" Name"+name);
			
	}
	private String getFilename(Part part){
		String header=part.getHeader("Content-Disposition");
		String filename=header.substring(header.indexOf("filename=\"")+10,header.lastIndexOf("\""));
		return filename;
	}
	/*
	private void writeTo(String filename,Part part) throws IOException,FileNotFoundException{
		InputStream in=part.getInputStream();
		OutputStream out=new FileOutputStream("D://");
		byte[] buffer=new byte[1024];
		int length= -1;
		while ((length = in.read(buffer))!=-1){
			out.write(buffer, 0, length);
		}
		
		in.close();
		out.close();
		
	}
	*/
}
