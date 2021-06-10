/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner (System.in);

        /**
         * Variables enteras que nos permitiran llenar el arreglo de numeros ingresado por el usuario
         * Y realizar las distintas comparaciones
         */
        int sumaNumerosIngresados=0, sumaConjuntosNumerosIngresados=0;
        int contadorMultiplos=0, resto1=0, resto2=0, contadorGeneral=0;
        int numeroIngresado[] = new int[100];

        /**
         * Ciclo do while que se repite hasta que la sumatoria de los numeros ingresados por el usuario sea mayor que 100
         */
        do{
            /**
             * Solicitamos el numero al usuario y lo guardamos en un arreglo de enteros
             */
            System.out.println("Ingrese un numero menor que 100");
            numeroIngresado[contadorGeneral] = scanner.nextInt();
            sumaNumerosIngresados += numeroIngresado[contadorGeneral];
            /**
             * Calculamos el resto de dividir el numero entre 2 y 3
             */
            resto1 = numeroIngresado[contadorGeneral]%2;
            resto2 = numeroIngresado[contadorGeneral]%3;

            /**
             * Si el resto1 y resto2 da 0, significa que tenemos un multiplo de 6
             */
            if (resto1==0 && resto2==0) {
                contadorMultiplos += 1;
            }
            contadorGeneral += 1;
        }while(sumaNumerosIngresados<100);

        /**
         * Ciclo for para realizar la sumatoria de los numeros en el conjunto 1<=x<=10
         */
        for(int i=0; i<contadorGeneral; i++){
            if (numeroIngresado[i]>=1 && numeroIngresado[i]<=10){
                sumaConjuntosNumerosIngresados += 1;
            }
        }
        /**
         * Imprimimos en pantalla el numero de multiplos y la sumatoria de numeros dentro del conjunto 1<=x<=10
         */
        System.out.println("La cantidad de numeros multiplos de 6 es: "+contadorMultiplos);
        System.out.println("El resultado de la suma de los numeros en el conjunto 1<=x<=10 es de: "+sumaConjuntosNumerosIngresados);
    }
}