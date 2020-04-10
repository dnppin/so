package com.kh.maskRush.miniGameSpacebar.views;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Background extends JPanel{

	private JFrame mf;
	private JPanel panel;
	public Background(JFrame mf) {
		this.mf = mf;
		this.setLayout(null);
		panel = this;

		JLabel label = new JLabel(new ImageIcon(new ImageIcon("ImageAll.etc/background.PNG").getImage().getScaledInstance(1000, 800, 0)));
		label.setBounds(0, 0, 1000, 800);

		JLabel start = new JLabel(new ImageIcon(new ImageIcon("ImageAll.etc/start.PNG").getImage().getScaledInstance(200, 100, 0)));
		start.setBounds(180, 550, 200, 100);

		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {


			}

		});
		this.add(label);
		this.add(start);
		this.setComponentZOrder(label, 1);


	}

}

