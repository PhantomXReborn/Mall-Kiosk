package mallkiosk;

import java.util.*;
import mallkiosk.models.Store;

public class StoreDirectory {
    
    private Map<String, Store> stores;
    private Map<String, List<String>> categories;
    
    public StoreDirectory() {
        stores = new HashMap<>();
        categories = new HashMap<>();
        initializeStores();
    }
    
    private void initializeStores() {
        // Ground Floor Stores
        addStore("Food Court", "Food & Beverages", "Ground Floor", "Central Area", "10:00-22:00");
        addStore("Starbucks", "Food & Beverages", "Ground Floor", "North Entrance", "07:00-22:00");
        addStore("Information Desk", "Services", "Ground Floor", "Main Entrance", "09:00-21:00");
        
        // First Floor Stores
        addStore("Apple Store", "Electronics", "First Floor", "East Wing", "10:00-21:00");
        addStore("Samsung", "Electronics", "First Floor", "East Wing", "10:00-21:00");
        addStore("Zara", "Fashion & Apparel", "First Floor", "West Wing", "10:00-21:00");
        addStore("H&M", "Fashion & Apparel", "First Floor", "West Wing", "10:00-21:00");
        
        // Second Floor Stores
        addStore("Barnes & Noble", "Books & Gifts", "Second Floor", "South Wing", "09:00-21:00");
        addStore("GameStop", "Entertainment", "Second Floor", "South Wing", "10:00-21:00");
        addStore("AMC Theaters", "Entertainment", "Second Floor", "North Wing", "10:00-23:00");
        
        // Third Floor Stores
        addStore("Fitness Center", "Services", "Third Floor", "East Wing", "06:00-22:00");
        addStore("Spa & Wellness", "Services", "Third Floor", "West Wing", "09:00-20:00");
        addStore("Food Court Express", "Food & Beverages", "Third Floor", "Central Area", "10:00-22:00");
    }
    
    private void addStore(String name, String category, String floor, String location, String hours) {
        Store store = new Store(name, category, floor, location, hours);
        stores.put(name, store);
        
        categories.computeIfAbsent(category, k -> new ArrayList<>()).add(name);
    }
    
    public List<String> searchStores(String query) {
        List<String> results = new ArrayList<>();
        
        for (Store store : stores.values()) {
            if (store.getName().toLowerCase().contains(query) || 
                store.getCategory().toLowerCase().contains(query)) {
                results.add(store.getName() + " (" + store.getFloor() + ")");
            }
        }
        
        return results;
    }
    
    public List<String> getStoresByCategory(String category) {
        List<String> storeNames = categories.getOrDefault(category, new ArrayList<>());
        List<String> result = new ArrayList<>();
        
        for (String name : storeNames) {
            Store store = stores.get(name);
            result.add(name + " (" + store.getFloor() + ")");
        }
        
        return result;
    }
    
    public List<String> getAllStoreNames() {
        List<String> allStores = new ArrayList<>();
        
        for (Store store : stores.values()) {
            allStores.add(store.getName() + " (" + store.getFloor() + ")");
        }
        
        Collections.sort(allStores);
        return allStores;
    }
    
    public Store getStore(String name) {
        return stores.get(name);
    }
}