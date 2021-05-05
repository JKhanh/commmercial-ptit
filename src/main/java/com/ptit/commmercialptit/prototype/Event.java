package com.ptit.commmercialptit.prototype;

import java.util.Date;

public class Event implements Cloneable{
    private String name;
    private Date startDate;
    private Date endDate;
    private Date publishDate;
    private String content;

    public Event(String name, Date startDate, Date endDate, Date publishDate, String content) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.publishDate = publishDate;
        this.content = content;
    }

    @Override
    protected Event clone(){
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
