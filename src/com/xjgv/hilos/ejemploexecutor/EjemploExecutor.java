package com.xjgv.hilos.ejemploexecutor;

import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {

        Toolkit tk = Toolkit.getDefaultToolkit();

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            long tiempoInicio = System.currentTimeMillis();

            System.out.println("inicio de la tarea");
            try {
                System.out.println("nombre del thread : " + Thread.currentThread().getName());
                //duerme el hilo para simular trabajo
                //TimeUnit.SECONDS.sleep(5);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea (: ");
            tk.beep();
            long tiempoFinal = System.currentTimeMillis();
            long duracion = tiempoFinal - tiempoInicio;

            System.out.println("El hilo tomo : " + duracion + " milisegundos en ejecutarse");

        };

        executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecucion del main 1");
        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Continuando con la ejecucion del main 2");

    }
}
