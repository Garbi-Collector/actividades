package com.montecristo.operaciones;

public abstract class OperacionAbstract {

    private int a;
    private int b;
    private int resultado;

    public OperacionAbstract() {
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void calcularResultado() {
    }
}