/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muchiri.javadesignpatterns.builder;

import java.util.ArrayList;

/**
 *
 * @author muchiri
 */
public class MessageBuilder {

    private Integer length;
    private ArrayList<String> messages;

    public MessageBuilder() {
        this.length = 0;
        this.messages = new ArrayList<>();
    }

    public void append(String message) {
        this.length++;
        this.messages.add(message);
    }

    public int length() {
        return this.length;
    }

    @Override
    public String toString() {
        return "MessageBuilder [messages=" + messages + "]";
    }

}
