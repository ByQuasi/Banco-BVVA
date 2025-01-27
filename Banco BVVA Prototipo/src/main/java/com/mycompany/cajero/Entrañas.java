package com.mycompany.cajero;

import java.util.Random;

public class Entrañas {

    private String nombre;
    private String contraseña;
    private int numeroc;
    private double saldo;

    public Entrañas() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo + this.saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getContraseña(){
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public int getNumero(){
        return numeroc;
        }
    
    public void setNumero() {
        int a;
        Random k = new Random();
        a = k.nextInt(100);
        this.numeroc = a;
    }

    void setNumero(int parseInt) {
        this.numeroc = parseInt;
    }
}