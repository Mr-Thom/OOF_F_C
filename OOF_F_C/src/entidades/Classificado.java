/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author 08050520
 */
public class Classificado implements Comparable {

    private int posicao;
    private final String nome;
    private final int idade;
    private final Peso peso;
    private final int partidasJogadas;
    private final int partidasGanhas;
    private final int partidasPerdidas;

    public Classificado(String nome, int idade, int peso, int partidasJogadas, int partidasGanhas, int partidasPerdidas) {
        this.nome = nome;
        this.idade = idade;
        this.peso = definePeso(peso);
        if (partidasGanhas <= partidasJogadas && partidasPerdidas <= partidasJogadas && partidasGanhas + partidasPerdidas == partidasJogadas) {
            this.partidasJogadas = partidasJogadas;
            this.partidasGanhas = partidasGanhas;
            this.partidasPerdidas = partidasPerdidas;
        } else {
            throw new IllegalArgumentException("Erro no histórico do classificado");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int i) {
        this.posicao = i;
    }

    public int getIdade() {
        return idade;
    }

    public Peso getPeso() {
        return peso;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public int getPartidasGanhas() {
        return partidasGanhas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    private Peso definePeso(int peso) {
        for (Peso p : Peso.values()) {
            if (peso == p.getCod()) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nome + "(" + idade + " Anos & " + peso + ")  | " + partidasJogadas + "  partidas Jogadas | " + partidasGanhas + " partidas Ganhas | " + partidasPerdidas + " partidas Perdidas |";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + this.idade;
        hash = 29 * hash + Objects.hashCode(this.peso);
        hash = 29 * hash + this.partidasJogadas;
        hash = 29 * hash + this.partidasGanhas;
        hash = 29 * hash + this.partidasPerdidas;
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
        final Classificado other = (Classificado) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (this.partidasJogadas != other.partidasJogadas) {
            return false;
        }
        if (this.partidasGanhas != other.partidasGanhas) {
            return false;
        }
        if (this.partidasPerdidas != other.partidasPerdidas) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return this.peso == other.peso;
    }

    @Override
    public int compareTo(Object o) {
        Classificado c = (Classificado) o;

        if (this.getPartidasGanhas() > c.getPartidasGanhas()) {
            return -1;
        } else if (this.getPartidasGanhas() < c.getPartidasGanhas()) {
            return 1;
        } else if (this.getPartidasGanhas() == 0 && c.getPartidasGanhas() == 0) {
            if (this.getPartidasJogadas() < c.getPartidasJogadas()) {
                return 1;
            } else if (this.getPartidasJogadas() > c.getPartidasJogadas()) {
                return -1;
            } else return 1;
        } else if (this.getPartidasJogadas() == 0 || c.getPartidasJogadas() == 0) {
            return 1;
        } else if (this.getPartidasGanhas() / this.getPartidasJogadas() > c.getPartidasGanhas() / c.getPartidasJogadas()) {
            return -1;
        } else if (this.getPartidasGanhas() / this.getPartidasJogadas() < c.getPartidasGanhas() / c.getPartidasJogadas()) {
            return 1;
        } else {
            return 1;
        }

    }

}
