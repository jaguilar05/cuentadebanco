package com.proyecto1;

public class Cajero {

    private CuentaDeBanco cuenta;

    public Cajero(CuentaDeBanco cuenta){
        this.cuenta = cuenta;

    }

    public void verBalance(){
        System.out.println("Tu balance es "+cuenta.getBalance());
    }

    public void depositarDinero(double depositoCantidad){
        cuenta.setBalance(cuenta.getBalance() +depositoCantidad);
        verBalance();

    }

    public void retiroDinero(double retiroCantidad){
        if(retiroCantidad > cuenta.getBalance()){
            System.out.println("Saldo insuficiente");
        }else{
            cuenta.setBalance(cuenta.getBalance()- retiroCantidad);
            verBalance();
        }
    }


}
