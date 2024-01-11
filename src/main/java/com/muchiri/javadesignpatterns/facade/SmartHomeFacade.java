/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.facade;

/**
 *
 * @author muchiri
 */
public class SmartHomeFacade {

    private final Lighting lighting;
    private final MusicSystem musicSystem;
    private final ClimateControl climateControl;

    public SmartHomeFacade() {
        this.lighting = new Lighting();
        this.musicSystem = new MusicSystem();
        this.climateControl = new ClimateControl();
    }

    public void startEveningRoutine(int degrees) {
        System.out.println("Starting evening routine...");
        lighting.on();
        musicSystem.playMusic();
        climateControl.setTemparature(degrees);
    }

    public void endEveningRoutine() {
        System.out.println("Ending evening routine...");
        lighting.off();
        musicSystem.stopMusic();
    }

}
