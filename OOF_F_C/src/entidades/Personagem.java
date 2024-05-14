/*NOMES: Thômas e Daniel
TURMA: 302 INFO

PERSONAGEM: Classe responsável por reunir as informações e o histórico do personagem criado pelo usuário
 */
package entidades;

import java.util.Objects;

public class Personagem implements Comparable {

    //Atributo referente ao id do personagem
    private int id;
    //Atributo referente ao nome do personagem
    private final String nome;
    //Atributo referente a idade do personagem
    private int idade;
    //Atributo referente a categoria de Peso do personagem
    private final Peso peso;
    //Atributo referente ao código do avatar do personagem
    private final int cod_avatar;
    //Atributo referente a aposentadoria do personagem
    private boolean aposentado;
    //Atributo referebte ao histórico do personagem (partidas jogadas, ganhas e perdidas)
    private final Historico historico;

    //Construtor que possui como parâmetro as classes Informações e Histórico
    public Personagem(String nome, int idade, double peso, int cod_avatar, Historico historico) {

        //Teste para valor nulo do parâmetro "nome"
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        //Teste pra verificar se o nome do Usário tem ao mínimo 1 caracter e se este não é um espaço
        if (nome.length() < 1 || nome.charAt(0) == ' ') {
            throw new IllegalArgumentException("O nome deve começar e conter no mínimo uma letra");
        }
        //Teste para verificar se o parâmetro "nome" é composto apenas por letras e espaços em branco
        for (int i = 0; i < nome.length(); i++) {
            if (!Character.isLetter(nome.charAt(i))) {
                if (nome.charAt(i) != ' ') {
                    throw new IllegalArgumentException("O nome deve conter somente letras e não numeros ou caracteres especiais");
                }
            }
        }
        this.nome = nome;
        this.setIdade(idade);
        if (peso < 40 || peso > 120.2) {
            throw new IllegalArgumentException("O peso deve ser entre 40 Kilogramas e 120.2 Kilogramas");
        }
        this.peso = this.definePeso(peso);
        //Teste para intervalo de valores para o parâmetro "cod_avatar"
        if (cod_avatar < 1 || cod_avatar > 8) {
            throw new IllegalArgumentException("Cód de avatar inválido");
        }
        this.cod_avatar = cod_avatar;

        //O personagem inicia com a aposentadoria igual a "false"
        this.aposentado = false;
        //Teste para valor nulo do parâmetro "historico"
        Objects.requireNonNull(historico, "Historico nulo");
        this.historico = historico;
    }

    //Construtor que possui como parâmetro as classes Informações e Histórico
    public Personagem(String nome, int idade, int peso, int cod_avatar, Historico historico) {

        //Teste para valor nulo do parâmetro "nome"
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        //Teste pra verificar se o nome do Usário tem ao mínimo 1 caracter e se este não é um espaço
        if (nome.length() < 1 || nome.charAt(0) == ' ') {
            throw new IllegalArgumentException("O nome deve começar e conter no mínimo uma letra");
        }
        //Teste para verificar se o parâmetro "nome" é composto apenas por letras e espaços em branco
        for (int i = 0; i < nome.length(); i++) {
            if (!Character.isLetter(nome.charAt(i))) {
                if (nome.charAt(i) != ' ') {
                    throw new IllegalArgumentException("O nome deve conter somente letras e não numeros ou caracteres especiais");
                }
            }
        }
        this.nome = nome;
        this.setIdade(idade);
        this.peso = this.definePeso(peso);
        //Teste para intervalo de valores para o parâmetro "cod_avatar"
        if (cod_avatar < 1 || cod_avatar > 8) {
            throw new IllegalArgumentException("Cód de avatar inválido");
        }
        this.cod_avatar = cod_avatar;

        //O personagem inicia com a aposentadoria igual a "false"
        this.aposentado = false;
        //Teste para valor nulo do parâmetro "historico"
        Objects.requireNonNull(historico, "Historico nulo");
        this.historico = historico;
    }

    //Getter do nome do personagem
    public String getNome() {
        return this.nome;
    }

    //Getter da idade do personagem
    public int getIdade() {
        return this.idade;
    }

    //Getter do peso do personagem
    public Peso getPeso() {
        return this.peso;
    }

    //Setter da idade do personagem, havendo teste de valores entre 18 e 45
    public void setIdade(int idade) {
        if (idade < 18 || idade > 45) {
            throw new IllegalArgumentException("Idade não pode ser inferior a 18 anos e nem superio a 45 anos");
        }
        this.idade = idade;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    //Método para definir a categoria de peso do personagem
    private Peso definePeso(double peso) {
        if (peso < 40 || peso > 120.2) {
            throw new IllegalArgumentException("O peso deve ser entre 40 Kilogramas e 120.2 Kilogramas");
        }
        for (Peso p : Peso.values()) {
            if (peso >= p.getMinimo() && peso <= p.getMaximo()) {
                return p;
            }
        }
        return null;
    }

    //Método para definir a categoria de peso do personagem pelo cod
    private Peso definePeso(int peso) {
        for (Peso p : Peso.values()) {
            if (peso == p.getCod()) {
                return p;
            }
        }
        return null;
    }

    //Getter do id do personagem
    public int getId() {
        return id;
    }

    //Getter do código do avatar do personagem
    public int getCod_avatar() {
        return cod_avatar;
    }

    //Getter do atributo aposentado
    public boolean isAposentado() {
        return aposentado;
    }

    //Método para aposentar o personagem 
    public void Aposentar() {
        this.aposentado = true;
    }

    //Getter do histórico do personagem
    public Historico getHistorico() {
        return historico;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + this.idade;
        hash = 73 * hash + Objects.hashCode(this.peso);
        hash = 73 * hash + this.cod_avatar;
        hash = 73 * hash + (this.aposentado ? 1 : 0);
        hash = 73 * hash + Objects.hashCode(this.historico);
        return hash;
    }

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
        final Personagem other = (Personagem) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        if (this.cod_avatar != other.cod_avatar) {
            return false;
        }
        if (this.aposentado != other.aposentado) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.peso != other.peso) {
            return false;
        }
        return Objects.equals(this.historico, other.historico);
    }

    @Override
    public String toString() {
        return this.getNome() + " (" + this.getIdade() + "Anos | Peso " + this.getPeso().getNome()
                + " | Partidas Jogadas: " + this.getHistorico().getPartidasJogadas() + " | Partidas Ganhas: "
                + this.getHistorico().getPartidasGanhas() + " | Partidas Perdidas: " + this.getHistorico().getPartidasPerdidas();
    }

    @Override
    public int compareTo(Object o) {
        Personagem p = (Personagem) o;

        if (this.getHistorico().getPartidasGanhas() > p.getHistorico().getPartidasGanhas()) {
            return 1;
        } else if (this.getHistorico().getPartidasGanhas() < p.getHistorico().getPartidasGanhas()) {
            return -1;
        } else if (this.getHistorico().getPartidasGanhas() / this.getHistorico().getPartidasJogadas() > p.getHistorico().getPartidasGanhas() / p.getHistorico().getPartidasJogadas()){
            return 1;
        } else if (this.getHistorico().getPartidasGanhas() / this.getHistorico().getPartidasJogadas() < p.getHistorico().getPartidasGanhas() / p.getHistorico().getPartidasJogadas()){
            return -1;
        } else return 0;

    }

}
