package view;

import ctrl.WindowListener;

import javax.swing.*;

public class GameFrame extends JFrame {
	MainFrame f;

	//	监听
	private WindowListener windowListener = new WindowListener();

	//游戏主窗口
	public GameFrame(MainFrame f) {
		this.f = f;

		this.setTitle("Tank Battles(坦克大战) 版本V0.1");
		this.setSize(1280, 665);
		this.setVisible(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//		设定居中
		this.setLocationRelativeTo(null);
//		设定监听关闭
		this.addWindowListener(windowListener);
//		绝对布局
		this.setLayout(null);

	}


}
