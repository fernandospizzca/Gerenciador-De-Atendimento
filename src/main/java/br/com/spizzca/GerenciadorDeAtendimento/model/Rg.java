package br.com.spizzca.GerenciadorDeAtendimento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Rg {

    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "numero", nullable = false, length = 20)
    @Id
    private String numRg;

    @Column(name = "orgao", nullable = true, length = 10)
    private String orgao;

    @Column(name = "uf", nullable = true, length = 2)
    private String uf;

    @Column(name = "data_exp", nullable = true)
    private Date dataExp;

    public Rg(String NumRg, String orgao, String uf, Date dataExp) {
        this.numRg = NumRg;
        this.orgao = orgao;
        this.uf = uf;
        this.dataExp = dataExp;
    }


    public String getNumRg() {
        return numRg;
    }

    public void setNumRg(String numRg) {
        this.numRg = numRg;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getDataExp(Date dataExp) {
        return this.dataExp;
    }

    public void setDataExp(Date dataExp) {
        this.dataExp = dataExp;
    }
}
