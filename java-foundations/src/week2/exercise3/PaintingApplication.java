package week2.exercise3;

public class PaintingApplication {

    public static void main(String[] args) {
        Tool screwDriver = new Tool("Screw-driver");
        Derek derek = new Derek();
        derek.setTool(screwDriver);
        derek.hangPainting(screwDriver);

        Tool tool = new Tool("Hammer");
        derek.setTool(tool);
        derek.hangPainting(tool);
    }
}
