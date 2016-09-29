public class ActivoFijo extends Producto{
    private Date fechaAsignacion;
    private Empleado empleado;
    private Double valorDepreciado;
    private String sistemaOperativo;
    private String serial;
    private String modelo;
    private String caracteristicas;
    public Date fechaCompra;


    public Date obtenerFechaAsignacion() {
        return fechaAsignacion;
    }

    public void establecerFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Empleado obtenerEmpleado() {
        return empleado;
    }

    public void establecerEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Double obtenerValorDepreciado() {
        return valorDepreciado;
    }

    public void establecerValorDepreciado(Double valorDepreciado) {
        this.valorDepreciado = valorDepreciado;
    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public void establecerSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String obtenerSerial() {
        return serial;
    }

    public void establecerSerial(String serial) {
        this.serial = serial;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public void establecerModelo(String modelo) {
        this.modelo = modelo;
    }

    public String obtenerCaracteristicas() {
        return caracteristicas;
    }

    public void establecerCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}