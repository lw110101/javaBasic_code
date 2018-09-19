package event;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import frameTool.FrameUtil;
//�˵����
public class Notepad {

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
	
		
		// �˵���
		JMenuItem openItem = new JMenuItem("��(o)");
		JMenuItem saveItem = new JMenuItem("����(s)");
		// ����ļ��¼�
		openItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					FileDialog fileDialog = new FileDialog(frame, "���Ϊ", FileDialog.LOAD);
					fileDialog.setVisible(true);
					// ��ȡ·��
					String path = fileDialog.getDirectory();
					// ��ȡ�ļ���
					String fileName = fileDialog.getFile();
					// �����ļ�
					File dir = new File(path, fileName);
					//��ȡ�ļ�����
					BufferedReader bufferedReader=new BufferedReader(new FileReader(dir));
					String line=null;
					while((line=bufferedReader.readLine())!=null) {
						area.setText(area.getText()+line+"\r\n");
					}
					bufferedReader.close();

				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		saveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				try {
					FileDialog fileDialog = new FileDialog(frame, "���Ϊ", FileDialog.SAVE);
					fileDialog.setVisible(true);
				
					// ��ȡ·��
					String path = fileDialog.getDirectory();
					// ��ȡ�ļ���
					String fileName = fileDialog.getFile();
					// �����ļ�
					File dir = new File(path, fileName);
					// ��ȡ�ı���������
					String text = area.getText();
					text = text.replaceAll("\n", "\r\n");
					// д����
					FileOutputStream fileOutputStream = new FileOutputStream(dir);
					fileOutputStream.write(text.getBytes());
					fileOutputStream.close();

				} catch (IOException e1) {

					e1.printStackTrace();
				}

			}
		});

		JMenuItem copyItem = new JMenuItem("����");
		JMenuItem closeItem = new JMenuItem("�ر�(c)");

		JMenuItem item1 = new JMenuItem("a.txt");
		JMenuItem item2 = new JMenuItem("b.txt");
		JMenuItem item3 = new JMenuItem("c.txt");
		JMenuItem item4 = new JMenuItem("d.txt");
		// ��Ӳ˵���

		frame.add(bar, BorderLayout.NORTH);

		bar.add(fileMenu);
		bar.add(editMenu);

		fileMenu.add(openItem);
		fileMenu.add(saveItem);

		editMenu.add(copyItem);
		editMenu.add(closeItem);
		// ��ѡ�˵�
		fileMenu.add(menu);

		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		frame.add(area);
		
		FrameUtil.initFrame(frame, 600, 700);
	}
}
