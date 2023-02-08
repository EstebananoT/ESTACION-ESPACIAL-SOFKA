package dev.spaceships.spaceTravel;

import dev.spaceships.spaceTravel.controller.SpaceShipController;
import dev.spaceships.spaceTravel.entity.FactorySpaceShips;
import dev.spaceships.spaceTravel.entity.SpaceShipGeneric;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpaceTravelApplicationTests {
	//This method creates test ships 3 of each type.
	private static void examapleSpaceShips(){
		FactorySpaceShips factory = new FactorySpaceShips();
		SpaceShipGeneric shuttle = factory.getShip("Shuttle","Saturno V","USA","LOX - LH2","1967-01-01 00:00:00",false,35100);
		SpaceShipController controller = new SpaceShipController();
	}
	@Test
	void contextLoads() {
	}

}
