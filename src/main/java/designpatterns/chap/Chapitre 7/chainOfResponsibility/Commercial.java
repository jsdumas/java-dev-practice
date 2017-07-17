﻿package chainOfResponsibility;

public class Commercial extends Employe {

    public Commercial(Employe employeSuivant) {
        super(employeSuivant);
    }

    @Override
    protected boolean accepteCourrier(Courrier courrier) {
        return (courrier.getCategorie() == Courrier.Categorie.COMMERCIAL);
    }

}
