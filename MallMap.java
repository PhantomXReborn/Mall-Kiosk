package mallkiosk;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import java.util.*;

import mallkiosk.models.StoreLocation;

public class MallMap extends StackPane {
    private double scale = 1.0;
    private Pane mapPane;
    private Map<String, StoreLocation> storeLocations;
    private StoreDirectory storeDirectory;
    private Circle currentLocationMarker;
    private String floor = "Ground Floor";
    
    public MallMap(StoreDirectory storeDirectory) {
        this.storeDirectory = storeDirectory;
        this.storeLocations = new HashMap<>();
        
        setMinSize(600, 400);
        setStyle("-fx-background-color: #ecf0f1; -fx-border-color: #bdc3c7; -fx-border-width: 2;");
        
        initializeMap();
    }
    
    private void initializeMap() {
        mapPane = new Pane();
        mapPane.setStyle("-fx-background-color: white;");
        
        // Draw mall layout
        drawMallLayout();
        
        getChildren().add(mapPane);
    }
    
    private void drawMallLayout() {
    	
        // Draw main mall structure
        Rectangle mallOutline = new Rectangle(550, 350);
        mallOutline.setFill(Color.LIGHTGRAY);
        mallOutline.setStroke(Color.BLACK);
        mallOutline.setStrokeWidth(2);
        mallOutline.setX(25);
        mallOutline.setY(25);
        mapPane.getChildren().add(mallOutline);
        
        // Draw corridors (pathways)
        drawCorridors();
        
        // Draw store locations
        drawStores(floor);
        
        // Draw information desk (current location)
        Circle infoDesk = new Circle(300, 200, 10);
        infoDesk.setFill(Color.BLUE);
        infoDesk.setStroke(Color.WHITE);
        infoDesk.setStrokeWidth(2);
        mapPane.getChildren().add(infoDesk);
        
        Text infoText = new Text(282, 170, "You are\n   here");
        infoText.setFill(Color.BLUE);
        infoText.setFont(Font.font(10));
        mapPane.getChildren().add(infoText);
        
        // Add store labels
        addStoreLabels();
    }
    
    private void drawCorridors() {
        // Main horizontal corridor
        Rectangle mainCorridor = new Rectangle(500, 40);
        mainCorridor.setFill(Color.WHITE);
        mainCorridor.setStroke(Color.GRAY);
        mainCorridor.setStrokeWidth(1);
        mainCorridor.setX(50);
        mainCorridor.setY(180);
        mapPane.getChildren().add(mainCorridor);
        
        // Main vertical corridor
        Rectangle verticalCorridor = new Rectangle(40, 300);
        verticalCorridor.setFill(Color.WHITE);
        verticalCorridor.setStroke(Color.GRAY);
        verticalCorridor.setStrokeWidth(1);
        verticalCorridor.setX(280);
        verticalCorridor.setY(50);
        mapPane.getChildren().add(verticalCorridor);
        
        // Additional corridors
        Rectangle sideCorridor1a = new Rectangle(40, 80);
        sideCorridor1a.setFill(Color.WHITE);
        sideCorridor1a.setStroke(Color.GRAY);
        sideCorridor1a.setStrokeWidth(1);
        sideCorridor1a.setX(150);
        sideCorridor1a.setY(100);
        mapPane.getChildren().add(sideCorridor1a);
        
     // Additional corridors
        Rectangle sideCorridor1b = new Rectangle(40, 130);
        sideCorridor1b.setFill(Color.WHITE);
        sideCorridor1b.setStroke(Color.GRAY);
        sideCorridor1b.setStrokeWidth(1);
        sideCorridor1b.setX(150);
        sideCorridor1b.setY(220);
        mapPane.getChildren().add(sideCorridor1b);
        
        Rectangle sideCorridor2a = new Rectangle(40, 80);
        sideCorridor2a.setFill(Color.WHITE);
        sideCorridor2a.setStroke(Color.GRAY);
        sideCorridor2a.setStrokeWidth(1);
        sideCorridor2a.setX(410);
        sideCorridor2a.setY(100);
        mapPane.getChildren().add(sideCorridor2a);
        
        Rectangle sideCorridor2b = new Rectangle(40, 130);
        sideCorridor2b.setFill(Color.WHITE);
        sideCorridor2b.setStroke(Color.GRAY);
        sideCorridor2b.setStrokeWidth(1);
        sideCorridor2b.setX(410);
        sideCorridor2b.setY(220);
        mapPane.getChildren().add(sideCorridor2b);
    }
    
    private void drawStores(String floor) {
    		
	    	if (floor.equalsIgnoreCase("First Floor")) {
	    		// stores with positions (First Floor)
		    	
	    		// Corridor 1-A
		    	addStore("   Gap   ", 90, 100, Color.ORANGE);
		    addStore("Samsung Store", 40, 300, Color.SILVER);
		
		    	// Corridor 2-A
		    addStore("Lego Store", 194, 220, Color.YELLOW);
		    addStore("Book Store", 194, 152, Color.LIGHTBLUE);
		        
		    	// Corridor 1-B
		    addStore("Cinnabon", 330, 152, Color.RED);
		    addStore("Spencer's", 330, 220, Color.GREEN);
		        
		    	// Corridor 2-B
		    addStore("Hot Topic", 450, 100, Color.PURPLE);
		    addStore("Food Court", 450, 300, Color.BROWN);
		    
	    	} else if (floor.equalsIgnoreCase("Second Floor")) {
	    		// stores with positions (Second Floor)
		    	
	    		// Corridor 1-A
		    	addStore("American Eagle", 35, 100, Color.SILVER);
		    addStore("Journeys", 80, 280, Color.ORANGE);
		
		    	// Corridor 2-A
		    addStore("Toy Store", 330, 152, Color.LIGHTBLUE);
		    addStore("Chapters", 330, 220, Color.DARKRED);
		        
		    	// Corridor 1-B
		    addStore("  Levi's  ", 203, 220, Color.RED);
		    addStore("TD Bank", 200, 152, Color.GREEN);
		        
		    	// Corridor 2-B
		    addStore("The Source", 450, 100, Color.GREY);
		    addStore("Food Court", 450, 300, Color.BROWN);
	    		
	    	} else if (floor.equalsIgnoreCase("Third Floor")) {
	    		// stores with positions (Third Floor)
		    	
	    		// Corridor 1-A
		    	addStore("Barber Shop", 57, 100, Color.SILVER);
		    addStore("Lululemon", 67, 280, Color.ORANGE);
		
		    	// Corridor 2-A
		    addStore("  Crocs  ", 330, 152, Color.DARKGREEN);
		    addStore("  Bell  ", 340, 220, Color.LIGHTBLUE);
		        
		    	// Corridor 1-B
		    addStore("Popcorn", 200, 220, Color.YELLOW);
		    addStore("Arcade", 205, 152, Color.GREY);
		        
		    	// Corridor 2-B
		    addStore("Sleep Country", 450, 100, Color.PURPLE);
		    addStore("Dollarama", 450, 300, Color.GREEN);
	    		
	    	} else {
	    		// stores with positions (Ground Floor)
		    	
	    		// Corridor 1-A
		    	addStore("Apple Store", 62, 100, Color.SILVER);
		    addStore("   H&M   ", 80, 280, Color.ORANGE);
		
			// Corridor 2-A 		    
		    addStore("  CIBC  ", 205, 220, Color.RED);
		    addStore("Book Store", 194, 152, Color.LIGHTBLUE);
		    
		    // Corridor 1-B
		    addStore("Sephora", 333, 152, Color.PINK);
		    addStore("GameStop", 325, 220, Color.PURPLE);
		        
		    	// Corridor 2-B
		    addStore("Starbucks", 450, 100, Color.GREEN);
		    addStore("Food Court", 450, 300, Color.BROWN);
	    	}
    }
    
    private void addStore(String name, int x, int y, Color color) {

        Text label = new Text(name);
        label.setFill(Color.BLACK);
        label.setFont(Font.font("Georgia", 15));

        // Measure text size
        double textWidth = label.getLayoutBounds().getWidth();
        double textHeight = label.getLayoutBounds().getHeight();

        double buffer = 5;

        // Create rectangle that wraps text
        Rectangle store = new Rectangle(
            textWidth + buffer * 2,
            textHeight + buffer * 2
        );

        store.setFill(color);
        store.setStroke(Color.BLACK);
        store.setStrokeWidth(1);
        store.setX(x);
        store.setY(y);
        store.setArcWidth(10);
        store.setArcHeight(10);

        // Position text inside rectangle
        label.setX(x + buffer);
        label.setY(y + textHeight + buffer / 2);

        mapPane.getChildren().addAll(store, label);

        StoreLocation location = new StoreLocation(name, x, y, this.floor);
        storeLocations.put(name, location);
    }
    
    private void addStoreLabels() {
        // Add directory numbers (store finder grid)
        for (int i = 1; i <= 20; i++) {
            Circle dot = new Circle(20 + (i * 25), 15, 3);
            dot.setFill(Color.RED);
            Text num = new Text(15 + (i * 25), 10, String.valueOf(i));
            num.setFont(Font.font(8));
            mapPane.getChildren().addAll(dot, num);
        }
        
        // Add legend
        Text legend = new Text(450, 400, "● Store Numbers - See Directory");
        legend.setFont(Font.font(10));
        legend.setFill(Color.GRAY);
        mapPane.getChildren().add(legend);
    }
    
    public void highlightStore(String storeName) {
        // Clear previous highlights
        mapPane.getChildren().removeIf(node -> 
            node instanceof Rectangle && "highlight".equals(node.getStyleClass().toString())
        );
        
        // Highlight selected store
        StoreLocation loc = storeLocations.get(storeName);
        if (loc != null) {
            Rectangle highlight = new Rectangle(loc.getX() - 3, loc.getY() - 3, 76, 56);
            highlight.setFill(Color.TRANSPARENT);
            highlight.setStroke(Color.YELLOW);
            highlight.setStrokeWidth(4);
            highlight.getStyleClass().add("highlight");
            mapPane.getChildren().add(highlight);
        }
    }
    
    public void setCurrentLocation(String location) {
        if (currentLocationMarker != null) {
            mapPane.getChildren().remove(currentLocationMarker);
        }
        
        // Find and highlight current location
        if (location.equals("Information Desk")) {
            currentLocationMarker = new Circle(300, 200, 12);
            currentLocationMarker.setFill(Color.GREEN);
            currentLocationMarker.setStroke(Color.WHITE);
            currentLocationMarker.setStrokeWidth(3);
            mapPane.getChildren().add(currentLocationMarker);
        } else {
            StoreLocation loc = storeLocations.get(location);
            if (loc != null) {
                currentLocationMarker = new Circle(loc.getX() + 35, loc.getY() + 25, 12);
                currentLocationMarker.setFill(Color.GREEN);
                currentLocationMarker.setStroke(Color.WHITE);
                currentLocationMarker.setStrokeWidth(3);
                mapPane.getChildren().add(currentLocationMarker);
            }
        }
    }
    
    public String getDirections(String from, String to) {
        // Extract store names
        String fromStore = from.split(" \\(")[0];
        String toStore = to.split(" \\(")[0];
        
        // Simplified directions for demo
        StringBuilder directions = new StringBuilder();
        directions.append("DIRECTIONS:\n");
        directions.append("━━━━━━━━━━━━━━━━━━━━━━\n\n");
        
        if (fromStore.contains("Information Desk")) {
            directions.append("1. Start at the Information Desk (Center of Mall)\n");
            directions.append("2. Head towards the main corridor\n");
            
            if (toStore.contains("Apple Store")) {
                directions.append("3. Walk straight for 50 feet\n");
                directions.append("4. Turn left at the electronics section\n");
                directions.append("5. Apple Store will be on your right\n");
                directions.append("\n⏱️ Estimated time: 2 minutes");
            } else if (toStore.contains("Starbucks")) {
                directions.append("3. Walk straight for 30 feet\n");
                directions.append("4. Starbucks is directly ahead\n");
                directions.append("\n⏱️ Estimated time: 1 minute");
            } else if (toStore.contains("Food Court")) {
                directions.append("3. Take the elevator to the Third Floor\n");
                directions.append("4. Exit elevator and turn right\n");
                directions.append("5. Food Court is straight ahead\n");
                directions.append("\n⏱️ Estimated time: 3 minutes");
            } else {
                directions.append("3. Follow the main corridor for 100 feet\n");
                directions.append("4. " + toStore + " will be on your left\n");
                directions.append("\n⏱️ Estimated time: 3-4 minutes");
            }
        } else {
            directions.append("1. From " + fromStore + ", exit towards the main corridor\n");
            directions.append("2. Follow the signs to " + toStore + "\n");
            directions.append("3. Take the nearest elevator/escalator if needed\n");
            directions.append("4. " + toStore + " will be visible from the main walkway\n");
            directions.append("\n⏱️ Estimated time: 3-5 minutes");
        }
        
        return directions.toString();
    }
    
    public void setCurrentFloor(String floor) {
    		this.floor = floor;
        // Update map based on floor selection
        mapPane.getChildren().clear();
        initializeMap();
        
        // Add floor indicator
        Text floorText = new Text(500, 50, "📍 " + floor);
        floorText.setFill(Color.DARKBLUE);
        floorText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        mapPane.getChildren().add(floorText);
    }

    public void zoom(double factor) {
        scale *= factor;
        mapPane.setScaleX(scale);
        mapPane.setScaleY(scale);
    }
    
    public void resetZoom() {
        scale = 1.0;
        mapPane.setScaleX(1.0);
        mapPane.setScaleY(1.0);
    }
}