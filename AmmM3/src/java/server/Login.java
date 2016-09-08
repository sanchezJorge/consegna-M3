
package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cliente.*;

@WebServlet(name = "Login", urlPatterns = {"/login.html"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);

        if (session.getAttribute("loggedId")=="true"){      

            if (session.getAttribute("userType") == "vendedores"){
                request.getRequestDispatcher("vendedores.jsp").forward(request, response);
            }else{
                ListaProducto lista = ListaProducto.getProductos();
                ArrayList<Producto> listaProducto = lista.getListaProducto();
                request.setAttribute("Producto", listaProducto);
                request.getRequestDispatcher("cliente.jsp").forward(request, response);
            }
        }


        if(request.getParameter("Login") != null){

            String username = request.getParameter("Username");
            String password = request.getParameter("Password");
            
            ArrayList<Usuario> listaUsuarios = Usuarios.getObjeto().getListaUsuarios();
            
            if (username != null && password != null)
                for(Usuario u : listaUsuarios)
                    if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                        session.setAttribute("loggedId", "true");
                        session.setAttribute("id", u.getId());
                        if(u instanceof Vendedores){
                            System.out.println("ASDFASDGASDGASDGASG");
                            request.setAttribute("vendedores", u);
                            session.setAttribute("vendedores", u);
                            session.setAttribute("userType", "vendedores");
                            request.getRequestDispatcher("vendedores.html").forward(request, response);
                        }else{
                            request.setAttribute("cliente", u);
                            session.setAttribute("cliente", u);
                            session.setAttribute("userType", "cliente");
                            request.getRequestDispatcher("cliente.html").forward(request, response);
                        }
                    }
            request.setAttribute("loggedId", "false");
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
