package com.winfirst.states;

import java.awt.Graphics;

import com.winfirst.utils.Handler;
import com.winfirst.world.World;

public class GameState extends State{
	
	private World world;

	
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.lvl");
		handler.setWorld(world);
	}
	
	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	}
	
	
}
 