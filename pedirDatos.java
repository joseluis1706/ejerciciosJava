import java.util.Scanner;
public class pedirDatos {
    public static void main(String[] args) {
        Scanner capturarTexto = new Scanner(System.in);
        String nombre, apellido;
        System.out.println("Ingrese su Nombre: ");
        nombre = capturarTexto.nextLine();
        System.out.println("Ingrese su Apellido: ");
        apellido = capturarTexto.nextLine();
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
        capturarTexto.close();        
    }    
}
