
package data;
import java.sql.*;

public class ExerciciosDAO {
    public Exercicios exercicio;
    public ConexaoBD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    
    public ExerciciosDAO() {
        bd = new ConexaoBD();
        exercicio = new Exercicios();
    }
    public boolean localizar() {
        sql = "select * from tb_exercicios where COD_EXERCICIOS = ?";
        try {
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, exercicio.getCOD_EXERCICIOS());
            resultSet = statement.executeQuery();
            resultSet.next();
            exercicio.setCOD_EXERCICIOS(resultSet.getString(1));
            exercicio.setTITULO_EXERCICIOS(resultSet.getString(2));
            exercicio.setDISCIPLINA_EXERCICIOS(resultSet.getString(3));       
            exercicio.setNOTAS_EXERCICIOS("" + resultSet.getString(4));
            return true;
        }catch (SQLException erro) {
            return false;
        }
    }
    public String atualizar(int operacao) {
        men = "Operacão realizada com sucesso!";
        try {
            if(operacao == INCLUSAO) {
                sql = "insert into tb_exercicios values (?, ?, ?, ?)";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, exercicio.getCOD_EXERCICIOS());
                statement.setString(2, exercicio.getTITULO_EXERCICIOS());
                statement.setString(3, exercicio.getDISCIPLINA_EXERCICIOS());
                statement.setString(4, exercicio.getNOTAS_EXERCICIOS());
               
                
                
                
            } else if (operacao == ALTERACAO) {
                sql = "update tb_exercicios set TITULO_EXERCICIOS = ?, DISCIPLINA_EXERCICIOS = ?" + "NOTAS_EXERCICIOS = ?" + "where COD_EXERCICIOS = ?";
                statement =  bd.connection.prepareStatement(sql);
                statement.setString(4, exercicio.getCOD_EXERCICIOS());
                statement.setString(1, exercicio.getTITULO_EXERCICIOS());
                statement.setString(2, exercicio.getDISCIPLINA_EXERCICIOS());
                statement.setString(3, exercicio.getNOTAS_EXERCICIOS());             
              
                
            } else if (operacao == EXCLUSAO) {
                sql = "delete from tb_exercicios where COD_EXERCICIOS = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, exercicio.getCOD_EXERCICIOS());
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
