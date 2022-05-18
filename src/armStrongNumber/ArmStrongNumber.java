package armStrongNumber;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int[][] multiArray= new int [3][3];
		
		multiArray[0][0]=1;
		multiArray[0][1]=2;
		multiArray[0][2]=3;
		
		multiArray[1][0]=4;
		multiArray[1][1]=5;
		multiArray[1][2]=6;
		
		multiArray[2][0]=7;
		multiArray[2][1]=8;
		multiArray[2][2]=9;
		
		//Scanner sc= new Scanner(System.in);
		
		
		
		for(int j=0; j<multiArray.length; j++){
			for(int k=0; k<multiArray.length; k++){
				System.out.print(multiArray[j][k]+" ");
			}
			System.out.println();
		}
	}

}
