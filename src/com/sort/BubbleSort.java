package com.sort;

/**
 * ð������
 * ʱ�临�Ӷ�O��n^2�� �ȶ�
 * 
 * @author xq
 *
 */
public class BubbleSort {
	
	public static void bubbleSort(int arr[]){
		
		int val;
		
		for (int i = 0;i < arr.length-1;i++){
			//������ѭ������
			for (int j = 0;j < arr.length-i-1;j++){
				//�ڲ����i�Ƚ��ƶ�����
				if (arr[j] > arr[j+1]){
					//����
					val = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = val;
				}
			}
		}
	}
	
	
	public static void printArr(int arr[]){
		for (int i = 0;i < arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = new int[]{2,1,3,5,3,2,0};

		BubbleSort.bubbleSort(a);
		
		printArr(a);
		
	}
}
