package com.sort;
/**
 * 堆排序
 * 利用完全二叉树的性质 用数组的形式 创建一个最小/最大堆
 * 创建堆 调整堆  然后取出大顶堆 继续调整堆
 * O（nlog2^n）
 * 不稳定
 * 
 * 创建大顶堆——--->>> 交换第一个和最后一个   length-1-----> 继续调整堆  ---->> 交换 ——>> 调整 。。。。循环 直到length<0
 * @author xq
 *
 */
public class HeapSort {
	
	public static void heapSort(int arr[]){
		
		//创建大顶堆
		//先调整堆 为一个大顶堆 从最后一个非叶子节点开始向上调整
		for (int i = (arr.length/2)-1;i >= 0;i--){
			adjustHeap(arr,i,arr.length);
		}
		
		//只有创建大顶堆 才是从最后一个非叶子节点开始  创建   而之后的每次调整 大顶堆 都是从根节点向下调整
		
		
		int val; //中间变量
		
		//然后从创建好的大顶堆中 和最后一个元素交换位置 然后重新调整堆
		for (int j = arr.length-1;j >= 0;j--){
			
			//交换
			val = arr[0];
			arr[0] = arr[j];
			arr[j] = val;
			
			//然后调整  因为已经是一个大顶堆，而0和length-1 交换 只需要从root开始调整
			adjustHeap(arr,0,j);
		}
		
	}
	
	//最后一个非叶子节点  i = arr.length/2 - 1;
	//调整堆  开始创建堆的时候 是从最后一个非叶子节点开始 调整堆的  调整好后 每次取堆顶 然后length-1 之后的每次都是从堆顶开始调整，因为只是最后一个元素和堆顶发生了交换
 	public static void adjustHeap(int arr[],int i,int length){
		int val = arr[i];
		
		//和左右孩子中 较大的比较 记录下k k 为当前左右孩子中大的一个的下标 
		// 然后比较较大的数 和 i 的大小 比 i 大 则  a[i] 直接赋a[k] 而由于交换了位置 可能会对交换了位置的以孩子节点为父节点的子树的结构造成影响
		// 所以要循环 向下 改变树结构 
		for (int k = i*2+1;k < length;k=k*2+1){
			
			//比较左右孩子
			if (k+1 < length && arr[k] < arr[k+1]){
				k++; //默认是左孩子大  更换 右孩子大
			}
			
			//然后用大值和i比较
			if (arr[k] > val){
				arr[i] = arr[k];
				i = k;//i 记录的是val要插入的位置  每次交换位置 都要变成交换的下标
			}else{
				//当前父节点最大
				break;
			}
		}
		
		arr[i] = val; //放回原值
 		
	}
 	
 	
 	public static void main(String[] args) {
		//测试堆排序
 		
 		int a[] = new int[]{2,1,5,9,10,-1,0,3,7};
 		
 		heapSort(a);
 		
 		BubbleSort.printArr(a);
 		
	}
}
