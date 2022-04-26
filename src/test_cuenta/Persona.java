package test_cuenta;

import java.util.Scanner;

public class Persona {

    private String Nombre;
    private int Edad;
    private int DNI;
    private Scanner Input;

    public Persona() {
        Nombre = " ";
        Edad = 0;
        DNI = 0;
        Input = new Scanner(System.in);
    }

    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        DNI = 5344;
        Input = new Scanner(System.in);
    }

    public void Lectura() {
        System.out.print("Ingrese su nombre: ");
        this.setNombre(Input.next());
        System.out.print("Ingrese su edad: ");
        this.setEdad(Input.nextInt());
        while (!this.EdadMinima()) {
            System.out.println("No tiene la edad suficiente para ingresar a su cuenta");
            System.out.print("Ingrese su edad: ");
            this.setEdad(Input.nextInt());
        }
        System.out.print("Ingrese su DNI: ");
        this.setDNI(Input.nextInt());
        while (!this.DNI()) {
            System.out.println("No tiene un DNI valido");
            System.out.print("Ingrese su DNI: ");
            this.setDNI(Input.nextInt());
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void Mostrar() {
        System.out.println("Hola " + this.getNombre());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("DNI: " + this.getDNI());
        if (EsMayorDeEdad()) {
            System.out.println("Mayor de edad : SI");
        } else {
            System.out.println("Mayor de edad : NO");
        }
    }

    public boolean DNI() {
        if (this.getDNI() >= 9999999) {
            return true;
        } else {
            return false;
        }
    }

    public boolean EdadMinima() {
        if (this.getEdad() >= 13) {
            return true;
        } else {
            return false;
        }
    }

    public boolean EsMayorDeEdad() {
        if (this.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
