package dominio;

import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class MemoriaUSB extends Insumo {

    private Capacidad capacidad;

    public MemoriaUSB(final String codigo,final  String nombre,final String marca,final  String serial ,final  Empleado responsable
            ,final  Sede sede,final  Empleado auxiliar,final  Date fechaCompra
            ,final Capacidad capacidad) throws DatoNoEncontrado {

        super(codigo, nombre,marca, serial, responsable, sede, auxiliar, fechaCompra);

        if(capacidad==null)
            throw new DatoNoEncontrado("",new NullPointerException());


    }

    public Capacidad obtenerCapacidad(){
        return this.capacidad;
    }

}
