package tugas.akhir.scene;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MenuScene {
    private Stage stage;

    public MenuScene(Stage stage) {
        this.stage = stage;
    }

    public void display() {
        Label select = new Label("MENU");
        select.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
        select.setTextFill(Color.WHITE);

        Button trigonometryBtn = new Button("Trigonometri");
        trigonometryBtn.setOnMouseEntered(event -> trigonometryBtn.setCursor(Cursor.HAND));
        DropShadow dropShadow = new DropShadow();
        trigonometryBtn.setEffect(null);
        trigonometryBtn.setOnMouseEntered(event -> {
            trigonometryBtn.setCursor(Cursor.HAND);
            trigonometryBtn.setEffect(dropShadow);
        });
        trigonometryBtn.setOnMouseExited(event -> {
            trigonometryBtn.setEffect(null);
        });
        trigonometryBtn.setOnAction(action -> {
            TrigoScene trigo = new TrigoScene(stage);
            trigo.display();
        });
        trigonometryBtn.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #dba703; -fx-text-fill: white; -fx-font-size: 15px; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        trigonometryBtn.setPrefWidth(150);
        trigonometryBtn.setPrefHeight(50);

        Button temperatureBtn = new Button("Konversi Suhu");
        temperatureBtn.setOnMouseEntered(event -> temperatureBtn.setCursor(Cursor.HAND));
        temperatureBtn.setEffect(null);
        temperatureBtn.setOnMouseEntered(event -> {
            temperatureBtn.setCursor(Cursor.HAND);
            temperatureBtn.setEffect(dropShadow);
        });
        temperatureBtn.setOnMouseExited(event -> {
            temperatureBtn.setEffect(null);
        });
        temperatureBtn.setOnAction(action -> {
            TempConvScene tempscene = new TempConvScene(stage);
            tempscene.display();
        });
        temperatureBtn.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #dba703; -fx-text-fill: white; -fx-font-size: 15px; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        temperatureBtn.setPrefWidth(150);
        temperatureBtn.setPrefHeight(50);

        Button averageBtn = new Button("Rata-rata");
        averageBtn.setOnMouseEntered(event -> averageBtn.setCursor(Cursor.HAND));
        averageBtn.setEffect(null);
        averageBtn.setOnMouseEntered(event -> {
            averageBtn.setCursor(Cursor.HAND);
            averageBtn.setEffect(dropShadow);
        });
        averageBtn.setOnMouseExited(event -> {
            averageBtn.setEffect(null);
        });
        averageBtn.setOnAction(action -> {
            AverageScene averageScene = new AverageScene(stage);
            averageScene.display();
        });
        averageBtn.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #dba703; -fx-text-fill: white; -fx-font-size: 15px; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        averageBtn.setPrefWidth(150);
        averageBtn.setPrefHeight(50);

        Button bmiBtn = new Button("BMI");
        bmiBtn.setOnMouseEntered(event -> bmiBtn.setCursor(Cursor.HAND));
        bmiBtn.setEffect(null);
        bmiBtn.setOnMouseEntered(event -> {
            bmiBtn.setCursor(Cursor.HAND);
            bmiBtn.setEffect(dropShadow);
        });
        bmiBtn.setOnMouseExited(event -> {
            bmiBtn.setEffect(null);
        });
        bmiBtn.setOnAction(action -> {
            BmiScene bmiScene = new BmiScene(stage);
            bmiScene.display();
        });
        bmiBtn.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #dba703; -fx-text-fill: white; -fx-font-size: 15px; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        bmiBtn.setPrefWidth(150);
        bmiBtn.setPrefHeight(50);

        Button backBtn = new Button("Kembali");
        backBtn.setOnMouseEntered(event -> backBtn.setCursor(Cursor.HAND));
        backBtn.setEffect(null);
        backBtn.setOnMouseEntered(event -> {
            backBtn.setCursor(Cursor.HAND);
            backBtn.setEffect(dropShadow);
        });
        backBtn.setOnMouseExited(event -> {
            backBtn.setEffect(null);
        });
        backBtn.setOnAction(action -> {
            FrontScene frontScene = new FrontScene(stage);
            frontScene.display();
        });
        backBtn.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #c82929; -fx-text-fill: white; -fx-font-size: 15; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        backBtn.setPrefWidth(100);
        backBtn.setPrefHeight(30);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        gridPane.setPadding(new Insets(50, 0, 50, 0));

        gridPane.add(trigonometryBtn, 0, 0);
        gridPane.add(temperatureBtn, 1, 0);
        gridPane.add(averageBtn, 0, 1);
        gridPane.add(bmiBtn, 1, 1);

        VBox root = new VBox();
        root.getChildren().addAll(select, gridPane, backBtn);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #292d31;");

        Scene scene = new Scene(root, 350, 600);
        stage.setScene(scene);
    }
}
