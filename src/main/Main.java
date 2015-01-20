package main;

import game.SokobanConfiguration;
import game.SokobanGame;
import gameframework.base.ObservableValue;
import gameframework.game.Game;
import gameframework.game.GameConfiguration;
import gameframework.game.GameData;
import gameframework.gui.GameWindow;
import levels.Level1;
import levels.Level2;

public class Main {

	public static void main(String[] args) {
		GameConfiguration gameConfiguration = new SokobanConfiguration();
		GameData gamedata = new GameData(gameConfiguration);
		Game game = new SokobanGame(gamedata);

		ObservableValue<Integer> score = new ObservableValue<Integer>(5);
		ObservableValue<Integer> life = new ObservableValue<Integer>(5);
		GameWindow gameWindow = new GameWindow("SokoBlob (by DREAMTEAM)",
				gamedata.getCanvas(), gameConfiguration, score, life);
		gamedata.addLevel(new Level2(gamedata));
		gamedata.addLevel(new Level1(gamedata));
		

		gameWindow.createGUI();
		game.start();

	}
}
