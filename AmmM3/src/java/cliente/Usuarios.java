package cliente;

import java.util.ArrayList;

public class Usuarios {
    
    private static Usuarios usuario;

    private ArrayList<Usuario> listaVendedores = new ArrayList<Usuario>();

    private ArrayList<Usuario> listaClientes = new ArrayList<Usuario>();
    
    public static Usuarios getObjeto() {
        if (usuario == null) {
            usuario = new Usuarios();
        }
        return usuario;
    }
    private Usuarios(){
        
        Cliente cliente1 = new Cliente();
        cliente1.setId(0001);
        cliente1.setNombre("Jorge");
        cliente1.setApellido("Sanchez");
        cliente1.setUsername("Sango");
        cliente1.setPassword("1234");
        cliente1.saldo.setSaldo(3000);
        listaClientes.add(cliente1);
        
        Cliente cliente2 = new Cliente();
        cliente2.setId(0002);
        cliente2.setNombre("Adrian");
        cliente2.setApellido("Justicia");
        cliente2.setUsername("Ajus");
        cliente2.setPassword("1234");
        cliente2.saldo.setSaldo(100);
        listaClientes.add(cliente2);
        
        Vendedores vendedor1 = new Vendedores();
        vendedor1.setNombre("Maribel");
        vendedor1.setApellido("Gomez");
        vendedor1.setId(0003);
        vendedor1.setUsername("Mago");
        vendedor1.setPassword("1234");
        vendedor1.saldo.setSaldo(1530);
        listaVendedores.add(vendedor1);
        
    }
    
    public Usuario getVendedor(int id){
        for(Usuario u : listaVendedores){
            if(u.id == id)
                return u;
        }
        return null;
    }
    
        public Usuario getCliente(int id){
        for(Usuario u : listaClientes){
            if(u.id == id)
                return u;
        }
        return null;
    }
        public ArrayList<Usuario> getListaCliente(){
            return listaClientes;
        }
            public ArrayList<Usuario> getListaVendedor(){
        return listaVendedores;
    }
            
        public ArrayList<Usuario> getListaUsuarios(){
        ArrayList<Usuario> listaUtenti = new ArrayList<Usuario>();
        listaUtenti.addAll(listaVendedores);
        listaUtenti.addAll(listaClientes);
        return listaUtenti;
    }
            
}