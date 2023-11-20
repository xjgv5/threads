package com.xjgv.hilos.ejemplos;

import com.xjgv.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Jhon Doe");
        hilo.start();
        //Thread.sleep(100);
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        Thread hilo3 = new NombreThread("Jano");
        hilo3.start();
        System.out.println(hilo.getState());

    }

}
