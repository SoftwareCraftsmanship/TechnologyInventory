package dominio;

/**
 * Created by Analista_TI on 22/10/2016.
 */
public class DatoNoEncontrado extends Exception{


        public DatoNoEncontrado(String mensaje, Exception e){
            super(mensaje,e);
        }


}
