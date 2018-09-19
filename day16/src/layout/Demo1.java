package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import frameTool.FrameUtil;

//边框布局管理器
public class Demo1 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("边框布局管理器");
		
		BorderLayout borderLayout=new BorderLayout();
		frame.setLayout(borderLayout);
	
		frame.add(new JButton("东"),BorderLayout.EAST);
		frame.add(new JButton("西"),BorderLayout.WEST);
		frame.add(new JButton("南"),BorderLayout.SOUTH);
		frame.add(new JButton("北"),BorderLayout.NORTH);
		frame.add(new JButton("中"),BorderLayout.CENTER);
	
		FrameUtil.initFrame(frame, 400, 300);
		
	}
}
