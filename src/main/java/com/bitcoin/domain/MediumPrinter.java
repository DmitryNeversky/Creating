package com.bitcoin.domain;

public class MediumPrinter implements UpgradeStrategy{

    @Override
    public double upgradeIncome(double income) {
        return income * 1.5;
    }

    @Override
    public int upgradeSpeed(int speed) {
        return speed - 40;
    }

    @Override
    public int upgradeCooler(int cooler) {
        return cooler + 4 ;
    }

    @Override
    public int upgradeCharge(int charge) {
        return charge + 200;
    }

    @Override
    public double upIncomePrice(double incomePrice) {
        return 0;
    }

    @Override
    public double upSpeedPrice(double speedPrice) {
        return 0;
    }
}
