package component;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import frameTool.FrameUtil;

//ע��
public class Demo1 {

	public static void main(String[] args) {
		
		JFrame frame=new  JFrame("ע��");
		JPanel panel=new JPanel();
		frame.add(panel);
		//�û���----�ı���
		JLabel nameLabel=new JLabel("�û���");
		JTextField nameField=new JTextField(12);
		panel.add(nameLabel);
		panel.add(nameField);
		//����-----�����
		JLabel passwordLabel=new JLabel("����");
		JPasswordField passwordField=new JPasswordField(12);
		panel.add(passwordLabel);
		panel.add(passwordField);
		//�Ա�-----��ѡ��
		JLabel sexLabel=new JLabel("�Ա�");
		JRadioButton woman=new JRadioButton("Ů");
		JRadioButton man=new JRadioButton("��",true);
		ButtonGroup group=new ButtonGroup();
		group.add(man);
		group.add(woman);
		panel.add(sexLabel);
		panel.add(man);
		panel.add(woman);
		//���Եĳ���----������
		JLabel cityLabel=new JLabel("���Եĳ���");
		String[] arr= {"�ϲ�","�Ϻ�","����","����","����","����"};
		
		JComboBox<?> citys=new JComboBox<String>(arr);
		panel.add(cityLabel);
		panel.add(citys);
		//��Ȥ����------��ѡ��
		JLabel hobbiesLabel=new JLabel("��Ȥ����");
		JCheckBox checkBox1=new JCheckBox("��ë��");
		JCheckBox checkBox2=new JCheckBox("����");
		JCheckBox checkBox3=new JCheckBox("����");
		JCheckBox checkBox4=new JCheckBox("��Ӿ");
		JCheckBox checkBox5=new JCheckBox("��ɽ");
		panel.add(hobbiesLabel);
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(checkBox3);
		panel.add(checkBox4);
		panel.add(checkBox5);
		//���˼���-------������
		JLabel resumeLabel=new JLabel("���˽���");
		JTextArea resumArea=new JTextArea(10, 8);
		resumArea.setLineWrap(true);
		panel.add(resumeLabel);
		panel.add(resumArea);

		FrameUtil.initFrame(frame, 500, 600);
	
	}
}

