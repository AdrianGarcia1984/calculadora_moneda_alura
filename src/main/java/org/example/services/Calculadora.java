package org.example.services;

import org.example.entities.Moneda;

public class Calculadora {
    Consulta consulta = new Consulta();
    Moneda moneda = new Moneda();
    public void Calcular(String moneda1, String moneda2, double monto){

        moneda = consulta.ConsultaMoneda(moneda1,moneda2);
        System.out.println("el valor de la conversion entre "+moneda.getBase_code()+" y "+ moneda.getTarget_code() +
                " es: "+moneda.getConversion_rate()*monto);

        System.out.println("**********************************");
        System.out.println("");

    }
}
