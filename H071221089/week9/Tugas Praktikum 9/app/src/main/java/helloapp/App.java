package helloapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage mainStage) {

        stage = mainStage;

        stage.setTitle("Kalkulator Ajaib");
        stage.setScene(getScene1());
        stage.setResizable(false);
        stage.show();
    }

    // Scene 1
    private Scene getScene1() {
        ImageView ivBanner = new ImageView("/images/calculator.jpg");
        ivBanner.setFitHeight(170);
        ivBanner.setFitWidth(170);
        ivBanner.setPreserveRatio(true);

        Text tTitle = new Text("Kalkulator Ajaib");

        Button btnPilih = new Button("Mulai");
        btnPilih.setId("button-pilih");

        VBox sectionRight = new VBox(ivBanner, tTitle, btnPilih);
        sectionRight.setSpacing(30);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");

        btnPilih.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // rootNode
        HBox rootNode = new HBox(sectionRight);

        Scene scene = new Scene(rootNode, 400, 700);

        // Style
        scene.getStylesheets()
                .add(getClass()
                        .getResource("/styles/style.css")
                        .toExternalForm());

        return scene;
    }

    // Scene 2
    private Scene getScene2() {
        Text tTitle = new Text("Seberapa cocoknya kalian?");
        Button btn1 = new Button("Name is destiny");
        btn1.getStyleClass().add("section-menu");
        Button btn2 = new Button("The birth of love");
        btn2.getStyleClass().add("section-menu");
        Text tDescription = new Text("capek jomblo?cek kecocokan anda bersama mantan anda disini");
        tDescription.setId("info-description");
        tDescription.setUnderline(true);

        VBox sectionRight = new VBox(tTitle, btn1, btn2, tDescription);
        sectionRight.setSpacing(8);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");

        btn1.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        btn2.setOnAction(v -> {
            stage.setScene(getScene4());
        });

        // rootNode
        HBox rootNode = new HBox(sectionRight);

        Scene scene = new Scene(rootNode, 400, 700);

        // Style
        scene.getStylesheets()
                .add(getClass()
                        .getResource("/styles/style.css")
                        .toExternalForm());

        return scene;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Scene getScene3() {
        Text tTitle = new Text("Name is destiny");

        TextField Namamu = new TextField();
        Label lnamamu = new Label("Masukkan Nama anda");
        lnamamu.setId("Namamu");
        Label lgebetan = new Label("Masukkan Nama gebetanmu");
        TextField gebetan = new TextField();
        lgebetan.setId("gebetanmu");
        Text tHasil = new Text("Kecocokan kalian");
        Label lHasil = new Label("-");
        lHasil.setId("hasil-Kecocokan");

        Button btnClear = new Button("Clear");
        btnClear.setId("button-clear");
        Button btnKonv = new Button("Calculate");
        btnKonv.setId("button-konv");
        Button btnBack = new Button("Back to Home");
        btnBack.setId("button-back");

        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(btnClear, btnKonv);
        buttonBox.setSpacing(8);
        buttonBox.setAlignment(Pos.CENTER);

        VBox hasil = new VBox();
        hasil.getChildren().addAll(tHasil, lHasil);
        hasil.setSpacing(10);
        hasil.setAlignment(Pos.CENTER);

        VBox vButton = new VBox();
        vButton.getChildren().addAll(buttonBox, btnBack);
        vButton.setSpacing(8);
        vButton.setAlignment(Pos.CENTER);
        vButton.setPrefWidth(400);

        VBox sectionRight = new VBox(tTitle, lnamamu, Namamu, lgebetan, gebetan, hasil, vButton);
        sectionRight.setSpacing(8);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");

        btnKonv.setOnAction(v -> {
            try {
                String yourName = Namamu.getText();
                String crushName = gebetan.getText();

                // Menghitung jumlah karakter dalam nama
                int yourNameLength = yourName.replaceAll("\\s+", "").length();
                int crushNameLength = crushName.replaceAll("\\s+", "").length();

                // Menghitung jumlah huruf yang sama dalam nama
                int commonLetters = 0;
                for (char c : yourName.toCharArray()) {
                    if (crushName.toLowerCase().contains(String.valueOf(c).toLowerCase())) {
                        commonLetters++;
                    }
                }

                // Menghitung persentase cinta
                double lovePercentage = ((double) commonLetters / (yourNameLength + crushNameLength)) * 100;

                // Menampilkan hasil persentase cinta
                lHasil.setText(String.format("%.2f", lovePercentage) + "%");
            } catch (Exception e) {
                // Tangani kesalahan yang terjadi
                e.printStackTrace();
                // Atau tampilkan pesan kesalahan yang lebih spesifik
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        });

        btnClear.setOnAction(v -> {
            Namamu.clear();
            gebetan.clear();
            lHasil.setText("-");
        });

        btnBack.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // rootNode
        HBox rootNode = new HBox(sectionRight);

        Scene scene = new Scene(rootNode, 400, 700);

        // Style
        scene.getStylesheets()
                .add(getClass()
                        .getResource("/styles/style.css")
                        .toExternalForm());

        return scene;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Scene getScene4() {
        Text tTitle = new Text("The birth of love");

        TextField tanggalmu = new TextField();
        Label lnamamu = new Label("Masukkan tanggal lahir anda");
        lnamamu.setId("Namamu");
        Label lgebetan = new Label("Masukkan tanggal lahir gebetanmu");
        TextField tanggalgebetan = new TextField();
        lgebetan.setId("gebetanmu");
        Text tHasil = new Text("Kecocokan kalian");
        Label lHasil = new Label("-");
        lHasil.setId("hasil-Kecocokan");
        lHasil.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");

        Button btnClear = new Button("Clear");
        btnClear.setId("button-clear");
        Button btnKonv = new Button("Calculate");
        btnKonv.setId("button-konv");
        Button btnBack = new Button("Back to Home");
        btnBack.setId("button-back");

        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(btnClear, btnKonv);
        buttonBox.setSpacing(8);
        buttonBox.setAlignment(Pos.CENTER);

        VBox hasil = new VBox();
        hasil.getChildren().addAll(tHasil, lHasil);
        hasil.setSpacing(10);
        hasil.setAlignment(Pos.CENTER);

        VBox vButton = new VBox();
        vButton.getChildren().addAll(buttonBox, btnBack);
        vButton.setSpacing(8);
        vButton.setAlignment(Pos.CENTER);
        vButton.setPrefWidth(400);

        VBox sectionRight = new VBox(tTitle, lnamamu, tanggalmu, lgebetan, tanggalgebetan, hasil, vButton);
        sectionRight.setSpacing(8);
        sectionRight.setAlignment(Pos.CENTER);
        sectionRight.setPrefWidth(400);
        sectionRight.setId("section-right");

        btnKonv.setOnAction(event -> {
            String tanggalLahirAnda = tanggalmu.getText();
            String tanggalLahirGebetan = tanggalgebetan.getText();

            int persentaseCinta = hitungPersentaseCinta(tanggalLahirAnda, tanggalLahirGebetan);

            lHasil.setText(persentaseCinta + "%");
        });

        btnClear.setOnAction(v -> {
            tanggalmu.clear();
            tanggalgebetan.clear();
            lHasil.setText("-");
        });

        btnBack.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // rootNode
        HBox rootNode = new HBox(sectionRight);

        Scene scene = new Scene(rootNode, 400, 700);

        // Style
        scene.getStylesheets()
                .add(getClass()
                        .getResource("/styles/style.css")
                        .toExternalForm());

        return scene;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private int hitungPersentaseCinta(String tanggalLahirAnda, String tanggalLahirGebetan) {
        int persentaseCinta = 0;

        try {
            // Mengubah tanggal lahir menjadi angka
            int angkaLahirAnda = ubahKeAngka(tanggalLahirAnda);
            int angkaLahirGebetan = ubahKeAngka(tanggalLahirGebetan);

            // Melakukan perhitungan persentase cinta
            if (angkaLahirAnda > 0 && angkaLahirGebetan > 0) {
                int perbedaan = Math.abs(angkaLahirAnda - angkaLahirGebetan);
                int persentase = 100 - (perbedaan % 101);
                persentaseCinta = persentase >= 0 ? persentase : 0;
            } else {
                throw new IllegalArgumentException("Format tanggal lahir tidak valid");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Atau tampilkan pesan kesalahan yang lebih spesifik
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        return persentaseCinta;
    }

    // Metode untuk mengubah tanggal lahir menjadi angka
    private int ubahKeAngka(String tanggalLahir) {
        int angkaLahir = 0;
        try {
            // Mengambil hari, bulan, dan tahun dari tanggal lahir
            String[] tanggal = tanggalLahir.split("-");
            if (tanggal.length != 3) {
                throw new IllegalArgumentException("Format tanggal lahir tidak valid");
            }
            int hari = Integer.parseInt(tanggal[0]);
            int bulan = Integer.parseInt(tanggal[1]);
            int tahun = Integer.parseInt(tanggal[2]);

            // Melakukan operasi matematika pada hari, bulan, dan tahun
            angkaLahir = (tahun * bulan * hari) % 10000;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            // Atau tampilkan pesan kesalahan yang lebih spesifik
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        return angkaLahir;
    }

    public static void main(String[] args) {
        launch();
    }
}