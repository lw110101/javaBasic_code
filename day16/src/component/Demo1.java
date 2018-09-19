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

//注册
public class Demo1 {

	public static void main(String[] args) {
		
		JFrame frame=new  JFrame("注册");
		JPanel panel=new JPanel();
		frame.add(panel);
		//用户名----文本框
		JLabel nameLabel=new JLabel("用户名");
		JTextField nameField=new JTextField(12);
		panel.add(nameLabel);
		panel.add(nameField);
		//密码-----密码框
		JLabel passwordLabel=new JLabel("密码");
		JPasswordField passwordField=new JPasswordField(12);
		panel.add(passwordLabel);
		panel.add(passwordField);
		//性别-----单选框
		JLabel sexLabel=new JLabel("性别");
		JRadioButton woman=new JRadioButton("女");
		JRadioButton man=new JRadioButton("男",true);
		ButtonGroup group=new ButtonGroup();
		group.add(man);
		group.add(woman);
		panel.add(sexLabel);
		panel.add(man);
		panel.add(woman);
		//来自的城市----下拉框
		JLabel cityLabel=new JLabel("来自的城市");
		String[] arr= {"南昌","上海","北京","杭州","赣州","广州"};
		
		JComboBox<?> citys=new JComboBox<String>(arr);
		panel.add(cityLabel);
		panel.add(citys);
		//兴趣爱好------复选框
		JLabel hobbiesLabel=new JLabel("兴趣爱好");
		JCheckBox checkBox1=new JCheckBox("羽毛球");
		JCheckBox checkBox2=new JCheckBox("篮球");
		JCheckBox checkBox3=new JCheckBox("足球");
		JCheckBox checkBox4=new JCheckBox("游泳");
		JCheckBox checkBox5=new JCheckBox("爬山");
		panel.add(hobbiesLabel);
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(checkBox3);
		panel.add(checkBox4);
		panel.add(checkBox5);
		//个人简历-------输入区
		JLabel resumeLabel=new JLabel("个人建立");
		JTextArea resumArea=new JTextArea(10, 8);
		resumArea.setLineWrap(true);
		panel.add(resumeLabel);
		panel.add(resumArea);

		FrameUtil.initFrame(frame, 500, 600);
	
	}
}

