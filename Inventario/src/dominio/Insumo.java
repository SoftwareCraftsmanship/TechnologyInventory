package dominio;

import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Insumo extends Item {

    public Insumo(final String codigo,final  String nombre,final  String marca,final  String serial
            ,final  Empleado responsable,final  Sede sede,final  Empleado auxiliar
            ,final  Date fechaCompra) throws DatoNoEncontrado {
        super(codigo, nombre,marca, serial, responsable, sede, auxiliar, fechaCompra);
    }

    public int hashCode(){
        return this.obtenerSerial().hashCode();
    }

    public boolean equals(final Object object){
        //hacer ciclo
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        final Item other = (Item)object;
        return other.hashCode()==this.hashCode();
    }

    public String toString(){
        return obtenerSerial().toString();
    }


}
