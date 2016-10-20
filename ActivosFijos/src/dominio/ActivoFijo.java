package dominio;

import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class ActivoFijo extends Item {

    private double valor;

    public ActivoFijo(final String codigo, final String nombre, final String serial,
                      final Empleado responsable,final Sede sede, final Empleado auxiliar,
                      final Date fechaCompra,final double valor) throws Exception {
        super(codigo, nombre, serial, responsable, sede, auxiliar, fechaCompra);

        if(valor ==0)
            throw new Exception();

        this.valor=valor;

    }

    public double obtenerValor(){
        return this.valor;
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
