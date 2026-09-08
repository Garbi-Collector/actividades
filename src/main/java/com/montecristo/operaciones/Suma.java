package com.montecristo.operaciones;

public class Suma extends OperacionAbstract {
    /*
        como nosotros le decimos a esta clase que tiene que 
        HEREDAR de OperacionAbstract, esta clase ya tiene todo
        lo que OperacionAbstract ya tenia
        es decir
        'a', 'b', 'resultado' y tambien todos sus metodos.
    */

    @Override 
    public void calcularResultado(){
        resultado = a+b;
    }
    
}
