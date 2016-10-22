/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Regional {

    private String codigo;
    private String nombre;

    public Regional(final String codigo, final String nombre)throws Exception {
        if(codigo== null)
            throw new Exception();

        if(nombre== null)
            throw new Exception();

        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int hashCode(){
        return this.codigo.hashCode();
    }

    public boolean equals(final Object object){
        //hacer ciclo
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        final Item other = (Item)object;
        return other.hashCode()==this.hashCode();
    }

    public String toString(){
        return codigo.toString();
    }

}
