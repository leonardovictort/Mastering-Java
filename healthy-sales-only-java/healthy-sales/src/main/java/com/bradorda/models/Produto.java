package com.bradorda.models;

public class Produto {

    private int id;
    private String name;
    private String codigoBarras;
    private double custoUnitario;
    private double custoTotal;
    private double icms;
    private double indiceMargemBruta;
    private double precoVenda;
    private double quantidadeEstoque;

    public Produto() {

    }

    public static Produto createNewProduto(int id, String name,String codigoBarras, double icms, double indiceMargemBruta){
        Produto produto = new Produto();
        produto.setId(id);
        produto.setName(name);
        produto.setCodigoBarras(codigoBarras);
        produto.setIcms(icms);
        produto.setIndiceMargemBruta(indiceMargemBruta);
        produto.setCustoUnitario(0);
        produto.setCustoTotal(0);
        produto.setQuantidadeEstoque(0);
        produto.setPrecoVenda(0);

        return produto;
    }

    public Produto(int id, String name,String codigoBarras, double custoUnitario, double icms, double indiceMargemBruta, double precoVenda, double quantidadeEstoque, double custoTotal) {
        this.id = id;
        this.name = name;
        this.codigoBarras = codigoBarras;
        this.custoUnitario = custoUnitario;
        this.icms = icms;
        this.indiceMargemBruta = indiceMargemBruta;
        this.precoVenda = precoVenda;
        this.quantidadeEstoque = quantidadeEstoque;
        this.custoTotal = custoTotal;
    }

    public void calcularPrecoVenda(){
        this.precoVenda = (custoUnitario /(1 - icms)) / (1 - indiceMargemBruta);
    }

    private void atualizarQuantidadeEstoque(double quantidade){
        this.quantidadeEstoque += quantidade;
    }

    public void atualizarCustosAndQuantidade(double custo, double quantidade){
        this.custoTotal = (this.custoUnitario * this.quantidadeEstoque) + (custo * quantidade);
        atualizarQuantidadeEstoque(quantidade);
        atualizarCustoUnitario();
        calcularPrecoVenda();
    }

    private void atualizarCustoUnitario(){
       this.custoUnitario = this.custoTotal / this.quantidadeEstoque;
    }

    public void imprimirInfo(){
        System.out.println("Nome: "+this.name +" Preço Venda: "+ this.precoVenda +" Custo: "+this.custoUnitario +" Quantidade Estoque: "+this.quantidadeEstoque);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getIndiceMargemBruta() {
        return indiceMargemBruta;
    }

    public void setIndiceMargemBruta(double indiceMargemBruta) {
        this.indiceMargemBruta = indiceMargemBruta;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }
}
