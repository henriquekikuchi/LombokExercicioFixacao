package letscode.kikuchi.henrique.lombokExercicio;

import letscode.kikuchi.henrique.lombokExercicio.domain.BaseCandidato;
import letscode.kikuchi.henrique.lombokExercicio.domain.InteligenciaCentral;
import letscode.kikuchi.henrique.lombokExercicio.views.BaseCandidatoView;

import java.util.Scanner;

public class LombokExercicioApplication {
    public static void main(String[] args) {
        BaseCandidatoView baseCandidatoView = new BaseCandidatoView();
        InteligenciaCentral inteligenciaCentral = new InteligenciaCentral();

        String cadastrarNovoCandidato = "s";
        do {
            System.out.println("**********Cadastro de novo candidato**********\n");
            BaseCandidato candidato = baseCandidatoView.criarCandidato();
            inteligenciaCentral.addCandidato(candidato);
            System.out.println("Deseja adicionar mais candidatos? [S/N]");
            cadastrarNovoCandidato = new Scanner(System.in).nextLine();
        } while (cadastrarNovoCandidato.equalsIgnoreCase("s"));

        System.out.println("Imprimindo candidados aprovados...");
        inteligenciaCentral.imprimirAprovados();
        System.out.println("Impresso com sucesso!!");
    }
}
