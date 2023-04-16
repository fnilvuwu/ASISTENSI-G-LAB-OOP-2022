package Praktikum4.assignment_4_2;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("A Day That Feels Better");
        song1.setArtist("Pamungkas");
        song1.setAlbum("Birdy");
        song1.setGenre("Pop");
        song1.setYear(2022);

        song1.displayInfo();
        System.out.println("-".repeat(20));
        SelfUtils.displaySelfData();
    }
}
