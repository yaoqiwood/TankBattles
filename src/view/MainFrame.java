package view;

import ctrl.ButtonActionListener;
import ctrl.WindowListener;
import sun.applet.Main;

import javax.swing.*;

public class MainFrame extends JFrame {
	//	设定窗口监听
	WindowListener windowListener = new WindowListener();
	//  实例化按键监听对象
	ButtonActionListener buttonActionListener = new ButtonActionListener(this);
	//	实例化面板对象
	private MainPanel mainPanel = new MainPanel(this);

	public MainFrame() {
//		设置大小
		this.setSize(1280, 665);
//		设置title
		this.setTitle("Tank Battles(坦克大战) V0.1(开发版) Author：柴甜橘");
//		设置默认关闭
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//		设置不可拉动窗口大小
		this.setResizable(false);
//		设定窗口监听 (设定询问关闭窗口)
		this.addWindowListener(windowListener);
//		设定绝对布局
		this.setLayout(null);
//		设定居中
		this.setLocationRelativeTo(null);
//		设置可见
		this.setVisible(true);

//		设定添加面板
		this.add(mainPanel);
//		添加按键监听
		this.mainPanel.getMainButton_Start().addActionListener(buttonActionListener);
		this.mainPanel.getMainButton_Exit().addActionListener(buttonActionListener);

	}
}
