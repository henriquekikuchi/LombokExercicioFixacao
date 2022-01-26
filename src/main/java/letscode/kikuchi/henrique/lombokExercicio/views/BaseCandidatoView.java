package letscode.kikuchi.henrique.lombokExercicio.views;

import letscode.kikuchi.henrique.lombokExercicio.domain.BaseCandidato;
import letscode.kikuchi.henrique.lombokExercicio.enums.Raca;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class BaseCandidatoView {
    private String nome;
    private int idade;
    private float peso;
    private Raca raca;

    public BaseCandidato criarCandidato(){
        askNome();
        askIdade();
        askPeso();
        askRaca();
        BaseCandidato candidato = new BaseCandidato(nome, idade, peso, raca);
        return candidato;
    }

    public void askNome(){
        System.out.println("Qual é o seu nome?");
        nome = new Scanner(System.in).nextLine();
    }

    public void askIdade(){
        System.out.println("Qual a sua idade?");
        idade = new Scanner(System.in).nextInt();
    }

    public void askPeso(){
        System.out.println("Qual o seu peso");
        peso = new Scanner(System.in).nextFloat();
    }

    public void askRaca(){
        System.out.println("Escolha o numero correspondente a sua raça?");
        for (Raca r : Raca.values()){
            System.out.printf("%d : %s%n", r.ordinal(), r.name());
        }
        int numRaca = new Scanner(System.in).nextInt();
        if (numRaca >= 0 && numRaca < Raca.values().length) raca = Raca.values()[numRaca];
        else askRaca();
    }
}
