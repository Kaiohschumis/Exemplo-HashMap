package com.company;

public class Programador extends Funcionario {
    private double auxilioEmocional;

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + auxilioEmocional;
    }

    public double getAuxilioEmocional() {
        return auxilioEmocional;
    }

    public void setAuxilioEmocional(double auxilioEmocional) {
        this.auxilioEmocional = auxilioEmocional;
    }
}
