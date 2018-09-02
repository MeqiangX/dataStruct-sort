package com.sort;
/**
 * ��������
 * O(nlog2^n) ���ȶ�
 * @author xq
 *
 */
public class QuickSort {

	public static void quickSort(int arr[],int start,int end){
		if (start < end){
			int pos = findPos(arr,start,end);
			
			quickSort(arr,start,pos-1); // С��pos������ ������������
			quickSort(arr,pos+1,end); // ����Pos������ ��������
		}
	}
	
	
	//�ҵ��±�  ÿ��������ĵ�һ��Ϊ�м�� ���ҵ��м����±�  ��֤��߶���С��a�������� �ұ߶��Ǵ���a��������  ѭ������ ֱ�� ��������СΪ1
	public static int findPos(int arr[],int start,int end){
		
		int val = arr[start];
		
		while (start < end){
			//���ұ߿�ʼ �� val ���бȽ�
			//ע�� ���ﲻ����if  ifֻ�ж�һ��   ����������ж���˵ ������ұ� Ҫ�Ǳ�val�� ��һֱ��ǰ�ƣ�ֱ����valС �ͺ�start���� ���任����߿�ʼ�Ƚ�
			while (start < end && arr[end] >= val){
				--end;
			}
			arr[start] = arr[end];
			
			while (start < end && arr[start] <= val){
				++start;
			}
			arr[end] = arr[start];
			
		}
		
		//���һ����start = end �˳���
		arr[start] = val;
		
		return start; //�����м��Pos
	}
	
	
	public static void main(String[] args) {
		//���Կ�������
		
		int a[] = new int[]{1,2,4,-1,2,0,2,3,5,7,2,4,9};
		
		quickSort(a,0,a.length-1);
		
		BubbleSort.printArr(a);
	}
}
