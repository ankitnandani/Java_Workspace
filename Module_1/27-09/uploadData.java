import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize=99999999)
public class uploadData extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		
		System.out.println(fname);
		
		

		PrintWriter out = resp.getWriter();
		
		InputStream fis = null;
		
		try
		{
			
			Part filePart = req.getPart("photo");
			
			if(filePart != null)
			{
				fis = filePart.getInputStream();
			}
			
			Connection conn = null;
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo01","root","");
				
				
				String sql = "Insert into demoTable(fname,lname,email,pass,photo) values(?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1,fname);
				ps.setString(2,lname);
				ps.setString(3,email);
				ps.setString(4,password);
				
				if(fis !=null)
				{
					ps.setBlob(5, fis);
				}
				
				int result = ps.executeUpdate();
				
				if(result>0)
				{
					out.print("Successful");
				}
				else
				{
					out.print("Fail");
				}
				
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
}
