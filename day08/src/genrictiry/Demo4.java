package genrictiry;
//���ͽӿ�

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

public class Demo4 implements Play{    //Ĭ��Object��������
	
	public static void main(String[] args) {
		
	}

	@Override
	public void play(Object o) {
		// TODO Auto-generated method stub	
	}
}*/
public class Demo4<T> implements Play<T>{   //�ӳ�ָ��������������

	public static void main(String[] args) {
		
	}
	@Override
	public void play(T o) {
		// TODO Auto-generated method stub
		
	}
}