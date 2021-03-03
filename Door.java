
package bd.edu.diu.Door.carfactory.model;


public class Door {
    private  String colorOfDoor;
    private String sizeOfDoor;
    private String designOfFronDoor;
    private String designOfBackDoor;
    private String qualityOfDoor;
    private String typeOfGlass;
    private String autoGlass;

    @Override
    public String toString() {
        return "Door{" + "colorOfDoor=" + colorOfDoor + "\n sizeOfDoor=" + sizeOfDoor + "\n qualityOfDoor=" + qualityOfDoor + "\n typeOfGlass=" + typeOfGlass + "\n autoGlass=" + autoGlass + '}';
    }

    
    
    
    
    public String getColorOfDoor() {
        return colorOfDoor;
    }

    public void setColorOfDoor(String colorOfDoor) {
        this.colorOfDoor = colorOfDoor;
    }

    public String getSizeOfDoor() {
        return sizeOfDoor;
    }

    public void setSizeOfDoor(String sizeOfDoor) {
        this.sizeOfDoor = sizeOfDoor;
    }

    public String getQualityOfDoor() {
        return qualityOfDoor;
    }

    public void setQualityOfDoor(String qualityOfDoor) {
        this.qualityOfDoor = qualityOfDoor;
    }

    public String getTypeOfGlass() {
        return typeOfGlass;
    }

    public void setTypeOfGlass(String typeOfGlass) {
        this.typeOfGlass = typeOfGlass;
    }

    public String getAutoGlass() {
        return autoGlass;
    }

    public void setAutoGlass(String autoGlass) {
        this.autoGlass = autoGlass;
    }
    
    public static void main(String[] args) {
        Door door = new Door();
        System.out.println(door);
    }
    
}
