package test3;

//编写程序,将字符串进行反转
public class Demo2 {

	public static void main(String[] args) {
		String str="院学装武民人学大昌南";
		reversal(str);
	}
	
	public static void reversal(String str) {
		char[] arr=str.toCharArray();
		for(int startIndex=0,endIndex=arr.length-1;startIndex<endIndex;startIndex++,endIndex--) {
			char temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
		}
		System.out.println("反转后的字符串是:"+new String(arr));
	}
}
