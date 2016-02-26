package com.tinymood.sort;

/**
 * 冒泡排序 - 稳定
 * @author 哓哓
 *
 */

public class BubbleSort {
	public void bubbleSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		boolean flag;
		for (int i = 0; i < a.length-1; i++) {
			flag = false;
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if (false == flag) {
				return;
			}
		}
	}
}
