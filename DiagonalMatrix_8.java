//WAP to print Diagonal Matrix.
public class DiagonalMatrix_8 
{
    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        int n = 4;
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 } };
        printPrincipalDiagonal(a, n);
    }
}
