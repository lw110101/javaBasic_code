package layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import frameTool.FrameUtil;

//表格布局管理器
public class Demo3 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("表格布局管理器");
		JPanel panel=new JPanel();
		frame.add(panel);
		GridLayout gridLayout=new GridLayout(4, 4,1,2);
		panel.setLayout(gridLayout);
		for(int i=0;i<10;i++) {
			panel.add(new JButton(i+""));
		}
		panel.add(new JButton("+"));
		panel.add(new JButton("-"));
		panel.add(new JButton("*"));
		panel.add(new JButton("/"));
		panel.add(new JButton("="));
		panel.add(new JButton("."));
		
		FrameUtil.initFrame(frame, 400, 300);
	}
}
