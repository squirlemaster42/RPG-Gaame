package com.winfirst.states;

import java.awt.Graphics;

import com.winfirst.graphics.Assets;

public class MainMenu extends State{

	public MainMenu(){
		
	}
	
	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.mainMenu, 0, 0, null);
	}

}