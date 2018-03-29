package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int amountPublicPost;

    public ForumUser(final int userId, final String userName, final char sex, final LocalDate birthdayDate, final int amountPublicPost) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.amountPublicPost = amountPublicPost;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getAmountPublicPost() {
        return amountPublicPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", amountPublicPost=" + amountPublicPost +
                '}';
    }
}
