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

}
