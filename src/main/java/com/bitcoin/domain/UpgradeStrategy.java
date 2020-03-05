package com.bitcoin.domain;

public interface UpgradeStrategy {
    double upgradeIncome(double income);
    int upgradeSpeed(int speed);
    int upgradeCooler(int cooler);
    int upgradeCharge(int charge);
}
