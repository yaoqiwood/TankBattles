package view;

import ctrl.WindowListener;

import javax.swing.*;

public class GameFrame extends JFrame {
	MainFrame f;

	//	����
	private WindowListener windowListener = new WindowListener();

	//��Ϸ������
	public GameFrame(MainFrame f) {
		this.f = f;

		this.setTitle("Tank Battles(̹�˴�ս) �汾V0.1");
		this.setSize(1280, 665);
		this.setVisible(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//		�趨����
		this.setLocationRelativeTo(null);
//		�趨�����ر�
		this.addWindowListener(windowListener);
//		���Բ���
		this.setLayout(null);

	}


}
