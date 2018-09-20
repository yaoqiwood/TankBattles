package ctrl;

import jdk.nashorn.internal.scripts.JO;
import sun.applet.Main;
import view.GameFrame;
import view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
	MainFrame f;

	public ButtonActionListener(MainFrame f) {
		this.f = f;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String Command = e.getActionCommand();
//		System.out.println(Command);
		if (Command.equals("StartGame")) {
			f.setVisible(false);
			new GameFrame(f).setVisible(true);      //�����صĴ��ڼ���
//			GameFrame gameFrame = new GameFrame(f);
//			gameFrame.setVisible(true);

		} else if (Command.equals("ExitGame")) {
			int CloseKey = JOptionPane.showConfirmDialog(null, "�Ƿ�Ҫ�رգ�", "��ʾ", JOptionPane.OK_CANCEL_OPTION);
			if (CloseKey == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		}
	}
}
