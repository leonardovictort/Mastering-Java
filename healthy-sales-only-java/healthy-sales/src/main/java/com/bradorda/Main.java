package com.bradorda;

import com.bradorda.models.Entrada;
import com.bradorda.models.EntradaItem;
import com.bradorda.models.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto produto = Produto.createNewProduto(1,"Coca Cola 2LT","7896636551404",0.12,0.10);
        Produto produto1 = Produto.createNewProduto(2,"Arame Z700 1000M","7896636551405",0.19,0.10);

        EntradaItem entradaItem = new EntradaItem(1,produto,10,8.75);
        EntradaItem entradaItem1 = new EntradaItem(2,produto1,100,435);
        List<EntradaItem> entradaItens = new ArrayList<>();
        entradaItens.add(entradaItem);
        entradaItens.add(entradaItem1);
        Entrada entrada = new Entrada();
        List<Entrada> entradas = new ArrayList<>();
        entrada.realizarEntrada(entradaItens);
        entradas.add(entrada.realizarEntrada(entradaItens));


        produto.imprimirInfo();
        produto1.imprimirInfo();

        EntradaItem entradaItem2 = new EntradaItem(2,produto,23,9.13);
        EntradaItem entradaItem21 = new EntradaItem(2,produto1,50,455);

        List<EntradaItem> entradaItens2 = new ArrayList<>();
        entradaItens2.add(entradaItem2);
        entradaItens2.add(entradaItem21);

        entradas.add(entrada.realizarEntrada(entradaItens2));


        produto.imprimirInfo();
        produto1.imprimirInfo();

        System.out.println("\n");

        for(Entrada e: entradas){
            for(int i =0; i < e.getEntradaItens().size();i++) {
                System.out.println(
                        e.getEntradaItens().get(i).getProduto().getName() + " Quantidade: " +
                                e.getEntradaItens().get(i).getQuantidade() + " Custo: " +
                                e.getEntradaItens().get(i).getValorUnitario() + " Data: " +
                                e.getDataEntrada()

                );
            }
        }

    }
}