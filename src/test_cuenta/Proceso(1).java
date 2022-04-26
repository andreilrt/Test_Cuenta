package test_cuenta;

import java.util.Scanner;

public class Proceso {

    private Persona ObjPersona;
    private Cuenta ObjCuenta;
    private Scanner Input;

    public Proceso() {
        ObjPersona = new Persona();
        ObjCuenta = new Cuenta();
        Input = new Scanner(System.in);
    }

    public void Opc1() {
        System.out.println("Hola " + this.ObjPersona.getNombre());
        System.out.println("Su cuenta actualmente cuenta con " + this.ObjCuenta.getCantidad() + " fondos");
    }

    public void Opc2() {
        double Valor = 0;
        System.out.println("Hola " + this.ObjPersona.getNombre());
        System.out.println("Su cuenta actualmente cuenta con " + this.ObjCuenta.getCantidad() + " fondos");
        System.out.print("La cantidad que quiere ingresar es de: ");
        Valor = this.Input.nextDouble();
        while (Valor <= 0) {
            System.out.println("Digite un valor valido");
            System.out.print("La cantidad que quiere ingresar es de: ");
            Valor = this.Input.nextDouble();
        }
        this.ObjCuenta.Ingresar(Valor);
        System.out.println("Su cuenta actualmente cuenta con " + this.ObjCuenta.getCantidad() + " fondos");
    }

    public void Opc3() {
        System.out.println("Hola " + this.ObjPersona.getNombre());
        System.out.println("Su cuenta actualmente cuenta con " + this.ObjCuenta.getCantidad() + " fondos");
        System.out.print("La cantidad que quiere retirar es de: ");
        double ValorRetiro = this.Input.nextDouble();
        if (this.ObjPersona.EsMayorDeEdad()) {
            while (ValorRetiro >= this.ObjCuenta.getCantidad()) {
                System.out.println("Por favor ingrese un monto de dinero valido");
                System.out.print("La cantidad que quiere retirar es de: ");
                ValorRetiro = this.Input.nextDouble();
            }
        } else {
            while (ValorRetiro >= this.ObjCuenta.getCantidad() ||ValorRetiro > 200000) {
                System.out.println("Por favor ingrese un monto de dinero valido");
                System.out.print("La cantidad que quiere retirar es de: ");
                ValorRetiro = this.Input.nextDouble();
            }
        }
        this.ObjCuenta.Retirar(ValorRetiro);
        System.out.println("Su cuenta actualmente cuenta con " + this.ObjCuenta.getCantidad() + " fondos");
    }

    public void Opc4() {
        System.out.println("Hola " + this.ObjPersona.getNombre());
        System.out.print("Ingrese su edad actual: ");
        int E = Input.nextInt();
        while (E < this.ObjPersona.getEdad()) {
            System.out.println("Digite una edad valida");
            System.out.print("Ingrese su edad actual: ");
            E = Input.nextInt();
        }
        this.ObjPersona.setEdad(E);
    }

    public void Opc5() {
        this.ObjPersona.Mostrar();
    }

    public void Opc6() {
        this.ObjCuenta.Mostrar(this.ObjPersona.EsMayorDeEdad());
    }

    public void Menu() {
        boolean Control = true;
        int Opc = 0;
        this.ObjCuenta.Dinero();
        this.ObjPersona.Lectura();
        this.ObjCuenta.setTitular(this.ObjPersona.getNombre());
        while (Control) {
            System.out.println(" ");
            System.out.println("Bienvenid@ a su cuenta, que acción deseea realizar ");
            System.out.println("1. Revisar cuanto dinero tiene su cuenta actualmente");
            System.out.println("2. Ingresar dinero a su cuenta");
            System.out.println("3. Retirar dinero de su cuenta");
            System.out.println("4. Actualizar la edad del titular ");
            System.out.println("5. Mostrar tus datos");
            System.out.println("6.Mostrar los datos de su cuenta");
            System.out.println("7. Salir");
            Opc = Input.nextInt();
            if (Opc < 1 || Opc > 7) {
                System.out.println("Ingrese una opción valida");
            }
            if (Opc == 7) {
                System.out.println("Programa Finalizado");
                Control = false;
            }
            if (Opc == 1) {
                Opc1();
            }
            if (Opc == 2) {
                Opc2();
            }
            if (Opc == 3) {
                Opc3();
            }
            if (Opc == 4) {
                Opc4();
            }
            if (Opc == 5) {
                Opc5();
            }
            if (Opc == 6) {
                Opc6();
            }
        }
    }
}
