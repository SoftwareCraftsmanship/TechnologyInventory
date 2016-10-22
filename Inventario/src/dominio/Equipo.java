package dominio;

import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Equipo extends ActivoFijo {

    private String procesador;
    private String sistemaOperativo;
    private Capacidad memoriaRAM;
    private DiscoDuro discoDuro;

    public Equipo(final String codigo,final  String nombre,final String marca,final  String serial,final  Empleado responsable
            ,final  Sede sede,final  Empleado auxiliar  ,final  Date fechaCompra,final  double valor,final String procesador
            ,final String sistemaOperativo,final Capacidad memoriaRAM   ,final DiscoDuro discoDuro      ) throws DatoNoEncontrado {
        super(codigo, nombre,marca, serial, responsable, sede, auxiliar, fechaCompra, valor);

        if(sistemaOperativo ==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(procesador ==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(memoriaRAM ==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(discoDuro ==null)
            throw new DatoNoEncontrado("",new NullPointerException());

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

    public Capacidad obtenerMemoriaRAM() {
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
