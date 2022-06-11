import java.util.Scanner;

public class rifa {
    public static void main(String[] args){
        int limiteInferior = 0;
        int limiteSuperior = 20;
        int numeroGanador = 12;
        int numeroJugador; //Se declara pero no se inicializa
        int numeroIntentos = 1;

        Scanner sc = new Scanner(System.in); // Linea para crear un objeto sc

        System.out.println("Ingresa un número entre " + limiteInferior + " y " + limiteSuperior);
        numeroJugador = sc.nextInt();

        while (numeroJugador != numeroGanador){
            
            if (numeroJugador >= limiteInferior && numeroJugador <= limiteSuperior){
                System.out.println("El número esta dentro del intervalo");
                if (numeroJugador > numeroGanador){
                    System.out.println("Te, pasaste!");
                    numeroIntentos++;
                    System.out.println("Ingresa un número entre " + limiteInferior + " y " + limiteSuperior);
                    numeroJugador = sc.nextInt();
                }
                else {
                    System.out.println("Te, falta!");
                    numeroIntentos++;
                    System.out.println("Ingresa un número entre " + limiteInferior + " y " + limiteSuperior);
                    numeroJugador = sc.nextInt();
                }
            }
                           
            else{
                System.out.println("El número esta Fuera del intervalo");
                System.out.println("Ingresa un número entre " + limiteInferior + " y " + limiteSuperior);
                numeroJugador = sc.nextInt();
            }

        }
        System.out.println("Ganaste!, Adivinaste en " + numeroIntentos);
        sc.close();       
    }
}
