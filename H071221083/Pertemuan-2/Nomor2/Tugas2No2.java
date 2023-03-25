public class Tugas2No2 {
    public static void main(String[] args) {
        PersonApp person = new PersonApp();
        
        person.setName("Nabil");
        person.setAge(19);
        person.setGender(true);
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
