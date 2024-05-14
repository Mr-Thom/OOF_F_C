/*NOMES: Thômas e Daniel
TURMA: 302 INFO

PESO: Trata-se de uma enumeração para os pesos disponíveis ao usuário para criar o seu personagem.
 */
package entidades;

public enum Peso {

    //Enumerações
    PALHA(1, "Palha", 40, 52.1),
    MOSCA(2, "Mosca", 52.2, 56.7),
    GALO(3, "Galo", 56.8, 61.2),
    PENA(4, "Pena", 61.3, 65.7),
    LEVE(5, "Leve", 65.8, 70.3),
    MEIO_MEDIO(6, "Meio Médio", 70.4, 77.1),
    MEDIO(7, "Médio", 77.2, 83.9),
    MEIO_PESADO(8, "Meio Pesado", 84.0, 92.9),
    PESADO(9, "Pesado", 93.0, 120.2);

    //Atributo referente a pesagem mínima à categoria de peso
    private double minimo;
    //Atributo referente a pesegem máxima à categoria de peso
    private double maximo;
    //Atributo referente ao nome do Peso
    private String nome;
    //Atributo referente ao cod do Peso
    private int cod;

    //Construtor com os parâmetros de peso mínimo e máximo
    private Peso(int cod, String nome, double minimo, double maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.nome = nome;
        this.cod = cod;
    }

    //Getter do peso mínimo
    public double getMinimo() {
        return minimo;
    }

    //Getter do peso máximo
    public double getMaximo() {
        return maximo;
    }

    //Getter do nome
    public String getNome() {
        return nome;
    }

    //Getter do cod
    public int getCod() {
        return cod;
    }

    //toString dos Pesos
    @Override
    public String toString() {
        return "Peso " + this.getNome();
    } //+ "{Mínimo=" + this.minimo + "Kg e Máximo=" + this.maximo + "Kg}"
}
