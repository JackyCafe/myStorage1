package tw.com.ian.mystorage1;

import java.io.Serializable;

public abstract class User implements Serializable {
    String user;
    String pwd;

    public User(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
