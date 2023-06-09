import java.util.ArrayList;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordsToTypeList = {
            "Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai",
    };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO 4
    public void addResult(Typer typer) {
        int timeResult = typer.getWordsTyped().split(" ").length * (int) (60000 / typer.getWpm());
        Result result = new Result(typer.getBotName(), timeResult);
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("==========================\n");
  
        for (int i = 0; i < raceStanding.size(); i++) {
            int finishTime = raceStanding.get(i).getFinishTime();
            double finishTimeInSeconds = (double) finishTime / 1000;
            System.out.println(
                    String.format("%d. %s = %.2f detik", i + 1, raceStanding.get(i).getName(), finishTimeInSeconds));
        }
    }

    public void startRace() {
        setNewWordsToType();
        System.out.println();

        for (Typer typer : raceContestant) {
            typer.start();
        }

        boolean isAllFinished = false;
        while (!isAllFinished) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // System.out.println(
            //         "\n#".repeat(30));
            System.out.println("\nTyping Progress ...");
            System.out.println("================\n");
            for (Typer typer : raceContestant) {
                System.out.println(String.format("- %s  => %s", typer.getBotName(), typer.getWordsTyped()));
                System.out.println(
                        "=".repeat(30));
            }

            if (raceContestant.size() == raceStanding.size()) {
                isAllFinished = true;
            }

        }

        printRaceStanding();
    }
}