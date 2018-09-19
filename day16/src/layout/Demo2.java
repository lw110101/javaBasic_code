package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import frameTool.FrameUtil;

//流式布局管理器
public class Demo2 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("流式布局管理器");
		JPanel panel=new JPanel();
		frame.add(panel);
		
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT, 5, 20);
		panel.setLayout(flowLayout);
		
		panel.add(new JButton("按钮1"));
		panel.add(new JButton("按钮2"));
		panel.add(new JButton("按钮3"));
		panel.add(new JButton("按钮4"));
		
		FrameUtil.initFrame(frame, 800, 600);
	}
}
