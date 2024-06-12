package com.castelo;

import com.castelo.dao.FuncionarioDao;
import com.castelo.dao.FuncionarioPojo;
import com.castelo.dao.PessoaDao;
import com.castelo.dao.PessoaPojo;
import com.castelo.modelo.Funcionario;
import com.castelo.modelo.Pessoa;

 
public class App 
{
    
    public static void main( String[] args )
    {
        /*  Inserindo pessoas no banco de dados.*/
        /*
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Wilian");
        pessoa.setEndereco("Rua Gordos da Patria");
        pessoa.setIdade(20);


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.cadastrarPessoa(pessoaPojo);

        */
        

        /*Atualizando o cadastro pessoa */
        /*
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Wilian");
        pessoa.setEndereco("Rua Gordos da Patria");
        pessoa.setIdade(35);
        pessoa.setId(3);
        


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());
        pessoaPojo.setId(pessoa.getId());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.atualizarPessoa(pessoaPojo);
        */


        /*deletar pessoa*/
        /*
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("wilian");
        pessoa.setEndereco("Rua Gordos da Patria");
        pessoa.setIdade(35);
        pessoa.setId(3);
        


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());
        pessoaPojo.setId(pessoa.getId());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.deletarPessoa(pessoaPojo);
        */
        

        /*cadastrar funcionario*/
        /*
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Pedro");
        funcionario.setLogin("Pedro");
        funcionario.setSenha("1553");


        FuncionarioPojo funcionarioPojo = new FuncionarioPojo();
        funcionarioPojo.setNome(funcionario.getNome());
        funcionarioPojo.setLogin(funcionario.getLogin());
        funcionarioPojo.setSenha(funcionario.getSenha());


        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioDao.cadastrarFuncionario(funcionarioPojo);
        */


        /*atualizar funcionario */
        /*
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Santi");
        funcionario.setLogin("SantiCVL");
        funcionario.setSenha("1553");
        funcionario.setId(2);


        FuncionarioPojo funcionarioPojo = new FuncionarioPojo();
        funcionarioPojo.setNome(funcionario.getNome());
        funcionarioPojo.setLogin(funcionario.getLogin());
        funcionarioPojo.setSenha(funcionario.getSenha());
        funcionarioPojo.setId(funcionario.getId());


        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioDao.atualizarFuncionario(funcionarioPojo);
        */


        /*deletar funcionario */
        /*
        Funcionario funcionario = new Funcionario();

        funcionario.setId(3);


        FuncionarioPojo funcionarioPojo = new FuncionarioPojo();
        funcionarioPojo.setId(funcionario.getId());

        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioDao.deletarFuncionario(funcionarioPojo);
        */

        /*Exibir funcionario */
        
        Funcionario funcionario = new Funcionario();

        funcionario.setId(3);
        
        FuncionarioPojo funcionarioPojo = new FuncionarioPojo();
        funcionarioPojo.setId(funcionario.getId());

        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioDao.exibirFuncionario(funcionarioPojo);
        
         

    }
}
