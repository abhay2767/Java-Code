
public class Practice4Array {
	public static void main(String[]args) {
		//calculate 2D array to add two matrix
		//2X3 Matrix[2][3] mean (2 Row and 3 Column)
		int [][]mat1 = {{1,2,3}, //index =0
				        {4,5,6}};//index =1
		
		int [][]mat2 = {{7,8,9}, //index =0
				        {2,5,8}};//index =1
		//mat1= |1  2  3|, mat2=  |7  8  9| mat1 X mat2 = result  =  |1+7 2+8 3+9| = |8  10  12|
		//      |4  5  6|         |2  5  8|                          |4+2 5+5 6+8|   |6  10  14|
	//	int [][]NewMat3;
		//or
		int [][]result = {{0,0,0},
		                  {0,0,0}};
		
		
		for(int i=0;i<mat1.length;i++)//row number of times(2time because row =2)
		{
			for(int j=0;j<mat1[i].length;j++)//column number of times(3time because column =3)
				{
				System.out.format("setting value for i=%d and j=%d\n", i,j);
				result[i][j] = mat1[i][j] + mat2[i][j];//formula for multiply two matrix
			    }
		}
		//print result
		for(int i = 0;i<mat1.length;i++)//row number of times(2time because row =2)
		{
			for(int j =0;j<mat2[i].length;j++)//column number of times(3time because column =3)
			{
				System.out.print(result[i][j] + " "); 
				result[i][j] = mat1[i][j] + mat2[i][j];//formula for multiply two matrix
		    }
			System.out.println("");
		}
		
	}
}
