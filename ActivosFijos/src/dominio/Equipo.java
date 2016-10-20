package dominio;

import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Equipo extends ActivoFijo {

    private String procesador;
    private String sistemaOperativo;
    private String memoriaRAM;
    private DiscoDuro discoDuro;

    public Equipo(String codigo, String nombre, String serial, Empleado responsable, Sede sede, Empleado auxiliar, Date fechaCompra, double valor) throws Exception {
        super(codigo, nombre, serial, responsable, sede, auxiliar, fechaCompra, valor);

        if(sistemaOperativo ==null)
            throw new Exception();

        if(procesador ==null)
            throw new Exception();

        if(memoriaRAM ==null)
            throw new Exception();

        if(discoDuro ==null)
            throw new Exception();

        this.sistemaOperativo=sistemaOperativo;
        this.procesador=procesador;
        this.memoriaRAM=memoriaRAM;
        this.discoDuro=discoDuro;

    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerProcesador() {
        return procesador;
    }

    public String obtenerMemoriaRAM() {
        return memoriaRAM;
    }

    public DiscoDuro obtenerDiscoDuro() {
        return discoDuro;
    }

    public int hashCode(){
        return this.obtenerSerial().hashCode();
    }

    public boolean equals(final Object object){
        //hacer ciclo
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        final Item other = (Item)object;
        return other.hashCode()==this.hashCode();
    }

    public String toString(){
        return obtenerSerial().toString();
    }
}
