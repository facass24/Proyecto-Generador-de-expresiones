/**
*
*@Generador de expresiones
 */
 class Nodo
 {
    private int elemento;
    private Nodo hijo_izquierdo;
    private Nodo hijo_derecho;

    public Nodo (int elem){
        elemento = elem;
        hijo_derecho = null;
        hijo_izquierdo = null;
    }
    public void setElemento(int ele){
        elemento = ele;
    }
    public void setHijoDerecho(Nodo derecho){
        hijo_derecho = derecho;
    }
    public void setHijoIzquierdo(Nodo izquierdo){
        hijo_izquierdo = izquierdo;
    }
    public int geteElemento(){
        return elemento;
    }
    public Nodo getHijoDerecho(){
        return hijo_derecho;
    }
    public Nodo getHijoIzquierdo(){
        return hijo_izquierdo;
    }

 }