public class Empleado {
    //Atributos de la clase empleados
    public String nombre, cargo, fecha_ingreso;
    public double salario;
    //Se inicializan los atributos
    public Empleado(String nombre, String cargo, String fecha_ingreso,
                    double salario){
        this.nombre=nombre;
        this.cargo=cargo;
        this.fecha_ingreso=fecha_ingreso;
        this.salario=salario;
    }
    //Metodo para mostrar la informacion
    public void mostrar_informacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Fecha de ingreso: "+ fecha_ingreso);
        System.out.println("Salario: "+ salario);
        System.out.println();
        System.out.println("-------------------------------------");
    }
}