package view;

import ctrl.ButtonActionListener;
import ctrl.WindowListener;
import sun.applet.Main;

import javax.swing.*;

public class MainFrame extends JFrame {
	//	�趨���ڼ���
	WindowListener windowListener = new WindowListener();
	//  ʵ����������������
	ButtonActionListener buttonActionListener = new ButtonActionListener(this);
	//	ʵ����������
	private MainPanel mainPanel = new MainPanel(this);

	public MainFrame() {
//		���ô�С
		this.setSize(1280, 665);
//		����title
		this.setTitle("Tank Battles(̹�˴�ս) V0.1(������) Author��������");
//		����Ĭ�Ϲر�
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//		���ò����������ڴ�С
		this.setResizable(false);
//		�趨���ڼ��� (�趨ѯ�ʹرմ���)
		this.addWindowListener(windowListener);
//		�趨���Բ���
		this.setLayout(null);
//		�趨����
		this.setLocationRelativeTo(null);
//		���ÿɼ�
		this.setVisible(true);

//		�趨������
		this.add(mainPanel);
//		��Ӱ�������
		this.mainPanel.getMainButton_Start().addActionListener(buttonActionListener);
		this.mainPanel.getMainButton_Exit().addActionListener(buttonActionListener);

	}
}
