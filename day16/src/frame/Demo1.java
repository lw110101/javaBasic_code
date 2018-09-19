package frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
//窗体
public class Demo1 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("我的第一个窗体");
		initFrame(frame,400,300);
		
	}
	
	public static void initFrame(JFrame frame,int width,int heigth) {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension d=toolkit.getScreenSize();
		int x=(int) d.getWidth();
		int y=(int) d.getHeight();
		frame.setBounds((x-width)/2,(y-heigth)/2,width,heigth);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
