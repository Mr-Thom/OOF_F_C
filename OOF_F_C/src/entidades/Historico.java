/*NOMES: Thômas e Daniel
TURMA: 302 INFO

HISTORICO: Trata-se da classe responsável pela manipulação do histórico de partidas jogadas por um personagem.
Nela, há a manipulação e o salvamento das partidas jogadas, ganhas e pertidas de um determinado personagem do usuário.
 */
package entidades;

public class Historico {

    //Atributo referente ao id do personagem
    private int id;
    //Atributo referente ao número de partidas jogadas pelo personagem
    private int partidasJogadas;
    //Atributo referente ao número de partidas ganhas jogadas pelo personagem
    private int partidasGanhas;
    //Atributo referente ao número de partidas perdidas jogadas pelo personagem
    private int partidasPerdidas;

    //Construtor sem parâmetro, onde inicializa todos os atributos com o valor inteiro de 0
    public Historico() {
        this.partidasGanhas = 0;
        this.partidasJogadas = 0;
        this.partidasPerdidas = 0;
    }

    //Construtor sem parâmetro, onde inicializa todos os atributos com o valor inteiro de 0
    public Historico(int g, int p, int j) {
        this.partidasGanhas = g;
        this.partidasJogadas = j;
        this.partidasPerdidas = p;
    }

    //Getter do número de partidas jogadas
    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    //Método que adiciona uma partida jogada ao histórico
    public void partidaJogada() {
        this.partidasJogadas++;
    }

    //Getter do número de partidas ganhas
    public int getPartidasGanhas() {
        return partidasGanhas;
    }

    //Método que adiciona uma partida ganha ao histórico
    public void partidaGanha() {
        this.partidasGanhas++;
    }

    //Getter do número de partidas perdidas
    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    //Método que adiciona uma partidida perdida ao histórico
    public void partidaPerdida() {
        this.partidasPerdidas++;
    }

    //Getter do id do Historico
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    //hashCode do Historico
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.partidasJogadas;
        hash = 37 * hash + this.partidasGanhas;
        hash = 37 * hash + this.partidasPerdidas;
        return hash;
    }

    //Equals do Historico
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Historico other = (Historico) obj;
        if (this.partidasJogadas != other.partidasJogadas) {
            return false;
        }
        if (this.partidasGanhas != other.partidasGanhas) {
            return false;
        }
        return this.partidasPerdidas == other.partidasPerdidas;
    }

    //toString do Historico
    @Override
    public String toString() {
        return "Histórico de " + this.getPartidasJogadas() + "partidas Jogadas (" + this.getPartidasGanhas() + " partidas Ganhas e " + this.getPartidasPerdidas() + " partidas Perdidas)";
    }
}
