package com.sort;
/**
 * ϣ������
 * 
 * ��ȵĲ�������
 * ʱ�临�Ӷ� O(n^1.3)
 * ���ȶ�
 * @author xq
 *
 */
public class SheerSort {

	public static void sheerSort(int arr[],int k){
		// k��ȵĲ�������  
		int insertIndex; //�����±�  ��ʼΪi
		int moveIndex; //���Ƚϵ�ǰ��������±� ��ʼΪinsertindex-k
		int val; //���浱ǰ�Ƚ�����ֵ
		
		for (int i = k; i < arr.length;i+=1){
			insertIndex = i;
			moveIndex = insertIndex-k;
			val = arr[insertIndex];
			
			//ѭ����ǰ�Ƚ� ֱ���ҵ��±� ����Խ��
		  while (moveIndex >= 0){
			  
			  if (arr[moveIndex] > val){
				 
				  //��ǰ�±��� ��val�� ������ǰѰ��λ��
				  arr[moveIndex+k] = arr[moveIndex];
				  insertIndex = moveIndex;
				  moveIndex -= k;
				  
			  }else{
				  //��ǰ�±�����val С�ڻ��ߵ���
				  arr[insertIndex] = val;
				  break;
			  }
		  }
			
		  //Խ��
		  if (moveIndex == -1){
			  arr[0] = val;
		  }
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		//����ϣ������
		
		int a[] =  new int[]{2,1,4,6,8,23,1,35,346,54735,73,0};
	
		sheerSort(a,5);
		sheerSort(a,3);
		sheerSort(a,1);
		BubbleSort.printArr(a);
	}
	
}
