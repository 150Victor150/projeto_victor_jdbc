package com.castelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

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


    public void exibirFuncionario(FuncionarioPojo funcionarioPojo) {
        Conexao conexao = new Conexao();
        String selectSql = "SELECT * FROM funcionario WHERE id = ?";

        try (Connection conn = conexao.getConexao();
             PreparedStatement selectPs = conn.prepareStatement(selectSql)) {

            // Configurar e executar a consulta SELECT
            selectPs.setInt(1, funcionarioPojo.getId());
            try (ResultSet rs = selectPs.executeQuery()) {
                while (rs.next()) {
                    // Processar os dados do ResultSet
                    funcionarioPojo.setId( rs.getInt(1));
                    String nome = rs.getString(2);

                    // Pegue outros dados conforme necessário
                    System.out.println("Dados do Funcionario:");
                    System.out.println("ID: " + funcionarioPojo.getId());
                    System.out.println("Nome: " + nome);
                    // Exiba outros dados conforme necessário
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
