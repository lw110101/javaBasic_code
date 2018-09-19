package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import frameTool.FrameUtil;

//完成如下图像程序，在文本框中输入路径，显示该路径下的子文件和子目录。

public class FileSearch {

	public static void main(String[] args) {

		JFrame frame = new JFrame("文件搜索器");

		JPanel panel = new JPanel();

		JTextField jTextField = new JTextField("请输入文件路径...", 15);

		JButton button = new JButton("搜索");

		JTextArea area = new JTextArea();
		area.setLineWrap(true);
//滚动条
		JScrollPane bar=new JScrollPane(area);
		//JScrollBar bar=new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 0);
		bar.add(area);
		
		panel.add(jTextField);
		panel.add(button);

		frame.add(panel, BorderLayout.NORTH);
		frame.add(bar);

		jTextField.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				JTextField jTextField = (JTextField) e.getSource();
				if (jTextField.getText().equals("请输入文件路径...")) {
					jTextField.setText("");
				}
			}
		});

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String path = jTextField.getText();
				File dir = new File(path);
				File[] files = dir.listFiles();
				for (File file : files) {
					area.setText(area.getText() + file.getName() + "\r\n");
				}
			}
		});

		FrameUtil.initFrame(frame, 400, 300);
	}
}
