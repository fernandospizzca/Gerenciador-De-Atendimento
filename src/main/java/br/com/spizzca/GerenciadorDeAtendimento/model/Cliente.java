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
public class Cliente {

    @Id
    @Column(name = "codigo", nullable = false)
    private static long codigo;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 14, unique = true)
    private String cpf;

    @Embedded
    private Rg rg;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Atendimento atendimento;

    @Column(name = "data_cadastro", nullable = false)
    private Date dataCadastro;

    public Cliente(long codigo, String nome, String cpf, Date dataCadastro) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.dataCadastro = new Date();
    }

    public static long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @OneToOne
    public Rg getRg() {
        return rg;
    }

    @OneToOne
    public void setRg(Rg rg) {
        this.rg = rg;
    }

    @OneToOne
    public Endereco getEndereco() {
        return endereco;
    }

    @OneToOne
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @OneToMany
    public Atendimento getAtendimento() {
        return atendimento;
    }

    @OneToMany
    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
