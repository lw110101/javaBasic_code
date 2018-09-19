package math_date;

import java.util.Random;

//随机类 Random
//nextInt()
public class Demo3 {

	public static void main(String[] args) {
	/*	char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n'
				,'o','p','q','r','s','t','u','v','w','x','y','z'};
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<4;i++){
			int index=random.nextInt(arr.length);//随机产生0-25
			sb.append(arr[index]);
		}char) (Math.random ()*26+'A')
		System.out.println("随机码是："+sb);
		*/
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<6;i++){
		int num=random.nextInt(62);
		
			if(num<=9){
				char c=(char)(num+48);
				sb.append(c);
			}else if(num>=10 && num<36){
				char c=(char)(num+55);
				sb.append(c);
			}else if(num>=36 && num<62){
				char c=(char)(num+61);
				sb.append(c);
			}
				
			}
		System.out.println("随机验证码是："+sb.toString());
		
	}

}
