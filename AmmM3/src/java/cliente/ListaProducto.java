package cliente;

import java.util.ArrayList;

public class ListaProducto {
    
     private static ListaProducto objeto = null;
     
    synchronized public static ListaProducto getProductos () {
        if (objeto == null) {
            objeto = new ListaProducto();
        }
        return objeto;
    }    
     public ArrayList<Producto> listaProducto = new ArrayList<>();
     
        private ListaProducto() {
        Producto elemento1 = new Producto();
        elemento1.setTitulo("Samsung Galaxy S6");
        elemento1.setId(001);
        elemento1.setDescripcion("Samsung Galaxy S6");
        elemento1.setDisponibilidad(20);
        elemento1.setImagen("img/GalaxyS6.jpg");
        elemento1.setPrecio(400);
        listaProducto.add(elemento1);
    
        Producto elemento2 = new Producto();
        elemento2.setTitulo("Samsung Galaxy S7");
        elemento2.setId(002);
        elemento2.setDescripcion("Samsung Galaxy S7");
        elemento2.setDisponibilidad(25);
        elemento2.setImagen("img/GalaxyS7.jpg");
        elemento2.setPrecio(650);
        listaProducto.add(elemento2);
        
        Producto elemento3 = new Producto();
        elemento3.setTitulo("iPhone 6s");
        elemento3.setId(003);
        elemento3.setDescripcion("iPhone 6s");
        elemento3.setDisponibilidad(5);
        elemento3.setImagen("img/iPhone6s.JPG");
        elemento3.setPrecio(700);
        listaProducto.add(elemento3);
        
        Producto elemento4 = new Producto();
        elemento4.setTitulo("iPhone 6s Plus");
        elemento4.setId(004);
        elemento4.setDescripcion("iPhone 6s Plus");
        elemento4.setDisponibilidad(10);
        elemento4.setImagen("img/iPhone6splus.jpg");
        elemento4.setPrecio(999);
        listaProducto.add(elemento4);
    
}

    
    public Producto getProducto(int id){
        for(Producto p : listaProducto){
            if(p.id == id)
                return p;
        }
        return null;
    }
    
    public ArrayList<Producto> getListaProducto(){
        return listaProducto;
    }
    
    public ArrayList<Producto> getProductoPorUser(int id){
        ArrayList<Producto> listaProductoPorUsuario = new ArrayList<>();
        boolean found = false;
        for(Producto p : listaProducto){
            if(p.getIdVendedor() == id){
                listaProductoPorUsuario.add(p);
                found = true;
            }
        }
        if (found)
            return listaProductoPorUsuario;
        else
            return null;
    }
}