package event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import frameTool.FrameUtil;

//�����¼�������
public class Demo3 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("�����¼�������");
		JButton button=new JButton("����");
		frame.add(button);
		/*
		button.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("����ĳ����:");
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("�ͷ�ĳ����:");
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("����ĳ����:");
				
			}
		});
		*/
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			/*	char c=e.getKeyChar();
				System.out.println("������"+c+"��");*/
				int code=e.getKeyCode();
				switch (code) {
				case 37:
					System.out.println("��");
					break;
				case 38:
					System.out.println("��");
					break;
				case 39:
					System.out.println("��");
					break;
				case 40:
					System.out.println("��");
					break;
				default:
					break;
				}
			}
		});
		
		FrameUtil.initFrame(frame, 400, 300);
		
		
	}
}
