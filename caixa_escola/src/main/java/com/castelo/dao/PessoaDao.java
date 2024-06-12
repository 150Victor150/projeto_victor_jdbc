package com.castelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.castelo.conexao.Conexao;

public class PessoaDao {


    public void cadastrarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sqlInsert = "insert into pessoa(nome, endereco, idade) value (?, ?, ?);";

        PreparedStatement ps = null;


        try {
            ps = conexao.getConexao().prepareStatement(sqlInsert);

            ps.setString(1, pessoaPojo.getNome());
            ps.setString(2, pessoaPojo.getEndereco());
            ps.setInt(3, pessoaPojo.getIdade());
            

            ps.execute();
            ps.close();

            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Ocorreu um erro com os dados.");
        }

    }


    public void atualizarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sqlUpdate = "update pessoa set nome = ?, endereco = ?, idade = ? where id = ?;";

        PreparedStatement ps = null;


        try {
            ps = conexao.getConexao().prepareStatement(sqlUpdate);

            ps.setString(1, pessoaPojo.getNome());
            ps.setString(2, pessoaPojo.getEndereco());
            ps.setInt(3, pessoaPojo.getIdade());
            ps.setInt(4, pessoaPojo.getId());

            ps.execute();
            ps.close();

            System.out.println("Dados atualizados com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Ocorreu um erro com os dados.");
        }

    }
    
    public void deletarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "DELETE FROM pessoa WHERE id = (?)";

        PreparedStatement ps = null;


        try {

            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, pessoaPojo.getId());
            
           

            ps.execute();
            ps.close();

            System.out.println("Dados deletados com sucesso!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

           
        
    }
}
