/*
 * NOMBRE: Fisher
 * FECHA: 15/04/22
 * PROYECTO: ED2022
 */
package ListEnlazada;

/**
 * Clase principal que prueba las listas enlazadas
 *
 * @author Fisherk2
 */
public class MainLinkListed {

    public static void main(String[] args) {

//        new MainLinkListed().demoListaSimple();
        new MainLinkListed().demoListaDoble();

    }

    public void demoListaSimple() {
        LinkedList lista = new LinkedList();
        lista.agregar("Fisher");
        lista.agregar("Alberto");
        lista.agregar("Zuñiga");
        lista.agregar(0, "Zuñiga");

        NodoLinked nodoBorrado = lista.remover(2);//Zuñiga

        System.out.println("Nodo borrado: " + nodoBorrado.info);
        System.out.println(">>>" + lista.inicio.info);
        System.out.println(">>>" + lista.fin.info);
    }

    public void demoListaDoble() {
        DoubleLinked lista = new DoubleLinked();
        lista.agregar("Ciencia de datos");
        lista.agregar("Inteligencia Artificial");
        lista.agregar("Fundamentos de IoT");
        lista.agregar("Administración de redes");
        lista.agregar("Taller de Investigación II");
        lista.agregar("Cómputo y servicios en la nube");
        lista.agregar("Desarrollo de aplicaciones para dispositivos móviles");
        lista.remover(5);

        NodoLinked auxiliar;
        auxiliar = lista.inicio;

        while (auxiliar != null) {
            System.out.println(auxiliar.info);
            auxiliar = auxiliar.siguiente;
        }

    }
}
