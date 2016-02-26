package com.tinymood.sort;

/**
 * 插入排序 - 稳定
 * @author 哓哓
 *
 */
public class InsertionSort {
	public void insertionSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		for (int i = 1; i < a.length; i++) {
			// 暂存当前值
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && temp < a[j]) {
				// 后移
				a[j + 1] = a[j];
				j--;
			}
			// 当前值归位
			a[j + 1] = temp;
		}
	}
}
