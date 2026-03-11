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
| Food Court | Food & Beverages | Central Area | 10:00-22:00 |
| Starbucks | Food & Beverages | North Entrance | 07:00-22:00 |
| Information Desk | Services | Main Entrance | 09:00-21:00 |
| Apple Store | Electronics | East Wing | 10:00-21:00 |
| H&M | Fashion & Apparel | West Wing | 10:00-21:00 |
| CIBC | Services | South Wing | 09:00-17:00 |
| Book Store | Books & Gifts | East Wing | 10:00-21:00 |
| Sephora | Fashion & Apparel | West Wing | 10:00-21:00 |
| GameStop | Entertainment | South Wing | 10:00-21:00 |

### First Floor
| Store | Category | Location | Hours |
|-------|----------|----------|-------|
| Gap | Fashion & Apparel | East Wing | 10:00-21:00 |
| Samsung Store | Electronics | East Wing | 10:00-21:00 |
| Lego Store | Entertainment | North Wing | 10:00-21:00 |
| Cinnabon | Food & Beverages | Food Court | 08:00-22:00 |
| Spencer's | Gifts | West Wing | 10:00-21:00 |
| Hot Topic | Fashion & Apparel | West Wing | 10:00-21:00 |
| Zara | Fashion & Apparel | West Wing | 10:00-21:00 |

### Second Floor
| Store | Category | Location | Hours |
|-------|----------|----------|-------|
| American Eagle | Fashion & Apparel | East Wing | 10:00-21:00 |
| Journeys | Fashion & Apparel | East Wing | 10:00-21:00 |
| Toy Store | Entertainment | North Wing | 10:00-21:00 |
| Chapters | Books & Gifts | South Wing | 09:00-22:00 |
| Levi's | Fashion & Apparel | West Wing | 10:00-21:00 |
| TD Bank | Services | South Wing | 09:00-18:00 |
| The Source | Electronics | West Wing | 10:00-21:00 |
| Barnes & Noble | Books & Gifts | South Wing | 09:00-21:00 |
| AMC Theaters | Entertainment | North Wing | 10:00-23:00 |

### Third Floor
| Store | Category | Location | Hours |
|-------|----------|----------|-------|
| Barber Shop | Services | East Wing | 09:00-20:00 |
| Lululemon | Fashion & Apparel | East Wing | 10:00-21:00 |
| Crocs | Fashion & Apparel | North Wing | 10:00-21:00 |
| Bell | Electronics | West Wing | 10:00-21:00 |
| Popcorn | Food & Beverages | Food Court | 11:00-22:00 |
| Arcade | Entertainment | North Wing | 11:00-23:00 |
| Sleep Country | Home Goods | West Wing | 10:00-20:00 |
| Dollarama | Discount | South Wing | 08:00-22:00 |
| Fitness Center | Services | East Wing | 06:00-22:00 |
| Spa & Wellness | Services | West Wing | 09:00-20:00 |
| Food Court Express | Food & Beverages | Central Area | 10:00-22:00 |

## 🧭 Map Coordinates System

### Store Positions by Floor

#### Ground Floor Map
| Store | X Position | Y Position | Color Code |
|-------|------------|------------|------------|
| Apple Store | 62 | 100 | Silver |
| H&M | 80 | 280 | Orange |
| CIBC | 205 | 220 | Red |
| Book Store | 194 | 152 | Light Blue |
| Sephora | 333 | 152 | Pink |
| GameStop | 325 | 220 | Purple |
| Starbucks | 450 | 100 | Green |
| Food Court | 450 | 300 | Brown |

#### First Floor Map
| Store | X Position | Y Position | Color Code |
|-------|------------|------------|------------|
| Gap | 90 | 100 | Orange |
| Samsung Store | 40 | 300 | Silver |
| Lego Store | 194 | 220 | Yellow |
| Cinnabon | 330 | 152 | Red |
| Spencer's | 330 | 220 | Green |
| Hot Topic | 450 | 100 | Purple |
| Food Court | 450 | 300 | Brown |

#### Second Floor Map
| Store | X Position | Y Position | Color Code |
|-------|------------|------------|------------|
| American Eagle | 35 | 100 | Silver |
| Journeys | 80 | 280 | Orange |
| Toy Store | 330 | 152 | Light Blue |
| Chapters | 330 | 220 | Dark Red |
| Levi's | 203 | 220 | Red |
| TD Bank | 200 | 152 | Green |
| The Source | 450 | 100 | Grey |
| Food Court | 450 | 300 | Brown |

#### Third Floor Map
| Store | X Position | Y Position | Color Code |
|-------|------------|------------|------------|
| Barber Shop | 57 | 100 | Silver |
| Lululemon | 67 | 280 | Orange |
| Crocs | 330 | 152 | Dark Green |
| Bell | 340 | 220 | Light Blue |
| Popcorn | 200 | 220 | Yellow |
| Arcade | 205 | 152 | Grey |
| Sleep Country | 450 | 100 | Purple |
| Dollarama | 450 | 300 | Green |

### Control Elements

#### Top Bar
- **Title**: "Mall Directory Kiosk"
- **Search Field**: Text input with search button
- **Floor Selector**: Dropdown (Ground, First, Second, Third)

#### Left Panel





#### Right Panel - Navigation Assistant
| Field | Display |
|-------|---------|
| Current Location | Information Desk |
| Destination | Apple Store |
| Directions | [Turn-by-turn instructions] |

## 🔧 Class Methods

### MallDirectoryKiosk.java
| Method | Parameters | Description |
|--------|------------|-------------|
| `start()` | Stage | Initializes UI and launches application |
| `performSearch()` | None | Filters stores based on search query |
| `filterStoresByCategory()` | String category | Updates store list by category |
| `selectStore()` | String storeName | Highlights selected store on map |
| `showDirections()` | None | Generates directions between locations |
| `getCurrentFloor()` | None | Returns selected floor value |

### MallMap.java
| Method | Parameters | Description |
|--------|------------|-------------|
| `drawMallLayout()` | None | Renders base map structure |
| `drawStores()` | String floor | Places stores on current floor |
| `highlightStore()` | String storeName | Highlights selected store |
| `setCurrentLocation()` | String location | Marks user's position |
| `getDirections()` | String from, String to | Returns navigation instructions |
| `zoom()` | double factor | Scales map view |

### StoreDirectory.java
| Method | Parameters | Returns |
|--------|------------|---------|
| `searchStores()` | String query | List of matching stores |
| `getStoresByCategory()` | String category | List of filtered stores |
| `getAllStoreNames()` | None | List of all stores |
| `getStore()` | String name | Store object |

## 📱 User Interaction Flow

1. Launch Application
2. Select Floor
3. Choose Action:
   - Search for store by name
   - Browse by category
   - Click store on map
4. View Search Results
5. Select Store
6. Click Get Directions
7. Display Turn-by-Turn Instructions

## ⚙️ Configuration

### Display Properties





### Color Scheme
| Element | Color Code | Usage |
|---------|------------|-------|
| Top Bar | #2c3e50 | Header background |
| Bottom Bar | #34495e | Footer background |
| Map Background | #ecf0f1 | Map canvas |
| Store Highlight | Yellow | Selected store outline |
| Current Location | Green | User position marker |
| Info Desk | Blue | Default starting point |

### Build Instructions
```bash
# Compile the application
javac --module-path /path/to/javafx-sdk/lib \
      --add-modules javafx.controls,javafx.fxml \
      mallkiosk/*.java mallkiosk/models/*.java

# Run the application
java --module-path /path/to/javafx-sdk/lib \
     --add-modules javafx.controls,javafx.fxml \
     mallkiosk.MallDirectoryKiosk




DIRECTIONS:
1. Start at the Information Desk (Center of Mall)
2. Head towards the main corridor
3. Walk straight for 50 feet
4. Turn left at the electronics section
5. Apple Store will be on your right

Estimated time: 2 minutes
