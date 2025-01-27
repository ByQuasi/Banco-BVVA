package com.mycompany.cajero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Usuarios {

    private final Scanner scanner = new Scanner(System.in);
    private HashMap<String, String> usuario;
    private ArrayList<Entrañas> usuario_def;
    // private double interes; 

    //Stringtokenaizer para leer un txt donde se guardetoda la info de los usuario
    private void leerInfo() {
        usuario = new HashMap<>();
        File a = new File("C://Users//User//Desktop//basededatosprimitiva2.txt");
        StringTokenizer st;
        Scanner scan = null;
        String g;
        try {
            scan = new Scanner(a);
            while (scan.hasNext()) {
                g = scan.nextLine();
                st = new StringTokenizer(g, ",");
                while (st.hasMoreTokens()) {
                    usuario.put(st.nextToken(), st.nextToken());
                }
            }
        } catch (FileNotFoundException e) {
        } finally {
            if (scan != null) {
                scan.close();
            }

        }
    }

    private void leerInfo2() {
        usuario_def = new ArrayList<>();
        File a = new File("C://Users//User//Desktop//basededatosprimitiva.txt");
        StringTokenizer st;
        Scanner scan = null;
        Entrañas k;
        String g;
        try {
            scan = new Scanner(a);
            while (scan.hasNext()) {
                g = scan.nextLine();
                st = new StringTokenizer(g, ",");
                while (st.hasMoreTokens()) {
                    k = new Entrañas();
                    k.setNombre(st.nextToken());
                    k.setContraseña(st.nextToken());
                    k.setNumero(Integer.parseInt(st.nextToken()));
                    k.setSaldo(Double.parseDouble(st.nextToken()));
                    usuario_def.add(k);

                }
            }
        } catch (FileNotFoundException e) {
        } finally {
           scan.close();
        }
    }

    private void guardarInfo(String a, String b) {
        PrintWriter k = null;
        try {
            FileWriter usuarios = new FileWriter("/C://Users//User//Desktop//basededatosprimitiva2.txt", true);
            k = new PrintWriter(usuarios);
            k.print(a + "," + b + ",");
            k.println();
        } catch (IOException e) {
            System.out.println("No amigo guardar info");
        } finally {
            k.close();
        }

    }

    private void guardarInfo(String a, String b, int c, double d) {
        PrintWriter k = null;
        try {
            FileWriter usuarios = new FileWriter("/C://Users//User//Desktop//basededatosprimitiva.txt", true);
            k = new PrintWriter(usuarios);
            k.print(a + "," + b + "," + c + "," + d + ",");
            k.println();
        } catch (IOException e) {
            System.out.println("No amigo guardar info");
        } finally {
            k.close();
        }
    }

    public void registrar() {
        leerInfo();
        usuario_def = new ArrayList<>();
        String a, b;
        Entrañas k = new Entrañas();
        do {
            System.out.print("Ingrese usuario: ");
            a = scanner.nextLine();
            if (usuario.containsKey(a)) {
                System.out.println("Usuario ya existente");
            }
        } while (usuario.containsKey(a));
        System.out.println();
        System.out.print("Ingrese contraseña: ");
        b = scanner.nextLine();
        usuario.put(a, b);
        k.setNombre(a);
        k.setContraseña(b);
        k.setNumero();
        k.setSaldo(1000);
        usuario_def.add(k);
        guardarInfo(k.getNombre(), k.getContraseña());
        guardarInfo(k.getNombre(), k.getContraseña(), k.getNumero(), k.getSaldo());

        iniciarsesion();
    }

    public void iniciarsesion() {
        leerInfo();
        String name, b, contra;
        do {
            System.out.print("Ingrese su usuario: ");
            name = scanner.nextLine();
            if (!usuario.containsKey(name)) {
                System.out.println("Usuario no existe");
            }
        } while (!usuario.containsKey(name));
        b = usuario.get(name);
        do {
            System.out.print("Ingrese contraseña: ");
            contra = scanner.nextLine();
            if (!contra.equals(b)) {
                System.out.println("Contraseña incorrecta");
            }
        } while (!contra.equals(b));
        System.out.println("");
        interfaz(name);
    }

    private void interfaz(String a) {
        leerInfo2();
        int b;
        boolean g = false;
        System.out.println("Buen dia " + a + ". Que desea hacer?");
        System.out.println("1.Ver saldo         2.Retirar plata");
        System.out.println("3.Transferir plata  4.Ver datos de la cuenta");
        System.out.println("5. Abonar plata     6.Cerrar Sesion");
        System.out.println("0.Salir ");
        b = scanner.nextInt();
        switch (b) {
            case 1:
                System.out.println("");
                Saldo(a);
                break;
            case 2:
                System.out.println("");
                retirar(a, g);
                break;
            case 3:
                System.out.println("");
                transferir(a);
                break;
            case 4:
                System.out.println("");
                datos(a);
                break;
            case 5:
                System.out.println("");
                abonar(a, g);
                break;
            case 6:
                System.out.println("");
                Cajero.ingreso();
                break;
            default:
                System.out.println("Gracias por su tiempo!");
                System.exit(0);
                break;
        }
    }

    private void Saldo(String a) {
        int b;
        boolean k = true;
        System.out.print("Su saldo es: ");
        for (Entrañas g : usuario_def) {
            if (g.getNombre().equals(a)) {
                System.out.println(g.getSaldo());
            }

        }
        System.out.println("Desea retirar o abonar plata?");
        System.out.println("1. Retirar 2. Abonar 3. Volver");
        b = scanner.nextInt();
        switch (b) {
            case 1:
                System.out.println("");
                retirar(a, k);
                break;
            case 2:
                System.out.println("");
                abonar(a, k);
                break;
            default:
                System.out.println("");
                interfaz(a);
                break;
        }
    }

    private void abonar(String a, boolean g) {
        if (!g) {
            for (Entrañas k : usuario_def) {
                if (k.getNombre().equals(a)) {
                    System.out.println(k.getSaldo());
                }
            }
        }
        System.out.println("Cuanto desea abonar?");
        double b = scanner.nextDouble();
        for (Entrañas k : usuario_def) {
            if (k.getNombre().equals(a)) {
                b = b + k.getSaldo();
                cambiar(k.getSaldo(), b);
                k.setSaldo(b);
            }
        }
        System.out.println("Desea relizar otra accion?");
        System.out.println("1.Si 2.No");
        int h = scanner.nextInt();
        if (h == 1) {
            System.out.println("");
            interfaz(a);
        } else {
            System.out.println("Gracias por su tiempo!");
        }
    }

    private void datos(String a) {
        scanner.nextLine();
        int h;
        for (Entrañas b : usuario_def) {
            if (b.getNombre().equals(a)) {
                System.out.println("Usuario: " + b.getNombre() + ", Contraseña: " + b.getContraseña() + ", Numero ID: " + b.getNumero() + ", Saldo: " + b.getSaldo());
            }
        }
        System.out.println("Desea modificar?");
        System.out.println("1. Si 2.No");
        int opc = scanner.nextInt();
        switch (opc) {
            case 1:
                System.out.println("1. Nombre  2.Contraseña");
        }

        System.out.println("Desea realizar otra operacion?");
        System.out.println("1. Si 2.No");
        h = scanner.nextInt();
        if (h == 1) {
            System.out.println("");
            interfaz(a);
        } else {
            System.out.println("Gracias por su tiempo!");
        }
    }

    private void retirar(String a, boolean b) {
        double h;

        if (!b) {
            System.out.print("Su saldo es: ");
            for (Entrañas g : usuario_def) {
                if (g.getNombre().equals(a)) {
                    System.out.println(g.getSaldo());
                }
            }
        }
        System.out.print("Ingrese cuanto quiere retirar:");
        h = scanner.nextDouble();
        for (Entrañas g : usuario_def) {
            if (g.getNombre().equals(a)) {
                if (h < g.getSaldo()) {
                    h = g.getSaldo() - h;
                    cambiar(g.getSaldo(), h);
                    g.setSaldo(h);
                } else {
                    System.out.println("No se puede realizar la operacion, saldo insuficiente.");
                }

            }
        }
        System.out.println("Desea realizar otra operacion?");
        System.out.println("1. Si 2.No");
        h = scanner.nextDouble();

        if (h == 1) {
            System.out.println("");
            interfaz(a);
        } else {
            System.out.println("Gracias por su tiempo!");
        }
    }

    private void transferir(String a) {
        scanner.nextLine();
        System.out.println("Ingrese cuenta: ");
        String nom = scanner.nextLine();
        System.out.print("Ingrese el monto a transferir: ");
        double num = scanner.nextInt();
        double aux = num;
        boolean flag = false;
        for (Entrañas k : usuario_def) {
            if (k.getNombre().equals(nom)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No se encontro usuario");
            System.out.println("Desea buscar nuevamente?");
            System.out.println("1. Si  2.No");
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    transferir(a);
                    break;
                case 2:
                default:
                    interfaz(a);
                    break;
            }
            return;
        }
        for (Entrañas i : usuario_def) {
            if (i.getNombre().equals(a)) {
                num = i.getSaldo() - num;
                cambiar(i.getSaldo(), num);
                i.setSaldo(num);
            }
        }
        leerInfo2();
        for (Entrañas j : usuario_def) {
            if (j.getNombre().equals(nom)) {
                aux = 20 + j.getSaldo() + aux;
                cambiar(j.getSaldo(), aux);
                j.setSaldo(aux);
            }
        }
        Saldo(a);
    }

    private void cambiar(double a, double b) {
        File file = new File("C://Users//User//Desktop//basededatosprimitiva.txt");
        String search = Double.toString(a);
        String replace = Double.toString(b);
        try {
            FileReader fr = new FileReader(file);
            String s;
            String Str = "";
            try (BufferedReader br = new BufferedReader(fr)) {
                int i = 0;
                while ((s = br.readLine()) != null) {
                    Str += s;
                }
                Str = Str.replaceAll(search, replace);
                FileWriter fe = new FileWriter(file);
                fe.write(Str);
                fe.close();
            } catch (Exception e) {
            }
        } catch (FileNotFoundException e) {
        }
        leerInfo2();

    }

}
