package com.sort;
/**
 * ѡ������
 * ʱ�临�Ӷ�O(n^2) ���ȶ�
 * @author xq
 *
 */
public class ChooseSort {
	
	
	public static void chooseSort(int arr[]){
		
		int val;
		
		for (int i = 0;i < arr.length-1;i++){
			//���ѭ������  �Ƚϵ�Ԫ�ص��ƶ����� ÿ�κͺ��������Ԫ�رȽ�  һֱ�������ڶ��� length-2
			for (int j = i+1;j < arr.length;j++){
				//�ڲ�ѭ������ ��i�Ƚϵ� Ԫ�ص��±��ƶ�  ÿ�ζ���i+1 �� length-1���±�Ƚ� 
				if (arr[i] > arr[j]){
					//����
					val = arr[i];
					arr[i] = arr[j];
					arr[j] = val;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int a[] = new int[]{2,2,54,1,234,5,3,42,42,1543,53};
		
		chooseSort(a);
		
		BubbleSort.printArr(a);
		
	}
}
