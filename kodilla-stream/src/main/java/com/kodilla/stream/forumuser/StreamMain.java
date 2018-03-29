package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfForumUsers = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ForumUser.getBirthdayDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(ForumUser -> ForumUser.getAmountPublicPost() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        resultMapOfForumUsers.entrySet().stream()
                .forEach(System.out::println);

    }
}
