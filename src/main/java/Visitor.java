public interface Visitor {

    String exibirCliente(Cliente cliente);
    String exibirGerente(Gerente gerente);
    String exibirFuncionario(Funcionario funcionario);

}