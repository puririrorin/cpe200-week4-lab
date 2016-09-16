package cpe200;


public class User {
    protected String userName;
    protected String password;

    public User() {

    }

    public boolean setUserName(String name) {
        if (name.matches("^[a-zA-Z][a-zA-Z0-9]{7,}$")) {
            userName = name;
            return true;
        }
        else
            return false;
    }

    public boolean setPassword(String name) {

        if (name.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[a-zA-Z0-9]{12,}$")) {
            password = name;
            return true;
        }
        else
            return false;
    }


    public String getUserName() {

        return userName;


    }

    public String getPassword() {

        return password;
    }
}
