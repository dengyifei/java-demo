package com.acrabsoft.design.strategy;

public class SelectionSort implements Sort {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++) {
            temp = arr[i];
            int j;
            int samllestLocation = i;
            for (j = i + 1; j < len; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    samllestLocation = j;
                }
            }
            arr[samllestLocation] = arr[i];
            arr[i] = temp;
        }
        System.out.println("ѡ������");
        return arr;
	}

}