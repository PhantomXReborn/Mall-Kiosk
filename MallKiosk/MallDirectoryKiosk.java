package mallkiosk;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.*;

public class MallDirectoryKiosk extends Application {

    private MallMap mallMap;
    private StoreDirectory storeDirectory;
    private TextField searchField;
    private ListView<String> searchResults;
    private Label currentLocationLabel;
    private Label destinationLabel;
    private TextArea directionsArea;
    private ComboBox<String> floorSelector;

    public static void main(String[] args) {
        launch(args);
    }

    public String getCurrentFloor() {
        return floorSelector.getValue();
    }

    @Override
    public void start(Stage primaryStage) {

        initializeMallData();

        BorderPane mainLayout = new BorderPane();
        mainLayout.setStyle("-fx-background-color: #f0f0f0;");

        HBox topBar = createTopBar();
        VBox leftPanel = createLeftPanel();
        StackPane centerPanel = createCenterPanel();
        VBox rightPanel = createRightPanel();
        HBox bottomPanel = createBottomPanel();

        mainLayout.setTop(topBar);
        mainLayout.setLeft(leftPanel);
        mainLayout.setCenter(centerPanel);
        mainLayout.setRight(rightPanel);
        mainLayout.setBottom(bottomPanel);

        Scene scene = new Scene(mainLayout, 1200, 700);

        primaryStage.setTitle("Mall Directory Kiosk - Shopping Mall Navigator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initializeMallData() {
        storeDirectory = new StoreDirectory();
        mallMap = new MallMap(storeDirectory);
    }

    private HBox createTopBar() {

        HBox topBar = new HBox(20);
        topBar.setPadding(new Insets(15));
        topBar.setStyle("-fx-background-color: #2c3e50;");
        topBar.setAlignment(Pos.CENTER_LEFT);

        Label title = new Label("🏬 Mall Directory Kiosk");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        title.setTextFill(Color.WHITE);

        searchField = new TextField();
        searchField.setPromptText("Search for stores, restaurants, or services...");
        searchField.setPrefWidth(400);

        Button searchButton = new Button("🔍 Search");
        searchButton.setOnAction(e -> performSearch());

        floorSelector = new ComboBox<>();
        floorSelector.getItems().addAll(
                "Ground Floor",
                "First Floor",
                "Second Floor",
                "Third Floor"
        );

        floorSelector.setValue("Ground Floor");

        floorSelector.setOnAction(e ->
                mallMap.setCurrentFloor(floorSelector.getValue())
        );

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        topBar.getChildren().addAll(
                title,
                spacer,
                searchField,
                searchButton,
                floorSelector
        );

        return topBar;
    }

    private VBox createLeftPanel() {

        VBox leftPanel = new VBox(15);
        leftPanel.setPadding(new Insets(20));
        leftPanel.setPrefWidth(250);
        leftPanel.setStyle("-fx-background-color: white; -fx-border-color: #ddd;");

        Label categoriesLabel = new Label("Store Categories");
        categoriesLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        ListView<String> categoryList = new ListView<>();

        categoryList.getItems().addAll(
                "All Stores",
                "👕 Fashion & Apparel",
                "🍔 Food & Beverages",
                "📱 Electronics",
                "📚 Books & Gifts",
                "💼 Services",
                "🎮 Entertainment"
        );

        categoryList.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldValue, newValue) -> filterStoresByCategory(newValue)
        );

        Label storesLabel = new Label("Store Directory");
        storesLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        searchResults = new ListView<>();
        searchResults.setPrefHeight(300);

        searchResults.getItems().addAll(storeDirectory.getAllStoreNames());

        searchResults.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldVal, newVal) -> selectStore(newVal)
        );

        Button findMeButton = new Button("📍 Find My Location");
        findMeButton.setMaxWidth(Double.MAX_VALUE);
        findMeButton.setOnAction(e -> showCurrentLocation());

        Button helpButton = new Button("❓ Need Help?");
        helpButton.setMaxWidth(Double.MAX_VALUE);
        helpButton.setOnAction(e -> showHelp());

        leftPanel.getChildren().addAll(
                categoriesLabel,
                categoryList,
                storesLabel,
                searchResults,
                findMeButton,
                helpButton
        );

        return leftPanel;
    }

    private StackPane createCenterPanel() {

        StackPane centerPanel = new StackPane();
        centerPanel.setPadding(new Insets(20));

        centerPanel.getChildren().add(mallMap);

        VBox zoomControls = new VBox(5);
        zoomControls.setAlignment(Pos.BOTTOM_RIGHT);

        Button zoomIn = new Button("+");
        zoomIn.setOnAction(e -> mallMap.zoom(1.2));

        Button zoomOut = new Button("-");
        zoomOut.setOnAction(e -> mallMap.zoom(0.8));

        Button resetZoom = new Button("↺");
        resetZoom.setOnAction(e -> mallMap.resetZoom());

        zoomControls.getChildren().addAll(
                zoomIn,
                zoomOut,
                resetZoom
        );

        StackPane.setAlignment(zoomControls, Pos.BOTTOM_RIGHT);
        centerPanel.getChildren().add(zoomControls);

        return centerPanel;
    }

    private VBox createRightPanel() {

        VBox rightPanel = new VBox(15);
        rightPanel.setPadding(new Insets(20));
        rightPanel.setPrefWidth(300);

        Label navLabel = new Label("Navigation Assistant");
        navLabel.setFont(Font.font("Arial", FontWeight.BOLD, 18));

        currentLocationLabel = new Label("📍 Current: Not set");
        destinationLabel = new Label("🎯 Destination: None selected");

        Button getDirectionsButton = new Button("🗺️ Get Directions");
        getDirectionsButton.setOnAction(e -> showDirections());

        directionsArea = new TextArea();
        directionsArea.setEditable(false);

        rightPanel.getChildren().addAll(
                navLabel,
                currentLocationLabel,
                destinationLabel,
                getDirectionsButton,
                directionsArea
        );

        return rightPanel;
    }

    private HBox createBottomPanel() {

        HBox bottomPanel = new HBox(20);
        bottomPanel.setPadding(new Insets(10));
        bottomPanel.setStyle("-fx-background-color: #34495e;");

        Label infoLabel = new Label(
                "🕒 Mall Hours: 10:00 AM - 9:00 PM | 📞 Customer Service: (555) 123-4567"
        );

        infoLabel.setTextFill(Color.WHITE);

        bottomPanel.getChildren().add(infoLabel);

        return bottomPanel;
    }

    private void performSearch() {

        String query = searchField.getText().toLowerCase();

        if (query.isEmpty())
            return;

        List<String> results = storeDirectory.searchStores(query);

        searchResults.getItems().clear();
        searchResults.getItems().addAll(results);
    }

    private void filterStoresByCategory(String category) {

        if (category == null)
            return;

        searchResults.getItems().clear();

        if (category.equals("All Stores")) {

            searchResults.getItems().addAll(
                    storeDirectory.getAllStoreNames()
            );

        } else {

            String cleanCategory = category.replaceAll("^[^a-zA-Z]+", "");

            List<String> filtered =
                    storeDirectory.getStoresByCategory(cleanCategory);

            searchResults.getItems().addAll(filtered);
        }
    }

    private void selectStore(String storeName) {

        if (storeName == null)
            return;

        String cleanName = storeName.split(" \\(")[0];

        destinationLabel.setText("🎯 Destination: " + storeName);

        mallMap.highlightStore(cleanName);
    }

    private void showCurrentLocation() {

        currentLocationLabel.setText(
                "📍 Current: Information Desk (Ground Floor)"
        );

        mallMap.setCurrentLocation("Information Desk");
    }

    private void showDirections() {

        String current =
                currentLocationLabel.getText().replace("📍 Current: ", "");

        String dest =
                destinationLabel.getText().replace("🎯 Destination: ", "");

        if (current.contains("Not set") || dest.contains("None selected")) {

            directionsArea.setText(
                    "Please set both current location and destination."
            );

            return;
        }

        String directions = mallMap.getDirections(current, dest);

        directionsArea.setText(directions);
    }

    private void showHelp() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Help - Mall Directory Kiosk");

        alert.setHeaderText("How to Use the Mall Directory");

        alert.setContentText(
                "1. Search for stores\n" +
                "2. Select a category\n" +
                "3. Click a store to highlight it\n" +
                "4. Use Find My Location\n" +
                "5. Click Get Directions"
        );

        alert.showAndWait();
    }
}