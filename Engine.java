
package bd.edu.diu.carfactory.model;


public class Engine {
    private int engineNo;
    private double power;
    private String type;
    private String brand;
    private String model;

    @Override
    public String toString() {
        return "Engine \n{" + "engineNo=" + engineNo + "\n power=" + power + "\n type=" + type + "\n brand=" + brand + "\n model=" + model + '}';
    }

    public int getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(int engineNo) {
        this.engineNo = engineNo;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public static void main(String[] args) {
        
        Engine engine = new Engine();
        System.out.println(engine);
        
    }
    
    
    
}
