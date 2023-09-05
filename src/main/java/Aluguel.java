
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author desou
 */
public class Aluguel {
    private int quantidadeDias;
    private double kmInicial;
    private double kmFinal;
    private double valorTotalAluguel;
    private Usuario usuario;
    private Carro carro;
    
    public Aluguel() {
        usuario = new Usuario();
        carro = new Carro();
    }
    public void iniciarAluguel() {
        usuario.cadastrarUsuario();
        carro.cadastrarCarro();
        quantidadeDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias de aluguel:"));
        kmInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o Km inicial do veículo:"));
   }
    public void fecharLocacao() {
        kmFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite o Km final do veículo:"));
        double valorBase = quantidadeDias * (kmFinal - kmInicial) * carro.getValorPorKm();
        if (quantidadeDias > 20) {
            valorBase = valorBase * 0.8;  // Desconto de 20%
        } else if (quantidadeDias > 10) {
            valorBase = valorBase * 0.9;  // Desconto de 10%
        } else if (quantidadeDias <= 10) {
            valorBase = valorBase;
        }
        valorTotalAluguel = valorBase;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Carro getCarro() {
        return carro;
    }
    public void mostrarResumoLocacao(Usuario usuario, Carro carro) {
    JOptionPane.showMessageDialog(null,
          "Resumo Aluguel\n" +
          "Cliente\n" + "\n" + usuario.mostrarDadosUsuario() + "\n" + "\n" +
          "Carro\n" + "\n" + carro.mostrarDadosCarro() + "\n" + "\n" +
          "Aluguel\n" + "\n" +
          "Quantidade de dias: " + quantidadeDias + "\n" +
          "Km Inicial: " + kmInicial + "\n" +
          "Km Final: " + kmFinal + "\n" +
          "Valor Total: R$" + valorTotalAluguel);
}
}