public class VehicleRunner {
  public static void main(String[] args) {
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    System.out.println("------------------------------");

    // testing all available methods on a Car object
    Bicycle myBike = new Bicycle("MBW", 2, 400);
    System.out.println(myBike.getName()); // inherited method
    System.out.println(myBike.getWheels()); // inherited method
    System.out.println(myBike.getGearCount());
    myBike.move(30); // inherited method
    myBike.turn(-90); // inherited method
    myBike.brake(0.50); // inherited method
    myBike.ringBell();

    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    BomberAircraft myBomber = new BomberAircraft("Kamikaze IV", 5, 2);
    System.out.println(myBomber.getName()); // inherited method
    System.out.println(myBomber.getWheels()); // inherited method
    System.out.println(myBomber.getNumBombs());
    myBomber.move(30); // inherited method
    myBomber.turn(-90); // inherited method
    myBomber.brake(0.50); // inherited method
    myBomber.dropBomb();
    myBomber.dropBomb();
    myBomber.dropBomb();
    myBomber.kamikaze();



  }
}