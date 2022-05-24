
public class App {
    public static void main(String[] args) throws Exception {
        Membro membro1 = new Membro("Luiz Gustavo","BP", 432444);
        Membro membro2 = new Membro("Paulo","BP", 125654);
        Membro membro3 = new Membro("Felipe","BP", 125474);
        Membro membro4 = new Membro("Alemão","BP", 182388);

        Comissao comissaoCEIC = new Comissao("Portaria nº 5560 de 24 Maio de 2022");

        comissaoCEIC.adicionaMembro(membro1);
        comissaoCEIC.adicionaMembro(membro2);
        comissaoCEIC.adicionaMembro(membro3);
        comissaoCEIC.adicionaMembro(membro4);

        //comissaoCEIC.listaTodosOsMembros();

        Membro resultadoBusca = comissaoCEIC.pesquisarMembroPorNome("Lu");
        if(resultadoBusca != null){
            System.out.println(resultadoBusca);
        }else{
            System.out.println("Não foi encontrado nenhum resultado!");
        }
        
        
    }
}
