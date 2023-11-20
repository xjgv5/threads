package com.xjgv.hilos.ejemplos.runnable;

import com.xjgv.hilos.ejemplos.EjemploSincronizacionThread.*;

import static com.xjgv.hilos.ejemplos.EjemploSincronizacionThread.imprimirFrases;


public class ImprimirFrases implements  Runnable{

    private String f1;
    private String f2;

    public ImprimirFrases(String f1, String f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public void run() {
        imprimirFrases(this.f1, this.f2);
    }
}
