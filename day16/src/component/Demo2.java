package component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import frameTool.FrameUtil;
//菜单组件
public class Demo2 {

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
	
		//菜单项
		JMenuItem openItem=new JMenuItem("打开(o)");
		JMenuItem saveItem=new JMenuItem("保存(s)");
		
		JMenuItem copyItem=new JMenuItem("复制");
		JMenuItem closeItem=new JMenuItem("关闭(c)");
		
		JMenuItem item1=new JMenuItem("a.txt");
		JMenuItem item2=new JMenuItem("b.txt");
		JMenuItem item3=new JMenuItem("c.txt");
		JMenuItem item4=new JMenuItem("d.txt");
		//添加菜单项
		
		frame.add(bar,BorderLayout.NORTH);
		
		bar.add(fileMenu);
		bar.add(editMenu);
		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		editMenu.add(copyItem);
		editMenu.add(closeItem);
		//复选菜单
		fileMenu.add(menu);
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		frame.add(area);
		
		FrameUtil.initFrame(frame, 600, 700);
	}
}
