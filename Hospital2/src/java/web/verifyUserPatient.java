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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author princEvil
 */
public class verifyUserPatient extends HttpServlet {

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
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            //out.println("" + u);
            //out.println("" + p);
//            checkuserpass(u, p, request, response);
            HttpSession session = request.getSession();
            String gender = request.getParameter("gender");
            String location = request.getParameter("location");
            String contact = request.getParameter("phone");
            String age = request.getParameter("age");
            String email = request.getParameter("email");
            session.setAttribute("gender", gender);
            session.setAttribute("location", location);
            session.setAttribute("phone", contact);
            session.setAttribute("age", age);
            session.setAttribute("email", email);
            session.setAttribute("name", name);
            session.setAttribute("password", password);
            //session.setAttribute("gender","gender");
            verifyPatientName(gender, name, password, location, contact, age, email, response, request);
        } finally {
            out.close();
        }
    }

    private void verifyPatientName(String gender, String name, String password, String location, String contact, String age, String email, HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {

        PrintWriter out = response.getWriter();
        // out.println("heelpp");
        Session s = HibernateUtil.getSession();
        Transaction t = s.beginTransaction();
        Query q = s.createQuery("from Login ");
        //Login l = (Login) s.get(Login.class, 5);
        List<Login> data = q.list();
        //       out.println("heelpp");
        for (Login x : data) {
            //out.println("heelpp 1");
            if (name.equals(x.getUsername())) {
                // out.println("heelpp");
                //out.println("Invalid Username or Password<br>");
                //out.println("<a href=Login/login.html>Try again</a>");
                //out.println("<a href=Login/login.html>Try again</a>");
                String em = "<b><font size=2 color=red>Invalid Patient Username ,Already Exists ,Please try Again!!</font></b>";

                request.setAttribute("errmsg", em);
                request.getRequestDispatcher("login.jsp").forward(request, response);
                //response.sendRedirect("login.jsp");
                //out.println("<script>");
                //out.println("alert('Username Exits ,Try Another One !!')");
                //out.println("</script>");

                break;
            }
        }
        //add into login and patient
        out.println("heelpp pl");
        RequestDispatcher rd = request.getRequestDispatcher("addPatient.jsp");
        rd.forward(request, response);
        /*  Login[] e1=new Login[1];  
         //Patient l = (Patient) s.get(Patient.class, x.getId());
         //Transfering to a jsp page
                
         e1[0]=new Login(password,"patient",'',name,""); 
         s.save(e1[0]);
         t.commit();
                
         Patient[] p=new Patient[1];  
         p[0]=new Patient(name,5,gender,age,email,location,contact); 
         s.save(p[0]);*/
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

}
