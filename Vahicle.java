
package bd.edu.diu.vahicle.carfactory.model;

import bd.edu.diu.Door.carfactory.model.Door;
import bd.edu.diu.Wheel.carfactory.model.Wheel;
import bd.edu.diu.carfactory.model.Engine;
import java.util.ArrayList;


public class Vahicle {
    private String chasesNo;
    private String companyName;
    private Engine engine = new Engine();
    private ArrayList<Wheel> wheeles =  new ArrayList<Wheel>();
    private ArrayList<Door> doors =  new ArrayList<Door>();

    @Override
    public String toString() {
        return "Vahicle{" + "chasesNo=" + chasesNo + "\n companyName=" + companyName + "\n engine=" + engine + "\n wheeles=" + wheeles + "\n doors=" + doors + '}';
    }

    
    
    public String getChasesNo() {
        return chasesNo;
    }

    public void setChasesNo(String chasesNo) {
        this.chasesNo = chasesNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheeles() {
        return wheeles;
    }

    public void setWheeles(ArrayList<Wheel> wheeles) {
        this.wheeles = wheeles;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }
    
    public static void main(String[] args) {
        Vahicle vahicle = new Vahicle();
        System.out.println(vahicle);
    }
}
