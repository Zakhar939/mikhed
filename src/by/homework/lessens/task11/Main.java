package by.homework.lessens.task11;

public class Main {
    public static void main(String[] args) {
        RobotCook robotCook = new RobotCook("ios", 500.0, "Германия", "электроплитка");
        RobotSapper robotSapper = new RobotSapper("huawei", 750.0, 5, "алюминий");
        RobotBuilder robotBuilder = new RobotBuilder("lg", 1000.0, "Япония", "бетономешалка", "бетон");

        robotCook.repairRobot();
        robotSapper.repairRobot();
        robotBuilder.repairRobot();
        robotCook.turnOn();

        System.out.println(robotCook.isOn);

        robotSapper.turnOff();
        System.out.println(robotSapper.isOn);

        robotBuilder.turnOn();
        System.out.println(robotBuilder.isOn);

        robotCook.uniquePossibility();
        robotSapper.uniquePossibility();
        robotBuilder.uniquePossibility();


        Robot[] exhibition1 = new Robot[] {robotCook, robotSapper, robotBuilder};
        for (Robot robot : exhibition1) {
            robot.uniquePossibility();
        }

        RobotEngineer[] exhibition2 = new RobotEngineer[] {robotSapper, robotBuilder};
        for (RobotEngineer robot : exhibition2) {
            robot.uniquePossibility();
            robot.createItem();
        }

        RobotSapper[] exhibition3 = new RobotSapper[] {robotSapper};
        for (RobotSapper robot : exhibition3) {
            robot.uniquePossibility();
            robot.createItem();
        }
    }
}
