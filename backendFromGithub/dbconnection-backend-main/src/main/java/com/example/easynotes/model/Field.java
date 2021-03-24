package com.example.easynotes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "field")
public class Field {

    private int fieldid;
    private int templateinstanceid;
    private int order;
    private String type;
    private String label;
    private boolean editable;
    private String defaultvalue;


    public Field() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Field(int fieldid, int templateinstanceid, int order, String type, String label, boolean editable, String defaultvalue) {
        this.fieldid = fieldid;
        this.templateinstanceid = templateinstanceid;
        this.order = order;
        this.type = type;
        this.label = label;
        this.editable = editable;
        this.defaultvalue = defaultvalue;
    }

    @Id
    public int getFieldid() {
        return fieldid;
    }

    public void setFieldid(int fieldid) {
        this.fieldid = fieldid;
    }

    public int getTemplateinstanceid() {
        return templateinstanceid;
    }

    public void setTemplateinstanceid(int templateinstanceid) {
        this.templateinstanceid = templateinstanceid;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue;
    }
}
