package frame;

import java.awt.FileDialog;

import javax.swing.JFrame;

import frameTool.FrameUtil;

//�ļ��Ի���
public class Demo3 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("����");
		FrameUtil.initFrame(frame,400,300);
		//��
		//	FileDialog fileDialog=new FileDialog(frame, "��ѡ���һ���ļ�",FileDialog.LOAD);
		
		//����
		FileDialog fileDialog=new FileDialog(frame, "��ѡ�񱣴�һ���ļ�", FileDialog.SAVE);
		fileDialog.setVisible(true);
		
		//��ȡ�򿪻򱣴���ļ�·�����ļ���
		System.out.println("�ļ�Ŀ¼��:"+fileDialog.getDirectory());
		System.out.println("�ļ�����:"+fileDialog.getFile());
	}
}
