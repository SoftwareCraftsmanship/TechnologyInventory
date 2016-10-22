package dominio;

import java.util.Date;

/**
 * Created by GR on 22/10/2016.
 */
public abstract class Mantenimiento {
    private ActivoFijo activo;
    private Empleado empleado;
    private /*Auxiliar*/ Object auxiliar;
    private Date fechaEjecucion;
    private String descripcion;
    private String observaciones;
    private Sede sede;

    public Mantenimiento(ActivoFijo activo, Empleado empleado, Empleado auxiliar, Date fechaEjecucion, String descripcion, String observaciones, Sede sede) {
        this.activo = activo;
        this.empleado = empleado;
        this.auxiliar = auxiliar;
        this.fechaEjecucion = fechaEjecucion;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
        this.sede = sede;
    }

    public void solicitarMantenimiento(){

    }

    public void generarActa(){


    }

}