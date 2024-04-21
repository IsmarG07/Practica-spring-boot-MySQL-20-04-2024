package com.example.modelo;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Student {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String nombre;
private String telefono;
private Date fechacumple;
private String departamento;

public String getNombre(){
	return nombre;
	
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public Date getFechacumple() {
	return fechacumple;
}

public void setFechacumple(Date fechacumple) {
	this.fechacumple = fechacumple;
}

public String getDepartamento() {
	return departamento;
}

public void setDepartamento(String departamento) {
	this.departamento = departamento;
}








}
