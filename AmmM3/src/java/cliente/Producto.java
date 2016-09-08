package cliente;
public class Producto {
    
        int id;
    private int precio;
    private int cantidad;
    private String titulo;
    private String descripcion;
    private String imagen;
    private int idVendedor;


public int getId() {
        return id;
}

   public void setId(int id) {
        this.id = id;
    }
   
       public int getPrecio() {
        return precio;
       }
           public void setPrecio(int precio) {
        this.precio = precio;
    }
               public int getDisponibilidad() {
        return cantidad;
    }
               public void setDisponibilidad(int cantidad) {
        this.cantidad = cantidad;
    }
               
               
       public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
       
        public int getIdVendedor() {
        return idVendedor;
    }

                
               
public boolean aumentarCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
            return true;
        }else{
            return false;
        }
    }

    public boolean disminuirCantidad(int cantidad) {
        if ((cantidad > 0)&&(cantidad<=this.cantidad)) {
            this.cantidad = this.cantidad - cantidad;
            return true;
        }else{
            return false;
        }
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
 public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
      public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}