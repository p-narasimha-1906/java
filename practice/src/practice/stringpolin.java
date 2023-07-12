package practice;

import java.util.Arrays;

public class stringpolin {
	public static void main(String[] args) {
		int[] a = { 10,20,30};

		int m = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
       if (i == a.length - 1) {
				m++;
				i = -1;
			}
			if (m == 4) {
				break;
			}
		}
		}
	}
