package CadastroDeProdutos;

public class Produto {

    private int codigo;
    private String nomeDoProduto;
    private int quantidade;
    private int quantidadeDeVenda;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidadeDeVenda(int quantidadeDeVenda) {

        this.quantidadeDeVenda = quantidadeDeVenda;
    }
    public int getQuantidadeDeVenda() {
        return  quantidade = quantidade - quantidadeDeVenda;
    }
}
