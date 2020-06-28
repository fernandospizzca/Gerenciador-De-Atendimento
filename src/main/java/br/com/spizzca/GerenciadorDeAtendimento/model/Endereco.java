package br.com.spizzca.GerenciadorDeAtendimento.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class Endereco{

    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;

    @Column(name = "logradouro", nullable = true, length = 60)
    private String logradouro;

    @Column(name = "numero", nullable = true)
    private int numero;

    @Column(name = "complemento", nullable = true, length = 30)
    private String complemento;

    @Column(name = "bairro", nullable = true, length = 30)
    private String bairro;

    @Column(name = "cidade", nullable = true, length = 30)
    private String cidade;

    @Column(name = "uf", nullable = true, length = 2)
    private String uf;



    @Column(name = "cep", nullable = true, length = 20)
    private String cep;
    

    /*
    @OneToMany
    private List<Cliente> clientes;*/

    public Endereco() {
    }


    public long getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
