package org.academiadecodigo.bootcamp.model;

import java.util.Date;

public class Bootcamp {
    private int id;
    private String location;
    private String start;
    private String end;



    public Bootcamp(int id, String location, String start, String end){
        this.id = id;
        this.location = location;
        this.start = start;
        this.end = end;

    }

    public Bootcamp(){

    }


    public int getId() {
        return id;
    }



    public String getLocation() {
        return location;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }



}