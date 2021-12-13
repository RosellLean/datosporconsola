import java.util.Scanner;

class Datos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");

        String nombre = in.nextLine();

        System.out.print("Ingresa tu apellido: ");

        String apellido = in.nextLine();

        System.out.print("Ingresa tu edad: ");

        String edad = in.nextLine();

        System.out.print("ingresa tu hobbie: ");

        String hobbie = in.nextLine();

        System.out.print("Ingresa tu editor favorito: ");

        String editor = in.nextLine();

        System.out.print("Ingresa el sistema operativo que usas: ");

        String so = in.nextLine();

        System.out.println("Su nombre es: " + nombre);

        System.out.println("Su apellido es: " + apellido);

        System.out.println("Su edad es: " + edad);

        System.out.println("Su hobbie es: " + hobbie);

        System.out.println("Su editor favorito es: " + editor);

        System.out.println("Su sistema operativo es: " + so);

    }
}