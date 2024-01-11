/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.facade;

/**
 *
 * @author muchiri
 */
public class Main {

    public static void main(String[] args) {
        SmartHomeFacade shf = new SmartHomeFacade();
        shf.startEveningRoutine(27);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println();
        shf.endEveningRoutine();
    }
}
