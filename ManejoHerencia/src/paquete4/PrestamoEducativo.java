/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPago;

    public PrestamoEducativo(Persona b, int t, String c, String n, InstitucionEducativa centro, double vA) {
        super(b, t, c.toUpperCase());
        nivelEstudio = n;
        centroEducativo = centro;
        valorCarrera = vA;
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerCentroEducativo(InstitucionEducativa n) {
        centroEducativo = n;
    }

    public void establecerValorCarrera(double n) {
        valorCarrera = n;
    }

    public void establecerValorMensualPago() {
        valorMensualPago = (valorCarrera / tiempoMeses) - 0.1 * (valorCarrera / tiempoMeses);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualPago() {
        return valorMensualPago;
    }

    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toUpperCase();
    }

    @Override
    public String toString() {
        return String.format("%sNivel de estudio: %s\n"
                + "Centro Educativo:\n%s"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago: %.2f\n\n",
                super.toString(),
                nivelEstudio,
                centroEducativo,
                valorCarrera,
                valorMensualPago);
    }
}
