/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author desou
 */
public class Main {
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        aluguel.iniciarAluguel();
        aluguel.fecharLocacao();
        aluguel.mostrarResumoLocacao(aluguel.getUsuario(), aluguel.getCarro());     
   }
}