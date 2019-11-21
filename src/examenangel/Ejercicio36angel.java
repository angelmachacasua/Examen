
package examenangel;

import static examenangel.ExamenAngel.imprimirMatris;

import java.util.Scanner;

public class Ejercicio36angel {
    static Scanner cs=new Scanner(System.in);
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    
   
    public static int[][]transformCaracol36(){
        System.out.println("Ingrese la Dimaension de la matriz");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de inicia: ");
        int numInit=cs.nextInt();
        for (int c = 0;c<dim/2;c++) {
            for (int Li = dim-1-c; Li >c; Li--) {
                M[Li][dim-1-c]=numInit;
                numInit++;
            }
            for (int Liz = dim-1-c; Liz>c; Liz--) {
                M[c][Liz]=numInit;
                numInit++;
            }
            for (int Ls = c; Ls <dim-1-c; Ls++) {
                M[Ls][c]=numInit;
                numInit++;
            }
            for (int Ld = c; Ld < dim-1-c; Ld++) {
                M[dim-1-c][Ld]=numInit;
                numInit++;
                }
            
            
            
        
            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }
        return M;
    }
    public static void main(String[] args) {
        imprimirMatris(transformCaracol36());
        
    }
    
    
}
