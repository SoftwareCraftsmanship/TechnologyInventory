package dominio;

import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public abstract class Item {

    private String codigo;
    private String nombre;
    private String marca;
    private String serial;
    private Empleado responsable;
    private Sede sede;
    private Empleado auxiliar;
    private Date fechaCompra;
    private Date fechaAsignacion;

    private Item(){

    }

    public Item(final String codigo,final String nombre,final String marca,final String serial,
                final Empleado responsable,final  Sede sede,final Empleado auxiliar,
                final Date fechaCompra) throws DatoNoEncontrado{
        if(codigo== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(nombre== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(marca== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(serial== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(responsable== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(sede== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(auxiliar== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(fechaCompra== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        this.codigo=codigo;
        this.nombre=nombre;
        this.marca=marca;
        this.serial=serial;
        this.responsable=responsable;
        this.sede=sede;
        this.auxiliar=auxiliar;
        this.fechaCompra=fechaCompra;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerSerial() {
        return serial;
    }

    public void establecerSerial(final String serial) {
        this.serial = serial;
    }

    public Date obtenerFechaAsignacion() {
        return fechaAsignacion;
    }

    public void establecerFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }



    public int hashCode(){
        return this.serial.hashCode();
    }

    public boolean equals(final Object object){
        //hacer ciclo
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        final Item other = (Item)object;
        return other.hashCode()==this.hashCode();
    }

    public String toString(){
        return serial.toString();
    }



}
