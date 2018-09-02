package com.sort;
/**
 * ��������
 * ʱ�临�Ӷ� O(n^2) �ȶ�
 * @author xq
 *
 */
public class InsertSort {

	//�ӵڶ�������ʼ ��ǰ����� �Ƚ� 
	public static void insertSort(int arr[]){
		int insertIndex; //��ǰҪ�����λ�� ��ʼ����������±� ���űȽϻᷢ���仯
		int moveIndex; //���Ƚ������±�
		int val; //���浱ǰҪ�Ƚϵ��� 
		
		for (int i = 1;i < arr.length;i++){
			//���ѭ������ �±��ƶ�
			insertIndex = i;
			moveIndex = insertIndex-1;
			val = arr[insertIndex];
			
			while (moveIndex >= 0){
				//��ǰi�±���� ��0~i���±�����Ƚ�
				
				//moveIndex��ֵ �� val��  ��Ϊǰ���������һ��������� ����˵��Ҫ�����λ��һ����moveIndex֮ǰ 
				if (arr[moveIndex] > val){
					//����
					arr[moveIndex+1] = arr[moveIndex];
					insertIndex = moveIndex; // ���õ�ǰҪ������±�ΪmoveIndex
					//moveIndex ǰ��
					--moveIndex;
				}else{
					//С�ڻ��ߵ���val
					
					//ֱ�Ӳ�����insertIndex
					arr[insertIndex] = val;
					
					//break 
					break;
					
				}
			}
			
			//����Ƴ���ѭ�� ���һ���С��0 ˵����ǰҪ�����ֵ λ�ڵ�һ��λ��
			if (moveIndex == -1){
				arr[0] = val;
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int a[] = new int[]{2,1,4,3,2,0,4,2,1};
		
		insertSort(a);
		
		BubbleSort.printArr(a);
		
	}
}
