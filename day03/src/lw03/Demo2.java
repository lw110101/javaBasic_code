package lw03;
/*
 * 1.	ȥ���ַ������߿ո�ĺ������Լ���trim����
 * 2.	��ȡ�ϴ��ļ���  "D:\\20120512\\day12\\Demo1.java"��
 * 3.	���ַ��������д洢���ַ�����
 * 4.   ��һ���Ӵ��������г��ֵĴ��� 
 */
public class Demo2 {
	public static void main(String[] args) {
		String str="  ����Ʈ��ǧ����˭�ڸ�̾          ";
		String str1="D:\\20120512\\day12\\Demo1.java";
		String str2="��Ϊ��, ��ΪԹ ,������ ,����Զ ,��Ϊ��, ��Ϊ��, ���Լ� ,��ǧ�� ,��Ϊ�� ,��Ϊ�� ,���Լ� ,��ǧ��";
		
		System.out.println("�ַ����ǣ�"+myTrim(str));
		System.out.println("�ļ����ǣ�"+fileName(str1));
		System.out.println("�ַ�����ת��"+inversion(str));
		System.out.println("�Ӵ����ֵĴ����ǣ�"+getNum(str2,"��Ϊ��"));
	}
	//�Լ���trim����
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
	
	//��ȡ�ϴ��ļ���  "D:\\20120512\\day12\\Demo1.java"��
	public static String fileName(String str){
		//String[] arr=str.split("\\\\");
		int index=str.indexOf("Demo");
		return str.substring(index);
	}
	
	//���ַ��������д洢���ַ�����
	public static String inversion(String str){
		char[] arr=str.toCharArray();
		for(int startIndex=0,endIndex=arr.length-1;startIndex<endIndex;startIndex++,endIndex--){
			char temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
		}
		return new String(arr);
		}
	
	//��һ���Ӵ��������г��ֵĴ���
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
