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
public class Atendimento {

    @Id
    @Column(name = "protocolo", nullable = false)
    private long protocolo;

    @Column(name = "data_atendimento", nullable = false)
    private Date dataAtendimento;

    @Column(name = "desc_atendimento", nullable = true, length = 1000)
    private String descAtendimento;

    @Column(name = "cod_cliente", nullable = false)
    private long codCliente;

    @ManyToOne
    @JoinColumn(name = "atendimento_ibfk_1")
    private Cliente cliente;


    public Atendimento(long codCliente, long protocolo, Date dataAtendimento, String descAtendimento) {
        this.dataAtendimento = dataAtendimento;
        this.descAtendimento = descAtendimento;
        this.codCliente = cliente.getCodigo();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getCodCliente() {
        return codCliente;
    }

    public long getProtocolo() {
        return protocolo;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getDescAtendimento() {
        return descAtendimento;
    }

    public void setDescAtendimento(String descAtendimento) {
        this.descAtendimento = descAtendimento;
    }

}
