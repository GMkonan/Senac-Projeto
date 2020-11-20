
package data;
import java.sql.*;

public class AlunosDAO {
    public TB_ALUNOS aluno;
    public ConexaoBD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    
    public AlunosDAO() {
        bd = new ConexaoBD();
        aluno = new TB_ALUNOS();
    }
    public boolean localizar() {
        sql = "select * from tb_alunos where codigo = ?";
        try {
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, aluno.getCodigo());
            resultSet = statement.executeQuery();
            resultSet.next();
            aluno.setCodigo(resultSet.getString(1));
            aluno.setTitulo(resultSet.getString(2));
            aluno.setgenero(resultSet.getString(3));
            aluno.setProdutora(resultSet.getString(4));
            aluno.setDataCompra("" + resultSet.getDate(5));
            return true;
        }catch (SQLException erro) {
            return false;
        }
    }
    public String atualizar(int operacao) {
        men = "Operacão realizada com sucesso!";
        try {
            if(operacao == INCLUSAO) {
                sql = "insert into tb_alunos values (?, ?, ?, ?, ?)";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, aluno.getCOD_ALUNOS());
                statement.setString(2, aluno.getNOME_ALUNOS());
                statement.setString(3, aluno.getSERIE_ALUNOS());
                statement.setString(4, aluno.getMATRICULA_ALUNOS());
                statement.setString(5, aluno.getTURNO_ALUNOS());
                statement.setString(6, aluno.getEMAIL_ALUNOS());
                statement.setString(7, aluno.getLOGIN_ALUNOS());
                statement.setString(8, aluno.getSENHA_ALUNOS());
                
                
                
            } else if (operacao == ALTERACAO) {
                sql = "update tb_alunos set NOME_ALUNOS = ?" +  "SERIE_ALUNOS = ?" + "MATRICULA_ALUNOS = ?, TURNO_ALUNOS = ?"
                        + "EMAIL_ALUNOS = ?, LOGIN_ALUNOS = ?, LOGIN_ALUNOS = ?  where codigo = ?";
                statement =  bd.connection.prepareStatement(sql);
                statement.setString(8, aluno.getCOD_ALUNOS());
                statement.setString(1, aluno.getNOME_ALUNOS());
                statement.setString(2, aluno.getSERIE_ALUNOS());
                statement.setString(3, aluno.getMATRICULA_ALUNOS());
                statement.setString(4, aluno.getTURNO_ALUNOS());
                statement.setString(5, aluno.getEMAIL_ALUNOS());
                statement.setString(6, aluno.getLOGIN_ALUNOS());
                statement.setString(7, aluno.getSENHA_ALUNOS());
                
                
                
            } else if (operacao == EXCLUSAO) {
                sql = "delete from filmes where codigo = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, aluno.getCodigo());
            }
            if(statement.executeUpdate() == 0) {
                men = "Falha na operacao!";
            }
        }catch (SQLException erro) {
            men = "falha na operacao " + erro.toString();
        }
        return men;
    }
}
