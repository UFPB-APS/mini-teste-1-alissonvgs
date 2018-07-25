public class ProdutoAmazon extends Produto {
    
    public ProdutoAmazon() {
        super();
    }
    
    public ProdutoAmazon(int id, String descricao, double preco, double precoCompra) {
        super(id, descricao, preco, precoCompra);
    }
    
    public void reajustarPreco(double percentual) {
        
        if (percentual > 0) {    
            super.reajustarPreco(percentual);
        }        
    }
    
}
