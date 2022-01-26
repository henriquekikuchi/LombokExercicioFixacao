package letscode.kikuchi.henrique.lombokExercicio.domain;

import letscode.kikuchi.henrique.lombokExercicio.enums.Raca;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseCandidato {
    private String nome;
    private int idade;
    private double peso;
    private Raca raca;

    public String prepararParaImpressao(){
        return nome + ";" + idade + ";" + peso + ";" + raca.name();
    }
}
