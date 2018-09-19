package buffered;
//装饰者模式
/*
需求1： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号。

需求2：编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号。
 
需求3： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号。

需求4： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号+ 分号。
 
需求5： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号+ 双引号。

需求6： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号+ 行号。
  
需求7： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号+ 分号+双引号。
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//需求1： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号。
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

//需求2：编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号。
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

//需求3： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号。
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
