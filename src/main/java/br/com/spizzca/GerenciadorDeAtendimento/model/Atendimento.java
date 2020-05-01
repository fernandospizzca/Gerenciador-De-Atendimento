package br.com.spizzca.GerenciadorDeAtendimento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@NoArgsConstructor
@Data
@Embeddable
public class Atendimento {

    @Id
    @Column(name = "protocolo", nullable = false)
    private long protocolo;

    @Column(name = "data_atendimento", nullable = false)
    private Date dataAtendimento;

    @Column(name = "desc_atendimento", nullable = true, length = 1000)
    private String descAtendimento;

    public Atendimento(long cliente_id, long protocolo, Date dataAtendimento, String descAtendimento) {
        this.dataAtendimento = dataAtendimento;
        this.descAtendimento = descAtendimento;
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
