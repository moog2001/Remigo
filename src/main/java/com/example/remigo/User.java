package com.example.remigo;

public class User extends Person {
    protected String userName;
    protected String eMail;
    protected String password;
    protected int userId;
    private boolean isGuest;

    public User(){
    }

    public User(String userName, String eMail, String password, int userId, boolean isGuest) {
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.userId = userId;
        this.isGuest = isGuest;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }
}
