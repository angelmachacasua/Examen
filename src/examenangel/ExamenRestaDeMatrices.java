
package examenangel;
public class ExamenRestaDeMatrices {
    public static void main(String[] args) {
        int matris_uno [][] = new int [3][3];
        int matris_dos [][] = new int [3][3];
        int matris_resultante [][]= new int [3][3];
        for (int i = 0; i < matris_uno.length; i++) {
            for (int j = 0; j < matris_uno.length; j++) {
                matris_uno[i][j]=(int)(Math.random()*5);
                
            }
            
        }
        for (int i = 0; i < matris_dos.length; i++) {
            for (int j = 0; j < matris_dos.length; j++) {
                matris_dos[i][j]=(int)(Math.random()*5);
                
            }
            
        }
        for (int i = 0; i < matris_uno.length; i++) {
            for (int j = 0; j < matris_dos.length; j++) {
                matris_resultante[i][j]=matris_uno[i][j]-matris_dos[i][j];
                
            }
            
        }
        for (int i = 0; i < matris_uno.length; i++) {
            
            for (int j = 0; j < matris_uno.length; j++) {
                System.out.print("[ "+ matris_uno[i][j]+" ]");
                
            }
            
            for (int j = 0; j < matris_dos.length; j++) {
                System.out.print("[ "+ matris_dos[i][j]+" ]");
                
            }
            
            
        }
        System.out.println("");
    }
    
}
