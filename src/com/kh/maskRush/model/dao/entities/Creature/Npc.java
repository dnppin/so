package com.kh.maskRush.model.dao.entities.Creature;

import java.awt.Image;
import java.awt.Toolkit;

public class Npc {
	
	Image chatWindow;

	public Npc(Image chatWindow) {
		this.chatWindow = chatWindow;
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		chatWindow = toolkit.getImage("ImageAll/etc/¥Î»≠√¢.png");
		
	}
	
	
	
	
	
	

}
