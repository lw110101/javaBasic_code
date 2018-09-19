package lw03;
import java.io.IOException;
import java.util.Arrays;
//import java.util.Properties;

/*System.Runtime��
 *  arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * currentTimeMillis()  : ��ȡϵͳʱ��
   
     exit(int status)  :�˳�jvm��  ���������0��ʾ�����˳�����0��ʾ�쳣�˳�
    
     gc()  :����jvm����������������������
     finalize()  ���һ��������������������ʱ�����ȵ��ö����finalize������
 
     getenv(String name)  ���ݻ������������ֻ�ȡ��������

     getProperties(key)  ��ȡϵͳ����
     
Runtime�ࣺ���������Ӧ�ó�������л�����
	getRuntime() ���ص�ǰӦ�ó�������л�������
	exec(String command) ����ָ����·��ִ�ж�Ӧ�Ŀ�ִ���ļ�
	freeMemory()  ����jvm���е��ڴ棬���ֽ�Ϊ��λ��
	maxMemory()  ����jvm��ͼʹ�õ�����ڴ�����
	totalMemory()  ����jvm�ڴ�����
 */
class Student{
	String name;
	public Student(String name){
		this.name=name;
	}
	
	public void finalize() throws Throwable{
		super.finalize();
		System.out.println(this.name+"��������");
	}
}
public class Demo4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//���鸴��
		int[] srcArr={1,2,3,4,5,6,7,8};
		int[] destArr=new int[5];
		System.arraycopy(srcArr,2,destArr,0,5);
		System.out.println("�������ǣ�"+Arrays.toString(destArr));
		//��ȡϵͳʱ�䣬���غ���
		System.out.println("��ǰʱ���ǣ�"+System.currentTimeMillis());
		//System.exit(0);
		//gc
		for(int i=0;i<3;i++){
		new Student("����"+i);
		System.gc();
		}
		//��ȡ��������
		System.out.println(System.getenv("JAVA_HOME"));
		
		/*��ȡϵͳ��Ϣ
		Properties properties=System.getProperties();
		properties.list(System.out);
		*/
		//ִ��exe�ļ����ر�
		Runtime r=Runtime.getRuntime();
		Process p=r.exec("notepad.exe");
		Thread.sleep(2000);
		p.destroy();
		//�����ڴ���Ϣ
		System.out.println("�����ڴ棺"+r.freeMemory());
		System.out.println("����ڴ棺"+r.maxMemory());
		System.out.println("�ڴ�������"+r.totalMemory());
		
	}

}
