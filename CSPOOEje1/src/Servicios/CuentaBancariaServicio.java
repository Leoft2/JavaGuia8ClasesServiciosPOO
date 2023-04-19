/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Leonel
 */
public class CuentaBancariaServicio {

    public Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        System.out.println("Introduce el numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Introduce el dni");
        long dniCliente = leer.nextLong();
        double saldoActual = 0;

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);

    }

    public void ingresar(CuentaBancaria cuenta) {

        System.out.println("Ingrese un monto de dinero");
        double ingreso = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);

    }

    public void retirar(CuentaBancaria cuenta) {

        System.out.println("Ingrese el monto que desea retirar de la cuenta");
        double retirar = leer.nextDouble();

        if (cuenta.getSaldoActual() < retirar) {

            System.out.println("el saldo actual no es suficiente para retirar");
            System.out.println("Se va a retirar" + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);

        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);

        }

    }

    public void extraccionRapida(CuentaBancaria cuenta) {

        System.out.println("Ingresar extraccion rapida");
        double extraer = leer.nextDouble();

        if (extraer > (cuenta.getSaldoActual() * 0.2)) {
            System.out.println("No puede retirar mas del 20%-$" + cuenta.getSaldoActual() * 0.2);

        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - extraer);

        }

    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("el saldo que tiene actualmente es: $" + cuenta.getSaldoActual());

    }
    
    
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Los datos que usted tiene son: ");

        System.out.println(cuenta.toString());


        
        
        
        
        
    }
    
    
    

}
