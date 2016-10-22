package dominio;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Sede {

    private Ciudad ciudad;
    private String nombre;

    public Sede(final Ciudad ciudad, final String nombre)throws DatoNoEncontrado {
        if(ciudad== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(nombre== null)
            throw new DatoNoEncontrado("",new NullPointerException());

        this.ciudad = ciudad;
        this.nombre = nombre;
    }

    public int hashCode(){
        return this.nombre.hashCode()
                +this.ciudad.obtenerCodigo().hashCode()
                +this.ciudad.obtenerRegional().obtenerCodigo().hashCode();
    }

    public boolean equals(final Object object){
        //hacer ciclo
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        final Item other = (Item)object;
        return other.hashCode()==this.hashCode();
    }

    public String toString(){
        return this.nombre
                +this.ciudad.obtenerCodigo()
                +this.ciudad.obtenerRegional().obtenerCodigo();
    }
}
