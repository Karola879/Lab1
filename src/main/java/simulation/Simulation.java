package simulation;

public class Simulation {
    private static final int HEIGHT = 20, WIDTH = 30;
    private static final WorldMap map = new WorldMap(WIDTH, HEIGHT);

    public static WorldMap getMap(){
        return map;
    }

    public static void simulateDay() {
        map.run();
    }
}