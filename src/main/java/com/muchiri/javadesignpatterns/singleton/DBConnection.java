/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.singleton;

/**
 *
 * @author muchiri
 */
public class DBConnection {

    private static DBConnection instance;

    public static DBConnection getInstance() {
        if (instance == null) {
            System.out.println("creating a new instance...");
            instance = new DBConnection();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Database successfully connected!");
    }

}
