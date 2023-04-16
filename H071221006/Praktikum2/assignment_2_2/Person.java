public class Person {
    public String name;
    public int age;
    public boolean isMale;

    public Person(String a, int b, boolean c) {
        this.name = a;
        this.age = b;
        this.isMale = c;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        String gender = "Perempuan"; 
        if (isMale == true) {
            gender = "Laki-laki";
            return gender;
        }

        return gender;
    }
}
