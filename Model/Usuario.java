
package Model;


public class Usuario {
    
   private int id;
   private int rol;
   private String nombreUsuario;
   private String contraseña; 

    public Usuario(int id, int rol, String nombreUsuario, String contraseña) {
        this.id = id;
        this.rol = rol;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    public Usuario(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   
   
      
}

