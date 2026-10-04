package com.bradorda.models;

import java.time.LocalDate;
import java.util.List;

public class Entrada {

    private int id;
    private List<EntradaItem> entradaItens;
    private LocalDate dataEntrada;

    public Entrada() {
    }

    private Entrada(List<EntradaItem> entradaItens, LocalDate dataEntrada) {
        this.entradaItens = entradaItens;
        this.dataEntrada = dataEntrada;
    }

    public Entrada realizarEntrada(List<EntradaItem> entradaItens){
        for(EntradaItem entradaItem : entradaItens){
            entradaItem.getProduto()
                    .atualizarCustosAndQuantidade(
                            entradaItem.getValorUnitario(),
                            entradaItem.getQuantidade());
        };

        return new Entrada(entradaItens,LocalDate.now());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<EntradaItem> getEntradaItens() {
        return entradaItens;
    }

    public void setEntradaItens(List<EntradaItem> entradaItens) {
        this.entradaItens = entradaItens;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
