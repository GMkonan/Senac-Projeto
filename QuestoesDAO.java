/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;

public class QuestoesDAO {
    public Questoes questao;
    public ConexaoBD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    
    public QuestoesDAO() {
        bd = new ConexaoBD();
        questao = new Questoes();
    }
    public boolean localizar() {
        sql = "select * from tb_questoes where COD_QUESTOES = ?";
        try {
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, questao.getCOD_QUESTOES());
            resultSet = statement.executeQuery();
            resultSet.next();
            questao.setCOD_QUESTOES(resultSet.getString(1));
            questao.setDESCRICAO_QUESTOES(resultSet.getString(2));
            questao.setRESPOSTA_QUESTOES(resultSet.getString(3));          
            questao.setPESO_QUESTOES("" + resultSet.getDate(4));
            return true;        
        } catch (SQLException erro){
            return false;
        }
    }
    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into tb_questoes values (?,?,?,?)";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, questao.getCOD_QUESTOES());
                statement.setString(2, questao.getDESCRICAO_QUESTOES());
                statement.setString(3, questao.getRESPOSTA_QUESTOES());
                statement.setString(4, questao.getPESO_QUESTOES());
            
            } else if (operacao == ALTERACAO) {
                sql = "update tb_questoes set DESCRICAO_QUESTOES = ?, RESPOSTA_QUESTOES = ?, PESO_QUESTOES = ?," + "where COD_QUESTOES = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(4, questao.getCOD_QUESTOES());
                statement.setString(1, questao.getDESCRICAO_QUESTOES());
                statement.setString(2, questao.getRESPOSTA_QUESTOES());
                statement.setString(3, questao.getPESO_QUESTOES());
               
            } else if (operacao == EXCLUSAO) {
                sql = "delete from filmes where codigo = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, questao.getCOD_QUESTOES());                
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
