/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("855655", "45514521", "55256625", "552525", Setor.OPERACOES, 2250, LocalDate.of(2000, Month.MARCH, 8), Genero.MASCULINO, "Mario", "7195626352",
                 "mario@gmail.com", new Endereco("Rua JOão ", "87", "casa", "758525","Misericordia", UnidadeFederativa.BAHIA));
        Medico medico = new Medico("45852", "8556545245", "8552445", "585447", Setor.SAUDE, 20052, LocalDate.of(1990, Month.MARCH, 20), Genero.FEMININO, "Renata",
                "710925525", "Drarenata@hotmail.com", new Endereco("Rua Luiz Marins", "1", "26° andar", "40255632", "São Paulo", UnidadeFederativa.SAO_PAULO));
        Advogado advogado = new Advogado("855652", "5285441552", "8556541", "5455845", Setor.JURIDICO, 19526, LocalDate.of(1991, Month.MARCH, 20), Genero.MASCULINO,
                "Felipe", "71952545", "Drfelipe@gmail.com", new Endereco("Rua Durval", "956", "Casa", "745541", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println("----------Sistema----------");
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(medico.toString());
        System.out.println("");
        System.out.println(advogado.toString());
    }
    }
