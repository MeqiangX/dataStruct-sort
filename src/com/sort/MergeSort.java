package com.sort;
/**
 * �鲢����
 * ���η�  �ֽ��������� �ָ�� ֻ��һ��Ԫ�ص������� ����ÿ������Ͷ��Ǿֲ�����
 * Ȼ�����ϵ�ջ�������������ϲ� ����Ԫ��ֻ��1�������� �ϲ� �Ͷ��������Ԫ�ص��ڲ������ ���������
 * Ȼ��ѭ�� �ֶ�����������Ԫ�ص������� �����Ͳ� ��Ϊ�������4������Ԫ�ص�������
 * ֱ�� ֻʣ��һ������ �鲢���
 * Ҫ����һ����ʱ���� ������ϲ����������� O(n)
 * ʱ�临�Ӷ� O(nlog2^n) 
 * @author xq
 *
 */
public class MergeSort {
	
	public static void mergeSort(int arr[],int start,int end,int temp[]){
		if (start < end){
			
			int mid = (start+end)/2;
			
			//һֱ���·�
			mergeSort(arr,start,mid,temp);
			mergeSort(arr,mid+1,end,temp);
			//�������  ����һ�� �ֽ⵽��� ��ֻʣ�� ֻ��һ��Ԫ�ص����� Ȼ����������ϲ� //Ȼ�󵯳�ջ �����ϲ�
			merge(arr,start,mid,end,temp);
		}
	}
	
	
	//�ϲ�������������
	public static void merge(int arr[],int start,int mid,int end,int temp[]){
		
		int i = start;
		int j = mid+1;
		int k = 0;
		
		//a start-mid  b  mid+1 - end
		
		while (i <= mid && j <= end){
			
			//�ϲ������������е� temp 
			
			if (arr[i] <= arr[j]){
				temp[k++] = arr[i++];
			}else{
				temp[k++] = arr[j++];
			}
		}
		
		//��ʣ���Ԫ�� ���뵽��β
		while (i <= mid){
			temp[k++] = arr[i++];
		}
		
		while (j <= end){
			temp[k++] = arr[j++];
		}
		
		
		//����ʱ���� ����ԭ����
		
		k = 0;
		
		while (start <= end){
			arr[start++] = temp[k++];
		}
		
	}
	
	
	public static void main(String[] args) {
		//���Թ鲢����
		
		int a[] = new int[]{2,1,5,0,-1,4,9,5,7};
		
		int temp[] = new int[9];
		
		mergeSort(a,0,a.length-1,temp);
		
		BubbleSort.printArr(a);
	}
}
