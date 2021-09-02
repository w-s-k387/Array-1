package Arrays1;

public class DiagonalMatrix {
	public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return new int[0];
        int m= mat.length; int n= mat[0].length;
        int[] result= new int[m*n];
        int r=0;
        int c=0;    
        int i=0;
        int dir=1;
        while(i < m*n){
            result[i] = mat[r][c];
            i++;
            if(dir==1){
                if(c==n-1){
                    dir=-1; r++;
                }
                else if(r==0){
                    dir=-1;c++;
                    
                }
                else{
                    c++;r--;
                }
            }
            else{ 
                 if(r==m-1){
                    dir=1; c++;
                }
                else if(c==0){
                    dir=1;r++;     
                }
                else{
                    r++;c--;
                }         
            }
        }
        return result;
    }

}