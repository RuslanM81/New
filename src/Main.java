import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // At (0;0) fuel=100
        Tank justTank = new Tank();
// At (10;10) fuel=100
        Tank anywareTank = new Tank(10, 10);
// At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(-99);
        justTank.printPosition();
        justTank.printFuel();
        anywareTank.goBackward(88);
        anywareTank.printPosition();
        anywareTank.printFuel();
        customTank.goForward(255);
        customTank.printPosition();
        customTank.printFuel();
    }
}