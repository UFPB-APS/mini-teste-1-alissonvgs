public class ItemVenda {

    private double quantidade;
    private Produto produto;
    private double precoVenda;
    private double lucro;
    
    protected double getSubTotal() {
        return this.getQuantidade() * this.getPrecoVenda();
    }
    
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getQuantidade() {
        return quantidade;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setProduto(Produto produto) {
        setPrecoVenda(produto.getPrecoReferencia());
        this.produto = produto;
    }
    
    public Produto getProduto() {
        return produto;
    }
   
    public void setLucro(double lucro){
        setLucro(this.precoVenda - produto.getPrecoCompra());
        this.lucro = lucro;
    }
    
    public double getLucro(){
        return this.lucro;
    }
}
