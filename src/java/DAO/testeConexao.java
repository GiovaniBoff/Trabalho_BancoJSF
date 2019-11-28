/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import oracle.jdbc.OracleType;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author Giovani
 */
public class testeConexao {
    public static void main(String[] args) {

        try(    
            Connection con = ConnectionFactory.getConnection();
            CallableStatement clst = con.prepareCall(SQL_SCRIPTS.PROCEDURE_selecionaPortoesDisponiveis.getSql());
            //PreparedStatement stmt = con.prepareStatement("select * from aeronave");
        ){
//            clst.registerOutParameter(1,Types.BOOLEAN);
         
//            clst.registerOutParameter(2,OracleTypes.NUMBER);
//            clst.setString(1,"TAM");
            
            clst.setString(1,"2019/08/16");
            clst.setString(2, "airbus a319");
            clst.registerOutParameter(3, OracleTypes.CURSOR);
            clst.execute();
            
            //System.out.println(essamerda);
            
            System.out.println(clst.getObject(3));
            ResultSet rs = (ResultSet)clst.getObject(3);
            while(rs.next()){
                System.out.println(rs.getString("nome"));
            
            }
            
            
            
           con.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
