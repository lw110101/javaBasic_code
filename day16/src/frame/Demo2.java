package frame;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frameTool.FrameUtil;

//�Ի���
public class Demo2 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("������");
		FrameUtil.initFrame(frame, 400, 300);
		//ʹ��JDialog
		JDialog dialog=new JDialog(frame, "��һ���Ի���", false);
		dialog.setVisible(true);
		
		//��Ϣ�Ի���
		JOptionPane.showMessageDialog(frame, "���첻���Ͽ�!", "֪ͨ", JOptionPane.INFORMATION_MESSAGE);
		//����Ի���
		JOptionPane.showMessageDialog(frame, "�����ֹʹ�õ���", "����", JOptionPane.WARNING_MESSAGE);
		//����Ի���
		JOptionPane.showMessageDialog(frame, "�������", "����", JOptionPane.ERROR_MESSAGE);
		//�����
		String name=JOptionPane.showInputDialog("�������������");
		System.out.println("����:"+name);
		//ȷ�Ͽ�
		int reply=JOptionPane.showConfirmDialog(frame, "ȷ��ж����");
		System.out.println("ȷ��дж����"+reply);
		
	}
}
