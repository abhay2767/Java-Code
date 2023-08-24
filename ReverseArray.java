
public class ReverseArray {
	public static void main(String[]args) {
		int []arr= {1,2,3,4,5};
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		int l = arr.length;
		int n = Math.floorDiv(5, 2);
		int temp;
		for(int i = 0;i<n;i++)
		{
			temp = arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
		}
		for(int element:arr)
		{
			System.out.print(element+" ");
		}
	}

}
