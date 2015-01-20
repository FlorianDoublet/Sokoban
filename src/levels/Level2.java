package levels;

import entities.DefaultCrate;
import entities.Player;
import entities.Switch;
import entities.Wall;
import gameframework.game.GameData;

public class Level2 extends SokobanLevel {

	public Level2(GameData data) {
		super(data);
	}

	@Override
	public void createMaze() {
		addGameEntity(new Wall(data.getCanvas(), 3, 1));
		addGameEntity(new Wall(data.getCanvas(), 3, 2));

		int i;
		for (i = 1; i <= 8; i++)
			addGameEntity(new Wall(data.getCanvas(), 7, i));

		for (i = 1; i <= 8; i++)
			addGameEntity(new Wall(data.getCanvas(), 8, i));

		for (i = 5; i <= 8; i++)
			addGameEntity(new Wall(data.getCanvas(), 6, i));

		for (i = 1; i <= 5; i++)
			addGameEntity(new Wall(data.getCanvas(), i, 8));

		for (i = 1; i <= 5; i++)
			addGameEntity(new Wall(data.getCanvas(), i, 7));

		for (i = 1; i <= 6; i++)
			addGameEntity(new Wall(data.getCanvas(), 1, i));

		addGameEntity(new Wall(data.getCanvas(), 5, 6));
		addGameEntity(new Wall(data.getCanvas(), 2, 1));
		addGameEntity(new Wall(data.getCanvas(), 2, 2));
		addGameEntity(new Wall(data.getCanvas(), 2, 5));
		addGameEntity(new Wall(data.getCanvas(), 2, 6));
		addGameEntity(new Wall(data.getCanvas(), 6, 1));
		addGameEntity(new Wall(data.getCanvas(), 6, 2));

	}

	@Override
	public void initEntities() {

		addGameEntity(new Switch(data, 3, 4));
		addGameEntity(new Switch(data, 4, 4));
		addGameEntity(new Switch(data, 5, 4));

		addGameEntity(new DefaultCrate(data, 4, 2));
		addGameEntity(new DefaultCrate(data, 3, 3));
		addGameEntity(new DefaultCrate(data, 3, 5));

		addGameEntity(new Player(data, 6, 3));

	}

}
