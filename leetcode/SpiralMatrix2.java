package leetcode.may10;

import java.util.Arrays;

public class SpiralMatrix2 {
	
	public static void main(String[] args) {
		int len=4;
		int result[][] = new int[len][len];
		int count = 1;
		int bottom = len;
		int right = len;
		int top=0,left=0;
		
		while(top<bottom && left<right) {
			for(int i=left;i<right;i++) {
				result[top][i] = count++;
			}
			top++;
			for(int i=top;i<bottom;i++) {
				result[i][right-1] = count++;
			}
			right--;
			if(top<bottom) {
				for(int i=right-1;i>=left;i--) {
					result[bottom-1][i]=count++;
				}
				bottom--;
			}
			if(left<right) {
				for(int i=bottom-1;i>=top;i--) {
					result[i][left]=count++;
				}
				left++;
			}
		}
		for(int[] a:result) {
			System.out.println(Arrays.toString(a));
		}

	}
