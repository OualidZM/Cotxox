package edu.pingpong.Cotxox.conductor;

import java.util.ArrayList;

public class Conductor {

    private String nombre = null;
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones;

    public Conductor(){

    }

    public Conductor(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    public int getNumeroValoracion(){

    }


    public void setValoracion(byte valoracion){

    }

    private double calcularValoracionMedia(){

    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
