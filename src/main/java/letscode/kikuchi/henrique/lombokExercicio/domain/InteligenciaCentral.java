package letscode.kikuchi.henrique.lombokExercicio.domain;

import lombok.Cleanup;
import lombok.Data;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Data
public class InteligenciaCentral {
    private List<BaseCandidato> aprovados = new ArrayList<BaseCandidato>();

    public void addCandidato(BaseCandidato candidato){
        if (isAprovado(candidato)) aprovados.add(candidato);
    }

    private boolean isAprovado(BaseCandidato candidato){
        boolean resultado =
                    candidato.getRaca().name().equalsIgnoreCase("Humano") ||
                    candidato.getRaca().name().equalsIgnoreCase("Gree") ||
                    candidato.getRaca().name().equalsIgnoreCase("Rakata");
        return resultado;
    }

    public void imprimirAprovados(){
        @Cleanup PrintWriter writer = null;
        try {
            writer = new PrintWriter("aprovados.csv", "UTF-8");
            writer.println("nome;idade;peso;raca");
            for (BaseCandidato candidato : aprovados) {
                writer.println(candidato.prepararParaImpressao());
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
