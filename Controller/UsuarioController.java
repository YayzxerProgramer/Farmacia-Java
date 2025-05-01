package controller;

import Model.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Properties;

public class UsuarioController {

    private Usuario usuario;
    private ArrayList<String[]> filas;
    private String mensaje;

    private final String separador = File.separator;
    private final String ruta = System.getProperty("user.dir") + separador + "Usuarios" + separador;
    private final String extension = ".txt";
    private final ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuarioController() {
        usuario = new Usuario();
        mensaje = "";
        File directorio = new File(ruta);
        directorio.mkdir();

        usuarios.add(new Usuario(1, 1, "admin", "1234"));
        usuarios.add(new Usuario(2, 1, "supervisor", "pass123"));
        usuarios.add(new Usuario(3, 0, "cliente", "cliente123"));
    }

    private void instanciarUsuario(int id, int rol, String nombreUsuario, String contraseña) {
        usuario = new Usuario(id, rol, nombreUsuario, contraseña);
    }

    private void actualizarUsuario(int id, int rol, String nombreUsuario, String contraseña) {
        usuario.setId(id);
        usuario.setRol(rol);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setContraseña(contraseña);
    }

    public String crearArchivo(int id, int rol, String nombreUsuario, String contraseña) {
        instanciarUsuario(id, rol, nombreUsuario, contraseña);

        File directorio = new File(ruta);
        File archivo = new File(ruta + id + extension);

        if (!archivo.exists()) {
            try {
                directorio.mkdir();
                try (Formatter formatter = new Formatter(archivo)) {
                    formatter.format("%s\r\n%s\r\n%s\r\n%s\r\n",
                            "numero_de_documento= " + usuario.getId(),
                            "nombre= " + usuario.getNombreUsuario(),
                            "contrasena= " + usuario.getContraseña(),
                            "rol= " + usuario.getRol());

                    mensaje = "archivo " + usuario.getId() + " creado";
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } else {
            mensaje = "el archivo: " + id + extension + " ya existe";
        }
        return mensaje;
    }

    public String actualizarArchivo(int id, int rol, String nombreUsuario, String contraseña) {
        actualizarUsuario(id, rol, nombreUsuario, contraseña);

        File ubicacionArchivo = new File(ruta + id + extension);

        if (ubicacionArchivo.exists()) {
            try (PrintWriter printWriter = new PrintWriter(new FileWriter(ubicacionArchivo))) {
                printWriter.format("%s\r\n%s\r\n%s\r\n%s\r\n",
                        "numero_de_documento= " + usuario.getId(),
                        "nombre= " + usuario.getNombreUsuario(),
                        "contrasena= " + usuario.getContraseña(),
                        "rol= " + usuario.getRol());

                mensaje = "archivo " + usuario.getId() + " actualizado";
            } catch (IOException e) {
                mensaje = "error, vuelva a intentar";
                System.out.println(e.getMessage());
            }
        } else {
            mensaje = "archivo " + id + " no existe";
        }
        return mensaje;
    }

    public String eliminarArchivo(int id) {
        File archivo = new File(ruta + id + extension);

        if (archivo.exists()) {
            try {
                if (archivo.delete()) {
                    mensaje = "registro eliminado correctamente";
                } else {
                    mensaje = "el registro se encuentra en uso";
                }
            } catch (Exception e) {
                mensaje = "Error, vuelva a intentar";
                System.out.println(e.getMessage());
            }
        } else {
            mensaje = "El registro no existe";
        }
        return mensaje;
    }

    public ArrayList<String[]> mostrarUsuariosTabla() {
        filas = new ArrayList<>();
        File archivo = new File(ruta);
        File[] listarArchivos = archivo.listFiles();

        try {
            for (File file : listarArchivos) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    filas.add(new String[]{
                        properties.getProperty("numero_de_documento"),
                        properties.getProperty("nombre"),
                        properties.getProperty("rol"),});
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return filas;
    }

    public boolean existeUsuario(int id) {
        File archivo = new File(ruta + id + extension);
        return archivo.exists();
    }

    public boolean validarFormulario(int id, int rol, String nombreUsuario, String contrasena) {
        return id != 0 && rol != 0 && !"".equals(nombreUsuario)
                && !"".equals(contrasena);
    }

    public int validarCredenciales(String nombreUsuario, String contrasena) {
        for (Usuario u : usuarios) {
            if (u.getNombreUsuario().equals(nombreUsuario) && u.getContraseña().equals(contrasena)) {
                return u.getRol();
            }
        }

        File archivo = new File(ruta);
        File[] listarArchivos = archivo.listFiles();

        if (listarArchivos == null) {
            System.out.println("No se encontraron archivos en: " + ruta);
            return 2;
        }

        try {
            for (File file : listarArchivos) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    if (nombreUsuario.equals(properties.getProperty("nombre"))
                            && contrasena.equals(properties.getProperty("contrasena"))) {
                        return Integer.parseInt(properties.getProperty("rol"));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }

    public boolean agregarUsuario(String nombreUsuario, String contrasena, String rol) {
        if (nombreUsuario == null || contrasena == null || rol == null) {
            return false;
        }

        for (Usuario usuario1 : usuarios) {
            if (usuario1.getNombreUsuario().equals(nombreUsuario)) {
                return false;
            }
        }

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombreUsuario(nombreUsuario);
        nuevoUsuario.setContraseña(contrasena);
        nuevoUsuario.setRol(rol.equals("Administrador") ? 1 : 0);

        usuarios.add(nuevoUsuario);
        return true;
    }

    public Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario1 : usuarios) {
            if (usuario1.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return usuario1;
            }
        }
        return null;
    }

    public boolean modificarUsuario(String nombreOriginal, String nuevoNombreUsuario, String nuevaContraseña) {
        Usuario usuario1 = buscarUsuario(nombreOriginal);

        if (usuario1 == null) {
            return false;
        }

        for (Usuario u : usuarios) {
            if (u.getNombreUsuario().equalsIgnoreCase(nuevoNombreUsuario) && !u.getNombreUsuario().equalsIgnoreCase(nombreOriginal)) {
                return false;
            }
        }

        usuario1.setNombreUsuario(nuevoNombreUsuario);
        usuario1.setContraseña(nuevaContraseña);
        return true;
    }

    public boolean eliminarUsuario(String nombre) {
        for (Usuario usuario1 : usuarios) {
            if (usuario.getNombreUsuario() != null && usuario.getNombreUsuario().equals(nombre)) {
                usuarios.remove(usuario1);
                return true; 
            }
        }
        return false;
    }

    public ArrayList<Usuario> obtenerUsuarios() {
        return usuarios;
    }
}
