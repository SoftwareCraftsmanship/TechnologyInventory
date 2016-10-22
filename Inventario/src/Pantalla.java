import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Pantalla extends Insumo {


    public Pantalla(String codigo, String nombre, String serial, Empleado responsable, Sede sede, Empleado auxiliar, Date fechaCompra) throws Exception {
        super(codigo, nombre, serial, responsable, sede, auxiliar, fechaCompra);
    }
}
