package ctrl;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListener extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
//		System.out.println(1);
		int key_ShowConfirm = JOptionPane.showConfirmDialog(null, "请问是否要关闭", "视窗", JOptionPane.OK_CANCEL_OPTION);
//		System.out.println(key_ShowConfirm); 返回值两个 一个是0 一个是2 0是Ok 2是cancel
		if (key_ShowConfirm == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}
}
