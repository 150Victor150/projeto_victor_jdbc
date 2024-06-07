package com.castelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.castelo.conexao.Conexao;

public class FuncionarioDao {
    public void cadastrarFuncionario(FuncionarioPojo FuncionarioPojo) {

        Conexao conexao = new Conexao();

        String sqlInsert = "insert into funcionario(nome, login, senha) value (?, ?, ?);";

        PreparedStatement ps = null;


        try {
            ps = conexao.getConexao().prepareStatement(sqlInsert);

            ps.setString(1, FuncionarioPojo.getNome());
            ps.setString(2, FuncionarioPojo.getLogin());
            ps.setString(3, FuncionarioPojo.getSenha());
            

            ps.execute();
            ps.close();

            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Ocorreu um erro com os dados.");
        }

    }


    public void atualizarFuncionario(FuncionarioPojo FuncionarioPojo) {

        Conexao conexao = new Conexao();

        String sqlUpdate = "update funcionario set nome = ?, login = ?, senha = ? where id = ?;";

        PreparedStatement ps = null;


        try {
            ps = conexao.getConexao().prepareStatement(sqlUpdate);

            ps.setString(1, FuncionarioPojo.getNome());
            ps.setString(2, FuncionarioPojo.getLogin());
            ps.setString(3, FuncionarioPojo.getSenha());
            ps.setInt(4, FuncionarioPojo.getId());

            ps.execute();
            ps.close();

            System.out.println("Dados atualizados com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Ocorreu um erro com os dados.");
        }

    }
    
    public void deletarFuncionario(FuncionarioPojo FuncionarioPojo) {

        Conexao conexao = new Conexao();

        String sql = "DELETE FROM funcionario WHERE id = (?)";

        PreparedStatement ps = null;


        try {

            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, FuncionarioPojo.getId());
            
           

            ps.execute();
            ps.close();

            System.out.println("Dados deletados com sucesso!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

           
        
    }
}
