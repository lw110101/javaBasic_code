package layout;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import frameTool.FrameUtil;

//卡片布局管理器
public class Demo4 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("卡片布局管理器");
		JPanel panel=new JPanel();
		frame.add(panel);
		
		CardLayout cardLayout=new CardLayout();
		panel.setLayout(cardLayout);
		
		panel.add(new JButton("红桃A"));
		panel.add(new JButton("黑桃5"));
		panel.add(new JButton("方块2"));
		panel.add(new JButton("梅花K"));
		
		FrameUtil.initFrame(frame, 400, 300);
	}
}
