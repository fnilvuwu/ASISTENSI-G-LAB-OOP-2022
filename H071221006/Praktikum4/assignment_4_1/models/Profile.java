package Praktikum4.assignment_4_1.models;

public class Profile {
        
      private String fullname;
      private String nickName;
      private int age;
      private String hobby;

      public Profile(String fullname, String nickName, int age, String hobby) {
            this.fullname = fullname;
            this.nickName = nickName;
            this.age = age;
            this.hobby = hobby;
      }

      public String getFullname() {
            return fullname;
      }
      public void setFullname(String fullname) {
            this.fullname = fullname;
      }
      public String getNickName() {
            return nickName;
      }
      public void setNickName(String nickName) {
            this.nickName = nickName;
      }
      public int getAge() {
            return age;
      }
      public void setAge(int age) {
            this.age = age;
      }
      public String getHobby() {
            return hobby;
      }
      public void setHobby(String hobby) {
            this.hobby = hobby;
      }

}
