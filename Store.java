package mallkiosk.models;

public class Store {
    private String name;
    private String category;
    private String floor;
    private String unit;
    private String hours;
    private String phone;
    private String description;
    
    public Store(String name, String category, String floor, String unit, String hours) {
        this.name = name;
        this.category = category;
        this.floor = floor;
        this.unit = unit;
        this.hours = hours;
        this.phone = "N/A";
        this.description = "";
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getFloor() {
        return floor;
    }
    
    public void setFloor(String floor) {
        this.floor = floor;
    }
    
    public String getUnit() {
        return unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public String getHours() {
        return hours;
    }
    
    public void setHours(String hours) {
        this.hours = hours;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return name + " (" + floor + ")";
    }
}