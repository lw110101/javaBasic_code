package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import frameTool.FrameUtil;

//�߿򲼾ֹ�����
public class Demo1 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("�߿򲼾ֹ�����");
		
		BorderLayout borderLayout=new BorderLayout();
		frame.setLayout(borderLayout);
	
		frame.add(new JButton("��"),BorderLayout.EAST);
		frame.add(new JButton("��"),BorderLayout.WEST);
		frame.add(new JButton("��"),BorderLayout.SOUTH);
		frame.add(new JButton("��"),BorderLayout.NORTH);
		frame.add(new JButton("��"),BorderLayout.CENTER);
	
		FrameUtil.initFrame(frame, 400, 300);
		
	}
}
