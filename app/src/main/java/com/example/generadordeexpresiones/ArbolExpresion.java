/**
*
*@Generador de expresiones
 */
class ArbolExpresion{
    private Nodo raiz;

    public ArbolExpresion(){
        raiz = null;
    }
    private Nodo insertar (Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
        } else if (valor < nodo.geteElemento()) {
            nodo.setHijoIzquierdo(insertar(nodo.getHijoIzquierdo(), valor));
        } else {
            nodo.setHijoDerecho(insertar(nodo.getHijoDerecho(), valor));
        }
        return nodo;
    }
    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    private int suma(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.geteElemento() + suma(nodo.getHijoIzquierdo()) + suma(nodo.getHijoDerecho());
    }
    public int suma() {
        return suma(raiz);
    }
    private int resta(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.geteElemento() - resta(nodo.getHijoIzquierdo()) - resta(nodo.getHijoDerecho());
    }
    
    public int resta() {
        return resta(raiz);
    }

    private int multiplicacion(Nodo nodo) {
        if (nodo == null) {
            return 1;
        }
        return nodo.geteElemento() * multiplicacion(nodo.getHijoIzquierdo()) * multiplicacion(nodo.getHijoDerecho());
    }
    
    public int multiplicacion() {
        return multiplicacion(raiz);
    }

    private int division(Nodo nodo) {
        if (nodo == null) {
            return 1;
        }
        if (nodo.getHijoIzquierdo() == null && nodo.getHijoDerecho() == null) {
            return nodo.geteElemento();
        }
        if (nodo.getHijoIzquierdo() != null && nodo.getHijoDerecho() != null) {
            return division(nodo.getHijoIzquierdo()) / division(nodo.getHijoDerecho());
        }
        if (nodo.getHijoIzquierdo() != null) {
            return division(nodo.getHijoIzquierdo());
        } else {
            return division(nodo.getHijoDerecho());
        }
    }
    
    public int division() {
        return division(raiz);
    }
    public int prioridad() {
        return prioridad(raiz);
    }
    
    private int prioridad(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        if (nodo.getHijoIzquierdo() == null && nodo.getHijoDerecho() == null) {
            return nodo.geteElemento();
        }
        int valorIzquierdo = prioridad(nodo.getHijoIzquierdo());
        int valorDerecho = prioridad(nodo.getHijoDerecho());
        switch (nodo.geteElemento()) {
            case '+':
                return valorIzquierdo + valorDerecho;
            case '-':
                return valorIzquierdo - valorDerecho;
            case '*':
                return valorIzquierdo * valorDerecho;
            case '/':
                return valorIzquierdo / valorDerecho;
            default:
                return 0;
        }
    }

}