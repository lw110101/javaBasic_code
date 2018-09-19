package event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import frameTool.FrameUtil;

//键盘事件监听器
public class Demo3 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("键盘事件监听器");
		JButton button=new JButton("按键");
		frame.add(button);
		/*
		button.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("键入某个键:");
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("释放某个键:");
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("按下某个键:");
				
			}
		});
		*/
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			/*	char c=e.getKeyChar();
				System.out.println("按下了"+c+"键");*/
				int code=e.getKeyCode();
				switch (code) {
				case 37:
					System.out.println("左");
					break;
				case 38:
					System.out.println("上");
					break;
				case 39:
					System.out.println("右");
					break;
				case 40:
					System.out.println("下");
					break;
				default:
					break;
				}
			}
		});
		
		FrameUtil.initFrame(frame, 400, 300);
		
		
	}
}
