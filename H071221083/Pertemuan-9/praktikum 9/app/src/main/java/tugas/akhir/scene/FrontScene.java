package tugas.akhir.scene;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FrontScene {
    private Stage stage;

    public FrontScene(Stage stage) {
        this.stage = stage;
    }

    public void display() {
        Label appName = new Label("MyCalculator");
        appName.setFont(Font.font("Comic Sans MS", FontWeight.SEMI_BOLD, 40));
        appName.setTextFill(Color.WHITE);

        Button enter = new Button("MULAI");
        enter.setOnMouseEntered(event -> enter.setCursor(Cursor.HAND));
        DropShadow dropShadow = new DropShadow();
        enter.setEffect(null);
        enter.setOnMouseEntered(event -> {
            enter.setCursor(Cursor.HAND);
            enter.setEffect(dropShadow);
        });
        enter.setOnMouseExited(event -> {
            enter.setEffect(null);
        });
        enter.setOnAction(action -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.display();
        });
        enter.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #dba703; -fx-text-fill: white; -fx-font-size: 20px; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        enter.setPrefWidth(150);
        enter.setPrefHeight(50);

        Button exitBtn = new Button("Keluar");
        exitBtn.setOnMouseEntered(event -> exitBtn.setCursor(Cursor.HAND));
        exitBtn.setEffect(null);
        exitBtn.setOnMouseEntered(event -> {
            exitBtn.setCursor(Cursor.HAND);
            exitBtn.setEffect(dropShadow);
        });
        exitBtn.setOnMouseExited(event -> {
            exitBtn.setEffect(null);
        });
        exitBtn.setOnAction(action -> {
            stage.close();
        });
        exitBtn.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #c82929; -fx-text-fill: white; -fx-font-size: 15; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        exitBtn.setPrefWidth(100);
        exitBtn.setPrefHeight(30);

        Image icon = new Image(
                "C:\\Nabil\\Campus\\2. Semester 2\\9. Praktikum PBO\\5. Push Asistensi\\ASISTENSI-G-LAB-OOP-2022\\H071221083\\Pertemuan-9\\praktikum 9\\app\\src\\main\\resources\\calculator.png");
        stage.getIcons().add(icon);

        ImageView appImg = new ImageView(
                "C:\\Nabil\\Campus\\2. Semester 2\\9. Praktikum PBO\\5. Push Asistensi\\ASISTENSI-G-LAB-OOP-2022\\H071221083\\Pertemuan-9\\praktikum 9\\app\\src\\main\\resources\\calculator.png");
        appImg.setFitWidth(150);
        appImg.setFitHeight(150);

        VBox root = new VBox();
        root.getChildren().addAll(appImg, appName, enter, exitBtn);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(40);
        root.setPadding(new Insets(50));
        root.setStyle("-fx-background-color: #292d31;");

        Scene scene = new Scene(root, 350, 600);
        stage.setScene(scene);
    }
}
