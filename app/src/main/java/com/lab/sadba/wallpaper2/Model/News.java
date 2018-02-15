package com.lab.sadba.wallpaper2.Model;

import java.util.List;

/**
 * Created by sadba on 15-Feb-18.
 */

public class News {

    private String code;
    private String message;
    private List<Accueil> accueils;

    public News() {
    }

    public News(String code, String message, List<Accueil> accueils) {
        this.code = code;
        this.message = message;
        this.accueils = accueils;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Accueil> getAccueils() {
        return accueils;
    }

    public void setAccueils(List<Accueil> accueils) {
        this.accueils = accueils;
    }
}
