package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import frameTool.FrameUtil;
//动作监听器
public class Demo1 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("动作监听器");
		JButton button=new JButton("按我吧");
		frame.add(button);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JButton button=(JButton) e.getSource();
				if(button.getText().equals("按我吧")) {
					button.setText("按她吧");
				}else {
					button.setText("按我吧");
				}
			}
		});
		FrameUtil.initFrame(frame, 300, 200);
	}
}
