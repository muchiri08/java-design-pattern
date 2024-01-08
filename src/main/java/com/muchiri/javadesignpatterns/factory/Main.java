/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.factory;

/**
 *
 * @author muchiri
 */
public class Main {

    public static void main(String[] args) {
        Logger console = LoggerFactory.createLogger(LoggerType.CONSOLE);
        console.log("my message");

        Logger file = LoggerFactory.createLogger(LoggerType.FILE);
        file.log("my message");

        Logger db = LoggerFactory.createLogger(LoggerType.DATABASE);
        db.log("my message");
    }
}
