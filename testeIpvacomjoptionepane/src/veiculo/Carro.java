package veiculo;

public class Carro {
    protected String modelo;
    protected String placa;
    protected String combustivel;
    protected double valorVeiculo;

    
    public Carro(String modelo, String placa, String combustivel, double valorVeiculo) {
        this.modelo = modelo;
        this.placa = placa;
        this.combustivel = combustivel;
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public String toString() {
        return "modelo: " + modelo + "\ncombustivel: " + combustivel + "\nplaca: " + placa + "\nvalorVeiculo: "
                + valorVeiculo;
    }
   
    /**
     * @param valorVeiculo the valorVeiculo to set
     */

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }
     
}