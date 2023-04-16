package Praktikum4.assignment_4_1.utils;

public class StringUtils {
    // method ini memeriksa apakah fullName hanya terdiri dari satu kata atau lebih
    public static String getNickName(String fullName) {
        // membagi fullName menjadi array string name menggunakan split yang memecah string menjadi spasi
        String[] name = fullName.split(" ");
        if (name.length > 1) {
            return name[1];
        // jika name hanya terdiri dari satu kata, maka akan mengembalikan fullname sebagai nickname
        } else {
            return name[0];
        }
        // jika name terdiri dari lebih satu kata, maka akan mengembalikan elemen terakhir sebagai nickname
    }


}

