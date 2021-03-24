package com.example.easynotes.model;

import javax.persistence.*;

@Entity
@Table(name = "template")
public class HtmlTemplate {

    private int templateid;
    private String name;
    private String html;


    public HtmlTemplate() {
        super();
        // TODO Auto-generated constructor stub
    }

    public HtmlTemplate(int templateid, String name, String html) {
        this.templateid = templateid;
        this.name = name;
        this.html = html;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTemplateid() {
        return templateid;
    }

    public void setTemplateid(int templateid) {
        this.templateid = templateid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}

