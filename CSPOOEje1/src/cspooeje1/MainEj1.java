/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cspooeje1;

import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;



public class MainEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       CuentaBancariaServicio scb = new CuentaBancariaServicio();
        
       CuentaBancaria primerCuenta = new CuentaBancaria();
       
       primerCuenta = scb.crearCuenta();
       
        System.out.println(primerCuenta.toString());
        
         
    }

}
