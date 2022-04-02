package user;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User implements Validator {

    private Integer userId;
    private String userName;
    private String userSurname;
    private String userMail;
    private String userPassword;
    private Integer userNumber;
    private String userResidence;
    private String userAddress;


    public User() {
    }

    public User(Integer userId, String userName, String userSurname, String userMail, String userPassword, Integer userNumber, String userResidence, String userAddress) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userMail = userMail;
        this.userPassword = userPassword;
        this.userNumber = userNumber;
        this.userResidence = userResidence;
        this.userAddress = userAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        if (isValid(userMail)) this.userMail = userMail;
        else {
            System.err.println("Not valid");
        }
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserResidence() {
        return userResidence;
    }

    public void setUserResidence(String userResidence) {
        this.userResidence = userResidence;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "User:" +
                "userId=" + this.userId +
                ", userName='" + this.userName + '\'' +
                ", userSurname='" + this.userSurname + '\'' +
                ", userMail='" + this.userMail + '\'' +
                ", userPassword='" + this.userPassword + '\'' +
                ", userNumber=" + this.userNumber +
                ", userResidence='" + this.userResidence + '\'' +
                ", userAddress='" + this.userAddress + '\'';
    }

}



