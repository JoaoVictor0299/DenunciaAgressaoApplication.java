package br.com.LadyPower.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Testimony {

    @JsonIgnore
    private Integer id;
    private String testimony;

    public Testimony(Integer id, String testimony) {
        this.id = id;
        this.testimony = testimony;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestimony() {
        return testimony;
    }

    public void setTestimony(String testimony) {
        this.testimony = testimony;
    }
}
