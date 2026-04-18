# 🏬 Mall Directory Kiosk

A JavaFX-based interactive touchscreen application designed for shopping malls to help visitors navigate stores, find amenities, and get directions.

## 📋 Program Overview

The Mall Directory Kiosk provides an interactive store directory with map navigation. Users can search stores by name or category across four floors, view color-coded locations on a visual map, highlight selections, and receive turn-by-turn directions through an intuitive touchscreen interface.

## 🎯 Core Features

| Feature | Description | User Interaction |
|---------|-------------|------------------|
| **Store Search** | Search by name or keyword | Text input field |
| **Category Filter** | Browse stores by type | Category list view |
| **Floor Selection** | Switch between 4 mall levels | Dropdown selector |
| **Interactive Map** | Visual store locations | Clickable map pane |
| **Directions** | Turn-by-turn navigation | Button trigger |
| **Zoom Controls** | Map magnification | Plus/minus buttons |

## 🏢 Store Directory

### Ground Floor
| Store | Category | Location | Hours |
|-------|----------|----------|-------|
| Information Desk | Services | Main Entrance | 09:00-21:00 |
| Apple Store | Electronics | East Wing | 10:00-21:00 |
| H&M | Fashion & Apparel | West Wing | 10:00-21:00 |
| CIBC | Services | South Wing | 09:00-17:00 |
| Book Store | Books & Gifts | East Wing | 10:00-21:00 |
| Sephora | Beauty | West Wing | 10:00-21:00 |
| GameStop | Entertainment | South Wing | 10:00-21:00 |
| Starbucks | Coffee Shops | North Entrance | 07:00-22:00 |
| Tim Hortons | Coffee Shops | South Entrance | 06:00-22:00 |
| McDonald's | Food & Beverages | East Wing | 24/7 |
| Subway | Food & Beverages | West Wing | 08:00-22:00 |
| Dollarama | Services | East Wing | 09:00-21:00 |
| Shoppers Drug Mart | Services | West Wing | 08:00-22:00 |

### First Floor
| Store | Category | Location | Hours |
|-------|----------|----------|-------|
| Gap | Fashion & Apparel | East Wing | 10:00-21:00 |
| Samsung Store | Electronics | East Wing | 10:00-21:00 |
| Lego Store | Entertainment | North Wing | 10:00-20:00 |
| Cinnabon | Food & Beverages | Central Area | 10:00-20:00 |
| Spencer's | Gifts | South Wing | 10:00-21:00 |
| Hot Topic | Entertainment | North Wing | 10:00-21:00 |
| Zara | Fashion & Apparel | West Wing | 10:00-21:00 |
| Food Court | Food & Beverages | South Wing | 10:00-22:00 |
| Indigo Books | Books & Gifts | West Wing | 09:00-21:00 |

### Second Floor
| Store | Category | Location | Hours |
|-------|----------|----------|-------|
| American Eagle | Fashion & Apparel | East Wing | 10:00-21:00 |
| Journeys | Fashion & Apparel | West Wing | 10:00-21:00 |
| Toy Store | Entertainment | Central Area | 10:00-20:00 |
| Chapters | Books & Gifts | South Wing | 09:00-22:00 |
| Levi's | Fashion & Apparel | East Wing | 10:00-21:00 |
| TD Bank | Services | West Wing | 09:00-17:00 |
| The Source | Electronics | North Wing | 10:00-21:00 |
| Food Court | Food & Beverages | South Wing | 10:00-22:00 |
| Sephora | Beauty | East Wing | 10:00-21:00 |
| GameStop | Entertainment | West Wing | 10:00-21:00 |
| AMC Theaters | Entertainment | North Wing | 10:00-23:00 |
| Barnes & Noble | Books & Gifts | South Wing | 09:00-21:00 |

### Third Floor
| Store | Category | Location | Hours |
|-------|----------|----------|-------|
| Barber Shop | Services | East Wing | 09:00-19:00 |
| Lululemon | Fashion & Apparel | West Wing | 10:00-21:00 |
| Crocs | Fashion & Apparel | Central Area | 10:00-20:00 |
| Bell Mobility | Services | East Wing | 10:00-20:00 |
| Popcorn Shop | Food & Beverages | South Wing | 10:00-21:00 |
| Arcade | Entertainment | North Wing | 11:00-23:00 |
| Sleep Country | Services | West Wing | 10:00-19:00 |
| Dollarama | Services | East Wing | 09:00-21:00 |
| Fitness Center | Health & Wellness | North Wing | 06:00-22:00 |
| Spa & Wellness | Health & Wellness | South Wing | 09:00-20:00 |
| Food Court Express | Food & Beverages | Central Area | 10:00-22:00 |
| Best Buy | Electronics | West Wing | 10:00-21:00 |
| Winners | Fashion & Apparel | East Wing | 09:00-21:00 |

## 🗺️ Map Coordinates System

### Store Positions by Floor

#### Ground Floor Map
| Store | X Position | Y Position | Color Code |
|-------|------------|------------|------------|
| Apple Store | 90 | 100 | #B0BEC5 (Silver) |
| H&M | 90 | 280 | #FFB74D (Orange) |
| CIBC | 190 | 100 | #EF9A9A (Red) |
| Book Store | 190 | 280 | #81D4FA (Light Blue) |
| Sephora | 420 | 100 | #F48FB1 (Pink) |
| GameStop | 420 | 280 | #CE93D8 (Purple) |
| Starbucks | 540 | 100 | #A5D6A7 (Green) |
| Tim Hortons | 540 | 280 | #BCAAA4 (Brown) |

#### First Floor Map
| Store | X Position | Y Position | Color Code |
|-------|------------|------------|------------|
| Gap | 90 | 100 | #FFB74D (Orange) |
| Samsung Store | 40 | 280 | #B0BEC5 (Silver) |
| Lego Store | 190 | 100 | #FFF59D (Yellow) |
| Book Store | 190 | 280 | #81D4FA (Light Blue) |
| Cinnabon | 420 | 100 | #EF9A9A (Red) |
| Spencer's | 420 | 280 | #A5D6A7 (Green) |
| Hot Topic | 540 | 100 | #CE93D8 (Purple) |
| Food Court | 540 | 280 | #BCAAA4 (Brown) |

#### Second Floor Map
| Store | X Position | Y Position | Color Code |
|-------|------------|------------|------------|
| American Eagle | 90 | 100 | #B0BEC5 (Silver) |
| Journeys | 90 | 280 | #FFB74D (Orange) |
| Toy Store | 190 | 100 | #81D4FA (Light Blue) |
| Chapters | 190 | 280 | #EF9A9A (Red) |
| Levi's | 420 | 100 | #EF9A9A (Red) |
| TD Bank | 420 | 280 | #A5D6A7 (Green) |
| The Source | 540 | 100 | #B0BEC5 (Silver) |
| Food Court | 540 | 280 | #BCAAA4 (Brown) |

#### Third Floor Map
| Store | X Position | Y Position | Color Code |
|-------|------------|------------|------------|
| Barber Shop | 90 | 100 | #B0BEC5 (Silver) |
| Lululemon | 90 | 280 | #FFB74D (Orange) |
| Crocs | 190 | 100 | #A5D6A7 (Green) |
| Bell | 190 | 280 | #81D4FA (Light Blue) |
| Popcorn | 420 | 100 | #FFF59D (Yellow) |
| Arcade | 420 | 280 | #CE93D8 (Purple) |
| Sleep Country | 540 | 100 | #CE93D8 (Purple) |
| Dollarama | 540 | 280 | #A5D6A7 (Green) |

### Control Elements

#### Top Bar
- Title: "Mall Directory Kiosk" with premium shopping navigator subtitle
- Search Field: Text input with search button (450px width)
- Floor Selector: Dropdown (Ground Floor, First Floor, Second Floor, Third Floor)

#### Left Panel - Store Directory (300px width)
| Section | Content |
|---------|---------|
| Header | Store Directory |
| Categories | All Stores, Fashion & Apparel, Food & Beverages, Electronics, Books & Gifts, Services, Entertainment, Coffee Shops, Health & Wellness, Beauty |
| Stores List | Scrollable list of all stores with floor indication |
| Actions | Find My Location button, Need Help button |

#### Center Panel - Interactive Map (700x500px)
| Element | Description |
|---------|-------------|
| Map Background | White with light gray border |
| Corridors | Main horizontal (50,220,600,60) and vertical (340,50,60,400) |
| Store Rectangles | Rounded corners with color coding |
| Store Labels | Store names centered in rectangles |
| Information Desk | Blue rectangle at (320,240,60,40) |
| Floor Indicator | Current floor badge at top-left |
| Zoom Controls | Plus, minus, and reset buttons at bottom-right |

#### Right Panel - Navigation Assistant (350px width)
| Field | Display |
|-------|---------|
| Current Location | 📍 Information Desk (Ground Floor) |
| Destination | 🎯 Apple Store (First Floor) |
| Directions Button | 🗺️ Get Directions (green button) |
| Directions Area | Scrollable text area with step-by-step instructions |

#### Bottom Bar
| Information | Display |
|-------------|---------|
| Mall Hours | 🕒 10:00 AM - 9:00 PM |
| Customer Service | 📞 (555) 123-4567 |
| Email | ✉️ info@mallkiosk.com |
| WiFi | 📶 Free WiFi Available |

## 🔧 Class Methods

### MallDirectoryKiosk.java
| Method | Parameters | Return | Description |
|--------|------------|--------|-------------|
| main() | String[] args | void | Launches JavaFX application |
| start() | Stage primaryStage | void | Initializes UI and sets up scene |
| initializeMallData() | None | void | Creates store directory and map |
| createTopBar() | None | HBox | Builds top navigation bar |
| createLeftPanel() | None | VBox | Creates store directory panel |
| createCenterPanel() | None | StackPane | Builds interactive map |
| createRightPanel() | None | VBox | Creates navigation assistant |
| createBottomPanel() | None | HBox | Builds info bar |
| performSearch() | None | void | Filters stores based on search query |
| filterStoresByCategory() | String category | void | Updates store list by category |
| selectStore() | String storeName | void | Highlights selected store on map |
| showCurrentLocation() | None | void | Sets location to Information Desk |
| showDirections() | None | void | Generates directions between locations |
| showHelp() | None | void | Displays help dialog |
| updateFloorInfo() | None | void | Updates floor indicator label |
| getCurrentFloor() | None | String | Returns selected floor value |

### MallMap.java
| Method | Parameters | Return | Description |
|--------|------------|--------|-------------|
| MallMap() | StoreDirectory directory | Constructor | Initializes map with store data |
| initializeMap() | None | void | Creates map pane and layout |
| drawMallLayout() | None | void | Renders base map structure |
| drawCorridors() | None | void | Draws walking paths |
| drawStores() | String floor | void | Places stores on current floor |
| addStoreWithBetterHighlight() | String name, int x, int y, Color color | void | Adds clickable store rectangle |
| drawInformationDesk() | None | void | Creates info desk marker |
| drawLegend() | None | void | Adds map legend |
| highlightStore() | String storeName | void | Highlights selected store with pulse |
| setCurrentLocation() | String location | void | Marks user's position with green dot |
| getDirections() | String from, String to | String | Returns navigation instructions |
| setCurrentFloor() | String floor | void | Changes displayed floor |
| zoom() | double factor | void | Scales map view |
| resetZoom() | None | void | Returns to default zoom level |

### StoreDirectory.java
| Method | Parameters | Return | Description |
|--------|------------|--------|-------------|
| StoreDirectory() | None | Constructor | Initializes store collections |
| initializeStores() | None | void | Populates all store data |
| addStore() | String name, String category, String floor, String location, String hours | void | Adds store to directory |
| searchStores() | String query | List<String> | Returns matching stores |
| getStoresByCategory() | String category | List<String> | Returns filtered store list |
| getAllStoreNames() | None | List<String> | Returns all stores with floor info |
| getStore() | String name | Store | Returns store object |
| getStoresByFloor() | String floor | List<Store> | Returns stores on specific floor |

### Store.java
| Method | Parameters | Return | Description |
|--------|------------|--------|-------------|
| Store() | String name, String category, String floor, String unit, String hours | Constructor | Creates store object |
| getName() | None | String | Returns store name |
| setName() | String name | void | Updates store name |
| getCategory() | None | String | Returns store category |
| setCategory() | String category | void | Updates category |
| getFloor() | None | String | Returns floor location |
| setFloor() | String floor | void | Updates floor |
| getUnit() | None | String | Returns unit/location |
| getHours() | None | String | Returns operating hours |
| getPhone() | None | String | Returns phone number |
| setPhone() | String phone | void | Updates phone number |
| toString() | None | String | Returns formatted store string |

### StoreLocation.java
| Method | Parameters | Return | Description |
|--------|------------|--------|-------------|
| StoreLocation() | String name, int x, int y, String floor | Constructor | Creates location object |
| getX() | None | int | Returns X coordinate |
| setX() | int x | void | Updates X coordinate |
| getY() | None | int | Returns Y coordinate |
| setY() | int y | void | Updates Y coordinate |
| getFloor() | None | String | Returns floor |
| isElevator() | None | boolean | Checks if elevator |
| setElevator() | boolean elevator | void | Sets elevator flag |
| distanceTo() | StoreLocation other | double | Calculates Euclidean distance |

## 📱 User Interaction Flow

1. Launch Application → Main window opens with Ground Floor displayed
2. Select Floor → Choose from dropdown in top bar
3. Choose Action:
   - Type in search field + press Enter/Search
   - Click category in left panel
   - Click store name in directory list
   - Click store rectangle directly on map
4. View Results → Store list updates with matching results
5. Select Store → Store highlights on map with yellow pulsing border
6. Set Current Location → Click "Find My Location" button
7. Get Directions → Click "Get Directions" button
8. Display Instructions → Turn-by-turn directions appear in right panel

## ⚙️ Configuration

### Display Properties
| Property | Value |
|----------|-------|
| Window Width | 1400 pixels |
| Window Height | 800 pixels |
| Left Panel Width | 300 pixels |
| Right Panel Width | 350 pixels |
| Map Width | 700 pixels |
| Map Height | 500 pixels |
| Map Scale Range | 0.5x to 2.0x |

### Color Scheme
| Element | Color Code | Usage |
|---------|------------|-------|
| Top Bar Background | Linear gradient #1a1a2e to #16213e | Header background |
| Bottom Bar Background | #1a1a2e | Footer background |
| Main Background | Linear gradient #667eea to #764ba2 | Window background |
| Map Background | #ecf0f1 | Map canvas |
| Map Border | #bdc3c7 | Map outline |
| Store Highlight | #f39c12 (Yellow-Orange) | Selected store outline |
| Current Location | #2ecc71 (Green) | User position marker |
| Info Desk | #3498db (Blue) | Default starting point |
| Find My Location Button | #3498db | Blue button |
| Help Button | #e74c3c | Red button |
| Get Directions Button | #27ae60 | Green button |
| Text Primary | #2c3e50 | Dark blue-gray text |
| Text Secondary | #7f8c8d | Gray text |
| Text Light | #e0e0e0 | Light text for dark backgrounds |

### Store Color Categories
| Category | Color Code | Color Name |
|----------|------------|------------|
| Electronics | #B0BEC5 | Silver/Gray |
| Fashion & Apparel | #FFB74D | Orange |
| Food & Beverages | #EF9A9A | Light Red |
| Books & Gifts | #81D4FA | Light Blue |
| Services | #A5D6A7 | Light Green |
| Entertainment | #CE93D8 | Purple |
| Beauty | #F48FB1 | Pink |
| Coffee Shops | #BCAAA4 | Brown |
| Health & Wellness | #81C784 | Green |
| Gifts | #FFF59D | Yellow |

## 🧪 Test Suite

### Test Classes Overview
| Test Class | Purpose | Number of Tests |
|------------|---------|-----------------|
| JUnit4CheckTest | Verify JUnit setup | 4 |
| StoreTest | Store model functionality | 10 |
| StoreLocationTest | Location and distance | 9 |
| StoreDirectoryTest | Search and filtering | 9 |
| MallMapTest | Map navigation | 7 |
| MallKioskIntegrationTest | End-to-end scenarios | 4 |

### Test Execution Output

========================================
Running Mall Directory Kiosk Tests (JUnit 4)
========================================

========================================
TEST SUMMARY
========================================
Tests run: 43
Tests passed: 43
Tests failed: 0
Tests ignored: 0
Time elapsed: 234 ms
========================================

All 43 tests passed!
Mall kiosk is working correctly

## 📊 Direction Output Example

### From Information Desk to Apple Store

🗺️ DIRECTIONS
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

📍 Starting Point: Information Desk
🎯 Destination: Apple Store

📋 Step-by-Step:
━━━━━━━━━━━━━━━━━━━━━━

1️⃣ Start at the Information Desk (Center of Mall)
2️⃣ Head towards the main corridor
3️⃣ Walk straight for 50 feet towards East Wing
4️⃣ Apple Store will be on your right

⏱️ Estimated time: 2 minutes
📏 Distance: ~150 feet

━━━━━━━━━━━━━━━━━━━━━━
💡 Tip: Look for directional signs along the way!

### From Information Desk to Starbucks

🗺️ DIRECTIONS
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

📍 Starting Point: Information Desk
🎯 Destination: Starbucks

📋 Step-by-Step:
━━━━━━━━━━━━━━━━━━━━━━

1️⃣ Start at the Information Desk (Center of Mall)
2️⃣ Head towards the main corridor
3️⃣ Walk straight for 30 feet towards South Entrance
4️⃣ Starbucks is directly ahead on the left

⏱️ Estimated time: 1 minute
📏 Distance: ~80 feet

### From Information Desk to Food Court

🗺️ DIRECTIONS
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

📍 Starting Point: Information Desk
🎯 Destination: Food Court

📋 Step-by-Step:
━━━━━━━━━━━━━━━━━━━━━━

1️⃣ Start at the Information Desk (Center of Mall)
2️⃣ Head towards the main corridor
3️⃣ Take the elevator to the Third Floor
4️⃣ Exit elevator and turn right
5️⃣ Food Court is straight ahead

⏱️ Estimated time: 3 minutes
📏 Distance: ~200 feet

## 🐛 Error Handling

| Error Scenario | User Message |
|----------------|---------------|
| No search results | "❌ No stores found matching 'query'" |
| No current location set | "⚠️ Please set both current location and destination." |
| No destination selected | "⚠️ Please set both current location and destination." |
| Store on different floor | Alert dialog: "The selected store is on the X Floor. Please change the floor using the dropdown above." |
| Empty search | Shows all stores |

## 📁 File Structure

mallkiosk/
├── MallDirectoryKiosk.java
├── MallMap.java
├── StoreDirectory.java
├── JavaFXTestBase.java
├── JUnit4CheckTest.java
├── MallKioskIntegrationTest.java
├── MallMapTest.java
├── StoreDirectoryTest.java
├── TestAllRunner.java
└── models/
    ├── Store.java
    ├── StoreLocation.java
    ├── StoreTest.java
    └── StoreLocationTest.java

## 🚀 Build Instructions

### Eclipse Setup

VM Arguments Required:
--module-path "C:\path\to\javafx-sdk\lib" --add-modules javafx.controls,javafx.fxml,javafx.graphics

### Command Line

Compile:
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml mallkiosk/*.java mallkiosk/models/*.java

Run:
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml mallkiosk.MallDirectoryKiosk

Run Tests:
java mallkiosk.TestAllRunner

## 📞 Support

| Contact Method | Information |
|----------------|-------------|
| Customer Service | (555) 123-4567 |
| Email | info@mallkiosk.com |
| Mall Hours | 10:00 AM - 9:00 PM Daily |
| Information Desk | Ground Floor, Main Entrance |

## 📄 License

MIT License - Free for educational and commercial use with attribution.
