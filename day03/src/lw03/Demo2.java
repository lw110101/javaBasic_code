package lw03;
/*
 * 1.	去除字符串两边空格的函数。自己的trim方法
 * 2.	获取上传文件名  "D:\\20120512\\day12\\Demo1.java"。
 * 3.	将字符串对象中存储的字符反序
 * 4.   求一个子串在整串中出现的次数 
 */
public class Demo2 {
	public static void main(String[] args) {
		String str="  茶香飘过千年是谁在感叹          ";
		String str1="D:\\20120512\\day12\\Demo1.java";
		String str2="何为仙, 何为怨 ,心似恋 ,至永远 ,何为仙, 何为凡, 不言间 ,已千年 ,何为仙 ,何为凡 ,不言间 ,已千年";
		
		System.out.println("字符串是："+myTrim(str));
		System.out.println("文件名是："+fileName(str1));
		System.out.println("字符串反转："+inversion(str));
		System.out.println("子串出现的次数是："+getNum(str2,"何为仙"));
	}
	//自己的trim方法
	public static String myTrim(String str){
		char[] arr=str.toCharArray();
		int startIndex=0;
		int endIndex=arr.length-1;
		while(true){
			if(arr[startIndex]==' '){
				startIndex++;
			}else{
				break;
			}
		}
		while(true){
			if(arr[endIndex]==' '){
				endIndex--;
			}else{
				break;
			}
		}
		return str.substring(startIndex, endIndex+1);
	}
	
	//获取上传文件名  "D:\\20120512\\day12\\Demo1.java"。
	public static String fileName(String str){
		//String[] arr=str.split("\\\\");
		int index=str.indexOf("Demo");
		return str.substring(index);
	}
	
	//将字符串对象中存储的字符反序
	public static String inversion(String str){
		char[] arr=str.toCharArray();
		for(int startIndex=0,endIndex=arr.length-1;startIndex<endIndex;startIndex++,endIndex--){
			char temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
		}
		return new String(arr);
		}
	
	//求一个子串在整串中出现的次数
	public static int getNum(String str,String value){
		int count=0;
		int startIndex=0;
		while((startIndex=str.indexOf(value,startIndex))!=-1){
			count++;
			startIndex=startIndex+value.length();
		}
		return count;
	}

}
