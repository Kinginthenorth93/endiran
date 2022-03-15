package com.trial.array;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] jake=new int[5][];
		jake[0]=new int[1];
		jake[1]=new int[2];
		jake[2]=new int[3];
		jake[3]=new int[4];
		jake[4]=new int[5];
		
		int add=3;
		for(int i=0;i<jake.length; i++) {
			for(int j=0;j<jake[i].length;j++) {
				jake[i][j]=add;
				add+=1;
							
			}
		}
		for(int i=0;i<jake.length;i++) {
			for(int j=0; j<jake[i].length;j++) {
				System.out.print(jake[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
