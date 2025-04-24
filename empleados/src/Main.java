import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------------NUEVOS EMPLEADOS-----------");
        System.out.println();
        //Leer los datos del primer empleado ingresados por consola
        Scanner empleado1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer empleado: ");
        //Leer un dato tipo string por consola
        String nombre1 = empleado1.nextLine();
        System.out.println("Ingrese el cargo que desempeña: ");
        String cargo1 = empleado1.nextLine();
        System.out.println("Ingrese la fecha de ingreso a la empresa: ");
        String fecha_ingreso1 = empleado1.nextLine();
        System.out.println("Ingrese el salario que cobra: ");
        //Leer un dato tipo double por consola
        double salario1 = empleado1.nextDouble();
        //Se crea un objeto Empleado con los datos ingresado por consola
        Empleado empleado_uno = new Empleado(nombre1, cargo1,
                fecha_ingreso1, salario1);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        //Leer los datos del segundo empleado
        Scanner empleado2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del segundo empleado: ");
        String nombre2 = empleado2.nextLine();
        System.out.println("Ingrese el cargo que desempeña: ");
        String cargo2 = empleado2.nextLine();
        System.out.println("Ingrese la fecha de ingreso a la compañia: ");
        String fecha_ingreso2 = empleado2.nextLine();
        System.out.println("Ingrese el salario que cobra: ");
        double salario2 = empleado2.nextDouble();
        //Segundo objeto creado con los datos de consola
        Empleado empleado_dos = new Empleado(nombre2, cargo2,
                fecha_ingreso2, salario2);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        //Leer los datos del tercer empleado
        Scanner empleado3 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del tercer empleado: ");
        String nombre3 = empleado3.nextLine();
        System.out.println("Ingrese el cargo que desempeña: ");
        String cargo3 = empleado3.nextLine();
        System.out.println("Ingrese la fecha de ingreso a la compañia: ");
        String fecha_ingreso3 = empleado3.nextLine();
        System.out.println("Ingrese el salario que cobra: ");
        double salario3 = empleado3.nextDouble();
        //Tercer objeto creado con los datos de consola
        Empleado empleado_tres = new Empleado(nombre3, cargo3,
                fecha_ingreso3, salario3);
        System.out.println();
        System.out.println("--------------INFORMACION---------------");
        System.out.println();
        empleado_uno.mostrar_informacion();
        empleado_dos.mostrar_informacion();
        empleado_tres.mostrar_informacion();

        System.out.println("Probando");
    }
}