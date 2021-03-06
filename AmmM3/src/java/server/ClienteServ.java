
package server;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cliente.Cliente;
import cliente.ListaProducto;
import cliente.Producto;


@WebServlet(name = "ClienteServ", urlPatterns = {"/cliente.html"})
public class ClienteServ extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        
        HttpSession sesion = request.getSession(false);
        if ((sesion.getAttribute("loggedId")!="true")){
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }

        ListaProducto productos = ListaProducto.getProductos();
        ArrayList<Producto> listaProductos = productos.getListaProducto();
        
        int idProducto;
        if (request.getParameter("idProducto")!=null && !(request.getParameter("idProducto").isEmpty())){
            
            idProducto = Integer.parseInt(request.getParameter("idProducto"));
            if (idProducto>0){
                
                request.setAttribute("producto", productos.getProducto(idProducto));
                request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
            }
        }else
            idProducto=0;

        if(request.getParameter("Adquirido") != null){
            Cliente cliente = (Cliente)sesion.getAttribute("cliente");
            request.setAttribute("cliente", cliente);
            int idProductoAdq = Integer.parseInt(request.getParameter("idProductoAcq"));
            double saldoCliente = cliente.saldo.getSaldo();
            Producto producto = productos.getProducto(idProductoAdq);
            if  (saldoCliente >= producto.getPrecio()){
                request.setAttribute("esito", true);
                request.setAttribute("producto", productos.getProducto(idProductoAdq));
                request.getRequestDispatcher("carro.jsp").forward(request, response);
            }else{
                request.setAttribute("esito", false);
                request.setAttribute("producto", productos.getProducto(idProductoAdq));
                request.getRequestDispatcher("carro.jsp").forward(request, response);
            }
        }
          

        sesion.setAttribute("productos", listaProductos);
        request.setAttribute("productos", listaProductos);
        request.setAttribute("idProducto", 0);
        request.getRequestDispatcher("cliente.jsp").forward(request, response);
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
