package com.oopa.clases;

public class Taco {
    private String tipoDeTortilla;
    private String guisado;
    private int numeroDeTortilla;
    private String tamanioDeTortilla;
    private float precio;

    public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
        this.tipoDeTortilla = tipoDeTortilla;
        this.guisado = guisado;
        this.numeroDeTortilla = numeroDeTortilla;
        this.tamanioDeTortilla = tamanioDeTortilla;
        this.precio = precio;
    }

    public void preparar() {
        // Lógica para preparar el taco
    }

    public void vender() {
        // Lógica para vender el taco
    }

    public void ponerSalsa() {
        // Lógica para poner salsa en el taco
    }

    public void subirPrecio(float incremento) {
        this.precio += incremento;
    }

    @Override
    public String toString() {
        return "Orden de taco: " + tipoDeTortilla + " de " + guisado + " con " + numeroDeTortilla + " tortillas de tamaño " + tamanioDeTortilla + " a un precio de $" + precio;
    }

    // Métodos get y set
    public String getTipoDeTortilla() {
        return tipoDeTortilla;
    }

    public void setTipoDeTortilla(String tipoDeTortilla) {
        this.tipoDeTortilla = tipoDeTortilla;
    }

    public String getGuisado() {
        return guisado;
    }

    public void setGuisado(String guisado) {
        this.guisado = guisado;
    }

    public int getNumeroDeTortilla() {
        return numeroDeTortilla;
    }

    public void setNumeroDeTortilla(int numeroDeTortilla) {
        this.numeroDeTortilla = numeroDeTortilla;
    }

    public String getTamanioDeTortilla() {
        return tamanioDeTortilla;
    }

    public void setTamanioDeTortilla(String tamanioDeTortilla) {
        this.tamanioDeTortilla = tamanioDeTortilla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}