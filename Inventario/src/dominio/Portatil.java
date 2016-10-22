package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Portatil extends Equipo {

    private Pantalla pantalla;
    private List<Item> accesorios;

    public Portatil(final String codigo,final  String nombre,final String marca,final  String serial,final  Empleado responsable
            ,final  Sede sede,final  Empleado auxiliar,final  Date fechaCompra,final  double valor
            ,final  String procesador,final  String sistemaOperativo,final  Capacidad memoriaRAM
            ,final  DiscoDuro discoDuro) throws DatoNoEncontrado {

        super(codigo, nombre,marca, serial, responsable, sede, auxiliar, fechaCompra, valor, procesador
                , sistemaOperativo, memoriaRAM, discoDuro);

        accesorios=new ArrayList<Item>();
    }


    public Pantalla obtenerPantalla() {
        return pantalla;
    }

    public List<Item> obtenerAccesorios() {
        return accesorios;
    }

    public void asignarPantalla(Pantalla pantalla)throws DatoNoEncontrado{
        if(pantalla==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        this.pantalla=pantalla;
    }

    public void agregarAccesorio(Item accesorio)throws DatoNoEncontrado{
        if(accesorio==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        accesorios.add(accesorio);
    }
}
