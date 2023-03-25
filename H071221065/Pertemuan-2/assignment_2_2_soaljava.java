public class assignment_2_2_soaljava {
    private String name;
    private int age;
    private boolean isMale;

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return this.isMale ? "Male" : "Female";
    }

    public static void main(String[] args) {
        assignment_2_2_soaljava person = new assignment_2_2_soaljava();
        System.out.println(person.name);
        person.setName("IZZATA");
        person.setAge(18);
        person.setGender(false);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
