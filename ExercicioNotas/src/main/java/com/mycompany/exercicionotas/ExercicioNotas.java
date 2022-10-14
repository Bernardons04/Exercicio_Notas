/*2. Elabore um programa em JAVA utilizando a estrutura de repetição
FOR para entrar com 4 notas e a opção da média (aritmética ou
ponderada). Para média ponderada das notas, as duas primeiras
notas tem peso 2 e a duas últimas tem peso 3. Exiba ao final,
conforme a seleção a média. E, exiba uma mensagem caso o aluno
foi aprovado ou não, considerando que a média de corte seja maior
ou igual a 7.*/

package com.mycompany.exercicionotas;
import javax.swing.JOptionPane;
public class ExercicioNotas {
    public static void main(String[] args) {
        float nota[] = new float [4];
        int p;
        for (int c = 0; c <= nota.length-1; c++) {
            p = c + 1;
            nota[c] = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + p + "ª nota: "));
        }
        float mediaAritmetica = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;
        float mediaPonderada = (nota[0]*2 + nota[1]*2 + nota[2]*3 + nota[3]*3) / 10;
        int option;
        
        ClasseNotas.calcularMedia(mediaAritmetica, mediaPonderada);
    }
}
