package com.sort;
/**
 * 插入排序
 * 时间复杂度 O(n^2) 稳定
 * @author xq
 *
 */
public class InsertSort {

	//从第二个数开始 和前面的数 比较 
	public static void insertSort(int arr[]){
		int insertIndex; //当前要插入的位置 开始等于自身的下标 随着比较会发生变化
		int moveIndex; //被比较数的下标
		int val; //保存当前要比较的数 
		
		for (int i = 1;i < arr.length;i++){
			//外层循环控制 下标移动
			insertIndex = i;
			moveIndex = insertIndex-1;
			val = arr[insertIndex];
			
			while (moveIndex >= 0){
				//当前i下标的数 和0~i的下标的数比较
				
				//moveIndex的值 比 val大  因为前面的子数组一定是有序的 所以说明要插入的位置一定在moveIndex之前 
				if (arr[moveIndex] > val){
					//后移
					arr[moveIndex+1] = arr[moveIndex];
					insertIndex = moveIndex; // 设置当前要插入的下标为moveIndex
					//moveIndex 前移
					--moveIndex;
				}else{
					//小于或者等于val
					
					//直接插入在insertIndex
					arr[insertIndex] = val;
					
					//break 
					break;
					
				}
			}
			
			//如果推出了循环 而且还是小于0 说明当前要插入的值 位于第一个位置
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
