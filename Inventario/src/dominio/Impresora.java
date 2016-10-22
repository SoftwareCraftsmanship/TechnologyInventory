package dominio;

import java.util.Date;

/**
 * Created by Analista_TI on 22/10/2016.
 */
public class Impresora extends ActivoFijo{


    public Impresora(final String codigo,final String nombre,final String marca,final String serial
            ,final Empleado responsable,final Sede sede,final Empleado auxiliar,final Date fechaCompra
            ,final double valor) throws DatoNoEncontrado {
        super(codigo, nombre, marca, serial, responsable, sede, auxiliar, fechaCompra, valor);
    }
}
