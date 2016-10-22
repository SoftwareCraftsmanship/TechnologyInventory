package dominio;

/**
 * Created by Analista_TI on 08/10/2016.
 */
public class Empleado {

    private String tipoDocumento;
    private String documento;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private int cargo;
    private String nombreCargo;
    private Sede sede;
    
    
    public Empleado(final String tipoDocumento,final  String documento,final  String nombre1,final  String nombre2
            ,final  String apellido1,final  String apellido2,final  int cargo,final  String nombreCargo
            ,final  Sede sede)throws DatoNoEncontrado {

        if(this.tipoDocumento==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(this.documento==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(this.nombre1==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(this.nombre2==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(this.apellido1==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(this.apellido2==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(this.cargo==0)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(this.nombreCargo==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        if(this.sede==null)
            throw new DatoNoEncontrado("",new NullPointerException());

        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cargo = cargo;
        this.nombreCargo = nombreCargo;
        this.sede = sede;
    }

    public String obtenerTipoDocumento() {
        return tipoDocumento;
    }

    public String obtenerDocumento() {
        return documento;
    }

    public String obtenerNombre1() {
        return nombre1;
    }

    public String obtenerNombre2() {
        return nombre2;
    }

    public String obtenerApellido1() {
        return apellido1;
    }

    public String obtenerApellido2() {
        return apellido2;
    }

    public int obtenerCargo() {
        return cargo;
    }

    public String obtenerNombreCargo() {
        return nombreCargo;
    }

    public Sede obtenerSede() {
        return sede;
    }

    public int hashCode(){
        return this.documento.hashCode();
    }

    public boolean equals(final Object object){
        //hacer ciclo
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        final Item other = (Item)object;
        return other.hashCode()==this.hashCode();
    }

    public String toString(){
        return documento.toString();
    }


}
