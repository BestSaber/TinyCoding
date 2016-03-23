package com.tinymood.sort;

import java.util.Arrays;

/**
 * 折半查找
 * @author 哓哓
 *
 */
public class HalfSearch {
	public int halfSearch(int[] a, int low, int high, int x) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (x < a[mid]) {
				high = mid - 1;
			} else if (x > a[mid]) {
				low = mid + 1;
			} else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		System.out.println(Arrays.binarySearch(a, 5));
		System.out.println(new HalfSearch().halfSearch(a, 0, a.length-1, 5));
	}
}
