/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
/**
 *
 * @author Giovani
 */
public class testeConexao {
    public static void main(String[] args) {

        try(    
            Connection con = ConnectionFactory.getConnection();
            CallableStatement clst = con.prepareCall(SQL_SCRIPTS.PROCEDURE_insertAeronaveNaFrota.getSql());
            //PreparedStatement stmt = con.prepareStatement("select * from aeronave");
        ){
//            clst.registerOutParameter(1,Types.BOOLEAN);
            clst.setString(1, "King air");
            clst.setString(2, "GOL");
            clst.execute();
//            boolean essamerda = clst.getBoolean(1);
            
            //System.out.println(essamerda);
            //ResultSet rs = stmt.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getString("Modelo"));
//            
//            }
            
            
            
           //con.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
