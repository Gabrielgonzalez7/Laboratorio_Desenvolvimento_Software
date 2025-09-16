/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Pessoa;
import java.sql.PreparedStatement;
import conexao.Conexao;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laboratorio
 */
public class PessoaDAO {
    private Conexao conexao;
    private Connection conn;

    public PessoaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Pessoa pessoa){
        String sql = "INSERT INTO pessoa (nome, sexo, idioma) VALUES (?,?,?);";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            
            stmt.execute();
            
            System.out.println("Pessoa inserida!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir pessoa: " + ex.getMessage());
        }
    }
    
    public Pessoa getPessoa (int id) {
        String sql = "SELECT * FROM pessoa WHERE id = ?";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Pessoa p = new Pessoa();
            
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setSexo(rs.getString("sexo"));
            p.setIdioma(rs.getString("idioma"));
            return p;
        } catch (SQLException ex){
            System.out.println("Erro ao consultar pessoa: " + ex.getMessage());
            return null;
        }
    }
    
    public void editar(Pessoa pessoa){
        try{
            String sql = "UPDATE pessoa set nome = ?, sexo = ?, idioma = ? WHERE id =?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            stmt.setInt(4, pessoa.getId());
            stmt.execute();
        } catch (SQLException ex){
            System.out.println("Erro ao atualizar pessoa: " + ex.getMessage());
        }
    }
    
    public void excluir(int id){
        try{
            String sql = "DELETE FROM pessoa WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex){
            System.out.println("Erro ao atualizar pessoa: " + ex.getMessage());
        }
    }
    
    public  List<Pessoa> getPessoa(){
        String sql = "SELECT * FROM PESSOA";
        try{
            PreparedStatement stms = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSer rs = stmt.executeQuery();
        List<Pessoa> listaPessoas = new ArrayList();
        while(rs.next()){
            Pessoa p = new Pessoa();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("Nome"));
            p.setSexo(rs.getString("Sexo"));
            p.setIdioma(rs.getString("Idioma"));
            listaPessoas.add(p);
        }
        return listaPessoa;
        } catch (SQLException ex){
            System.out.println("Erro ao consultar todas as pessoas" +ex.getMessage());
            return null;
        }
        
        public void preencheTabela(){
            PessoaDAO pDAO = new PessoaDAO();
            List<Pessoa> listaPessoa = pDAO.getPessoasNome(txtNome.getText());
            
            DefaultTableModel tabelaPessoas = (DefaultTableModel) tbl_Pessoas.getModel();
            tabelaPessoas.setNumRows(0);
            for(Pessoa p: listaPessoa){
                Object[] obj = new Object[]{
                p.getId(),
                p.getNome(),
                p.getSexo(),
                p.getIdioma()};
                tabelaPessoas.addRow(obj);
            }
            

public List<Pessoa> getPessoasNome(String nome){
            
            String sql = "SELECT * FROM pessoa WHERE nome LIKE?";
            try{
                
                PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE
                , ResultSet.CONCUR_UPDATABLE);
                
                stmt.setString(1, "%"+ nome + "%");
                ResultSet rs = stmt.executeQuery();
                List<Pessoa> listaPessoas = new ArrayList();

                while(rs.next()){
                    Pessoa p = new Pessoa();
                    p.setId(rs.getInt("id"));
                    p.setNome(rs.getString("nome"));
                    p.setSexo(rs.getString("Sexo"));
                    p.setIdioma(rs.getString("idioma"));
                    listaPessoas.add(p);                  
                }
                return listaPessoas;
            }catch(SQLException ex){
                System.out.println("Erro ao consultar todas as pessoas" +ex.getMessage());
                return null;
            }
        }

 
    
