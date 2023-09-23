package Assignment;

public class Array {

	public static void main(String[] args) {
//		int intArray[][] = new int[4][];
//		intArray[0] = new int[3];
//		intArray[1] = new int[2];
//		intArray[2] = new int[3];
//		intArray[3] = new int[2];
//		
//		for (int i = 0; i < intArray.length; i++)
//			for (int j = 0; j < intArray[i].length; j++)
//				intArray[i][j] = (i+1)*10+j;
//		
//		for (int i = 0; i < intArray.length; i++) {
//			for (int j = 0; j < intArray[i].length; j++)
//				System.out.print(intArray[i][j]+" ");
//			System.out.println();
//		}
//	}
		int [][] arr = new int[4][5];
		
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1)*10 + j;
				if(j == (arr[0].length)-1)
					arr[i][j] = 0;
				if(i == (arr.length)-1)
					arr[i][j] = 0;
			}
		
		for(int[] line: arr) {
			for(int num : line)
				System.out.printf("%3d ", num);
			System.out.println();
		}
	}
}
