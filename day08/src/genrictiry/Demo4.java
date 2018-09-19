package genrictiry;
//泛型接口

interface Play<T>{
	public void play(T o);
}
/*
public class Demo4 implements Play<String>{

	public static void main(String[] args) {
		Demo4 d=new Demo4();
		
	}
	@Override
	public void play(String o) {
		// TODO Auto-generated method stub
	}
}

public class Demo4 implements Play{    //默认Object数据类型
	
	public static void main(String[] args) {
		
	}

	@Override
	public void play(Object o) {
		// TODO Auto-generated method stub	
	}
}*/
public class Demo4<T> implements Play<T>{   //延迟指定具体数据类型

	public static void main(String[] args) {
		
	}
	@Override
	public void play(T o) {
		// TODO Auto-generated method stub
		
	}
}