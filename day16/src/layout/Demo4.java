package layout;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import frameTool.FrameUtil;

//��Ƭ���ֹ�����
public class Demo4 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("��Ƭ���ֹ�����");
		JPanel panel=new JPanel();
		frame.add(panel);
		
		CardLayout cardLayout=new CardLayout();
		panel.setLayout(cardLayout);
		
		panel.add(new JButton("����A"));
		panel.add(new JButton("����5"));
		panel.add(new JButton("����2"));
		panel.add(new JButton("÷��K"));
		
		FrameUtil.initFrame(frame, 400, 300);
	}
}
