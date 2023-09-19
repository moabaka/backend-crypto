package com.example.fullstack.Entity;


import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="user_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;

    @Column(name="Nombre", length = 255)
    private String username;

    @Column(name="Apellidos", length = 255)
    private String apellido;

    @Column(name="contrasena", length = 255)
    private String password;
    
    @Column(name="País", length = 255)
    private String country;
    
    @Column(name="Ciudad", length = 255)
    private String city;
    
    @Column(name="Direccion", length = 255)
    private String Direccion; 
    
    @Column(name="tipo", length = 255)
    private String Tipo_de_cuenta;
    
    @Column(name="Número de Tarjeta", length = 255)
    private String card_number;
    
    @Column(name="fecha de caducidad", length = 255)
    private Date expired;
    
    @Column(name="cvv", length = 255)
    private int cvv;
    
    
    

    public User() {
    }

    public User(int userid, String username, String password, String country, String city,String Direccion,String Tipo_de_cuenta, String card_number,Date expired,int cvv ) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.country = country;
        this.city = city;
        this.Direccion = Direccion;
        this.Tipo_de_cuenta = Tipo_de_cuenta;
        this.card_number = card_number;
        this.expired = expired;
        this.cvv = cvv;
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
		return "User [userid=" + userid + ", username=" + username + ", apellido=" + apellido + ", password=" + password
				+ ", country=" + country + ", city=" + city + ", Direccion=" + Direccion + ", Tipo_de_cuenta="
				+ Tipo_de_cuenta + ", card_number=" + card_number + ", expired=" + expired + ", cvv=" + cvv + "]";
	}
    
}

