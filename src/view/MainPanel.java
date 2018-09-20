package view;

import util.Data;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
	MainFrame f;
	private JPanel PanelMainRight = new JPanel();
	//  label
	private JButton MainButton_Start = new JButton("��ʼ��Ϸ");
	private JButton MainButton_Exit = new JButton("�˳���Ϸ");

	private MainJLabel mainJLabel = new MainJLabel(this);

	public MainPanel(MainFrame f) {
		this.f = f;
		this.setSize(1280, 665);
//		���Բ���
		this.setLayout(null);

//		PanelMainRight.setLayout(null);
//      �趨��Сλ��
		PanelMainRight.setBounds(1050, 0, 225, 665);
//		�ı�����ɫ
		PanelMainRight.setBackground(Color.DARK_GRAY);
//		�趨�߿�
		PanelMainRight.setBorder(BorderFactory.createLineBorder(Color.black, 3));
//		�趨PanelΪ���Բ���
		PanelMainRight.setLayout(null);
		this.add(PanelMainRight);

//		��ť
		this.MainButton_Start.setBounds(58, 400, 100, 30);
		this.PanelMainRight.add(MainButton_Start);

		this.MainButton_Exit.setBounds(58, 450, 100, 30);
		this.PanelMainRight.add(MainButton_Exit);

//		�趨λ��
		this.PanelMainRight.add(mainJLabel);

		this.MainButton_Start.setActionCommand("StartGame");    //��ʼ��Ϸ
		this.MainButton_Exit.setActionCommand("ExitGame");      //�ر���Ϸ
	}


	//�趨����ͼƬ
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


