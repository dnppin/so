package com.kh.maskRush.model.dao.states;

import java.awt.Graphics;

import com.kh.maskRush.controller.Game;

//create State so that classes share things in common
public abstract class State {
	
	private static State currentState = null; //what state to tick and render
	
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
	
	//CLASS
	
	protected Game game;
	
	public State(Game game) {
		this.game = game;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	
	
}
