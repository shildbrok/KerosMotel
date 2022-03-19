/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionDB;
import model.bean.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author estev
 */
public class UsuarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarUsuario(UsuarioDTO usuarioDTO){
        String sql = "insert into usuarios (nome, telefone, login, senha, tipo_user) values(?,?,?,?,?)";
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuarioDTO.getNome());
            pstm.setString(2, usuarioDTO.getTelefone());
            pstm.setString(3, usuarioDTO.getLogin());
            pstm.setString(4, usuarioDTO.getSenha());
            pstm.setString(5, usuarioDTO.getTpUser());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO: " + e);
        }
    }
    
    public ResultSet logarUsuario(UsuarioDTO user){
        
        conn = new ConnectionDB().conectaDB();
        
        try {
            String sql = "Select * from usuarios where login =? and senha =?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getLogin());
            pstm.setString(2, user.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tela Login: "+ e);
            return null;
        }
    }
    
    
    
        
    
}
