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

    @Column(name = "rg", nullable = false, length = 20, unique = true)
    @Id
    private String NumRg;

    @Column(name = "orgao", nullable = false, length = 10)
    private String orgao;

    @Column(name = "uf", nullable = false, length = 2)
    private String[] uf = new String[2];

    @Column(name = "data_exp", nullable = false)
    private Date dataExp;

    @Column(name = "cod_cliente", nullable = false)
    private long codCliente;

    @OneToOne
    @JoinColumn(name = "rg_ibfk_1")
    private Cliente cliente;

    public Rg(String NumRg, String orgao, String[] uf, Date dataExp) {
        this.NumRg = NumRg;
        this.orgao = orgao;
        this.uf = uf;
        this.dataExp = dataExp;
        this.codCliente = cliente.getCodigo();
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public String getNumRg() {
        return NumRg;
    }

    public void setNumRg(String numRg) {
        this.NumRg = numRg;
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
