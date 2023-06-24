/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Alexito
 */
public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String n, String s) {
        nombre = n;
        siglas = s;
    }

    
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerSiglas(String n) {
        siglas = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    public String toString() {
        return String.format("\tNombre: %s\n"
                + "\tSiglas: %s\n", nombre, siglas);
    }

}
