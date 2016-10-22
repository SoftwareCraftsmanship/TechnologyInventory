package dominio;

import java.util.Date;
import java.util.List;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class EquipoEscritorio extends Equipo {

    private Pantalla pantalla;
    private List<Item> accesorios;


    public EquipoEscritorio(final String codigo,final  String nombre,final  String marca,final  String serial,final  Empleado responsable
            ,final  Sede sede,final  Empleado auxiliar,final  Date fechaCompra,final  double valor,final  String procesador
            ,final  String sistemaOperativo,final  Capacidad memoriaRAM,final  DiscoDuro discoDuro
            ,final  Pantalla pantalla,final List<Item> accesorios) throws DatoNoEncontrado {

        super(codigo, nombre,marca, serial, responsable, sede, auxiliar, fechaCompra, valor, procesador, sistemaOperativo
                , memoriaRAM, discoDuro);

        if(pantalla==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(accesorios==null || accesorios.size()<1)
            throw new DatoNoEncontrado("",new NullPointerException());

        this.pantalla=pantalla;
        this.accesorios=accesorios;
    }

    public Pantalla obtenerPantalla() {
        return pantalla;
    }

    public List<Item> obtenerAccesorios() {
        return accesorios;
    }


}