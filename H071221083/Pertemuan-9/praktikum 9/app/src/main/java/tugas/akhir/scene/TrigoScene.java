package tugas.akhir.scene;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TrigoScene {
    private Stage stage;

    public TrigoScene(Stage stage) {
        this.stage = stage;
    }

    public void display() {
        Label titleLabel = new Label("Perhitungan Trigonometri");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: white;");

        Label angleLabel = new Label("Sudut (dalam derajat):");
        angleLabel.setStyle("-fx-text-fill: white;");

        TextField angleTextField = new TextField();

        Label resultLabel = new Label();
        resultLabel.setStyle("-fx-text-fill: white;");

        Button calculateButton = new Button("Hitung");
        calculateButton.setOnMouseEntered(event -> calculateButton.setCursor(Cursor.HAND));
        DropShadow dropShadow = new DropShadow();
        calculateButton.setEffect(null);
        calculateButton.setOnMouseEntered(event -> {
            calculateButton.setCursor(Cursor.HAND);
            calculateButton.setEffect(dropShadow);
        });
        calculateButton.setOnMouseExited(event -> {
            calculateButton.setEffect(null);
        });
        calculateButton.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #027b02; -fx-text-fill: white; -fx-font-size: 15px; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        calculateButton.setOnAction(action -> {
            try {
                double angle = Double.parseDouble(angleTextField.getText());
                double radians = Math.toRadians(angle);

                double sinValue = Math.sin(radians);
                double cosValue = Math.cos(radians);
                double tanValue = Math.tan(radians);

                String resultText = String.format("Sin(%s) = %.2f\nCos(%s) = %.2f\nTan(%s) = %.2f",
                        angle, sinValue, angle, cosValue, angle, tanValue);

                resultLabel.setText(resultText);
            } catch (NumberFormatException e) {
                resultLabel.setText("Masukkan angka yang valid!");
            }
        });

        Button clearButton = new Button("Clear");
        clearButton.setOnMouseEntered(event -> clearButton.setCursor(Cursor.HAND));
        clearButton.setEffect(null);
        clearButton.setOnMouseEntered(event -> {
            clearButton.setCursor(Cursor.HAND);
            clearButton.setEffect(dropShadow);
        });
        clearButton.setOnMouseExited(event -> {
            clearButton.setEffect(null);
        });
        clearButton.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #c82929; -fx-text-fill: white; -fx-font-size: 15px; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        clearButton.setOnAction(action -> {
            angleTextField.clear();
            resultLabel.setText("");
        });

        // HBox untuk menyatukan tombol calculateButton dan clearButton
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(calculateButton, clearButton);
        buttonBox.setAlignment(Pos.CENTER); // Menyatukan tombol di tengah secara horizontal

        // Tombol untuk kembali ke MenuScene
        Button backButton = new Button("Back");
        backButton.setOnMouseEntered(event -> backButton.setCursor(Cursor.HAND));
        backButton.setEffect(null);
        backButton.setOnMouseEntered(event -> {
            backButton.setCursor(Cursor.HAND);
            backButton.setEffect(dropShadow);
        });
        backButton.setOnMouseExited(event -> {
            backButton.setEffect(null);
        });
        backButton.setStyle(
                "-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bold; -fx-background-color: #dba703; -fx-text-fill: white; -fx-font-size: 15; -fx-padding: 5px 20px; -fx-background-radius: 50; -fx-border-radius: 50;");
        backButton.setOnAction(action -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.display();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(titleLabel, angleLabel, angleTextField, buttonBox, resultLabel, backButton);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #292d31; -fx-padding: 20px;");

        Scene scene = new Scene(root, 350, 600);
        stage.setScene(scene);
    }
}
