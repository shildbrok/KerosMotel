/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionDB;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Quartos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estev
 */
public class QuartosDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarQuarto(Quartos quartos){
        String sql = "insert into quartos (nquarto, nomeQuarto, vlrMinimo, adcPessoa, saidaPessoa, maxPessoa, status) values(?,?,?,?,?,?,?)";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, quartos.getNumeroQuarto());
            pstm.setString(2, quartos.getNomeQuarto());
            pstm.setInt(3, quartos.getVlrQuarto());
            pstm.setInt(4, quartos.getAdcPessoa());
            pstm.setInt(5, quartos.getSaidaPessoa());
            pstm.setInt(6, quartos.getMaxPessoa());
            pstm.setString(7, quartos.getStatus());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no QuartosDAO: " + e);
        }
    }
    
    public List<Quartos> read(){
    
        
        
        ResultSet rs = null;
        conn = new ConnectionDB().conectaDB();
        List<Quartos> quartos = new ArrayList<>();
        try {
            pstm = conn.prepareStatement("select * from quartos");
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Quartos q = new Quartos();
                
                q.setAdcPessoa(rs.getInt("adcPessoa"));
                q.setId_quarto(rs.getInt("idquarto"));
                q.setNomeQuarto(rs.getString("nomeQuarto"));
                q.setNumeroQuarto(rs.getString("nquarto"));
                q.setSaidaPessoa(rs.getInt("saidaPessoa"));
                q.setMaxPessoa(rs.getInt("maxPessoa"));
                q.setVlrQuarto(rs.getInt("vlrMinimo"));
                q.setStatus(rs.getString("status"));
                
                quartos.add(q);
                
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Lista de quartos: " + e);
        }finally{
            
        }
        
        return quartos;
    }
    
    public void update(Quartos q){
        
        String sql = "UPDATE quartos SET nquarto = ? , vlrMinimo = ?, nomeQuarto = ?, adcPessoa = ?, maxPessoa = ?, saidaPessoa = ?, status = ? WHERE idquarto = ?";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, q.getNomeQuarto());
            pstm.setInt(2, q.getVlrQuarto());
            pstm.setString(3, q.getNomeQuarto());
            pstm.setInt(4, q.getAdcPessoa());
            pstm.setInt(5, q.getMaxPessoa());
            pstm.setInt(6, q.getMaxPessoa());
            pstm.setString(7, q.getStatus());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "mudando quarto " + e);
        }
        
    }
    
    public void mudarStatus(Quartos q){
        
         String sql = "UPDATE quartos SET status = ? WHERE nquarto = ?";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, q.getStatus());
            pstm.setString(2, q.getNumeroQuarto());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "mudando quarto " + e);
        }
    
    }
    public void delete(Quartos q){
        
        String sql = "Delete from quartos where id = ?";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, q.getId_quarto());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "deletando quarto  " + e);
        }
        
    }
    
    
}
