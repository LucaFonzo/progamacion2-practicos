package registroempresa;

public class Usuario extends Asociativo{
    private String nombreUsuario;
    private String contrasenia;
    public Usuario(String nombre,String apellido,int edad,String nombreUsuario,String contrasenia){
        super(nombre,apellido,edad);
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    @Override
    public String getInfo(){
        return "Tipo: Usuario " +super.getInfo() + " Nombre usuario: " + this.getNombreUsuario() + " Contraseña: " + this.getContrasenia();
    }
}
