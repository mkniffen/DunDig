package net.kniffen.DunDig;

import net.kniffen.DunDig.screens.Splash;

import com.badlogic.gdx.Game;

public class DunDig extends Game {
	
	public static final String TITLE = "DunDig", VERSION = "0.0.0.0.early";
	
	@Override
	public void create() {
		setScreen(new Splash());
	}

	@Override
	public void render() {
		super.render();
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
	@Override
	public void resize(int width, int height) {
		super.render();
	}
	
	@Override
	public void pause() {
		super.pause();
	}
	
	@Override
	public void resume() {
		super.resume();
	}
}
