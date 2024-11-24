package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Participante {
    private String instrumento;
    private BigDecimal cantidadDinero;
    
    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal cantidadDinero){
        super(nombre);
        this.instrumento = instrumento;
        this.cantidadDinero= cantidadDinero;
    }
    public String getInstrumento(){
        return instrumento;
    }
    public void setInstrumento(String instrumento){
        this.instrumento = instrumento; 
    }
    public BigDecimal getCantidadDinero(){
        return cantidadDinero;
    }
    public void setCantidadDinero(BigDecimal cantidadDinero){
        this.cantidadDinero= cantidadDinero;
    }
    public String toString(){
        return super.toString()+" "+ instrumento + ", "+ cantidadDinero+ " €";
    }
}

