package frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import frameTool.FrameUtil;
//Ãæ°å
public class Demo4 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("´°Ìå");
		JPanel panel=new JPanel();
		frame.add(panel);
		panel.setBackground(Color.blue);
		FrameUtil.initFrame(frame, 800, 600);
	
	}
}
