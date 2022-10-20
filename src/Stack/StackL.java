package Stack;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class StackL {

    public static void main(String[] args) {
        Pila p = new Pila();
        p.push (new NodoT (";"));
        p.push (new NodoT ("Ent"));
        p.push (new NodoT ("Op"));
        p.push (new NodoT ("Ent"));
        p.push (new NodoT ("="));
        p.push (new NodoT ("id"));
        p.push (new NodoT ("r"));

        System.out.println(p.toString());
        String C = JOptionPane.showInputDialog("Inserte la entrada"), w;

        if (C == null) {
            return;
        }

        C = C.trim(); // removemos los espacios del inicio y los del final, si es que hay

        System.out.println("input = " + C);

        List <String> operadores = new ArrayList<>();
        operadores.add ("+");
        operadores.add ("*");
        operadores.add ("/");
        operadores.add ("-");

        List <String> reservadas = new ArrayList<>();
        reservadas.add ("int");
        reservadas.add ("String");

        if(!C.endsWith(";")) {
            System.out.println("Porfavor ingrese una entrada valida" );
            return;
        }
        
        if(!C.endsWith(" ;")){
         C = C.substring(0, C.lastIndexOf(";")).trim() + " ;";
        }
        
        String [] tokens = C.split(" ");

        for (String s : tokens) {

            if (reservadas.contains(s)) {
//                    System.out.println("Sacamos " + p.pop().toString());
                    w = "r";
            } else
            if (s.matches ("[a-z]+") && !reservadas.contains(s)) {
//                    System.out.println("Sacamos " + p.pop().toString());
                w = "id";
            } else
                if (s.matches ("[0-9]+")) {
//                    System.out.println("Sacamos " + p.pop().toString());
w = "Ent";
            } else
                if (operadores.contains(s)) {
          //          System.out.println("Sacamos " + p.pop().toString());
          w = "Op";
            } else
                if (s.matches("=")) {
                   //System.out.println("Sacamos " + p.pop().toString());
                   w = s;
            } else
                if (s.matches(";")) {
                //System.out.println("Sacamos " + p.pop().toString());
                w = s;
            }else w = null;
            if (!w.equals(p.pop().toString())){
                System.err.println("error, no esperaba "+s);
                break;
            }
        }

        if(p.obtenerTamaño() == 0) {
            System.out.println("La entrada es valida");
        } else {
            System.out.println("La entrada NO es valida");
        }
    }
}   