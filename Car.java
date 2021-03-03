
package bd.edu.diu.car.carfactory.model;

import bd.edu.diu.carfactory.service.CarService;
import bd.edu.diu.vahicle.carfactory.model.Vahicle;


public class Car extends Vahicle implements CarService{

    private String modelName;
    private String brandName;
    private String color;
    private int Year;
    private int status;
    
    @Override
    public void start() {
        System.out.println("car started");
        status =1;
    }

    @Override
    public void stop() {
       System.out.println("car stoped");
       status =0;
    }

    @Override
    public void drive() {
        System.out.println("car drived");
        status =2;
    }

    @Override
    public String toString() {
        return "Car{" + "modelName=" + modelName + ", brandName=" + brandName + ", color=" + color + ", Year=" + Year + ", status=" + status + super.toString();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
   
    
    
}
