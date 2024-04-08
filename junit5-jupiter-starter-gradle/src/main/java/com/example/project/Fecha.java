package com.example.project;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    
    public Fecha(int dia, int mes, int anio) {
    	
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
    }

    
    public boolean esFechaValida() {
    	
    	if (dia < 1 || dia > 31 || mes < 1 || mes > 12)
            return false;

        int diasMes = obtenerDiasDelMes();
        
        return dia <= diasMes;
    }

    
    private int obtenerDiasDelMes() {
    	
        switch (mes) {
        
            case 4, 6, 9, 11:
                return 30;
            
            case 2:
                return esAnioBisiesto() ? 29 : 28;
                
            default:
                return 31;
        }
    }

    private boolean esAnioBisiesto() {
    	
        return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
        
    }
}
