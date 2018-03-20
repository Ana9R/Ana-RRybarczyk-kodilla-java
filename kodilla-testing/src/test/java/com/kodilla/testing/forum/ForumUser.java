package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList <ForumPost> posts = new ArrayList <ForumPost>();
    private LinkedList <ForumComment> coments = new LinkedList <ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        //nic
    }
    public void addComment(ForumPost thePost, String author, String commentBody){
        //nic
    }
    public int getPostsQuantity(){
        // nic
        return 100;
    }
    public int getCommentsQuantity(){
        // nic
        return 100;
    }
    public ForumPost getPost(int postNumber){
        //nic
        return null;
    }
    public ForumComment getComment(int commentNumber){
        //nic
        return null;
    }
    public boolean removePost(ForumPost thePost){
        //nic
        return true;
    }
    public boolean removeComment(ForumComment theComment){
        //nic
        return true;
    }
    public String getRealName() {
        return realName;
    }

    public String getName() {
        return name;

    }
}
