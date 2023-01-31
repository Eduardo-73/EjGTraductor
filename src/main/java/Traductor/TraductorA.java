/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Traductor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class TraductorA implements Comparable<TraductorA> {

    private Map<String, TraductorA> entrada;
    private String palabraExtrangera;
    private String traduccionEspañol;

    public TraductorA(String palabraExtrangera, String traduccionEspañol) {
        this.entrada = new HashMap<>();
        this.palabraExtrangera = palabraExtrangera;
        this.traduccionEspañol = traduccionEspañol;
    }

    public TraductorA() {
    }

    public void vaciarEntrad(Map<String, TraductorA> entrada) {
        entrada.clear();
    }

    public void guardarEntrada(Map<String, TraductorA> entrada) {
        entrada.put(palabraExtrangera, new TraductorA(traduccionEspañol, palabraExtrangera));
    }

    public void borrarEntrada(Map<String, TraductorA> entrada) {
        entrada.remove(traduccionEspañol, palabraExtrangera);
    }

    public void modificarEntrada(Map<String, TraductorA> entrada) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una nueva palabra ");
        String palExtrangera = teclado.nextLine();
        System.out.println("Dime su traducción ");
        String traEspañol = teclado.nextLine();

        entrada.put(palabraExtrangera, new TraductorA(palExtrangera, traEspañol));
    }

    public String getPalabraExtrangera() {
        return palabraExtrangera;
    }

    public void setPalabraExtrangera(String palabraExtrangera) {
        this.palabraExtrangera = palabraExtrangera;
    }

    public String getTraduccionEspañol() {
        return traduccionEspañol;
    }

    public void setTraduccionEspañol(String traduccionEspañol) {
        this.traduccionEspañol = traduccionEspañol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.traduccionEspañol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TraductorA other = (TraductorA) obj;
        return Objects.equals(this.traduccionEspañol, other.traduccionEspañol);
    }

    @Override
    public String toString() {
        return "TraductorA{" + "palabraExtrangera=" + palabraExtrangera + ", traduccionEspa\u00f1ol=" + traduccionEspañol + '}';
    }

    @Override
    public int compareTo(TraductorA o) {
        return this.traduccionEspañol.compareToIgnoreCase(o.traduccionEspañol);
    }

}
