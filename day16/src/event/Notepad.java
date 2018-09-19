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
//菜单组件
public class Notepad {

	public static void main(String[] args) {
		//窗体
		JFrame frame=new JFrame("记事本");
		//文本区
		JTextArea area=new JTextArea(30,40);
		area.setLineWrap(true);
		//菜单条
		JMenuBar bar=new JMenuBar();
		
		//菜单
		JMenu fileMenu=new JMenu("文件(F)");
		JMenu editMenu=new JMenu("编辑(E)");
		JMenu menu=new JMenu("切换文件");
	
		
		// 菜单项
		JMenuItem openItem = new JMenuItem("打开(o)");
		JMenuItem saveItem = new JMenuItem("保存(s)");
		// 添加文件事件
		openItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					FileDialog fileDialog = new FileDialog(frame, "另存为", FileDialog.LOAD);
					fileDialog.setVisible(true);
					// 获取路径
					String path = fileDialog.getDirectory();
					// 获取文件名
					String fileName = fileDialog.getFile();
					// 创建文件
					File dir = new File(path, fileName);
					//读取文件数据
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
					FileDialog fileDialog = new FileDialog(frame, "另存为", FileDialog.SAVE);
					fileDialog.setVisible(true);
				
					// 获取路径
					String path = fileDialog.getDirectory();
					// 获取文件名
					String fileName = fileDialog.getFile();
					// 创建文件
					File dir = new File(path, fileName);
					// 读取文本区的数据
					String text = area.getText();
					text = text.replaceAll("\n", "\r\n");
					// 写数据
					FileOutputStream fileOutputStream = new FileOutputStream(dir);
					fileOutputStream.write(text.getBytes());
					fileOutputStream.close();

				} catch (IOException e1) {

					e1.printStackTrace();
				}

			}
		});

		JMenuItem copyItem = new JMenuItem("复制");
		JMenuItem closeItem = new JMenuItem("关闭(c)");

		JMenuItem item1 = new JMenuItem("a.txt");
		JMenuItem item2 = new JMenuItem("b.txt");
		JMenuItem item3 = new JMenuItem("c.txt");
		JMenuItem item4 = new JMenuItem("d.txt");
		// 添加菜单项

		frame.add(bar, BorderLayout.NORTH);

		bar.add(fileMenu);
		bar.add(editMenu);

		fileMenu.add(openItem);
		fileMenu.add(saveItem);

		editMenu.add(copyItem);
		editMenu.add(closeItem);
		// 复选菜单
		fileMenu.add(menu);

		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		frame.add(area);
		
		FrameUtil.initFrame(frame, 600, 700);
	}
}
