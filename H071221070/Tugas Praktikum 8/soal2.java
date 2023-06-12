import java.util.ArrayList;
import java.util.Random;

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wordsTyped = "";
        this.wpm = wpm;
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordToType().split(" ");
        double howLongToType = (double) (60000.0 / wpm);

        // Perulangan untuk menambahkan kata dengan method addWordToTyped
        for (String word : wordsToType) {
            addWordTyped(word);
            try {
                Thread.sleep((long) howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordTyped("(Selesai)");

        // Menambahkan typer yang telah selesai mengetik semua kata ke list
        typeRacer.addResult(this);
    }
}

class Result {
    private String name;
    private double finishTIme;

    public Result(String name, double finishTIme) {
        this.name = name;
        this.finishTIme = finishTIme;
    }

    public String getName() {
        return name;
    }

    public void setName(String racerName) {
        this.name = racerName;
    }

    public double getFinishTIme() {
        return finishTIme;
    }

    public void setFinishTIme(double racerTime) {
        this.finishTIme = racerTime;
    }

}

class TypeRacer {
    private String WordToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordToType() {
        return WordToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    // List kalimat
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

    public void setNewWordxToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        WordToType = wordsToTypeList[angkaRandom];
    }

    public void addResult(Typer typer) {
        double finishTime = (System.currentTimeMillis() - startTime) / 1000.0;
        Result result = new Result(typer.getBotName(), finishTime);
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // Klasemen
        for (int i = 0; i < raceStanding.size(); i++) {
            Result result = raceStanding.get(i);
            System.out.println((i + 1) + ". " + result.getName() + " = " + result.getFinishTIme() + " detik");
        }
    }

    private long startTime;

    public void startRace() {
        // Menjalankan kompetisi
        startTime = System.currentTimeMillis();
        // Typing progress
        boolean allFinished = false;
        while (!allFinished) {
            allFinished = true;
            System.out.println("Typing progress . . .");
            System.out.println("===============================");

            for (Typer typer : raceContestant) {
                String botName = typer.getBotName();
                String wordsTyped = typer.getWordsTyped();
                System.out.println("- " + botName + " => " + wordsTyped);

                if (!wordsTyped.contains("(Selesai)")) {
                    allFinished = false;
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
        }

        // Menampilkan race standing setelah semua typer selesai
        printRaceStanding();
    }
}

public class soal2 {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordxToType();
        System.out.println("|| Text to type ||");
        System.out.println("\"" + typeRacer.getWordToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot ToKu", 72, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70, typeRacer);

        for (Typer typer : typers) {
            typeRacer.getRaceContestant().add(typer);
            typer.start();
        }

        typeRacer.startRace();
    }
}

