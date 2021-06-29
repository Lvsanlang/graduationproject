package com.student.graduationproject.util.email;

public class Mail {
    private String title;
    private String code;
    private String email;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    生成6位验证码的公共方法
    public String makecode() {

        String[] letters = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "a", "b", "d", "c", "e", "f", "g", "h", "i", "j",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
        String stringcode = "";
        for (int i = 0; i < 6; i++) {
            stringcode = stringcode + letters[(int) Math.floor(Math.random() * letters.length)];
        }
        return stringcode;
    }
}

