package org.example.model;


public  class User {
    private String _nume, _prenume, _cnp, _serieTicket, _tipTicket;

    public User(String _nume, String _prenume, String _cnp, String _serieTicket, String _tipTicket){
        this._nume = _nume;
        this._prenume = _prenume;
        this._cnp = _cnp;
        this._serieTicket = _serieTicket;
        this._tipTicket = _tipTicket;
    }
    // getters
    public String get_nume() {
        return _nume;
    }

    public String get_prenume() {
        return _prenume;
    }

    public String get_cnp() {
        return _cnp;
    }

    public String get_serieTicket() {
        return _serieTicket;
    }

    public String get_tipTicket() {
        return _tipTicket;
    }




}
