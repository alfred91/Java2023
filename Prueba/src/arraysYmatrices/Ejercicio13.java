package arraysYmatrices;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio13{
    
    public static void main(String[] args) {//Creamos los arrays multidimensionales
        int tabla1[][]=new int [2][3];
        int tabla2[][]=new int [2][3];
        int suma[][]=new int [tabla1.length][tabla1[0].length];
        int numero[][]=new int[2][3];
 
        //Rellenamos los dos primeros arrays
        rellenarArrays(tabla1, 1, 200);
        rellenarArrays(tabla2, 1, 200);
 
        //Sumamos los arrays
        SumaMatrices(tabla1, tabla2, suma);
 
        //Mostramos los arrays
        System.out.println("Array 1 ");
        imprimirTabla(tabla1);
 
        System.out.println("Array 2");
        imprimirTabla(tabla2);
 
        System.out.println("La suma de matrices es ");
        imprimirTabla(suma);
    }
    public static void rellenarArrays(int tabla[][], int a, int b){
    	Scanner sc = new Scanner(System.in);
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[0].length;j++){
            	System.out.println("Introduce un numero: ");
                int numero=sc.nextInt();
                tabla[i][j]=numero;
            }
        }
    }

    public static void imprimirTabla (int tabla[][]){
        for (int i=0;i<tabla.length;i++){
            for (int j=0;j<tabla[0].length;j++){
                System.out.print(tabla[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
 
    }
    public static int[][] SumaMatrices (int tabla1[][], int tabla2[][], int sumamatrices[][]){
 
        for (int i=0;i<sumamatrices.length;i++){
            for (int j=0;j<sumamatrices[0].length;j++){
                sumamatrices[i][j]=tabla1[i][j]+tabla2[i][j];
            }
            System.out.println("");
        }
        return sumamatrices;
    }
}