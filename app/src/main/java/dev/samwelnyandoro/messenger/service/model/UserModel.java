package dev.samwelnyandoro.messenger.service.model;

public class UserModel
{
    private static String username;
    private static String password;
    private static String name;
    private static String photo;

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserModel.password = password;
    }

    private static String on_off_status;
    private static String last_seen;
    private static String status;

    public static String getOn_off_status() {
        return on_off_status;
    }

    public static void setOn_off_status(String on_off_status) {
        UserModel.on_off_status = on_off_status;
    }

    public static String getLast_seen() {
        return last_seen;
    }

    public static void setLast_seen(String last_seen) {
        UserModel.last_seen = last_seen;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        UserModel.status = status;
    }

    public static String getName()
    {
        return name;
    }

    public static void setName(String name)
    {
        UserModel.name = name;
    }

    public static String getPhoto()
    {
        return photo;
    }

    public static void setPhoto(String photo)
    {
        UserModel.photo = photo;
    }

    public UserModel()
    {

    }

    public static String getUsername()
    {
        return username;
    }

    public static void setUsername(String username)
    {
        UserModel.username = username;
    }
}