 package genrictiry;

//����һ�����鹤����
class ArrTool<T>{
	public void reversal(T[] arr) {
		 for(int startIndex=0,endIndex=arr.length-1;startIndex<endIndex;startIndex++,endIndex--) {
			 T temp=arr[startIndex];
			 arr[startIndex]=arr[endIndex];
			 arr[endIndex]=temp; 
		 }
	 }
	
	public String toString(T[] arr){
		StringBuffer buff=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				buff.append("["+arr[i]+",");
			}else if(i==arr.length-1) {
				buff.append(arr[i]+"]");
			}else {
				buff.append(arr[i]+",");
			}
		}
		return buff.toString();
	}
	
	public static <T>void print(T[] arr) {
		//��̬������Ҫʹ�÷��ͣ����Լ�����
	}
 }
 
public class Demo3 {

	public static void main(String[] args) {
		String[] arr= {"a","d","e","z","g","r"};
		ArrTool<String> arrtool=new ArrTool<String>();
		
		arrtool.reversal(arr);
		System.out.println(arrtool.toString(arr));
		/*
		ArrTool tool=new ArrTool();
		tool.reversal(arr);//Ĭ��Object����
		System.out.println(tool.toString(arr));*/
	}
}
