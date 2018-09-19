package buffered;
//װ����ģʽ
/*
����1�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������кš�

����2����дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ������зֺš�
 
����3�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ�������˫���š�

����4�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������к�+ �ֺš�
 
����5�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ������зֺ�+ ˫���š�

����6�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ�������˫����+ �кš�
  
����7�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������к�+ �ֺ�+˫���š�
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//����1�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������кš�
class BufferedLine extends BufferedReader{

	BufferedReader bufferedReader;
	int count=1;
	public BufferedLine(BufferedReader bufferedReader) {
		super(bufferedReader);
		this.bufferedReader=bufferedReader;
	}
	@Override
	public String readLine() throws IOException {
		String line=bufferedReader.readLine();
		if(line==null) {
			return null;
		}
		line=(count++)+" "+line;
		return line;
	}
}

//����2����дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ������зֺš�
class BufferedQuotation extends BufferedReader{

	BufferedReader bufferedReader;

	public BufferedQuotation(BufferedReader bufferedReader) {
		super(bufferedReader);
		this.bufferedReader = bufferedReader;
	}

	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if (line == null) {
			return null;
		}
		line = "\"" + line + "\"";
		return line;
	}
}

//����3�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ�������˫���š�
class BufferedSemicolon extends BufferedReader{
	
	BufferedReader bufferedReader;

	public BufferedSemicolon(BufferedReader bufferedReader) {
		super(bufferedReader);
		this.bufferedReader = bufferedReader;
	}

	@Override
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if (line == null) {
			return null;
		}
		line = line + ";";
		return line;
	}
}

public class Demo6 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\eclipse-Workspace\\day13\\src\\buffered\\Demo1.java");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		
		BufferedLine bufferedLine=new BufferedLine(bufferedReader);
		
		BufferedQuotation bufferedQuotation=new BufferedQuotation(bufferedLine);
		
		BufferedSemicolon bufferedSemicolon=new BufferedSemicolon(bufferedQuotation);
		
		String line=null;
		while((line=bufferedSemicolon.readLine())!=null) {
			System.out.println(line);
		}
		bufferedSemicolon.close();
	}
}
