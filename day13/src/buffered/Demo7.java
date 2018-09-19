package buffered;
/*
 需求:一家三口每个人都会工作，儿子的工作就是画画，母亲的工作就是在儿子的基础上做一个增强，不单止可以画画，还可以上涂料。
	爸爸的工作就是在妈妈基础上做了增强，就是上画框。
*/

interface Work{
	public void work();
}

class Son implements Work{

	public void work() {
		System.out.println("画画...");
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
		System.out.println("涂料...");
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
		System.out.println("上画框");
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
