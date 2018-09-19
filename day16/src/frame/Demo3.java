package frame;

import java.awt.FileDialog;

import javax.swing.JFrame;

import frameTool.FrameUtil;

//文件对话框
public class Demo3 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("窗体");
		FrameUtil.initFrame(frame,400,300);
		//打开
		//	FileDialog fileDialog=new FileDialog(frame, "请选择打开一个文件",FileDialog.LOAD);
		
		//保存
		FileDialog fileDialog=new FileDialog(frame, "请选择保存一个文件", FileDialog.SAVE);
		fileDialog.setVisible(true);
		
		//获取打开或保存的文件路径与文件名
		System.out.println("文件目录是:"+fileDialog.getDirectory());
		System.out.println("文件名是:"+fileDialog.getFile());
	}
}
