package servletpaketi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MASLAN
 */
@WebServlet(name="ServletSinifi1", urlPatterns={"/ServletSinifi1"})
public class ServletSinifi1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {

        String kullaniciAdi = request.getParameter("kullaniciAdi").toString();
        String parola = request.getParameter("parola").toString();

        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=Content-Type content=text/html; charset=UTF-8>");
        out.println("<title>ServletSinifi1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>ServletSinifi1 " + request.getContextPath () + "</h1>");
        out.println("<h2>Kullanıcı Adı :  <font color=red>" + kullaniciAdi +"</font> Hoşgeldiniz</h2>");
        out.println("<h2>Parola        :  <font color=red>" + parola + "</font></h2>");
        out.println("</body>");
        out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setCharacterEncoding( "UTF-8" );
        //JSP sayfasından gelen değerlerdeki Türkçe karakter problemini çözer.

        String kullaniciAdi = request.getParameter("kullaniciAdi").toString();
        System.out.println("kullaniciAdi = " + kullaniciAdi);
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servlet Kullanımı1 için Açıklama";
    }// </editor-fold>

}