package test1;
//定义一个函数，接收一个数组与一个要查找的元素，如果该元素存在数组中，那么返回该元素在数组中的索引值，如果不存在返回-1。(不要严格要求使用二分查找法)
public class Demo3 {

	public static void main(String[] args) {
		
		int[] arr= {12,8,4,6,7,2,6};
		int index=getIndex(arr,6);
		System.out.println("索引值是:"+index);
	}
	
	public static int getIndex(int[] arr,int target) {
		int index=-1,count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				count++;
			}
		}
		if(count>0) {
			System.out.println("该数组有"+count+"个元素");
		}
		return index;
	}
}
