import cars.Car;
import cars.GTLineAT;
import cars.ZenithAT;

public class KiaStore {
    public static void main(String[] args) {
        // Example usage:
        // Car myCar = new SomeConcreteCar();
        // myCar = new SensorParqueo(myCar);
        // myCar = new TiroDeArrastre(myCar);
        // System.out.println("Description: " + myCar.getDescription());
        // System.out.println("Cost: " + myCar.cost());

        Car myCar = new GTLineAT();
        myCar = new Accessory.SensorParqueo(myCar);
        myCar = new Accessory.TiroDeArrastre(myCar);
        System.out.println("Description: " + myCar.getDescription());
        System.out.println("Cost: " + myCar.cost());
        
        Car anotherCar = new ZenithAT();
        anotherCar = new Accessory.Pernos(anotherCar);
        anotherCar = new Accessory.Rin14(anotherCar);
        System.out.println("Description: " + anotherCar.getDescription());
        System.out.println("Cost: " + anotherCar.cost());

    }
}
