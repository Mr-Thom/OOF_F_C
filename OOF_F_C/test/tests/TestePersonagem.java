/*NOMES: Thômas e Daniel
TURMA: 302 INFO

TESTPERSONAGEM: Uma classe de teste para as classes Personagem, Histórico e Informacoes.
 */
package tests;

import entidades.*;

public class TestePersonagem {

    public static void main(String[] args) {
        Historico h1 = new Historico();
        Historico h2 = new Historico();

        Personagem p1 = new Personagem("João da Silva", 18, 45, 1, h1);
        Personagem p2 = new Personagem("Maria", 40, 70, 2, h2);

        //Getters
        /*
        System.out.println(p1.getId() == 0);
        System.out.println(p2.getId() == 1);
        System.out.println(p1.getHistorico().getPartidasGanhas() == 0);
        System.out.println(p1.getHistorico().getPartidasJogadas() == 0);
        System.out.println(p1.getHistorico().getPartidasPerdidas() == 0);
        System.out.println(p1.getHistorico().getId() == 0);
        System.out.println(p2.getHistorico().getPartidasGanhas() == 0);
        System.out.println(p2.getHistorico().getPartidasJogadas() == 0);
        System.out.println(p2.getHistorico().getPartidasPerdidas() == 0);
        System.out.println(p2.getHistorico().getId() == 1);
        System.out.println(p1.getHistorico().ID() == 2);
        System.out.println(p2.getHistorico().ID() == 2);
        System.out.println(p1.getCod_avatar() == 1);
        System.out.println(p1.getNome().equals("João da Silva"));
        System.out.println(p1.getIdade() == 18);
        System.out.println(p1.getPeso().equals(Peso.PALHA));
        System.out.println(p1.isAposentado() == false);
        System.out.println(p1.getId() == 0);
        System.out.println(p2.getCod_avatar() == 2);
        System.out.println(p2.getNome().equals("Maria"));
        System.out.println(p2.getIdade() == 40);
        System.out.println(p2.getPeso().equals(Peso.LEVE));
        System.out.println(p2.getId() == 1);
        System.out.println(p2.isAposentado() == false);
        */
        
        //Erros
        
        //Personagem p3 = new Personagem("18", 18, 50, 1, h1);
        //Personagem p4 = new Personagem("$%", 18, 50, 1, h1);
        //Personagem p5 = new Personagem("João", 17, 50, 1, h1);
        //Personagem p6 = new Personagem("João", 46, 50, 1, h1);
        //Personagem p7 = new Personagem("João", 18, 0, 1, h1);
        //Personagem p8 = new Personagem("João", 18, 120.3, 1, h1);
        //Personagem p9 = new Personagem("João", 18, 50, 0, h1);
        //Personagem p10 = new Personagem("João", 18, 50, 9, h1);
        //Personagem p11 = new Personagem("", 18, 50, 1, h1);
        //Personagem p12 = new Personagem(" ", 18, 50, 1, h1);
        //Personagem p14 = new Personagem ("João da Silva", 18, 45, 1, null);
        //Personagem p15 = new Personagem(null, 18, 45, 1, h1);

        
        //Métodos
        
        /*
        p1.setIdade(20);
        System.out.println(p1.getIdade() == 20);
        p1.Aposentar();
        System.out.println(p1.isAposentado() == true);
        p1.getHistorico().partidaJogada();
        p1.getHistorico().partidaJogada();
        p1.getHistorico().partidaJogada();
        p1.getHistorico().partidaGanha();
        p1.getHistorico().partidaGanha();
        p1.getHistorico().partidaPerdida();
        System.out.println(p1.getHistorico().getPartidasJogadas() == 3);
        System.out.println(p1.getHistorico().getPartidasGanhas() == 2);
        System.out.println(p1.getHistorico().getPartidasPerdidas() == 1);
         */
        
    }

}
