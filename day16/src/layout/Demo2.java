package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import frameTool.FrameUtil;

//��ʽ���ֹ�����
public class Demo2 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("��ʽ���ֹ�����");
		JPanel panel=new JPanel();
		frame.add(panel);
		
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT, 5, 20);
		panel.setLayout(flowLayout);
		
		panel.add(new JButton("��ť1"));
		panel.add(new JButton("��ť2"));
		panel.add(new JButton("��ť3"));
		panel.add(new JButton("��ť4"));
		
		FrameUtil.initFrame(frame, 800, 600);
	}
}
