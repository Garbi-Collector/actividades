package com.montecristo.operaciones;

/*
    esto es una clase abstracta y sirve para
*/
public abstract class OperacionAbstract {
    /*
        declaramos las variables que vamos a unsar
        lo mantendremos simple, teniendo solo 2 numeros
    */
    private int a;
    private int b;
    private int resultado;

    public OperacionAbstract(){}

    /*
        getters y setters
    */
   public int getA(){
    return a;
   }
   public int getB(){
    return b;
   }
   public int getResultado(){
    return resultado;
   }

   public void setA(int a){
    this.a=a;
   }
   public void setB(int b){
    this.b=b;
   }
    
    /*
        por ultimo dejaremos un metodo pero no le diremos que va a hacer
        este metodo servira para que las clases que hereden de OperacionAbstract
        puedan especificar que quieren hacer con este metodo
    */
   public void calcularResultado(){
    
   }
    
}
