package event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import frameTool.FrameUtil;

//����¼�������
public class Demo2 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("����¼�������");
		JButton button=new JButton("��ť");
		frame.add(button);
	/*	
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("�ͷš���");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("����");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("�Ƴ��ˡ�����");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���롣����");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("������������");
				
			}
		});*/
		//������
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					System.out.println("˫��");
				} else {
					System.out.println("����");
				}
			}
		});
		
		FrameUtil.initFrame(frame, 300, 200);
	}
}
