package server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "VenditoreServ", urlPatterns = {"/vendedores.html"})
public class VenditoreServ extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession sesion = request.getSession(false);
        if ((sesion.getAttribute("loggedId")!="true")){
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }

        if(request.getParameter("Insertar") != null){
            request.setAttribute("nombre", (String)(request.getParameter("nombre")));
            request.setAttribute("img", (String)(request.getParameter("img")));
            request.setAttribute("descripcion", (String)(request.getParameter("descripcion")));
            request.setAttribute("precio", (String)(request.getParameter("precio")));
            request.setAttribute("cantidad", (String)(request.getParameter("cantidad")));
            request.getRequestDispatcher("confirmacionVendedor.jsp").forward(request, response);
        }
        
        request.getRequestDispatcher("vendedores.jsp").forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
