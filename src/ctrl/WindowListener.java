package ctrl;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListener extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
//		System.out.println(1);
		int key_ShowConfirm = JOptionPane.showConfirmDialog(null, "�����Ƿ�Ҫ�ر�", "�Ӵ�", JOptionPane.OK_CANCEL_OPTION);
//		System.out.println(key_ShowConfirm); ����ֵ���� һ����0 һ����2 0��Ok 2��cancel
		if (key_ShowConfirm == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}
}
