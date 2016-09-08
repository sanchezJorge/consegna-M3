package cliente;

import java.util.ArrayList;

public class Vendedores extends Usuario{
   private ArrayList<Producto> productoEnVenta = new ArrayList<Producto>(); 

    public Vendedores(){
        super();
    }
        public ArrayList<Producto> getProductoEnVenta() {
        return productoEnVenta;
    }
            public void setProductoEnVenta(ArrayList<Producto> venta) {
        this.productoEnVenta = venta;
    }
}
