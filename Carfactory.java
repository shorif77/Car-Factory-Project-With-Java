package bd.edu.diu.carfactory;

import bd.edu.diu.Door.carfactory.model.Door;
import bd.edu.diu.Wheel.carfactory.model.Wheel;
import bd.edu.diu.car.carfactory.model.Car;
import bd.edu.diu.carfactory.model.Engine;
import com.sun.java.accessibility.util.SwingEventMonitor;
import java.util.ArrayList;
import java.util.Scanner;

public class Carfactory {

    Scanner keyboard = new Scanner(System.in);
    static ArrayList<Car> cars = new ArrayList<Car>();

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Engine addEngine() {
       System.out.println(" Engine Information   ");
        Engine engine = new Engine();
        System.out.println("Enter Engine No: ");
        engine.setEngineNo(keyboard.nextInt());

        System.out.println("Enter Power: ");
        engine.setPower(keyboard.nextDouble());

        System.out.println("Enter Type: ");
        engine.setType(keyboard.nextLine());

        System.out.println("Enter Brand: ");
        engine.setBrand(keyboard.nextLine());

        System.out.println("Enter Model: ");
        engine.setModel(keyboard.nextLine());

        return engine;
    }

    public Wheel addWheel() {
System.out.println(" Wheel Information   ");
        Wheel wheel = new Wheel();
        System.out.println("Enter ringSize: ");
        wheel.setRingSize(keyboard.nextFloat());

        System.out.println("Enter tireSize: ");
        wheel.setTireSize(keyboard.nextInt());

        System.out.println("Enter Type: ");
        wheel.setWidth(keyboard.nextInt());

        System.out.println("Enter Brand: ");
        wheel.setLeangth(keyboard.nextInt());

        System.out.println("Enter Model: ");
        wheel.setCompanyName(keyboard.nextLine());

        return wheel;
    }

    public Door adddoor() {
System.out.println(" Door Information   ");
        Door door = new Door();
        System.out.println("Enter colorOfDoor: ");
        door.setColorOfDoor(keyboard.nextLine());

        System.out.println("Enter sizeOfDoor: ");
        door.setSizeOfDoor(keyboard.nextLine());

        System.out.println("Is it autoGlass: ");
        door.setAutoGlass(keyboard.nextLine());

        System.out.println("Enter qualityOfGlass which you want: ");
        door.setQualityOfDoor(keyboard.nextLine());

        System.out.println("Enter the type of glass: ");
        door.setTypeOfGlass(keyboard.nextLine());

        return door;
    }

    //
    public Car addCar() {
        System.out.println(" Car  Information   ");
        Car car = new Car();
        System.out.println("Enter BrandName ");
        car.setBrandName(keyboard.nextLine());
        System.out.println("Enter Model Name ");
        car.setModelName(keyboard.nextLine());
        System.out.println("Enter color ");
        car.setColor(keyboard.nextLine());
        System.out.println("Enter Year ");
        car.setYear(keyboard.nextInt());
        System.out.println("Enter ChasesNo ");
        car.setChasesNo(keyboard.nextLine());
        System.out.println("Enter CompanyName ");
        car.setCompanyName(keyboard.nextLine());
        car.setEngine(addEngine());
        car.getWheeles().add(addWheel());
        car.getDoors().add(adddoor());
        return car;

    }

    public static void main(String[] args) {
while (true) {
        System.out.println("Main Menu ");
        System.out.println("__________");
        System.out.println("1.Add car");
        System.out.println("2.Display car");
        System.out.println("3.Start car");
        System.out.println("4.exit");
        Carfactory factory = new Carfactory();
        System.out.print("enter Choice ");
        String ch = factory.keyboard.next();
        
            if (ch.equals("1")) {
                cars.add(factory.addCar());

            } else if (ch.equals("2")) {
                for (Car arg : cars) {
                    System.out.println(arg);
                }

            } else if (ch.equals("3")) {
                System.out.println("Enter Model for start ");
                String m = factory.keyboard.next();
                for (Car arg : cars) {
                    if (arg.getModelName().equalsIgnoreCase(m)) {
                        arg.start();
                        arg.drive();
                        arg.stop();
                    }
                }

            } else {

                System.exit(0);
            }

        }
    }

}
