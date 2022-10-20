package Stack;

public class Pila {
    
    private NodoT peek;
    private int size;

    public Pila() {
        peek = null;
        size = -1;
    }
     // Metodo para sacar todos los datos de la pila
    public void vaciar() {
        peek = null;
        size = -1;
    }
     // Metodo para definir que la pila esta vacia
    public boolean estaVacia() {
        return peek == null;
    }
    
     // Metodo para sacar datos de la pila
    public NodoT pop() {
        if (estaVacia()) {
            return null; 
        }
        NodoT temp = peek;

        if (size == 0) {
            vaciar();
            return temp;
        } else {
            temp.der = null;
            peek = temp.izq;
            peek.der = null; 
            size--;
            return temp;
        }
    }
    
     // Metodo para añadir datos a la pila
     public void push(NodoT nodoNuevo) {
        if( estaVacia() ) {
            peek = nodoNuevo;
       }else{
            nodoNuevo.izq = peek;
            peek.der = nodoNuevo;
            peek = peek.der;
        }
        size++;
    }
     
     // Metodo para obtener el peek de la pila
     public NodoT obtenerPeek() {
        if (estaVacia()) { 
            return new NodoT(null);
        }
        return peek;
    }
     
     // Metodo para obtener el tamaño de la pila
     public int obtenerTamaño() {
        return size + 1;
    }

     // Se define el método toString para imprimir el valor de la pila
    @Override
    public String toString() {
        StringBuilder infoS = new StringBuilder();
        
        NodoT temp = peek;
        while(temp != null) {
            infoS.append(temp.toString() + " -> ");
            temp = temp.izq;
        }
        return infoS.toString();
    }
}

