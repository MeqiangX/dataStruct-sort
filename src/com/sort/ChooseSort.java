package com.sort;
/**
 * 选择排序
 * 时间复杂度O(n^2) 不稳定
 * @author xq
 *
 */
public class ChooseSort {
	
	
	public static void chooseSort(int arr[]){
		
		int val;
		
		for (int i = 0;i < arr.length-1;i++){
			//外层循环控制  比较的元素的移动次数 每次和后面的所有元素比较  一直到倒数第二个 length-2
			for (int j = i+1;j < arr.length;j++){
				//内层循环控制 和i比较的 元素的下标移动  每次都和i+1 到 length-1的下标比较 
				if (arr[i] > arr[j]){
					//交换
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
