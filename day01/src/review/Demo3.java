package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������һ��ԭ��:");
		String originalText=bufferedReader.readLine();
		String cipherText=getCiphertext(originalText);
		System.out.println("������:"+cipherText);
		getOriginaltext(cipherText);
	}
//����
	public static String getCiphertext(String str) {
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				arr[i]=(char)arr[i+arr.length-1];
			}else if(i>10) {
				arr[i]=(char)(arr[i]+i%10);
			}else if(i<10) {
				char[] crr= {'w','9','X','7','m','6','4','T','$'};
				for(char c:crr) {
					arr[i]=(char)(arr[i]^c);
				}	
			}
		}
		return Arrays.toString(arr);
		
	}
	//����
	public static void getOriginaltext(String str) {
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				arr[i]=(char)arr[i-arr.length-1];
			}else if(i>10) {
				arr[i]=(char)(arr[i]-i);
			}else if(i<10) {
				char[] crr= {'w','9','X','7','m','6','4','T','$'};
				for(char c:crr) {
					arr[i]=(char)(arr[i]^c^arr[i]);
				}	
			}
		}
		System.out.println("ԭ����:"+Arrays.toString(arr));
	}
}
