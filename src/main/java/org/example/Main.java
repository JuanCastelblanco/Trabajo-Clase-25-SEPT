package org.example;

import org.example.modelos.Apartamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n Bienvenido !!!");

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        System.out.println("Digite nombre urbanizacion");
        apartamento.setNombreUrbanizacion(lea.nextLine());

        System.out.println("Digite numero apto");
        apartamento.setNumeroApto(lea.nextInt());

        System.out.println("Digite tiene parqueadero");
        apartamento.setTieneParqueadero(lea.nextLine());

        System.out.println("Digite direccion");
        apartamento.setDireccion(lea.nextLine());

        System.out.println("Digite precio canon");
        apartamento.setPrecioCanon(lea.nextInt());

        System.out.println("Digite id");
        apartamento.setId(lea.nextLine());

        System.out.println("Digite ciudad");
        apartamento.setCiudad(lea.nextLine());

        //imprimiendo los datos del Apartamento:
        System.out.println(apartamento);
    }
}