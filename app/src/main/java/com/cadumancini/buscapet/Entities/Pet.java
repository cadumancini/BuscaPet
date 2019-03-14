package com.cadumancini.buscapet.Entities;

import java.util.Date;

public class Pet {
    private String especie;
    private String corPredominante;
    private String corSecundaria;
    private String porte;
    private String sexo;
    private String nome;
    private int idade;
    private String tipoIdade;
    private String caracteristicasAdicionais;
    private Date dataCadastro;
    // definir como amarrar Pet com Usuario

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoIdade() {
        return tipoIdade;
    }

    public void setTipoIdade(String tipoIdade) {
        this.tipoIdade = tipoIdade;
    }

    public String getCaracteristicasAdicionais() {
        return caracteristicasAdicionais;
    }

    public void setCaracteristicasAdicionais(String caracteristicasAdicionais) {
        this.caracteristicasAdicionais = caracteristicasAdicionais;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
