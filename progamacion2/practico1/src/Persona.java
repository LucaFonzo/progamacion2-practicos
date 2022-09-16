import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Persona {
    final static double MINIMC = 18.5;
    final static double MAXIMC = 25;
    final static int EDALEGAL = 18;
    final static int EDADVOTAR = 16;
    private int DNI;
    private LocalDate fechaNacimiento;
    private char sexo;
    private String nombre;
    private double altura;
    private double peso;

    public Persona(int DNI){
        this.DNI = DNI;
        fechaNacimiento = LocalDate.of(2020,1,1);
        sexo = 'f';
        nombre = "N N";
        peso = 1;
        altura = 1;
    }
    public double getIMC(){
        double IMC = this.peso / Math.pow(this.altura,2);
        return IMC;
    }
    public boolean itsInShape(){
        double IMC = getIMC();
        if (IMC >= MINIMC && IMC <= MAXIMC){
            return true;
        }
        return false;
    }
    public boolean itsBirthDay(){
        if (this.fechaNacimiento == LocalDate.now()){
            return true;
        }
        return false;
    }
    public long calcAge(){
        LocalDate fechaActual = LocalDate.now();
        long edad = ChronoUnit.YEARS.between(this.fechaNacimiento,fechaActual);
        return edad;
    }
    public boolean itsOlderThan18(){
        long edad = calcAge();
        if (edad >= EDALEGAL){
            return true;
        }
        return false;
    }
    public boolean canVote(){
        long edad = calcAge();
        if (edad >= EDADVOTAR){
            return true;
        }
        return false;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getInfo(){
        String info =  "Nombre: " + this.nombre + "\n" + "fecha nacimiento: " + this.fechaNacimiento + "\n" + "Sexo: " + this.sexo + "\n" + "Peso: " + this.peso + "\n" + "Altura: " + altura;
        return info;
    }
}
