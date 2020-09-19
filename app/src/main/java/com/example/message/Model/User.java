package com.example.message.Model;

public class User {
    private String id,username,imageUrl,Status,search,password;

    public User(String id, String username, String imageURL,String Status,String search,String password) {
        this.id = id;
        this.username = username;
        this.imageUrl = imageURL;
        this.Status=Status;
        this.search=search;
        this.password=password;
    }
    public User(){}


    public String getStatus() {
        return Status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageUrl;
    }

    public void setImageURL(String imageURL) {
        this.imageUrl = imageURL;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
