package test1;

import java.util.Arrays;

//Ŀǰ������ int[] arr =  {11,2, 4, 2, 10, 11}������һ�����������������ظ�Ԫ�أ����ص����鲻׼�˷ѳ���
public class Demo4 {

	public static void main(String[] args) {

		int[] arr = clearRepeat();
		System.out.println("����ظ�Ԫ�غ�:" + Arrays.toString(arr));
	}

	public static int[] clearRepeat() {
		int[] arr = { 11, 2, 4, 2, 10, 11, 2 };
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break; // ------������
				}
			}
		}
		System.out.println("count=" + count);
		int[] newArr = new int[arr.length - count];

		int index = 0;

		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < newArr.length; j++) {
				if (newArr[j] == arr[i]) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
			if (!flag) {
				newArr[index++] = arr[i];
			}
		}
		return newArr;
	}
}
