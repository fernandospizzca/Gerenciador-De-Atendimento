package br.com.spizzca.GerenciadorDeAtendimento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Rg {
    @Column(name = "id", nullable = false)
    @Id
    private long id;

    @Column(name = "rg", nullable = false, length = 20, unique = true)
    private String rg;

    @Column(name = "orgao", nullable = false, length = 10)
    private String orgao;

    @Column(name = "uf", nullable = false, length = 2)
    private String[] uf = new String[2];

    @Column(name = "data_exp", nullable = false)
    private Date dataExp;

    public Rg(String rg, String orgao, String[] uf, Date dataExp) {
        this.rg = rg;
        this.orgao = orgao;
        this.uf = uf;
        this.dataExp = dataExp;
    }

    public long getId() {
        return id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String[] getUf() {
        return uf;
    }

    public void setUf(String[] uf) {
        this.uf = uf;
    }

    public Date getDataExp() {
        return dataExp;
    }

    public void setDataExp(Date dataExp) {
        this.dataExp = dataExp;
    }
}
