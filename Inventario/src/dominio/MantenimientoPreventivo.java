package dominio;

import dominio.Mantenimiento;

import java.util.Date;

/**
 * Created by GR on 22/10/2016.
 */
public class MantenimientoPreventivo extends Mantenimiento {

    private Date fechaProgramacion;


    public MantenimientoPreventivo(ActivoFijo activo, Empleado empleado, Empleado auxiliar, Date fechaEjecucion, String descripcion, String observaciones, Sede sede, Date fechaProgramacion) {
        super(activo, empleado, auxiliar, fechaEjecucion, descripcion, observaciones, sede);
        this.fechaProgramacion = fechaProgramacion;
    }
}
