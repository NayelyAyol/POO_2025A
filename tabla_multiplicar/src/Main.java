import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se crea un objeto para iniciar "tablas"
        Scanner tablas=new Scanner(System.in);

        //Se lee un dato tipo entero ingresado por consola
        System.out.println("-----¡APRENDAMOS A MULTIPLICAR!-----");
        System.out.println("Ingrese un numero (1-10): ");
        int numero=tablas.nextInt();

        //Se usa una condicion para evitar el ingreso de datos erroneos
        if (0<numero & numero<=10){
            System.out.println("--------TABLA DE MULTIPLICAR--------");
            //Se usa un bucle for para que e cada iteracion el numero a multiplicar cambie
            for (int i = 1; i <= 10; i++) {
                //Se declara una variable ne la que se guarada el resultado de las multiplicaciones
                int resultado=numero*i;
                System.out.println(numero+" x "+i+" = "+resultado);
            }
        }
        //En caso del ingreso de un dato incorrecto, se muestra un aviso
        else
        {
            System.out.println("Elija un numero del 1 al 10 por favor");
        }
        tablas.close();
    }
}