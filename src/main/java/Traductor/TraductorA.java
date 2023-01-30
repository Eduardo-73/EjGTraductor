/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Traductor;

/**
 *
 * @author eduardo
 */
public class TraductorA {
    
    private String palabraExtrangera;
    private String traduccionEspañol;

    public TraductorA(String palabraExtrangera, String traduccionEspañol) {
        this.palabraExtrangera = palabraExtrangera;
        this.traduccionEspañol = traduccionEspañol;
    }

    public TraductorA() {
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
    public String toString() {
        return "TraductorA{" + "palabraExtrangera=" + palabraExtrangera + ", traduccionEspa\u00f1ol=" + traduccionEspañol + '}';
    }
    
}
