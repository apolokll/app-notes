package com.apolokll.appnotes.model;

public class Notes{
    private String title;
    private String text;

    public Notes(String title, String text){
        this.title = title;
        this.text = text;
    }

    public String getTitle(){
        return title;
    }

    public String getText() {
        return text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
}
