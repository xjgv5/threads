package com.xjgv.hilos.ejemplosync;

import com.xjgv.hilos.ejemplosync.runnable.Cliente;
import com.xjgv.hilos.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Cliente(p)).start();
    }
}
