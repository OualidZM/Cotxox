package edu.pingpong.Cotxox.carrera;

import edu.pingpong.Cotxox.conductor.Conductor;
import edu.pingpong.Cotxox.conductor.PoolConductores;

public class Carrera {
    
    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;
    private double distancia = 0;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private int propina = 0;
    private Conductor conductor;
    


    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }
    
    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getCosteEsperado(){
        //
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }


    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setConductor(Conductor conductor){
        this.conductor = conductor;
    }
    
    public Conductor getConductor(){
        return this.conductor;
    }

    public void asignarConductor(PoolConductores conductores){
        //
    }

    public void realizarPago(double pago){

    }


    public double getCosteTotal() {
        return costeTotal;
    }

    public void recibirPropina(int propina){
        //
    }
    public int getPropina() {
        return propina;
    }

    public void liberarConductor(){
        //
    }
}
