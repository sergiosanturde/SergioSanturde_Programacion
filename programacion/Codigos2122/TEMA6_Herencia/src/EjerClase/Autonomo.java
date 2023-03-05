package EjerClase;

public final class Autonomo extends Trabajador{

    private int cuota;
    protected String factura;

    public Autonomo() {}

    public Autonomo(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int cuota, String factura) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.cuota = cuota;
        this.factura = factura;
        realizarFactura();
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (cuota*Administracion.IVA) - (this.sueldo*Administracion.IRPF);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota: " + cuota);

        System.out.println("Factura: " + factura);
    }
    public void realizarFactura(){
        this.factura = String.format("\"Factura realizada por un importe de %.2f a la empresa con CIF %s",sueldo,Administracion.CIF);
    }
    //g y s


    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
