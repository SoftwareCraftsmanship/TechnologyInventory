package dominio;

/**
 * Created by Analista_TI on 22/10/2016.
 */
public class Capacidad {

    private int cantidad;
    private String unidadMedida;

    private Capacidad(){

    }

    public Capacidad(final int cantidad, final String unidadMedida)throws DatoNoEncontrado {
        if(cantidad ==0)
            throw new DatoNoEncontrado("001",new NullPointerException());

        if(unidadMedida ==null || unidadMedida.equals(""))
            throw new DatoNoEncontrado("001",new NullPointerException());

        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public String obtenerUnidadMedida() {
        return unidadMedida;
    }
}
