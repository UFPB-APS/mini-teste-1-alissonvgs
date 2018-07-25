public class LogicaVenda {

    private Custo iv = new ImpostoSobreVenda();
    private Custo seguro;
    private double lucroTotal;

    public Custo getSeguro() {
        return seguro;
    }
    
    public void setSeguro(Custo seguro) {
        this.seguro = seguro;
    }

    public double calcularTotal(Venda venda) {
        venda.setTotal(0.0);
        
        for (ItemVenda item: venda.getItens()) {
            if (item != null) {
                venda.setTotal(venda.getTotal() + item.getSubTotal());
            }
        }
        
        if ( this.iv != null) {
            venda.setTotal(venda.getTotal() + this.iv.calcularCusto(venda));
        }
        
        if ( this.seguro != null) {
            venda.setTotal(venda.getTotal() + this.seguro.calcularCusto(venda));
        }
        
        return venda.getTotal();
    }
    
    public double lucroTotal(Venda venda){
        double lucroTotal = 0.0;
        for(ItemVenda item: venda.getItens()){
            if(item != null){
                lucroTotal += item.getLucro();
            }
        }
        return lucroTotal;
    }
}