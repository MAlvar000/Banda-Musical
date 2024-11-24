package dominio;

import java.util.ArrayList;

public class BandaMusica {
    private String nombre;
    private ArrayList<Actuacion> actuaciones;

public BandaMusica(String nombre){
    this.nombre = nombre;
    this.actuaciones = new ArrayList<>();
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public void annadirActuacion(Actuacion actuacion){
    actuaciones.add(actuacion);
}
public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Banda de música de: ").append(nombre.toUpperCase()).append("/n");
    for (Actuacion act: actuaciones) {
        sb.append(act).append("/n");
    }
    return sb.toString();
}
}