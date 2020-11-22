/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;

public class OpcoesDAO {
    public Opcoes opcao;
    public ConexaoBD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    
    public OpcoesDAO() {
        bd = new ConexaoBD();
        opcao = new Opcoes();
    }
    public boolean localizar() {
        sql = "select * from filmes where codigo = ?";
        try {
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, opcao.COD_OPCOES());
            resultSet = statement.executeQuery();
            resultSet.next();
            opcao.setCOD_OPCOES(resultSet.getString(1));                   
            opcao.setRESPOSTA_OPCOES("" + resultSet.getDate(2));
            return true;        
        } catch (SQLException erro){
            return false;
        }
    }
    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into tb_opcoes values (?,?)";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, opcao.getCOD_OPCOES());
                statement.setString(2, opcao.getRESPOSTA_OPCOES());
                        
            } else if (operacao == ALTERACAO) {
                sql = "update tb_opcoes set RESPOSTA_OPCOES = ?, where COD_OPCOES = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(2, opcao.getCOD_OPCOES());
                statement.setString(1, opcao.getRESPOSTA_OPCOES());
                
            } else if (operacao == EXCLUSAO) {
                sql = "delete from tb_opcoes where COD_OPCOES = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, opcao.getCOD_OPCOES());                
            }
            if (statement.executeUpdate() ==  0) {
                men = "Falha na operacao!";                
            }
        } catch (SQLException erro) {
            men = "Falha na operacao " + erro.toString();
        }
        return men;
    }
}
