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

public class AverageScene {
    private Stage stage;

    public AverageScene(Stage stage) {
        this.stage = stage;
    }

    public void display() {
        Label titleLabel = new Label("Perhitungan Rata-rata");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: white;");

        Label inputLabel = new Label("Masukkan angka (pisahkan dengan spasi):");
        inputLabel.setStyle("-fx-text-fill: white;");

        TextField inputTextField = new TextField();

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
            String inputText = inputTextField.getText();
            String[] numbers = inputText.split(" ");

            double sum = 0;
            int count = 0;

            for (String number : numbers) {
                try {
                    double value = Double.parseDouble(number);
                    sum += value;
                    count++;
                } catch (NumberFormatException e) {
                    // Skip if the input is not a valid number
                }
            }

            if (count > 0) {
                double average = sum / count;
                resultLabel.setText("Rata-rata: " + average);
            } else {
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
            inputTextField.clear();
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
        root.getChildren().addAll(titleLabel, inputLabel, inputTextField, buttonBox, resultLabel, backButton);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #292d31; -fx-padding: 20px;");

        Scene scene = new Scene(root, 350, 600);
        stage.setScene(scene);
    }
}
