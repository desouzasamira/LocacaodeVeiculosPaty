
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author desou
 */
public class Carro {
    private String modelo;
    private String marca;
    private double valorPorKm;
    
    public void cadastrarCarro() {
        modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        marca = JOptionPane.showInputDialog("Digite a marca do carro:");
        valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por Km do carro:"));
   }
    public String mostrarDadosCarro() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nValor por Km: " + valorPorKm;
   }

    double getValorPorKm() {
        return valorPorKm;
    }
}