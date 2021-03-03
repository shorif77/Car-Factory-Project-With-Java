 
package bd.edu.diu.Wheel.carfactory.model;

public class Wheel {
    private float ringSize;
    private int tireSize;
    private int width;
    private int leangth;
    private String companyName;

    @Override
    public String toString() {
        return "Wheel{" + "ringSize=" + ringSize + "\n tireSize=" + tireSize + "\n width=" + width + "\n leangth=" + leangth + "\n companyName=" + companyName + '}';
    }

    
    public float getRingSize() {
        return ringSize;
    }

    public void setRingSize(float ringSize) {
        this.ringSize = ringSize;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLeangth() {
        return leangth;
    }

    public void setLeangth(int leangth) {
        this.leangth = leangth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public static void main(String[] args) {
        
        Wheel wheel = new Wheel();
        System.out.println(wheel);
        
         
    }
}


