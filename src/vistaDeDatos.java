import java.util.Scanner;

public class vistaDeDatos {
    public static void main(String[] args) {

        datosNutriologo persona = new datosNutriologo("javier",18,"m");//Creamos una instancia de la clase
            Scanner sc = new Scanner(System.in);

            System.out.println("introduce el peso");
            persona.setPeso(sc.nextDouble());
            System.out.println("Introduce estatura");
            persona.setEstatura(sc.nextDouble());

        persona.imc();
        }

    }










