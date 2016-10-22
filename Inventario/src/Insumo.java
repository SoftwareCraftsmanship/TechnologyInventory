import java.util.Date;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Insumo extends Item {

    public Insumo(String codigo, String nombre, String serial, Empleado responsable, Sede sede, Empleado auxiliar, Date fechaCompra) throws Exception {
        super(codigo, nombre, serial, responsable, sede, auxiliar, fechaCompra);
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
