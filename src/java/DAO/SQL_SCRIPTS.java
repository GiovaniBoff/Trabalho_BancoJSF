/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Giovani
 */
public enum SQL_SCRIPTS {
    PROCEDURE_insertAeronaveNaFrota("{call insertAeronaveNaFrota(?,?)}"),
    PROCEDURE_totalFrotaComp("begin TOTALFROTACOMP(?,?); end;"),
    FUNCTION_isPortaoValid("begin ? := ISPORTAOVALID(?,?); end;"),
    PROCEDURE_pegaPortoesDisponiveis("declare begin PEGAPORTOESDISPONIVEIS(TO_DATE(?,'YYYY/MM/DD'),?,?); end;"),
    PROCEDURE_selecionaPortoesDisponiveis("begin SELECIONAPORTOESDISPONIVEIS(TO_DATE(?,'YYYY/MM/DD'),?,?); end;");
    
    private final String sql;
    SQL_SCRIPTS(String sql){
        this.sql = sql; 
    }
    
    public String getSql() {
        return sql;
    }    
}
