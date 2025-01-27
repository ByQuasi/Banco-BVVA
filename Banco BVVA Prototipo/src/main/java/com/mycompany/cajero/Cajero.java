package com.mycompany.cajero;

import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        ingreso();

    }

    public static void ingreso() {
        Scanner scanner = new Scanner(System.in);
        int a;
        Usuarios u = new Usuarios();
        System.out.println("1.Iniciar sesion  2.Registrar: ");
        a = scanner.nextInt();
        if (a == 1) {
            u.iniciarsesion();
        } else {
            u.registrar();
        }

    }
}
