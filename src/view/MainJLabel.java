package view;

import javax.swing.*;
import java.awt.*;

public class MainJLabel extends JLabel {
	MainPanel f;

	//	label
	public MainJLabel(MainPanel f) {
		this.f = f;

		this.setText("Ì¹¿Ë´óÕ½ V0.1");
		this.setLayout(null);
//		this.setSize(100,100);
		this.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 25));
		this.setForeground(Color.black);
		this.setBounds(25, 60, 200, 100);
//		this.setLocation(50,50);
	}
}
