package dominio;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Ciudad {

    private Regional regional;
    private String codigo;
    private String nombre;

    public Ciudad(final String codigo,final  String nombre,final Regional regional)throws DatoNoEncontrado {
        if(codigo== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(nombre== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(regional== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        this.codigo = codigo;
        this.nombre = nombre;
        this.regional = regional;
    }

    public String obtenerCodigo() {
        return this.codigo;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public Regional obtenerRegional() {
        return this.regional;
    }

    public int hashCode(){
        return this.codigo.hashCode()+this.regional.obtenerCodigo().hashCode();
    }

    public boolean equals(final Object object){
        //hacer ciclo
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        final Item other = (Item)object;
        return other.hashCode()==this.hashCode();
    }

    public String toString(){
        return codigo.toString()+" "+this.regional.obtenerCodigo().toString();
    }

}
