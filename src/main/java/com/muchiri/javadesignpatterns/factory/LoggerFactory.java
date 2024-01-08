/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.factory;

/**
 *
 * @author muchiri
 */
public class LoggerFactory {

    public static Logger createLogger(LoggerType logger) {
        switch (logger) {
            case CONSOLE:
                return new ConsoleLogger();
            case DATABASE:
                return new DatabaseLogger();
            case FILE:
                return new FileLogger();
            default:
                throw new IllegalArgumentException("No such logger type!");
        }
    }
}
