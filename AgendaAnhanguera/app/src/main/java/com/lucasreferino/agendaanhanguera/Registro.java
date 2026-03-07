package com.lucasreferino.agendaanhanguera;

import java.util.Date;
//construtores
public class Registro {
    //Declarando variáveis
    private int codigo;
    private Date data;
    private String assunto;
//fim das variaveis e iniciando a declaração dos construtores
    public Registro(int codigo, Date data, String assunto) {
    this.codigo = codigo;
    this.data = data;
    this.assunto = assunto;
    } //fim do construtor

// iniciando os getters e setters

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }


}//fim do registro

