package com.sort;
/**
 * 希尔排序
 * 
 * 跨度的插入排序
 * 时间复杂度 O(n^1.3)
 * 不稳定
 * @author xq
 *
 */
public class SheerSort {

	public static void sheerSort(int arr[],int k){
		// k跨度的插入排序  
		int insertIndex; //插入下标  开始为i
		int moveIndex; //被比较的前面数组的下标 开始为insertindex-k
		int val; //保存当前比较数的值
		
		for (int i = k; i < arr.length;i+=1){
			insertIndex = i;
			moveIndex = insertIndex-k;
			val = arr[insertIndex];
			
			//循环向前比较 直到找到下标 或者越界
		  while (moveIndex >= 0){
			  
			  if (arr[moveIndex] > val){
				 
				  //当前下标数 比val大 继续向前寻找位置
				  arr[moveIndex+k] = arr[moveIndex];
				  insertIndex = moveIndex;
				  moveIndex -= k;
				  
			  }else{
				  //当前下标数比val 小于或者等于
				  arr[insertIndex] = val;
				  break;
			  }
		  }
			
		  //越界
		  if (moveIndex == -1){
			  arr[0] = val;
		  }
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		//测试希尔排序
		
		int a[] =  new int[]{2,1,4,6,8,23,1,35,346,54735,73,0};
	
		sheerSort(a,5);
		sheerSort(a,3);
		sheerSort(a,1);
		BubbleSort.printArr(a);
	}
	
}
