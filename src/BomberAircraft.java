public class BomberAircraft extends Vehicle{
    private int numBombs;

    public BomberAircraft(String name, int wheels, int numBombs) {
        super(name, wheels);
        this.numBombs = numBombs;
    }

    public int getNumBombs() {
        return numBombs;
    }

    public void dropBomb() {
        if(numBombs > 0) {
            System.out.println("Weeeeee~~~KABOOOM!");
            numBombs--;
        } else {
            System.out.println("Insufficient bombing supplies");
        }
    }

    public void kamikaze() {
        System.out.println("Farewell brothers--------------KABOOOM!");
        System.exit(0);
    }
}
