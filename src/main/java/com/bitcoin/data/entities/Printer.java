package com.bitcoin.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Printer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private byte lvl;

    private double income;
    private int speed;
    private int cooler;
    private int memory;

    public Printer(){}

    public byte getLvl() {
        return lvl;
    }

    public void setLvl(byte lvl) {
        this.lvl = lvl;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCooler() {
        return cooler;
    }

    public void setCooler(int cooler) {
        this.cooler = cooler;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}