
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author desou
 */
public class Usuario {
   private String nome;
   private String cpf;
   private String telefone;

    public void cadastrarUsuario() {
       nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
       cpf = JOptionPane.showInputDialog("Digite o CPF do usuário:");
       telefone = JOptionPane.showInputDialog("Digite o telefone do usuário:");
   }
    public String mostrarDadosUsuario() {
       return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
   }
}