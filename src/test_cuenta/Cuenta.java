package test_cuenta;

public class Cuenta {

    private String Titular;
    private double Cantidad;

    public Cuenta() {
        Titular = " ";
        Cantidad = 0;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void Dinero() {
        double Dinero = Math.floor(Math.random() * 6000000 + 1000000);
        this.setCantidad(Dinero);
    }

    public void Mostrar(boolean M18) {
        if (M18) {
            System.out.println("Nombre del titular: " + this.getTitular());
        } else {
            System.out.println("Nombre del titular:  Papa de " + this.getTitular());
        }
        System.out.println("Cantidad: " + this.getCantidad());
    }

    public void Ingresar(double CantidadI) {
        this.setCantidad(CantidadI + this.getCantidad());
    }

    public void Retirar(double CantidadR) {
        this.setCantidad(this.getCantidad() - CantidadR);
    }
}
