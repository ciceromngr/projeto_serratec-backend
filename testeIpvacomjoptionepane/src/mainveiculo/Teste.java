package mainveiculo;

import javax.swing.JOptionPane;

import veiculo.Ipva;

public class Teste {
    public static void main(String[] args) {
        String modelo;
        String placa;
        String combustivel;
        double valorVeiculo;
        double taxaLicenciamento;
        int desejaSair = 0;

        while(desejaSair == 0){
       
        modelo = (JOptionPane.showInputDialog(null, "Digite o Modelo"));
        placa = (JOptionPane.showInputDialog(null, "Digite a Placa"));
        combustivel = (JOptionPane.showInputDialog(null, "Digite o Combustivel"));
        valorVeiculo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do veiculo:"));
        taxaLicenciamento = Double.parseDouble(JOptionPane.showInputDialog(null,"Taxa de licenciamento para o veiculo :"));
        
        
        Ipva carro = new Ipva(modelo, placa, combustivel.toLowerCase(), valorVeiculo,taxaLicenciamento );
        JOptionPane.showMessageDialog(null,carro,"Veiculo",JOptionPane.DEFAULT_OPTION);
        carro.calculaIpva();

        desejaSair = JOptionPane.showConfirmDialog(null, "Deseja Continuar com a Consulta?");
    }


        

    }
}