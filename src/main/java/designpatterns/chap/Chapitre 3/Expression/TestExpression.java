﻿public class TestExpression {    public static void main(String[] args) {        Noeud racine = new NoeudPlus();        racine.ajouteNoeud(new NoeudValeur(6));        racine.ajouteNoeud(new NoeudValeur(3));        NoeudOperateur noeudOperateur1 = new NoeudMoins();        noeudOperateur1.ajouteNoeud(new NoeudValeur(15));        NoeudOperateur noeudOperateur2 = new NoeudMoins();        noeudOperateur2.ajouteNoeud(new NoeudValeur(4));        noeudOperateur2.ajouteNoeud(new NoeudValeur(10));        noeudOperateur1.ajouteNoeud(noeudOperateur2);        noeudOperateur1.ajouteNoeud(new NoeudValeur(3));        noeudOperateur1.ajouteNoeud(new NoeudValeur(9));        racine.ajouteNoeud(noeudOperateur1);        int resultat = new VisiteurEvalExpression()                .evaluer(racine);        System.out.println("Résultat = " + resultat);    }}