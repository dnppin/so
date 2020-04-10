package com.kh.maskRush.model.dao.entities.Creature;

import java.awt.Graphics;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.gfx.Assets;

public class BoyPlayer extends Creature {

	public BoyPlayer(Game game, float x, float y) {
		super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
	}

	@Override
	public void tick() {
		getInput();
		move();
		game.getGameCamera().centerOnEntity(this);
	}
	
	//input이 들어올때 캐릭터가 어떻게 행동할지 정의
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManager().up) {
			yMove = - speed;
		}
		if(game.getKeyManager().down) {
			yMove =  speed;
		}
		if(game.getKeyManager().left) {
			xMove = - speed;
		}
		if(game.getKeyManager().right) {
			xMove =  speed;
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.boyPlayer, (int) (x - game.getGameCamera().getxOffset()), (int) (y - game.getGameCamera().getyOffset()), width, height, null);
		
	}
	
}
