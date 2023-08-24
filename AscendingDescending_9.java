//WAP to print the element of array in ascending and descending order.
import java.util.Arrays;

class AscendingDescending_9
{
    public static void main(String[] args) 
    {
        int[] arr = { 5, 2, 1, 8, 10 };
        System.out.println("Current Array");
        for(int i =0;i<5;i++)
        {
        	System.out.print(arr[i]);
        	System.out.print(", ");
        } 
        System.out.println("");
        Arrays.sort(arr);
        
        System.out.println("Ascending Order");
        for (int values : arr)
        {
            System.out.print(values + ", ");
        }
        System.out.println("");
        int[] arr1 = { 5, 2, 1, 8, 10 };
        int l = arr1.length;
		int n = Math.floorDiv(2, 2);
		int temp;
		for(int i = 0;i<n;i++)
		{
			temp = arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
		}
		System.out.println("Descending order");
		for(int element:arr)
		{
			System.out.print(element+", ");
        }
    
    }
}