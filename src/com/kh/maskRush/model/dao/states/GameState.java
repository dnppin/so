package com.kh.maskRush.model.dao.states;

import java.awt.Graphics;

import com.kh.maskRush.controller.Game;
import com.kh.maskRush.model.dao.entities.Creature.BoyPlayer;
import com.kh.maskRush.model.dao.worlds.World;

public class GameState extends State {
	
	private BoyPlayer boyPlayer;
	private World world;
	
	public GameState(Game game) {
		super(game);
		boyPlayer = new BoyPlayer(game, 100, 100);
		world = new World(game, "res/worlds/world1.txt");
		
		game.getGameCamera().move(0, 0);
	}
	
	@Override
	public void tick() {
		boyPlayer.tick();
		world.tick();
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		boyPlayer.render(g);
		
	}
	
}