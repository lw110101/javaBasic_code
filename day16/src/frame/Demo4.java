package frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import frameTool.FrameUtil;
//���
public class Demo4 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("����");
		JPanel panel=new JPanel();
		frame.add(panel);
		panel.setBackground(Color.blue);
		FrameUtil.initFrame(frame, 800, 600);
	
	}
}
