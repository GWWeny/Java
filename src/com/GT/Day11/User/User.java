package com.GT.Day11.User;

public class User {
    private String id;
    private String name;
    private String passage;

    public User() {
    }

    public User(String id, String name, String passage) {
        this.id = id;
        this.name = name;
        this.passage = passage;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return passage
     */
    public String getPassage() {
        return passage;
    }

    /**
     * 设置
     * @param passage
     */
    public void setPassage(String passage) {
        this.passage = passage;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", passage = " + passage + "}";
    }
}
