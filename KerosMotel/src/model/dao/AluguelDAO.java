/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.AluguelDTO;
import model.bean.Quartos;

/**
 *
 * @author estev
 */
public class AluguelDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarAluguel(AluguelDTO aluguel){
        String sql = "insert into aluguelquarto (nome,valor,clientes,funcionario1,funcionario2,tppagamento) values(?,?,?,?,?,?)";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, aluguel.getNome());
            pstm.setString(2, aluguel.getValor());
            pstm.setString(3, aluguel.getClientes());
            pstm.setString(4, aluguel.getFuncionario1());
            pstm.setString(5, aluguel.getFuncionario2());
            pstm.setString(6, aluguel.getTpPagamento());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no QuartosDAO: " + e);
        }
    }
    
    public List<AluguelDTO> read(){
    
        
        
        ResultSet rs = null;
        conn = new ConnectionDB().conectaDB();
        List<AluguelDTO> Aluguel = new ArrayList<>();
        try {
            pstm = conn.prepareStatement("select * from aluguelquarto");
            rs = pstm.executeQuery();
            
            while(rs.next()){
                AluguelDTO a = new AluguelDTO();
                
                a.setId(rs.getInt("id"));
                a.setData(rs.getInt("data"));
                a.setClientes("clientes");
                a.setFuncionario1("funcionario1");
                a.setFuncionario2("funcionario2");
                a.setTpPagamento("tppagamento");
                a.setValor("valor");
                a.setNome("nome");
                
                Aluguel.add(a);
                
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Lista de quartos: " + e);
        }finally{
            
        }
        
        return Aluguel;
    }
    
    public void update(AluguelDTO a){
        
        String sql = "UPDATE aluguelquarto SET nome = ? , clientes = ?, funcionario1 = ?, funcionario2 = ?, valor = ?, data = ?, tppagamento = ? WHERE id = ?";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, a.getNome());
            pstm.setString(2, a.getClientes());
            pstm.setString(3, a.getFuncionario1());
            pstm.setString(4, a.getFuncionario2());
            pstm.setString(5, a.getValor());
            pstm.setInt(6, a.getData());
            pstm.setString(7, a.getTpPagamento());
            
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "mudando quarto " + e);
        }
        
    }
    public void delete(AluguelDTO a){
        
        String sql = "Delete from aluguelquarto WHERE id = ?";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, a.getId());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "deletando aluguel quarto  " + e);
        }
        
    }
    
    
}
