package dominio;

import dominio.Mantenimiento;

import java.util.Date;

/**
 * Created by GR on 22/10/2016.
 */
public class MantenimientoCorrectivo extends Mantenimiento {

    private String causa;


    public MantenimientoCorrectivo(ActivoFijo activo, Empleado empleado, Empleado auxiliar, Date fechaEjecucion, String descripcion, String observaciones, Sede sede) {
        super(activo, empleado, auxiliar, fechaEjecucion, descripcion, observaciones, sede);

    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String  getCausa() {
        return this.causa;
    }
}
