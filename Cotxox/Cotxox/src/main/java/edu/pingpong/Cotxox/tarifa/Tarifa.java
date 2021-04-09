package edu.pingpong.Cotxox.tarifa;

import edu.pingpong.Cotxox.carrera.Carrera;

public class Tarifa {
    static  final double COSTE_MILLA = 1.35;
    static  final double COSTE_MINUTO = 0.35;
    static  final double COSTE_MINIMO = 5;
    static  final byte PORCENTAJE_COMISION = 20;

    Tarifa(){}

    static double  getCosteDistancia(double distancia){
        return distancia * COSTE_MILLA;
    }

    static double getCosteTiempo(int minutos){
        return minutos * COSTE_MINUTO;
         
    }
    static double getCosteTotalEsperado(Carrera carrera){
        double costeRecorrido = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        double comision = (costeRecorrido * PORCENTAJE_COMISION) /100;
        double total = costeRecorrido + comision;

        if(total < COSTE_MINIMO){
            return COSTE_MINIMO;
        }else{
            return total;
        }
        
    }


}


