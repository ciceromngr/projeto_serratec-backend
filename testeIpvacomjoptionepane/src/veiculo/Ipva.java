package veiculo;

import javax.swing.JOptionPane;

public class Ipva extends Carro{
    private double valorIpva;
    private double taxaLicenciamento;

  
   
    public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
        super(modelo, placa, combustivel, valorVeiculo);
        this.taxaLicenciamento = taxaLicenciamento;
    }

    public double getValorIpva() {
        return valorIpva;
    }   

        public void calculaIpva() {
            
            if (combustivel.equals("gás")) {
            JOptionPane.showMessageDialog(null, "Valor do IPVA + Taxa "+taxaLicenciamento+" = "+((valorVeiculo * 0.01) + taxaLicenciamento));
            }else 
            
            if (combustivel.equals("flex")) {
                JOptionPane.showMessageDialog(null, "Valor do IPVA + Taxa "+taxaLicenciamento+" = "+((valorVeiculo * 0.03) + taxaLicenciamento));
            }else 
            
            
            if (combustivel.equals("gasolina")) {
                JOptionPane.showMessageDialog(null, "Valor do IPVA + Taxa "+taxaLicenciamento+" = "+((valorVeiculo * 0.04) + taxaLicenciamento));
            }
        }
}
    