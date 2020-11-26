/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;

public class ProfessoresDAO {
    public Professores professor;
    public ConexaoBD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    
    public ProfessoresDAO() {
        bd = new ConexaoBD();
        professor = new Professores();
    }
    public boolean localizar() {
        sql = "select * from tb_professores where LOGIN_PROFESSOR = ?"; //provavelmente mudar isso pra login
        try {
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, professor.getLOGIN_PROFESSOR());
            resultSet = statement.executeQuery();
            resultSet.next();
            professor.setCOD_PROFESSOR(resultSet.getString(1));
            professor.setNOME_PROFESSOR(resultSet.getString(2));
            professor.setDISCIPLINA_PROFESSOR(resultSet.getString(3));
            professor.setIDADE_PROFESSOR(resultSet.getString(4));
            professor.setTELEFONE_PROFESSOR(resultSet.getString(5));
            professor.setENDERECO_PROFESSOR(resultSet.getString(6));
            professor.setUF_PROFESSOR(resultSet.getString(7));
            professor.setCIDADE_PROFESSOR(resultSet.getString(8));
            professor.setCPF_PROFESSOR(resultSet.getString(9));
            professor.setRG_PROFESSOR(resultSet.getString(10));
            professor.setSEXO_PROFESSOR(resultSet.getString(11));
            professor.setBAIRRO_PROFESSOR(resultSet.getString(12));
            professor.setTURNO_PROFESSOR(resultSet.getString(13));
            professor.setLOGIN_PROFESSOR(resultSet.getString(14));
            professor.setSENHA_PROFESSOR(resultSet.getString(15));                       
            professor.setEMAIL_PROFESSOR("" + resultSet.getDate(16));
            return true;        
        } catch (SQLException erro){
            return false;
        }
    }
    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        bd.getConnection();
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into tb_professores values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, professor.getCOD_PROFESSOR());
                statement.setString(2, professor.getNOME_PROFESSOR());
                statement.setString(3, professor.getDISCIPLINA_PROFESSOR());
                statement.setString(4, professor.getIDADE_PROFESSOR());
                statement.setString(5, professor.getTELEFONE_PROFESSOR());  
                statement.setString(6, professor.getENDERECO_PROFESSOR());
                statement.setString(7, professor.getUF_PROFESSOR());
                statement.setString(8, professor.getCIDADE_PROFESSOR());
                statement.setString(9, professor.getCPF_PROFESSOR());
                statement.setString(10, professor.getRG_PROFESSOR());
                statement.setString(11, professor.getSEXO_PROFESSOR());
                statement.setString(12, professor.getBAIRRO_PROFESSOR());
                statement.setString(13, professor.getTURNO_PROFESSOR());
                statement.setString(14, professor.getLOGIN_PROFESSOR());
                statement.setString(15, professor.getSENHA_PROFESSOR());
                statement.setString(16, professor.getEMAIL_PROFESSOR());
            } else if (operacao == ALTERACAO) {
                sql = "update tb_professores set NOME_PROFESSOR = ?, DISCIPLINA_PROFESSOR = ?" + "IDADE_PROFESSOR = ?" + "TELEFONE_PROFESSOR = ?" + 
                        "ENDERECO_PROFESSOR = ?, UF_PROFESSOR = ?, CIDADE_PROFESSOR = ?, CPF_PROFESSOR = ?, RG_PROFESSOR = ?, SEXO_PROFESSOR = ?, BAIRRO_PROFESSOR = ?, TURNO_PROFESSOR = ?, LOGIN_PROFESSOR = ?, SENHA_PROFESSOR = ?, EMAIL_PROFESSOR = ?" + "where codigo = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(16, professor.getCOD_PROFESSOR());
                statement.setString(1, professor.getNOME_PROFESSOR());
                statement.setString(2, professor.getDISCIPLINA_PROFESSOR());
                statement.setString(3, professor.getIDADE_PROFESSOR());
                statement.setString(4, professor.getTELEFONE_PROFESSOR());
                statement.setString(5, professor.getENDERECO_PROFESSOR());
                statement.setString(6, professor.getUF_PROFESSOR());
                statement.setString(7, professor.getCIDADE_PROFESSOR());
                statement.setString(8, professor.getCPF_PROFESSOR());
                statement.setString(9, professor.getRG_PROFESSOR());
                statement.setString(10, professor.getSEXO_PROFESSOR());
                statement.setString(11, professor.getBAIRRO_PROFESSOR());
                statement.setString(12, professor.getTURNO_PROFESSOR());
                statement.setString(13, professor.getLOGIN_PROFESSOR());
                statement.setString(14, professor.getSENHA_PROFESSOR());
                statement.setString(15, professor.getEMAIL_PROFESSOR());
           
            } else if (operacao == EXCLUSAO) {
                sql = "delete from tb_professores where COD_PROFESSOR = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, professor.getCOD_PROFESSOR());                
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
