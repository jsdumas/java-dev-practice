﻿public class NoeudPlus extends NoeudOperateur {    public void accepteVisiteur(VisiteurExpression v) {        v.visite(this);    }}