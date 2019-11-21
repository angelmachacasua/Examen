
package examenangel;

class cs {
    public static void imprimirMatris(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if(j==0) {System.out.println("");}
                System.out.print(+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    
    public static int[][] transformada01(){
        System.out.println("Ingrse la dimension de la matriz");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {
                if ((i+j)%2==0){
                     M[i][j]=numInit+(i+j)*(i+j+1)/2+j;
                }else{
       
            M[i][j]=numInit+(j+i)*(j+i+1)/2+i;
                }
        }
        }
        return M;
    }
       
    
    public static void main(String[] args) {
        imprimirMatris(transformada01());
        
    }

    static int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
