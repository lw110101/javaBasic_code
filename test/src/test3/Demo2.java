package test3;

//��д����,���ַ������з�ת
public class Demo2 {

	public static void main(String[] args) {
		String str="Ժѧװ������ѧ�����";
		reversal(str);
	}
	
	public static void reversal(String str) {
		char[] arr=str.toCharArray();
		for(int startIndex=0,endIndex=arr.length-1;startIndex<endIndex;startIndex++,endIndex--) {
			char temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
		}
		System.out.println("��ת����ַ�����:"+new String(arr));
	}
}
