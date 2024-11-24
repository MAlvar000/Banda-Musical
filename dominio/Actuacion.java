package dominio;

import java.time.LocalDate; 
import java.util.ArrayList;

public class Actuacion {
    private LocalDate fecha;
    private ArrayList<Participante> participantes;

public Actuacion(LocalDate fecha){
    this.fecha=fecha;
    this.participantes = new ArrayList<>();
}
public LocalDate getFecha(){
    return fecha;
}
public void setFecha(LocalDate fecha){
    this.fecha= fecha;
}
public void annadirParticipante(Participante participante){
    participantes.add(participante);
}
public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Fecha de actuacción: ").append(fecha).append("/n");
    for(Participante p: participantes){
        sb.append(p).append("/n");
    }
    return sb.toString();
}
}
