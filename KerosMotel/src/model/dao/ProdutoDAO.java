/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;



/**
 *
 * @author estev
 */
public class ProdutoDAO {
    
    Connection conn;
    PreparedStatement pstm = null;
    
    public void cadastrarProduto(Produto p){
        
        String sql = "insert into produtos (nome, qtd, precovenda, precocompra) values(?,?,?,?)";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getNome());
            pstm.setInt(2, p.getQtd());
            pstm.setFloat(3, p.getPrecoVenda());
            pstm.setFloat(4, p.getPrecoCompra());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gravando Produto " + e);
        }
        
    }
    
    public List<Produto> read(){
    
        
        
        ResultSet rs = null;
        conn = new ConnectionDB().conectaDB();
        List<Produto> produtos = new ArrayList<>();
        try {
            pstm = conn.prepareStatement("select * from produtos");
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Produto p = new Produto();
                
                p.setId_produto(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPrecoVenda(rs.getFloat("precovenda")); 
                p.setQtd(rs.getInt("qtd"));
                p.setPrecoCompra(rs.getFloat("precocompra"));
                              
                produtos.add(p);
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Lista produtos: " + e);
        }finally{
            
        }
        
        return produtos;
    }
    
    public void update(Produto p){
        
        String sql = "UPDATE produtos SET nome = ? , qtd = ?, precovenda = ?, precocompra = ? WHERE id = ?";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getNome());
            pstm.setInt(2, p.getQtd());
            pstm.setFloat(3, p.getPrecoVenda());
            pstm.setFloat(4, p.getPrecoCompra());
            pstm.setInt(5, p.getId_produto());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gravando Produto " + e);
        }
        
    }
    public void delete(Produto p){
        
        String sql = "Delete from produtos where id = ?";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, p.getId_produto());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gravando Produto " + e);
        }
        
    }
    
    
}
