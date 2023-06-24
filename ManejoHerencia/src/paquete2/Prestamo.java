/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona benificiario;
    protected int tiempoMeses;
    protected String ciudad;

    public Prestamo(Persona b, int t, String c) {
        benificiario = b;
        tiempoMeses = t;
        ciudad = c;
    }

    public void establecerBenificiario(Persona n) {
        benificiario = n;
    }

    public void establecerTiempoMeses(int n) {
        tiempoMeses = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public Persona obtenerBenificiario() {
        return benificiario;
    }

    public int obtenerTiempoMeses() {
        return tiempoMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {

        return String.format("Benificiario:\n%s"
                + "Tiempo del préstamo (meses): %d\n"
                + "Ciudad del préstamo: %s\n",
                benificiario,
                tiempoMeses,
                ciudad);

    }

}
