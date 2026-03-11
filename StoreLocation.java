package mallkiosk.models;

public class StoreLocation {
    private String name;
    private int x;
    private int y;
    private String floor;
    private boolean isElevator;
    private boolean isEscalator;
    private boolean isRestroom;
    
    public StoreLocation(String name, int x, int y, String floor) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.floor = floor;
        this.isElevator = false;
        this.isEscalator = false;
        this.isRestroom = false;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public String getFloor() {
        return floor;
    }
    
    public void setFloor(String floor) {
        this.floor = floor;
    }
    
    public boolean isElevator() {
        return isElevator;
    }
    
    public void setElevator(boolean elevator) {
        isElevator = elevator;
    }
    
    public boolean isEscalator() {
        return isEscalator;
    }
    
    public void setEscalator(boolean escalator) {
        isEscalator = escalator;
    }
    
    public boolean isRestroom() {
        return isRestroom;
    }
    
    public void setRestroom(boolean restroom) {
        isRestroom = restroom;
    }
    
    public double distanceTo(StoreLocation other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}