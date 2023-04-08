public class Person2 {
    public static void main(String[] args) {
        
        Person p1 = new Person("Minhajul Yusri Khairi", 18, true);
        String nama = p1.getName();
        System.out.println(nama);
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());

        System.out.println("Nama: "+ p1.getName() +"\nUmur: "+ p1.getAge() + "\nGender: "+ p1.getGender());
    }
}
