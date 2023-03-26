//Melengkapi yang disuruhkan soal

class no2person {
    public static void no(String[] args) {

    }

    String name;
    int age;
    boolean isMale;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    String getGender() {
        if (isMale) {
            return "Male";
        } else {
            return "Female";
        }
        
    }

    public static void main(String[] args) {
        // Membuat objek Person baru
        no2person person1 = new no2person();

        // Mengatur nilai atribut nama, umur, dan jenis kelamin
        person1.setName(" Al Qadri");
        person1.setAge(19);
        person1.setGender(true);

        // Menampilkan informasi Person
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
    }

}

// Program di atas merupakan contoh program Java yang mendefinisikan sebuah
// kelas no2person. Kelas ini memiliki tiga atribut yaitu name untuk menyimpan
// nama, age untuk menyimpan umur, dan isMale untuk menyimpan jenis kelamin
// (dalam bentuk boolean). Kelas no2person juga memiliki tiga metode yaitu
// setName(), setAge(), dan setGender() untuk mengatur nilai dari atribut, serta
// getName(), getAge(), dan getGender() untuk mendapatkan nilai dari atribut.

// Pada bagian main(), program membuat sebuah objek no2person baru dengan
// menggunakan sintaks new no2person(). Selanjutnya, program mengatur nilai
// atribut dari objek tersebut menggunakan metode setName(), setAge(), dan
// setGender(). Terakhir, program mencetak informasi mengenai objek no2person
// tersebut dengan menggunakan metode getName(), getAge(), dan getGender().

// Behaviornya adalah program akan mencetak informasi mengenai objek no2person
// yang telah dibuat, yaitu nama, umur, dan jenis kelamin.
