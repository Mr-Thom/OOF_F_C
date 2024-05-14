/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import entidades.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import persistencia.*;

/**
 *
 * @author Usuario
 */
public class TesteBancoDeDados {

    public static void main(String[] args) {

        Historico historico = new Historico();

        /*try {
            Personagem p1 = new Personagem("fernando", 19, 93.00, 5, historico);
            PersonagemDAO p = PersonagemDAO.getInstance();
            p.inserir(p1);
            System.out.println(p1);
        } catch (Exception e) {
            System.out.println("Moio =" + e);
        }*/
        /*try {
            PersonagemDAO p = PersonagemDAO.getInstance();
            Personagem p1 = (Personagem) p.pesquisar("35");
            //p1.Aposentar();
            //p.editar(p1);
            System.out.println(p1);
        } catch (Exception e) {
            System.out.println("Moio =" + e);
        }*/
        /*try {
            PersonagemDAO p = PersonagemDAO.getInstance();
            p.excluir("33");
        } catch (Exception e) {
            System.out.println("Moio =" + e);
        }*/
        /*try {
            PersonagemDAO p = PersonagemDAO.getInstance();
            ArrayList<Personagem> array = p.pesquisarTudo();
            Iterator i = array.iterator();
            while (i.hasNext()){
                Personagem p1 = (Personagem) i.next();
                System.out.println(p1);
            }
        } catch (Exception e) {
            System.out.println("Moio =" + e);
        }*/
        /*try {
            ClassificacaoDAO c = ClassificacaoDAO.getInstance();
            Classificado c1 = new Classificado("Furao", 45, 7, 1, 0, 1);
            System.out.println(c.inserir(c1));
        } catch (Exception e) {
            System.out.println("Moio =" + e);
        }*/
        try {
            ClassificacaoDAO c = ClassificacaoDAO.getInstance();
            TreeSet<Classificado> tree = new TreeSet(c.pesquisarTudo());
            Iterator i = tree.iterator();
            while (i.hasNext()){
                Classificado p1 = (Classificado) i.next();
                System.out.println(p1);
            }
        } catch (Exception e) {
            System.out.println("Moio =" + e);
        }
        /*try {
            ClassificacaoDAO c = ClassificacaoDAO.getInstance();
            TreeSet<Classificado> tree = (TreeSet) c.pesquisar("R");
            Iterator i = tree.iterator();
            while (i.hasNext()){
                Classificado p1 = (Classificado) i.next();
                System.out.println(p1);
            }
        } catch (Exception e) {
            System.out.println("Moio =" + e);
        }*/
    }
}
