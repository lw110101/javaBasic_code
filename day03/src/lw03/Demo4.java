package lw03;
import java.io.IOException;
import java.util.Arrays;
//import java.util.Properties;

/*System.Runtime类
 *  arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * currentTimeMillis()  : 获取系统时间
   
     exit(int status)  :退出jvm，  如果参数是0表示正常退出，非0表示异常退出
    
     gc()  :建议jvm运行垃圾回收器回收垃圾
     finalize()  如果一个对象被垃圾回收器回收时，会先调用对象的finalize方法。
 
     getenv(String name)  根据环境变量的名字获取环境变量

     getProperties(key)  获取系统属性
     
Runtime类：该类代表了应用程序的运行环境。
	getRuntime() 返回当前应用程序的运行环境对象。
	exec(String command) 根据指定的路径执行对应的可执行文件
	freeMemory()  返回jvm空闲的内存，以字节为单位。
	maxMemory()  返回jvm试图使用的最多内存量。
	totalMemory()  返回jvm内存总量
 */
class Student{
	String name;
	public Student(String name){
		this.name=name;
	}
	
	public void finalize() throws Throwable{
		super.finalize();
		System.out.println(this.name+"被回收了");
	}
}
public class Demo4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//数组复制
		int[] srcArr={1,2,3,4,5,6,7,8};
		int[] destArr=new int[5];
		System.arraycopy(srcArr,2,destArr,0,5);
		System.out.println("新数组是："+Arrays.toString(destArr));
		//获取系统时间，返回毫秒
		System.out.println("当前时间是："+System.currentTimeMillis());
		//System.exit(0);
		//gc
		for(int i=0;i<3;i++){
		new Student("肥喵"+i);
		System.gc();
		}
		//获取环境变量
		System.out.println(System.getenv("JAVA_HOME"));
		
		/*获取系统信息
		Properties properties=System.getProperties();
		properties.list(System.out);
		*/
		//执行exe文件及关闭
		Runtime r=Runtime.getRuntime();
		Process p=r.exec("notepad.exe");
		Thread.sleep(2000);
		p.destroy();
		//返回内存信息
		System.out.println("空闲内存："+r.freeMemory());
		System.out.println("最多内存："+r.maxMemory());
		System.out.println("内存总量："+r.totalMemory());
		
	}

}
