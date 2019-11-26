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
    PROCEDURE_insertAeronaveNaFrota("{call insertAeronaveNaFrota(?,?)}");
    
    
    private final String sql;
    SQL_SCRIPTS(String sql){
        this.sql = sql; 
    }
    
    public String getSql() {
        return sql;
    }    
}
