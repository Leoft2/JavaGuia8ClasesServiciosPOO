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
    
    private Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta() {
        
        System.out.println("Introduce el numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Introduce el dni");
        long dniCliente = leer.nextInt();
        System.out.println("Introduce el saldo actual");
        int saldoActual = leer.nextInt();
                
        return new CuentaBancaria(numeroCuenta,dniCliente,saldoActual);
        
    }
     
        
        
    
    
    
    
    
    
}
