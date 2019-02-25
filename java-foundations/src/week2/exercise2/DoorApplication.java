package week2.exercise2;

public class DoorApplication {
    public static void main(String[] args) {
        Key key = new Key();
        Door door = new Door(4);
        key.open(door);
    }
}
