//Para poder leer y procesar datos por teclado es necesario que esta clase sea importada
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Se crea un objeto Scanner para iniciar
        Scanner notas=new Scanner(System.in);

        System.out.println("---------CENTRO DE CALIFICACIONES--------");

        System.out.println("Nombre del estudiante: ");
        //Lee una linea de caracteres
        String nombre=notas.nextLine();

        System.out.println("--------INGRESE LAS CALIFICACIONES-------");
        double suma=0;
        //Usamos la sentencia for para que las calificaciones sean ingresadas 3 veces
        for (int i =0; i < 3; i++) {
            System.out.println("Calificacion " + (i + 1) + ":");
            //Leer datos tipo double
            double calificacion = notas.nextDouble();
            notas.nextLine();
            //Se usa += para una suma total de las calificaciones
            suma += calificacion;
        }
        //Calculo del promedio
        double promedio=suma/3;
        System.out.println("El promedio es: "+promedio);

        //Se muestra si el estudiante aprobo o no
        System.out.println("---------ESTADO DEL ESTUDIANTE-----------");
        System.out.print("Estudiante "+nombre+" : ");
        if (promedio>=7){
            System.out.println("Aprobado");
        }
        else {
            System.out.print("Reprobado");
        }
        //Cerramos el objeto Scanner
        notas.close();
    }
}