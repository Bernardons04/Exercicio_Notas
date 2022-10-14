package com.mycompany.exercicionotas;
import javax.swing.JOptionPane;
public class ClasseNotas {
    public static void calcularMedia(float mediaAritmetica, float mediaPonderada){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para calcular a Média Aritmética \ne 2 para calcular a Média Ponderada: "));
        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, "Você escolheu calcular a Média Aritmética! "
                    + "\nA Média Aritmética das notas que você nos informou é: " + mediaAritmetica);
            if (mediaAritmetica >= 7) {
                JOptionPane.showMessageDialog(null, "O aluno foi aprovado");
            } else {
                JOptionPane.showMessageDialog(null, "O aluno foi reprovado");
            }
        } else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, "Você escolheu calcular a Média Ponderada! "
                    + "\nA Média Ponderada das notas que você nos informou é: " + mediaPonderada);
            if (mediaPonderada >= 7) {
                JOptionPane.showMessageDialog(null, "O aluno foi aprovado");
            } else {
                JOptionPane.showMessageDialog(null, "O aluno foi reprovado");
            }
        }
    }
}
