package net.kniffen.DunDig.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.kniffen.DunDig.DunDig;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "DunDig!!!";
		config.width = 1080;
		config.height = 720;
		
		new LwjglApplication(new DunDig(), config);
	}
}
