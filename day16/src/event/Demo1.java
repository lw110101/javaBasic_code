package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import frameTool.FrameUtil;
//����������
public class Demo1 {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("����������");
		JButton button=new JButton("���Ұ�");
		frame.add(button);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JButton button=(JButton) e.getSource();
				if(button.getText().equals("���Ұ�")) {
					button.setText("������");
				}else {
					button.setText("���Ұ�");
				}
			}
		});
		FrameUtil.initFrame(frame, 300, 200);
	}
}
