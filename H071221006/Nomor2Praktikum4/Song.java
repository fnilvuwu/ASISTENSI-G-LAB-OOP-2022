package Praktikum4;

public class Song {
    private String title, artist, album, genre;
    private int year;

    // public Song(String title, String artist, String album, String genre, int year) {
    //     this.title = title;
    //     this.artist = artist;
    //     this.album = album;
    //     this.genre = genre;
    //     this.year = year;
    // }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(getTitle());
        System.out.println(getArtist());
        System.out.println(getAlbum());
        System.out.println(getGenre());
        System.out.println(getYear());
    }

}
