﻿public class PrivilegeUpdateGlobal extends
        PrivilegeUpdate {
    public PrivilegeUpdateGlobal(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Boolean egale(PrivilegeUpdateGlobal priv) {
        if (utilisateur == priv.getUtilisateur())
            return true;
        else
            return false;
    }
}
