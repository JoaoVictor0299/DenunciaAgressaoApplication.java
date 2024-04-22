package br.com.LadyPower.Entities;

import java.time.LocalDate;

public class Delation {

    private Integer id;
    private String delation;
    private LocalDate assaultDate;
    private Boolean flagShare;
    private Abuser abuser;


    public Delation(Integer id, String delation, LocalDate assaultDate, Boolean flagShare, Abuser abuser) {
        this.id = id;
        this.delation = delation;
        this.assaultDate = assaultDate;
        this.flagShare = flagShare;
        this.abuser = abuser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDelation() {
        return delation;
    }

    public void setDelation(String delation) {
        this.delation = delation;
    }

    public LocalDate getAssaultDate() {
        return assaultDate;
    }

    public void setAssaultDate(LocalDate assaultDate) {
        this.assaultDate = assaultDate;
    }

    public Boolean getFlagShare() {
        return flagShare;
    }

    public void setFlagShare(Boolean flagShare) {
        this.flagShare = flagShare;
    }

    public Abuser getAbuser() {
        return abuser;
    }

    public void setAbuser(Abuser abuser) {
        this.abuser = abuser;
    }
}
