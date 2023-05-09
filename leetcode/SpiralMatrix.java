//Leetcode problem number 54
package leetcode.may9;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		List<Integer> result = new ArrayList<>();
		int a[][] = { { 1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int m = a.length;
		int n = a[0].length;
		int k=0,l=0;
		
		while(k<m && l<n) {
			for(int i=l;i<n;i++) {
				result.add(a[k][i]);
			}
			k++;
			for(int i=k;i<m;i++) {
				result.add(a[i][n-1]);
			}
			n--;
			if(k<m) {
				for(int i=n-1;i>=l;i--) {
					result.add(a[m-1][i]);
				}
				m--;
			}
			if(l<n) {
				for(int i=m-1;i>=k;i--) {
					result.add(a[i][l]);
				}
				l++;
			}
		}
		System.out.println(result);

	}

}
