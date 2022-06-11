import java.util.Scanner;

public class promedio {
    
    public static void main(String[] args){
        String nombreEstudiante, nombreMateria;
        double nota, porcentaje, promedioAcumulado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su Nombre");
        nombreEstudiante = sc.next();

        System.out.println("Ingrese el Nombre de la materia");
        nombreMateria = sc.next();

        System.out.println(nombreEstudiante);
        System.out.println(nombreMateria);

        // el for tiene 3 partes:
        // variable: int i = 0
        // Condicion
        // Incremento
        for (int numNota = 1; numNota < 4; numNota++ ){
            System.out.println("Ingrese la nota " + numNota);
            nota = sc.nextDouble();

            System.out.println("Ingrese el porcentaje de la nota " + numNota);
            porcentaje = sc.nextDouble();

            promedioAcumulado = promedioAcumulado + (nota * porcentaje / 100);            
        }

        System.out.println("La nota definitiva es : " + promedioAcumulado);
        sc.close();
    }
}
