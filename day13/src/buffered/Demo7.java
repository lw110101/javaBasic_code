package buffered;
/*
 ����:һ������ÿ���˶��Ṥ�������ӵĹ������ǻ�����ĸ�׵Ĺ��������ڶ��ӵĻ�������һ����ǿ������ֹ���Ի�������������Ϳ�ϡ�
	�ְֵĹ������������������������ǿ�������ϻ���
*/

interface Work{
	public void work();
}

class Son implements Work{

	public void work() {
		System.out.println("����...");
	}	
}

class Mather implements Work{

	Work work;

	public Mather(Work work) {
		super();
		this.work = work;
	}

	public void work() {
		work.work();
		System.out.println("Ϳ��...");
	}
}

class Father implements Work{
	Work work;

	public Father(Work work) {
		super();
		this.work = work;
	}
	@Override
	public void work() {
		work.work();
		System.out.println("�ϻ���");
	}
}
public class Demo7 {

	public static void main(String[] args) {
		
		Son s=new Son();
		Mather m=new Mather(s);
		Father f=new Father(m);
		f.work();
	}
}
