package other;

import java.io.File;
import java.io.IOException;

//作业：  剪切一个非空目录。原理：先复制在删除源文件
public class Demo9 {

	public static void main(String[] args) throws IOException {
	
		File file =new File("C:\\Users\\hasee\\Desktop\\aa");
		
		File destFile=new File("C:\\Users\\hasee\\Desktop\\lw");
		renameFile(file,destFile);
		
	}
	
	public static void renameFile(File dir, File dest) throws IOException {

		if (!dir.exists()) {
			System.out.println("源文件不存在！");
			return;
		} else {
			if (!dest.exists()) {
				dest.mkdir();
				File[] files = dir.listFiles();
				for (File file : files) {
					if (file.isFile()) {
						file.renameTo(new File(dest,file.getName()));
					} else if (file.isDirectory()) {
						renameFile(file, new File(dest, file.getName()));
					}
				}	
				dir.delete();
			}
		}
	}
}
