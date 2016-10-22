import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class EquipoEscritorio extends Equipo {


    public EquipoEscritorio(final String codigo,final  String nombre, final String serial,final  Empleado responsable,final  Sede sede
            ,final  Empleado auxiliar, final Date fechaCompra, final double valor) throws Exception {
        super(codigo, nombre, serial, responsable, sede, auxiliar, fechaCompra, valor);
    }
}