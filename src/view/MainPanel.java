package view;

import util.Data;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
	MainFrame f;
	private JPanel PanelMainRight = new JPanel();
	//  label
	private JButton MainButton_Start = new JButton("开始游戏");
	private JButton MainButton_Exit = new JButton("退出游戏");

	private MainJLabel mainJLabel = new MainJLabel(this);

	public MainPanel(MainFrame f) {
		this.f = f;
		this.setSize(1280, 665);
//		绝对布局
		this.setLayout(null);

//		PanelMainRight.setLayout(null);
//      设定大小位置
		PanelMainRight.setBounds(1050, 0, 225, 665);
//		改背景颜色
		PanelMainRight.setBackground(Color.DARK_GRAY);
//		设定边框
		PanelMainRight.setBorder(BorderFactory.createLineBorder(Color.black, 3));
//		设定Panel为绝对布局
		PanelMainRight.setLayout(null);
		this.add(PanelMainRight);

//		按钮
		this.MainButton_Start.setBounds(58, 400, 100, 30);
		this.PanelMainRight.add(MainButton_Start);

		this.MainButton_Exit.setBounds(58, 450, 100, 30);
		this.PanelMainRight.add(MainButton_Exit);

//		设定位置
		this.PanelMainRight.add(mainJLabel);

		this.MainButton_Start.setActionCommand("StartGame");    //开始游戏
		this.MainButton_Exit.setActionCommand("ExitGame");      //关闭游戏
	}


	//设定背景图片
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		System.out.println(111);
		g.drawImage(Data.IMG_BGMainPanel, 0, 0, 1280, 720, 0, 0, 1280, 720, null);

		this.repaint();
	}


	public JPanel getPanelMainRight() {
		return PanelMainRight;
	}

	public JButton getMainButton_Start() {
		return MainButton_Start;
	}

	public JButton getMainButton_Exit() {
		return MainButton_Exit;
	}
}


