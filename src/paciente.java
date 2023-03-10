public class paciente {
    private String nombre;
    private int edad;
    private String sexo;
    private double estatura;
    private double Peso;

    public paciente(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public paciente() {

    }

    public paciente(String nombre, int edad, String sexo, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estatura = estatura;
        Peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }
    public void imc(){
        double imc=getPeso()/(getEstatura()*getEstatura());
        if ((imc<18.50) || (imc <24.99)){
            System.out.println("Peso normal"
                    +"\nIMC obtenido:"+imc
                    +"\nnombre:"+getNombre());
        }else if((imc<25.00) || (imc<29.99)){
            System.out.println("esta en sobrepeso;"
                    +"\nIMC obtenido:"+imc
                    +"\nnombre"+getNombre());
        }
    }



}