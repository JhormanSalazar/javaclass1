package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entradas del problema
        //Acostumbrarse a crear las variables en orden, primero las clases envolturas(wrapper) y luego los primitivos.
        String telefonoCliente;
        String nombreCliente;
        String nombrePareja;
        String direccionEnvio;
        String descripcionEnvio;
        String correoCliente;
        int montoRegalo;
        boolean medioPago;

        //dato especial para permitir uso del teclado
        Scanner sc = new Scanner(System.in);

        //Recibiendo datos del usuario
        System.out.println("PELUCHITOS S.A.S");
        System.out.print("\nDigita tu nombre: ");
        nombreCliente = sc.nextLine();
        System.out.print("Digita tu correo: ");
        correoCliente = sc.nextLine();
        System.out.print("Digita tu dirección de envío: ");
        direccionEnvio = sc.nextLine();
        System.out.print("Digita el mensaje para tu regalito: ");
        descripcionEnvio = sc.nextLine();
        System.out.print("Como se llama tu alma gemela?: ");
        nombrePareja = sc.nextLine();
        System.out.print("Cual es tu teléfono de contacto?: ");
        telefonoCliente = sc.nextLine();
        System.out.print("Digita el monto total del regalo: ");
        montoRegalo = sc.nextInt();
        System.out.println("Es pago en efectivo?: \nSi : true \nNo : false");
        medioPago = sc.nextBoolean();

        System.out.println("Resumen de la compra: ");
        System.out.println("Apreciado cliente " + nombreCliente + " tu pedido queda agendado");
        System.out.println(nombrePareja + " recibirá tu detalle" + "\nEn la dirección: "+ direccionEnvio + "\nEl total fue:"+
                montoRegalo + "\n¡Gracias por tu compra!");
    }
}