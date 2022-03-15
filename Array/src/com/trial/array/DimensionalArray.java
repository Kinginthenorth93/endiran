package com.trial.array;

public class DimensionalArray {
	public static void main(String[] args) {
		int [][] ace = new int[3][3];
		int count=10;
		for(int i=0;i<ace.length;i++) {
			for(int j=0;j<ace.length;j++) {
				ace[i][j]=count;
				count+=10;
				}
			}
		for(int i=0;i<ace.length;i++) {
			for(int j=0;j<ace.length;j++) {
				System.out.print(ace[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
