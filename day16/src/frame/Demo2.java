package frame;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frameTool.FrameUtil;

//对话框
public class Demo2 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("主窗体");
		FrameUtil.initFrame(frame, 400, 300);
		//使用JDialog
		JDialog dialog=new JDialog(frame, "第一个对话框", false);
		dialog.setVisible(true);
		
		//消息对话框
		JOptionPane.showMessageDialog(frame, "明天不用上课!", "通知", JOptionPane.INFORMATION_MESSAGE);
		//警告对话框
		JOptionPane.showMessageDialog(frame, "宿舍禁止使用电器", "警告", JOptionPane.WARNING_MESSAGE);
		//错误对话框
		JOptionPane.showMessageDialog(frame, "密码错误", "错误", JOptionPane.ERROR_MESSAGE);
		//输入框
		String name=JOptionPane.showInputDialog("请输入你的姓名");
		System.out.println("姓名:"+name);
		//确认框
		int reply=JOptionPane.showConfirmDialog(frame, "确认卸载吗？");
		System.out.println("确认写卸载吗？"+reply);
		
	}
}
