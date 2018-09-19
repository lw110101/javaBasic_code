package event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import frameTool.FrameUtil;

//鼠标事件监听器
public class Demo2 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("鼠标事件监听器");
		JButton button=new JButton("按钮");
		frame.add(button);
	/*	
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("释放。。");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("按下");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("移出了。。。");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("进入。。。");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("单击。。。。");
				
			}
		});*/
		//适配器
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					System.out.println("双击");
				} else {
					System.out.println("单击");
				}
			}
		});
		
		FrameUtil.initFrame(frame, 300, 200);
	}
}
