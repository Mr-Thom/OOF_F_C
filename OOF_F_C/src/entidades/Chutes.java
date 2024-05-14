/*NOMES: Thômas e Daniel
TURMA: 302 INFO

GOLPES_PES: Trata-se de uma enumeração para os golpes de pés disponíveis ao usuário durante o combate.
 */
package entidades;

public enum Chutes {

    //Enumerações
    CHUTE_PAIA(1,"Chute Paia", 4, 3, 75),
    BICO(2,"Bico", 7, 4, 60),
    VOADORA(3,"Voadora", 18, 10, 40),
    VOADORA_DE_DOIS_PÉS(4,"Voadora de Dois Pés", 38, 18, 30),
    RAPÃO_DE_BRIGADIANO(5,"Rapão de Brigadiano", 14, 8, 50);

    //Atributo referente ao dano do golpe
    private int dano;
    //Atributo referente ao custo do golpe
    private int custo;
    //Atributo referente a eficacia(%) do golpe
    private int eficacia;
    //Atributo referente ao cod do golpe
    private int cod;
    //Atributo referente ao nome do golpe
    private String nome;

    //Constutor com os parâmetros dano, custo e eficacia
    private Chutes(int cod, String nome, int dano, int custo, int eficacia) {
        this.dano = dano;
        this.custo = custo;
        this.eficacia = eficacia;
        this.cod = cod;
        this.nome = nome;
    }

    //Getter do dano do golpe
    public int getDano() {
        return dano;
    }

    //Getter do custo do golpe
    public int getCusto() {
        return custo;
    }

    //Getter da eficacia do golpe
    public int getEficacia() {
        return eficacia;
    }

    //Getter do código do golpe
    public int getCod() {
        return this.cod;
    }
    
    //Getter do nome do golpe
    public String getNome() {
        return nome;
    }
    
    //toString dos Golpes_Pes
    @Override
    public String toString() {
        return this.getNome() + " {Dano=" + this.dano + " | Custo=" + this.custo + " | Eficácia= " + this.eficacia + "}";
    }
    
}

