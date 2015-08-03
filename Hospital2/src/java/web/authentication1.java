/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import entity.Login;
import hibdao.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author princEvil
 */
public class authentication1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String u = request.getParameter("username");
            String p = request.getParameter("password");
            //out.println("" + u);
            //out.println("" + p);
            checkuserpass(u, p, request, response);
        } finally {
            out.close();
        }
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void checkuserpass(String username, String password, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       // throw new UnsupportedOperationException("Not supported yet.");

        //To change body of generated methods, choose Tools | Templates.
        PrintWriter out = response.getWriter();
        Session s = HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        Query q = s.createQuery("from Login where username='" + username + "' and password='" + password + "' ");
        //Login l = (Login) s.get(Login.class, 5);
        List<Login> data = q.list();
        out.println("reached");
        for (Login x : data) {
            if (password.equals(x.getPassword()) && x.getPosition().equals("admin")) {
                out.println("reached");
                HttpSession session = request.getSession();
                session.setAttribute("name", x.getUsername());
                session.setAttribute("role", x.getPosition());
                session.setAttribute("date", x.getLastLogin());
                String e = new Date().toString();
                //Query u=s.createQuery("update Login set lastLogin='"+e+"' where username='"+ username +"'  ");    
                out.println("reached");
                Login l = (Login) s.get(Login.class, x.getId());
                l.setLastLogin(e);
                s.update(l);
                t.commit();
                out.println("reached");
                // <jsp:forward page="Admin.jsp"></jsp:forward>
                //response.sendRedirect("Admin.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("Admin1.jsp");
                rd.forward(request, response);
            } else if (password.equals(x.getPassword()) && x.getPosition().equals("doctor")) {
                out.println("reached");
                HttpSession session = request.getSession();
                session.setAttribute("name", x.getUsername());
                session.setAttribute("role", "doctor");
                session.setAttribute("date", x.getLastLogin());
                String e = new Date().toString();
                //Query u = s.createQuery("update Login set lastLogin='" + e + "' where username='" + username + "'  ");
                Login l = (Login) s.get(Login.class, x.getId());
                l.setLastLogin(e);
                s.update(l);
                t.commit();
                RequestDispatcher rd = request.getRequestDispatcher("doctor1.jsp");
                rd.forward(request, response);

            } else if (password.equals(x.getPassword()) && x.getPosition().equals("patient")) {
                out.println("Welcome Patient");
                HttpSession session = request.getSession();
                session.setAttribute("name", x.getUsername());
                session.setAttribute("role", "patient");
                String e = new Date().toString();
                //Query u = s.createQuery("update Login set lastLogin='" + e + "' where username='" + username + "'  ");
                session.setAttribute("date", x.getLastLogin());
                Login l = (Login) s.get(Login.class, x.getId());
                l.setLastLogin(e);
                s.update(l);
                t.commit();
                RequestDispatcher rd = request.getRequestDispatcher("patient1.jsp");
                rd.forward(request, response);
            } else {
                out.println("1111");
                response.sendRedirect("invalid.jsp");
                  RequestDispatcher rd = request.getRequestDispatcher("invalid.jsp");
                rd.forward(request, response);
                out.println("Invalid Username or Password<br>");
                out.println("<a href=login.jsp>Try again</a>");
            }
            out.println("1111");
            response.sendRedirect("invalid.jsp");
                  RequestDispatcher rd = request.getRequestDispatcher("invalid.jsp");
                rd.forward(request, response);
        }
         response.sendRedirect("invalid.jsp");
    }

}
