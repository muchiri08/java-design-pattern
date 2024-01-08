/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.factory;

/**
 *
 * @author muchiri
 */
public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("FILE: "+message);
    }
}
