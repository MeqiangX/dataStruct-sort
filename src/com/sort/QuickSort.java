package com.sort;
/**
 * 快速排序
 * O(nlog2^n) 不稳定
 * @author xq
 *
 */
public class QuickSort {

	public static void quickSort(int arr[],int start,int end){
		if (start < end){
			int pos = findPos(arr,start,end);
			
			quickSort(arr,start,pos-1); // 小于pos的数组 继续快速排序
			quickSort(arr,pos+1,end); // 大于Pos的数组 继续快排
		}
	}
	
	
	//找到下标  每次以数组的第一个为中间点 ，找到中间点的下标  保证左边都是小于a的子数组 右边都是大于a的子数组  循环往复 直到 最后数组大小为1
	public static int findPos(int arr[],int start,int end){
		
		int val = arr[start];
		
		while (start < end){
			//从右边开始 和 val 进行比较
			//注意 这里不能用if  if只判断一次   但是这里的判断是说 如果是右边 要是比val大 就一直向前移，直到比val小 就和start交换 并变换从左边开始比较
			while (start < end && arr[end] >= val){
				--end;
			}
			arr[start] = arr[end];
			
			while (start < end && arr[start] <= val){
				++start;
			}
			arr[end] = arr[start];
			
		}
		
		//最后一定是start = end 退出的
		arr[start] = val;
		
		return start; //返回中间点Pos
	}
	
	
	public static void main(String[] args) {
		//测试快速排序
		
		int a[] = new int[]{1,2,4,-1,2,0,2,3,5,7,2,4,9};
		
		quickSort(a,0,a.length-1);
		
		BubbleSort.printArr(a);
	}
}
