package modulos.fim.exercios.dois;

public class main {

    public static void main(String[] args) {
        // Ex - 1:
//        ContaBancaria cliente1 = new ContaBancaria();
//
//        cliente1.setNomeTitular("Marcos");
//        cliente1.setSaldo(1000000);
//        cliente1.setNumeroDaConta(505);
//
//        System.out.println("O cliente " + cliente1.getNomeTitular() + " tem " + cliente1.getSaldo() + " na conta " + cliente1.getNumeroDaConta());
//
        //Ex - 2:
//        IdadePessoa marcos = new IdadePessoa();
//
//        marcos.setNome("Marcos");
//        marcos.setIdade(22);
//
//        marcos.verificaIdade();

        //Ex - 3:
        Produto produto = new Produto();

        produto.setNome("Sabão");
        produto.setPreco(50.50);
        produto.aplicarDesconto(10);

        System.out.println(produto.getNome() + " tem o valor de " + produto.getPreco());

    }
}
