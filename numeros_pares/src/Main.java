import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se crea un objeto para leer desde la entrada
        Scanner pares = new Scanner(System.in);
        //Se lee un dato tipo int del teclado
        System.out.println("-------¡ENCONTREMOS LOS NUMEROS PARES!------");
        System.out.print("¿Cuantos numeros desea ingresar?:");
        //LEE un dato tipo entero
        int cantidad = pares.nextInt();

        System.out.println("------------Ingrese los numeros--------------");
        //Se declara una variable que hara de contador
        int total = 0;
        //Se usa la sentencia for para leer cada numero que el usuario ingrese
        for (int i = 0; i < cantidad; i++) {
            //Se lee un dato tipo int
            System.out.println("Numero " + (i + 1) + ":");
            int numero = pares.nextInt();
            //Se pone una condicion
            if (numero % 2 == 0) {
                total++;
            }
        }

        //Se muestran los resultados con ayuda de la sentencia if
        System.out.println("-----------------RESULTADOS------------------");
        if (total == 0) {
            System.out.println("No hay numeros pares");
        }
        else {
            System.out.println("Hay " + total + " numeros pares");
        }
        //Se cierra el objeto
        pares.close();
    }
}