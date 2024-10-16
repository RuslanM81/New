public class Tank {
    private static String tankName = "T-34-";
    private int x;
    private int y;
    private int turn;
    private int fuel;
    private static int tankCount;
    private int n;

    public Tank() {
        this(0,0,100);

    }

    public Tank(int x, int y) {
        this(10,10,100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++tankCount;
    }

    public void goForward(int x) {

        if (Math.abs(x) > fuel)
            if (x < 0) {
                x = -fuel;
                fuel = 0;
            } else {
                x = fuel;
                fuel = 0;
            }
        else {

            fuel -= x;

        }

        if (turn == 0) {
            this.x = this.x + x;
        } else if (turn == 1) {
            this.y = this.y + x;
        } else if (turn == 2) {
            this.x = this.x - x;
        } else if (turn == 3) {
            this.y = this.y - x;
        }


    }

    public void goBackward(int x) {
        if (Math.abs(x) > fuel)
            if (x < 0) {
                x = -fuel;
                fuel = 0;
            } else {
                x = fuel;
                fuel = 0;
            }
        else {

            fuel -= x;

        }

        if (turn == 0) {
            this.x = this.x - x;
        } else if (turn == 1) {
            this.y = this.y - x;
        } else if (turn == 2) {
            this.x = this.x + x;
        } else if (turn == 3) {
            this.y = this.y + x;
        }

    }

    public void printPosition() {
        System.out.println("The Tank " + tankName + n + " is at " + this.x + ", " + this.y + " now.");
    }

    public void turnRight() {
        turn++;
        if (turn == 4)
            turn = 0;
    }

    public void turnLeft() {
        turn--;
        if (turn == -1)
            turn = 3;
    }

    public void printFuel() {
        System.out.println("fuel " + fuel);
    }

}