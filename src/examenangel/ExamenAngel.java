
package examenangel;

import java.util.Scanner;

public class ExamenAngel {

   static Scanner cs=new Scanner(System.in);
    
    
    public static void imprimirMatris(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if(j==0) {System.out.println("");}
                System.out.print(+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    
    public static int[][] transformada17(){
        System.out.println("Ingrse la dimension de la matriz");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = dim-1; j >= i; j--) {
       
            M[j][i]=numInit;
            numInit++;
        }
        }
        return M;
    }
       
    
    public static void main(String[] args) {
        imprimirMatris(transformada17());
        
    }
    
}
