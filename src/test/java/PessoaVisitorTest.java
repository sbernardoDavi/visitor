import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaVisitorTest {

    @Test
    public void deveRetornarCliente(){

        Cliente cliente = new Cliente(123, "marco");
        PessoaVisitor pessoaVisitor = new PessoaVisitor();

        assertEquals("Cliente{cpf=123, nome='marco'}", pessoaVisitor.exibir(cliente));

    }

    @Test
    public void deveExibirGerente(){
        Gerente gerente = new Gerente(123, "davi");
        PessoaVisitor pessoaVisitor = new PessoaVisitor();

        assertEquals("Gerente{Matricula=123, nome='davi'}", pessoaVisitor.exibir(gerente));
    }

    @Test
    public void deveExibirFuncionario(){
        Funcionario funcionario = new Funcionario(12345, "Alice", new Setor("administracao"));
        PessoaVisitor pessoaVisitor = new PessoaVisitor();

        assertEquals("Funcionario{Matricula=12345, nome='Alice', setor=administracao}", pessoaVisitor.exibir(funcionario));
    }

}