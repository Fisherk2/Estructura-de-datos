package Stack;

public class NodoT {
    String info;
    NodoT der, izq;
    
    NodoT(String info){
        this.info = info;
        der = izq = null;
    }

    @Override
    public String toString() {
        return info;
    }
}

