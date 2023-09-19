package com.example.fullstack.Dto;

import java.util.Date;

public class UserDto {

    private int userid;
    private String username;
    private String apellido;
    private String password;
    private String country;
    private String city;
    private String Direccion;
    private String Tipo_de_cuenta;
    private String card_number;
    private Date expired;
    private int cvv;

    public UserDto(int userid, String username, String apellido, String password, String country, String city,
                   String direccion, String tipo_de_cuenta, String card_number, Date expired, int cvv) {
        this.userid = userid;
        this.username = username;
        this.apellido = apellido;
        this.password = password;
        this.country = country;
        this.city = city;
        Direccion = direccion;
        Tipo_de_cuenta = tipo_de_cuenta;
        this.card_number = card_number;
        this.expired = expired;
        this.cvv = cvv;
    }

    public UserDto() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTipo_de_cuenta() {
        return Tipo_de_cuenta;
    }

    public void setTipo_de_cuenta(String tipo_de_cuenta) {
        Tipo_de_cuenta = tipo_de_cuenta;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "UserDto [userid=" + userid + ", username=" + username + ", apellido=" + apellido + ", password="
                + password + ", country=" + country + ", city=" + city + ", Direccion=" + Direccion
                + ", Tipo_de_cuenta=" + Tipo_de_cuenta + ", card_number=" + card_number + ", expired=" + expired
                + ", cvv=" + cvv + "]";
    }
}
