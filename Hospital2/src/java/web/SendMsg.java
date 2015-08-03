
package web;

//import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SendMsg extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession sin=request.getSession(true);
        if(sin!=null)
        {
        String s = request.getParameter("dame");
        String a[];
        a = request.getParameterValues("scalp");
        String b[];
        b = request.getParameterValues("eyes");
         String c[];
        c = request.getParameterValues("knee");
         String d[];
         d=request.getParameterValues("jaw");
     String e[];
         e=request.getParameterValues("neck");
         String f[];
         f=request.getParameterValues("chest");
         String g[];
         g=request.getParameterValues("abdomen");
         String h[];
         h=request.getParameterValues("thigh");
         String ii[];
         ii=request.getParameterValues("feet");
         String j[];
         j=request.getParameterValues("toe");

        String k="";
        String l="";
        String m=""; 
        String n="";
        String o="";
        String p="";
        String q="";
        String r="";
        String sp="";
        String t="";
        if(a!=null)
        for (String a1 : a) {
            k = k+ a1+ "," ;
        }
        if(b!=null)
        for(String b1 : b) {
           l = l + b1 + ",";
        }
        if(c!=null)
        for (String c1 : c) {
           m = m + c1 + ",";
       }
        if(d!=null)
         for (String d1 : d) {
        n = n + d1 + ",";
         }
        if(e!=null)
         for (String e1 : e) {
         o = o + e1 + ",";
         }
        if(f!=null)
         for (String f1 : f) {
         p = p + f1 + ",";
         }
        if(g!=null)
         for (String g1 : g) {
         q = q + g1 + ",";
         }
        if(h!=null)
         for (String h1 : h) {
         s = s + h1 + ",";
         }
        if(ii!=null)
         for (String ii1 : ii) {
         t = t + ii1 + ",";
         }
        if(j!=null)
         for (String j1 : j) {
         sp = sp + j1 + ",";
         }
        //System.out.println(sim);
       // out.println(s);
        
        String msg=k+l+n+m+o+p+q+r+sp+t;
        String name=(String)sin.getAttribute("username");
        HttpSession session=request.getSession();
        session.setAttribute("msg",msg);
        session.setAttribute("reciever",s);
        session.setAttribute("check","'+no+'");
        session.setAttribute("sender",name);
        RequestDispatcher rd = request.getRequestDispatcher("msg.jsp");   
        rd.forward(request, response);
        /*
        String  i=(String)sin.getAttribute("userid");
        
        Connection con=dao.DBService.getConnection();   
        Statement ss=con.createStatement();
        
        out.println(msg);
        out.println("<a href=http://localhost:8084/formservlet/medanta/medanta.html>Your message has been sent !! wait for the reply !!</a>");
        ss.execute("insert into message(reciver,senderid,check_y_n,sender,msg) values('"+s+"','"+i+"','no','"+name+"','"+msg+"')");
        
        response.sendRedirect("http://localhost:8084/formservlet/Login/login.html");
        */
        }
   // response.sendRedirect("ClientHome.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SendMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SendMsg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
