package component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import frameTool.FrameUtil;
//�˵����
public class Demo2 {

	public static void main(String[] args) {
		//����
		JFrame frame=new JFrame("���±�");
		//�ı���
		JTextArea area=new JTextArea(30,40);
		area.setLineWrap(true);
		//�˵���
		JMenuBar bar=new JMenuBar();
		
		//�˵�
		JMenu fileMenu=new JMenu("�ļ�(F)");
		JMenu editMenu=new JMenu("�༭(E)");
		JMenu menu=new JMenu("�л��ļ�");
	
		//�˵���
		JMenuItem openItem=new JMenuItem("��(o)");
		JMenuItem saveItem=new JMenuItem("����(s)");
		
		JMenuItem copyItem=new JMenuItem("����");
		JMenuItem closeItem=new JMenuItem("�ر�(c)");
		
		JMenuItem item1=new JMenuItem("a.txt");
		JMenuItem item2=new JMenuItem("b.txt");
		JMenuItem item3=new JMenuItem("c.txt");
		JMenuItem item4=new JMenuItem("d.txt");
		//��Ӳ˵���
		
		frame.add(bar,BorderLayout.NORTH);
		
		bar.add(fileMenu);
		bar.add(editMenu);
		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		editMenu.add(copyItem);
		editMenu.add(closeItem);
		//��ѡ�˵�
		fileMenu.add(menu);
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		frame.add(area);
		
		FrameUtil.initFrame(frame, 600, 700);
	}
}
