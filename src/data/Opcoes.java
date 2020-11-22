
package data;



public class Opcoes {

    public Opcoes(String COD_OPCOES, String RESPOSTA_OPCOES) {
        this.COD_OPCOES = COD_OPCOES;
        this.RESPOSTA_OPCOES = RESPOSTA_OPCOES;
    }
    
      
    private String COD_OPCOES, RESPOSTA_OPCOES;

    public String getCOD_OPCOES() {
        return COD_OPCOES;
    }

    public void setCOD_OPCOES(String COD_OPCOES) {
        this.COD_OPCOES = COD_OPCOES;
    }

    public String getRESPOSTA_OPCOES() {
        return RESPOSTA_OPCOES;
    }

    public void setRESPOSTA_OPCOES(String RESPOSTA_OPCOES) {
        this.RESPOSTA_OPCOES = RESPOSTA_OPCOES;
    }

    String COD_OPCOES() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    }
    
