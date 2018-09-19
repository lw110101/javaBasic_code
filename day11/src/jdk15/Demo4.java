  package jdk15;

public class Demo4 {

	public static void main(String[] args) {
	
		add(1,2,3,4,5);
		//addTest(1.2,2);
	}
	
	public static void add(int... t) {
		int result=0;
		for(int temp:t) {
			result+=temp;
		}
		System.out.println("result="+result);
	}
	
	/*public static <T>void addTest(T... t){
		
		for(T part:t) {
			
			System.out.println(part+" ");
		}

	}*/
}
