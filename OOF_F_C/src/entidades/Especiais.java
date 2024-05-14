/*NOMES: Thômas e Daniel
TURMA: 302 INFO

ESPECIAIS: Trata-se de uma enumeração para os especiais disponíveis ao usuário durante o combate.
 */
package entidades;

public enum Especiais {

    //Enumerações
    DUPLO_TWIST_CARPADO(1, "Duplo Twist Carpado",50, 20, 10),
    PATCHON(2, "Dedada no Olho",25, 12, 30),
    CONCHA_NO_OUVIDO(3, "Concha no Ouvido",18, 10, 35),
    MATA_LEAO(4, "Mata Leao",28, 14, 30),
    CHUTE_QUINTUPLO_AEREO(5, "Chute Quintuplo Aéreo",35, 17, 25);

    //Atributo referente ao dano do especial
    private int dano;
    //Atributo referente ao custo do especial
    private int custo;
    //Atributo referente a eficacia(%) do especial
    private int eficacia;
    //Atributo referente ao cod do golpe
    private int cod;
    //Atributo referente ao nome do especial
    private String nome;

    //Constutor com os parâmetros dano, custo e eficacia
    private Especiais(int cod, String nome, int dano, int custo, int eficacia) {
        this.dano = dano;
        this.custo = custo;
        this.eficacia = eficacia;
        this.cod = cod;
        this.nome = nome;
    }

    //Getter do dano do especial
    public int getDano() {
        return dano;
    }

    //Getter do custo do especial
    public int getCusto() {
        return custo;
    }

    //Getter da eficacia do especial
    public int getEficacia() {
        return eficacia;
    }

    //Getter do código do especial
    public int getCod() {
        return this.cod;
    }
    
    //Getter do nome do especial
    public String getNome() {
        return nome;
    }
    
    //toString do Especiais
    @Override
    public String toString() {
        return "Especial " + this.getNome() + " {Dano=" + this.dano + " | Custo=" + this.custo + " | Eficácia= " + this.eficacia + "}";
    }
}

