package buffered;
////�̳���ǿ����
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

////����:��ǿreadLine���ܣ����к�
class A extends BufferedReader {
	int count = 1;

	public A(Reader in) {
		super(in);
	}

	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		if (line == null) {
			return null;
		}
		line = count + " "+line;
		count++;
		return line;
	}

}
//����:��ǿreadLine���ܣ�������
class B extends BufferedReader{

	public B(Reader in) {
		super(in);
	}
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		if (line == null) {
			return null;
		}
		line="\""+line+"\"";
		return line;
	}
	
}
public class Demo5 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("E:\\eclipse-Workspace\\day13\\src\\buffered\\Demo1.java");
		BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
		
		//A a=new A(bufferedReader);
		B b=new B(bufferedReader);
		String line=null;
		while((line=b.readLine())!=null) {
			System.out.println(line);
		}
		b.close();
		
	}
}
