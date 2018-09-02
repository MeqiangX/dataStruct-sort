package com.sort;
/**
 * 归并排序
 * 分治法  现将整个数组 分割成 只有一个元素的子数组 这样每个数组就都是局部有序
 * 然后向上弹栈，继续对两两合并 两个元素只有1个的数组 合并 和多个有两个元素的内部有序的 多个子数组
 * 然后循环 又对有两个有序元素的子数组 两两和并 成为多个含有4个有序元素的子数组
 * 直到 只剩下一个数组 归并完成
 * 要借助一个临时数组 来保存合并的有序数组 O(n)
 * 时间复杂度 O(nlog2^n) 
 * @author xq
 *
 */
public class MergeSort {
	
	public static void mergeSort(int arr[],int start,int end,int temp[]){
		if (start < end){
			
			int mid = (start+end)/2;
			
			//一直向下分
			mergeSort(arr,start,mid,temp);
			mergeSort(arr,mid+1,end,temp);
			//最后治理  即第一次 分解到最后 就只剩下 只含一个元素的数组 然后将有序数组合并 //然后弹出栈 两两合并
			merge(arr,start,mid,end,temp);
		}
	}
	
	
	//合并两个有序数组
	public static void merge(int arr[],int start,int mid,int end,int temp[]){
		
		int i = start;
		int j = mid+1;
		int k = 0;
		
		//a start-mid  b  mid+1 - end
		
		while (i <= mid && j <= end){
			
			//合并两个有序数列到 temp 
			
			if (arr[i] <= arr[j]){
				temp[k++] = arr[i++];
			}else{
				temp[k++] = arr[j++];
			}
		}
		
		//将剩余的元素 加入到队尾
		while (i <= mid){
			temp[k++] = arr[i++];
		}
		
		while (j <= end){
			temp[k++] = arr[j++];
		}
		
		
		//将临时数组 覆盖原数组
		
		k = 0;
		
		while (start <= end){
			arr[start++] = temp[k++];
		}
		
	}
	
	
	public static void main(String[] args) {
		//测试归并排序
		
		int a[] = new int[]{2,1,5,0,-1,4,9,5,7};
		
		int temp[] = new int[9];
		
		mergeSort(a,0,a.length-1,temp);
		
		BubbleSort.printArr(a);
	}
}
