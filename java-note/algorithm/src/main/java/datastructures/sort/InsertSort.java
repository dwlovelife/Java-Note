package datastructures.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 插入排序 将一个记录插到已排好序的有序序列中,从而得到一个新的有序序列(将序列的第一个数据看成是一个有序的子序列)
 * 然后从第二个记录逐个向该有序的子序列进行有序的插入,直至整个序列有序
 */
public class InsertSort {
	public static void main(String[] args) {
		int count = 80000;
		int[] arr = new int[count];
		for(int i = 0; i < count;i++){
			arr[i] = (int)(Math.random() * count);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String start = sdf.format(new Date());
		System.out.println("开始时间:" + start);
		insertSort(arr);
		String end = sdf.format(new Date());
		System.out.println("开始时间:" + end);
		//System.out.println(Arrays.toString(arr));
	}

	public static void insertSort(int[] elements) {
		// 由于是插入排序我们先把elements[0] 给单独拎出来 当成一个有序子序列
		for (int i = 1; i < elements.length; i++) {
			// 如果待插入的数比前一个数(目前排列最大的数)小 才启动插入操作
			if (elements[i - 1] > elements[i]) {
				// 定义一个临时变量用来存储 待插入的数字
				int temp = elements[i];
				// 从后向前遍历插入
				for (int j = i; j >= 0; j--) {
					// 如果前一个数比当前的位置大则把 前一个数往后移 因为我们已经暂存了待插入的数字
					if (j > 0 && elements[j - 1] > temp) {
						elements[j] = elements[j - 1];
					} else {
						elements[j] = temp;
						break;
					}
				}
			}
		}
	}

}
