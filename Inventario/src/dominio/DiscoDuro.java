package dominio;

import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class DiscoDuro extends Insumo {
    public DiscoDuro(final String codigo,final  String nombre, final String marca,final  String serial
            ,final  Empleado responsable,final  Sede sede,final  Empleado auxiliar,final  Date fechaCompra) throws DatoNoEncontrado {
        super(codigo, nombre,marca, serial, responsable, sede, auxiliar, fechaCompra);
    }
}
