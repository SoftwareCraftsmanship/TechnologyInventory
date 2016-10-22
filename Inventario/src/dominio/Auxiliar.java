package dominio;

import java.util.List;

/**
 * Created by Analista_TI on 22/10/2016.
 */
public class Auxiliar extends Empleado{

    private List<Sede> sedesAsignadas;

    public Auxiliar(final String tipoDocumento, final String documento, final String nombre1,final  String nombre2
            ,final  String apellido1,final  String apellido2,final  int cargo,final  String nombreCargo
            ,final  Sede sede) throws DatoNoEncontrado {
        super(tipoDocumento, documento, nombre1, nombre2, apellido1, apellido2, cargo, nombreCargo, sede);
    }

    public List<Sede> obtenerSedesAsignadas(){
        return sedesAsignadas;
    }

    public void asignarSede(Sede sede) throws DatoNoEncontrado{

        if(sede==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        sedesAsignadas.add(sede);
    }
}
