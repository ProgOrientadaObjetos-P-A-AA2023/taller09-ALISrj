/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marcaAuto;
    private Persona garante;
    private double valorAuto;
    private double valorMensualPago;

    public PrestamoAutomovil(Persona b, int t, String c, String tipo, String m, Persona g, double vA) {
        super(b, t, c.toLowerCase());
        tipoAuto = tipo;
        marcaAuto = m;
        garante = g;
        valorAuto = vA;
    }

    public void establecerTipoAuto(String n) {
        tipoAuto = n;
    }

    public void establecerMarcaAuto(String n) {
        marcaAuto = n;
    }

    public void establecerGarante(Persona n) {
        garante = n;
    }

    public void establecerValorAuto(double n) {
        valorAuto = n;
    }

    public void establecerValorMensualPago() {
        valorMensualPago = valorAuto / tiempoMeses;
    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public String obtenerMarcaAuto() {
        return marcaAuto;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerValorMensualPago() {
        return valorMensualPago;
    }

    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("%sTipo de auto: %s\n"
                + "Marca del auto: %s\n"
                + "Garante:\n%s"
                + "Valor del auto: %.2f\n"
                + "Valor mensual de pago: %.2f\n\n",
                super.toString(),
                tipoAuto,
                marcaAuto,
                garante,
                valorAuto,
                valorMensualPago);
    }

}
