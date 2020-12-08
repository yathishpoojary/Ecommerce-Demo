import java.io.*;  
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;  
import javax.servlet.http.*;  
import model.ConnectionManager;
public class DisplayImage extends HttpServlet { 
    public void doGet(HttpServletRequest request,HttpServletResponse response)  
             throws IOException  
    { 
    Statement stmt=null;
    String sql=null;
    BufferedInputStream bin=null;
    BufferedOutputStream bout=null;
    InputStream in =null;

    response.setContentType("image/jpeg");  
    ServletOutputStream out;  
    out = response.getOutputStream();  
    Connection conn = ConnectionManager.getConnection();

    int ID = Integer.parseInt(request.getParameter("ID"));
    System.out.println("helo"+ ID);
        try {
            stmt = conn.createStatement();
            sql = "select * from products.Product where id=?"+ID+"";
            ResultSet result = stmt.executeQuery(sql);
            if(result.next()){
                in=result.getBinaryStream(3);//Since my data was in third column of table.
            }
            bin = new BufferedInputStream(in);  
            bout = new BufferedOutputStream(out);  
            int ch=0;   
            while((ch=bin.read())!=-1)  
                {  
                bout.write(ch);  
            }  

        } catch (SQLException ex) {
            Logger.getLogger(DisplayImage.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        try{
            if(bin!=null)bin.close();  
            if(in!=null)in.close();  
            if(bout!=null)bout.close();  
            if(out!=null)out.close();
            if(conn!=null)conn.close();
        }catch(IOException | SQLException ex){
            System.out.println("Error : "+ex.getMessage());
        }
    }


    }  
}  