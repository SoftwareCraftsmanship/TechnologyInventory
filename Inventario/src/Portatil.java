import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Portatil extends Equipo {

    private Pantalla pantalla;
    private List<Item> accesorios;

    public Portatil(final String codigo, final  String nombre, final  String serial, final Empleado responsable, final Sede sede
            , final  Empleado auxiliar, final  Date fechaCompra, final  double valor ) throws Exception {
        super(codigo, nombre, serial, responsable, sede, auxiliar, fechaCompra, valor);

        accesorios=new ArrayList<Item>();
    }

    public Pantalla obtenerPantalla() {
        return pantalla;
    }

    public List<Item> obtenerAccesorios() {
        return accesorios;
    }

    public void asignarPantalla(Pantalla pantalla)throws Exception{
        if(pantalla==null)
            throw new Exception();

        this.pantalla=pantalla;
    }

    public void agregarAccesorio(Item accesorio)throws Exception{
        if(accesorio==null)
            throw new Exception();

        accesorios.add(accesorio);
    }
}
