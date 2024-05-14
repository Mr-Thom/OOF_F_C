/*NOMES: Thômas e Daniel
TURMA: 302 INFO

GOLPES_MAOS: Trata-se de uma enumeração para os golpes de mãos disponíveis ao usuário durante o combate.
 */
package entidades;

import java.util.HashMap;

public enum Socos {

    //Enumerações
    SOCO_PAIA(1,"Soco Paia",3, 2, 80),
    RETÃO_NO_QUEIXO(2,"Retão no Queixo",10, 5, 55),
    SOCO_DE_LADO(3,"Soco de Lado", 7, 4, 60),
    SOCO_NO_BUCHO(4,"Soco no Bucho",18, 12, 40),
    GANCHO(5,"Gancho",15, 10, 60);

    //Atributo referente ao dano do golpe
    private int dano;
    //Atributo referente ao custo do golpe
    private int custo;
    //Atributo referente a eficacia(%) do golpe
    private int eficacia;
    //Atributo referente ao código do golpe
    private int cod;
    //Atributo referente ao nome do golpe
    private String nome;
    
    //Constutor com os parâmetros dano, custo e eficacia
    private Socos(int cod, String nome, int dano, int custo, int eficacia) {
        this.dano = dano;
        this.custo = custo;
        this.eficacia = eficacia;
        this.cod = cod;
        this.nome = nome;
    }

    //Getter do dano do golpe
    public int getDano() {
        return this.dano;
    }

    //Getter do custo do golpe
    public int getCusto() {
        return this.custo;
    }

    //Getter da eficacia do golpe
    public int getEficacia() {
        return this.eficacia;
    }

    //Getter do código do golpe
    public int getCod() {
        return this.cod;
    }
    
    //Getter do nome do golpe
    public String getNome() {
        return nome;
    }
    
    //toString dos Golpes_Maos
    @Override
    public String toString() {
        return this.getNome() + " {Dano=" + this.dano + " | Custo=" + this.custo + " | Eficácia= " + this.eficacia + "}";
    }
}
