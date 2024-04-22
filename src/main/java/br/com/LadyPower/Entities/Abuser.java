package br.com.LadyPower.Entities;

import java.time.LocalDate;

public class Abuser {

    private Integer id;
    private String name;
    private LocalDate bornDate;
    private String connection;
    private String zipCode;
    private String road;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;

    public Abuser(Integer id, String name, LocalDate bornDate, String connection, String zipCode, String road, String complement, String neighborhood, String city, String state) {
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
        this.connection = connection;
        this.zipCode = zipCode;
        this.road = road;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
