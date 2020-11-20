
package data;


public class Alunos {
    private String cod_alunos, nome_alunos, serie_alunos, matricula_alunos, turno_alunos, email_alunos, login_alunos, senha_alunos;
    
    public Alunos(String cod_alunos, String nome_alunos, String serie_alunos, String matricula_alunos, String turno_alunos, String email_alunos, String login_alunos, String senha_alunos) {
        this.cod_alunos = cod_alunos;
        this.nome_alunos = nome_alunos;
        this.serie_alunos = serie_alunos;
        this.matricula_alunos = matricula_alunos;
        this.turno_alunos = turno_alunos;
        this.email_alunos = email_alunos;
        this.login_alunos = login_alunos;
        this.senha_alunos = senha_alunos;
    }
    
    public String getCOD_ALUNOS() {
        return cod_alunos;
    }
    public void setCOD_ALUNOS(String codigo) {
        this.cod_alunos = cod_alunos;
    }
    public String getNOME_ALUNOS() {
        return nome_alunos;
    }
    public void setNOME_ALUNOS(String dataCompra) {
        this.nome_alunos = nome_alunos;
    }

    public void setCod_alunos(String cod_alunos) {
        this.cod_alunos = cod_alunos;
    }

    public void setNome_alunos(String nome_alunos) {
        this.nome_alunos = nome_alunos;
    }

    public void setSerie_alunos(String serie_alunos) {
        this.serie_alunos = serie_alunos;
    }

    public void setMatricula_alunos(String matricula_alunos) {
        this.matricula_alunos = matricula_alunos;
    }

    public void setTurno_alunos(String turno_alunos) {
        this.turno_alunos = turno_alunos;
    }

    public void setEmail_alunos(String email_alunos) {
        this.email_alunos = email_alunos;
    }

    public void setLogin_alunos(String login_alunos) {
        this.login_alunos = login_alunos;
    }

    public void setSenha_alunos(String senha_alunos) {
        this.senha_alunos = senha_alunos;
    }

    public String getCod_alunos() {
        return cod_alunos;
    }

    public String getNome_alunos() {
        return nome_alunos;
    }

    public String getSerie_alunos() {
        return serie_alunos;
    }

    public String getMatricula_alunos() {
        return matricula_alunos;
    }

    public String getTurno_alunos() {
        return turno_alunos;
    }

    public String getEmail_alunos() {
        return email_alunos;
    }

    public String getLogin_alunos() {
        return login_alunos;
    }

    public String getSenha_alunos() {
        return senha_alunos;
    }


}
