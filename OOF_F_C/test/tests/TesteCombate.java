/*NOMES: Thômas e Daniel
TURMA: 302 INFO

TESTCOMBATE: Uma classe de teste para a classe Combate.
 */
package tests;

import entidades.*;
import controle.Combate;
import entidades.Historico;
import java.util.Scanner;

public class TesteCombate {

    public static void main(String[] args) {

        int fechamento = 1;
        Scanner teclado = new Scanner(System.in);
        Historico h = new Historico();
        Personagem p = new Personagem("João", 18, 50, 1, h);
        Combate o = new Combate(p);

        while (fechamento != 0) {

            System.out.println("-------------------");
            System.out.print("\nSAIR = 0");
            System.out.print("\nSOCOS = 1");
            System.out.print("\nCHUTES = 2");
            System.out.print("\nDEFENDER = 3");
            System.out.print("\nPULAR TURNO = 4");
            System.out.print("\nINFORMAÇÕES = 5");
            System.out.println("\nESPECIAIS = 6");
            System.out.print("\n-------------------");

            int escolha = teclado.nextInt();

            if (escolha == 1) {

                System.out.print("\n" + Socos.SOCO_PAIA.toString() + " ---> DIGITE '1' PARA ESTE GOLPE");
                System.out.print("\n" + Socos.RETÃO_NO_QUEIXO.toString() + " ---> DIGITE '2' PARA ESTE GOLPE");
                System.out.print("\n" + Socos.SOCO_DE_LADO.toString() + " ---> DIGITE '3' PARA ESTE GOLPE");
                System.out.print("\n" + Socos.SOCO_NO_BUCHO.toString() + " ---> DIGITE '4' PARA ESTE GOLPE");
                System.out.print("\n" + Socos.GANCHO.toString() + " ---> DIGITE '5' PARA ESTE GOLPE");

                int escolha2 = teclado.nextInt();

                System.out.println(o.golpesMaosDoUser(escolha2));
            }
            if (escolha == 2) {

                System.out.print("\n" + Chutes.CHUTE_PAIA.toString() + " ---> DIGITE '1' PARA ESTE GOLPE");
                System.out.print("\n" + Chutes.BICO.toString() + " ---> DIGITE '2' PARA ESTE GOLPE");
                System.out.print("\n" + Chutes.VOADORA.toString() + " ---> DIGITE '3' PARA ESTE GOLPE");
                System.out.print("\n" + Chutes.VOADORA_DE_DOIS_PÉS.toString() + " ---> DIGITE '4' PARA ESTE GOLPE");
                System.out.print("\n" + Chutes.RAPÃO_DE_BRIGADIANO.toString() + " ---> DIGITE '5' PARA ESTE GOLPE");

                int escolha2 = teclado.nextInt();

                System.out.println(o.golpePesDoUser(escolha2));
            }
            if (escolha == 3) {

                System.out.println(o.defender());

            }
            if (escolha == 4) {

                System.out.println(o.pularTurno());

            }
            if (escolha == 5) {

                System.out.println("VIDA DO USER:" + o.getVidaUser());
                System.out.println("VIDA DO ADVERSARIO:" + o.getVidaAdversario());
                System.out.println("ENERGIA:" + o.getEnergia());
                System.out.println("PARTIDA JOGADA:" + h.getPartidasJogadas());
                System.out.println("PARTIDA GANHA:" + h.getPartidasGanhas());
                System.out.println("PARTIDA PERDIDA:" + h.getPartidasPerdidas());

            }
            if (escolha == 6) {

                System.out.print("\n" + Especiais.DUPLO_TWIST_CARPADO.toString() + " ---> DIGITE '1' PARA ESTE ESPECIAL");
                System.out.print("\n" + Especiais.PATCHON.toString() + " ---> DIGITE '2' PARA ESTE ESPECIAL");
                System.out.print("\n" + Especiais.CONCHA_NO_OUVIDO.toString() + " ---> DIGITE '3' PARA ESTE ESPECIAL");
                System.out.print("\n" + Especiais.MATA_LEAO.toString() + " ---> DIGITE '4' PARA ESTE ESPECIAL");
                System.out.print("\n" + Especiais.CHUTE_QUINTUPLO_AEREO.toString() + " ---> DIGITE '5' PARA ESTE ESPECIAL");

                int escolha2 = teclado.nextInt();

                System.out.println(o.EspeciaisDoUser(escolha2));
            }
        }

    }

}
