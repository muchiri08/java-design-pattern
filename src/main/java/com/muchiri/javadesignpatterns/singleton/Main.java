/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.singleton;

/**
 *
 * @author muchiri
 */
public class Main {

    public static void main(String[] args) {
        /*
        * I am doing this silly thing because I have time to do it LOL.
        * The main aim was to see the different threads accessing the
        * DBConnection class and if the msg inside the == null condition
        * is printed more than once then the DBConnection would not be singleton
         */

        DBConnection dbc = DBConnection.getInstance();
        dbc.connect();

        Runnable r1 = () -> {
            DBConnection dbc1 = DBConnection.getInstance();
            dbc1.connect();
        };

        Runnable r2 = () -> {
            DBConnection dbc1 = DBConnection.getInstance();
            dbc1.connect();
        };

        Thread thr1 = new Thread(r1);
        thr1.start();
        Thread thr2 = new Thread(r2);
        thr2.start();
    }
}
