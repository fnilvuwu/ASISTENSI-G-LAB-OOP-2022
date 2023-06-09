

public class User {
    private String username;
    private String password;
    private Profile profile;
 
    public User(){}

    public User(String username, String password, Profile profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    public User(String username, String password){ 
        this.username = username;
        this.password = password;
    }

    
    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Profile getProfile() {
        return profile;
    }
    
    
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserName(String username) {
        this.username = username;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}