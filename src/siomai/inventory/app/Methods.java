package siomai.inventory.app;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class Methods {
    //Static Variables
    static java.sql.Connection conn  = null;
    static java.sql.Statement stmt = null;
    static File temp = new File("database.sqlite");
    //static String url = "jdbc:sqlite:" + temp.getAbsolutePath().replace("\\","\\\\");
    static String url = "jdbc:sqlite:C:\\Users\\Conrad Francisco Jr\\Desktop\\TransactionManagement\\src\\siomai\\inventory\\app\\database.sqlite";
    static String error = "";
    
    public static boolean openDB(){
        boolean result = false;
        try{
            Class.forName("org.sqlite.JDBC");
            conn = java.sql.DriverManager.getConnection(url);

            System.out.println("OK! SQLite DB session connected.");
            result = true;
        }
        catch(Exception e){
            error = e.getMessage();
            System.out.println("Open DB Error:" + e.getMessage());
        } 
        return result;
    }

    //Close DB Session Method
    public static boolean closeDB(){
        boolean result = false;
        try{
            conn.close();

            System.out.println("OK! SQLite DB session closed.");
            result = true;
        }
        catch(Exception e){
            error = e.getMessage();
            System.out.println("Close DB Error: " + e.getMessage());
        }
        return result;
    }       
        //Open DB Session Method
    public static Connection opensDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn = java.sql.DriverManager.getConnection(url);
            System.out.println("OK! SQLite DB session connected.");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        } 
    }

    //Close DB Session Method
    public static Connection closesDB(){
        try{
            conn.close();
            System.out.println("OK! SQLite DB session closed.");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }    

    //Create Record Method
    public static boolean create(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +" VALUES(" + values + ")";
            stmt.executeUpdate(query);
            //You can include exception handling here. (e.g. Duplicate Data, etc.)
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
    public static boolean createq(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(Date, ProductID, Quantity, EmployeeID, BeginningSteam) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
    public static boolean createqn(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(Date, ProductID, Quantity, EmployeeID) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
    public static boolean createz(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(Date, ProductID, Quantity, EmployeeID, EndingSteam, StockOutStatus) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
    public static boolean createzn(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(Date, ProductID, Quantity, EmployeeID) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
    public static boolean createlogs(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(EmployeeID, LoginDate, LogoutDate) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            //You can include exception handling here. (e.g. Duplicate Data, etc.)
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
        public static boolean createnp(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(ProductName, Quantity, Price) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            //You can include exception handling here. (e.g. Duplicate Data, etc.)
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
        public static boolean createsales(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(ProductID, Quantity, Total) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            //You can include exception handling here. (e.g. Duplicate Data, etc.)
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
        }
        public static boolean createexpenses(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(ProductID, Date, Quantity, Price, Total) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            //You can include exception handling here. (e.g. Duplicate Data, etc.)
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
        }
        public static boolean createuser(String table, String values){
        boolean result = false;
        try{
            Methods.stmt = conn.createStatement();
            String query = "INSERT INTO "+ table +"(EmployeeID, Position) VALUES(" + values + ")";
            stmt.executeUpdate(query);
            //You can include exception handling here. (e.g. Duplicate Data, etc.)
            result = true;
        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
        }
    //Update Record Method
    public static boolean update(String table, String set, String set2, int id){
        boolean result = false;
        try{
            String queryCheck = "SELECT EmployeeID from "+ table +" WHERE EmployeeID = '" + id + "'";
            PreparedStatement con = conn.prepareStatement(queryCheck);
            ResultSet resultSet = con.executeQuery();
            if(!resultSet.next()) {
                System.out.println("Data does not exist in the database!");
            }
            else{
                do{
                    Methods.stmt = conn.createStatement();
                    String query = "UPDATE "+ table +" SET " + set + ","+ set2 + " WHERE EmployeeID=" + id;
                    stmt.executeUpdate(query);
                
                    result = true;
                    
                }while(resultSet.next());
            }

        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
        public static boolean update1(String table, String set, int id){
        boolean result = false;
        try{
            String queryCheck = "SELECT ProductID from "+ table +" WHERE ProductID = '" + id + "'";
            PreparedStatement con = conn.prepareStatement(queryCheck);
            ResultSet resultSet = con.executeQuery();
            if(!resultSet.next()) {
                System.out.println("Data does not exist in the database!");
            }
            else{
                do{
                    Methods.stmt = conn.createStatement();
                    String query = "UPDATE "+table+" SET "+set+" WHERE ProductID=" + id;
                    stmt.executeUpdate(query);
                
                    result = true;
                    
                }while(resultSet.next());
            }

        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
        public static boolean updateuser(String table, String set, int id){
        boolean result = false;
        try{
            String queryCheck = "SELECT EmployeeID from "+ table +" WHERE EmployeeID = '" + id + "'";
            PreparedStatement con = conn.prepareStatement(queryCheck);
            ResultSet resultSet = con.executeQuery();
            if(!resultSet.next()) {
                System.out.println("Data does not exist in the database!");
            }
            else{
                do{
                    Methods.stmt = conn.createStatement();
                    String query = "UPDATE "+table+" SET "+set+" WHERE EmployeeID=" + id;
                    stmt.executeUpdate(query);
                
                    result = true;
                    
                }while(resultSet.next());
            }

        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
    public static boolean updatetime(String table, Timestamp time, int id){
        boolean result = false;
        try{
            String queryCheck = "SELECT LogID from "+ table +" WHERE LogID = '" + id + "'";
            PreparedStatement con = conn.prepareStatement(queryCheck);
            ResultSet resultSet = con.executeQuery();
            if(!resultSet.next()) {
                System.out.println("Data does not exist in the database!");
            }
            else{
                do{
                    Methods.stmt = conn.createStatement();
                    String query = "UPDATE "+ table +" SET " + time +" WHERE LogID=" + id;
                    stmt.executeUpdate(query);
                
                    result = true;
                    
                }while(resultSet.next());
            }

        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }    

    //Delete Record Method
    public static boolean deleteuser(String table, int id){
        boolean result = false;
        try{
            String queryCheck = "SELECT EmployeeID from "+ table +" WHERE EmployeeID = '" + id + "'";
            PreparedStatement con = conn.prepareStatement(queryCheck);
            ResultSet resultSet = con.executeQuery();
            if(!resultSet.next()){
                System.out.println("Data does not exist in the database!");
            }
            else{
                do{
                    Methods.stmt = conn.createStatement();
                    String query = "DELETE FROM "+ table + " WHERE EmployeeID=" + id;
                    stmt.executeUpdate(query);
                    result = true;
                    
                }while(resultSet.next());
            }

        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
    public static boolean delete(String table, int id){
        boolean result = false;
        try{
            String queryCheck = "SELECT ID from "+ table +" WHERE ID = '" + id + "'";
            PreparedStatement con = conn.prepareStatement(queryCheck);
            ResultSet resultSet = con.executeQuery();
            if(!resultSet.next()){
                System.out.println("Data does not exist in the database!");
            }
            else{
                do{
                    Methods.stmt = conn.createStatement();
                    String query = "DELETE FROM "+ table + " WHERE ID=" + id;
                    stmt.executeUpdate(query);
                    result = true;
                    
                }while(resultSet.next());
            }

        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }
    public static boolean deleteproduct(String table, int id){
        boolean result = false;
        try{
            String queryCheck = "SELECT ProductID from "+ table +" WHERE ProductID = '" + id + "'";
            PreparedStatement con = conn.prepareStatement(queryCheck);
            ResultSet resultSet = con.executeQuery();
            if(!resultSet.next()){
                System.out.println("Data does not exist in the database!");
            }
            else{
                do{
                    Methods.stmt = conn.createStatement();
                    String query = "DELETE FROM "+ table + " WHERE ProductID=" + id;
                    stmt.executeUpdate(query);
                    result = true;
                    
                }while(resultSet.next());
            }

        }
        catch(Exception e){
            System.out.println("Create Error: " + e.getMessage());
        }
        return result;
    }

    public static String[][] read(String table){
        String[][] records = null;
        try{
            Methods.stmt = conn.createStatement();

            //Count total rows
            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM " + table);
            int totalRows = rs.getInt(1);

            //Count total columns
            rs = stmt.executeQuery("SELECT * FROM " + table);
            ResultSetMetaData rsmd = rs.getMetaData();
            int totalColumns = rsmd.getColumnCount();

            //Initialize 2D Array "records" with totalRows by totalColumns
            records = new String[totalRows][totalColumns];

            //Retrieve the record and store it to 2D Array "records"
            int row=0;
            while(rs.next()){                
                for(int col=0,index=1;col<totalColumns;col++,index++){
                    records[row][col] = rs.getObject(index).toString();
                }
                row++;
            }            
        }
        catch(Exception e){
            System.out.println("Read Error: " + e.getMessage());
        }
        return records;
    }
    
    //Read Record Method
    public static String[][] read(String table, String[] columns){
        String[][] records = null;
        try{
            Methods.stmt = conn.createStatement();

            //Count total rows
            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM " + table);
            int totalRows = rs.getInt(1);

            //Count total columns
            int totalColumns = columns.length;
            String cols = "";
            for(int i=0;i<totalColumns;i++){
                cols += columns[i];
                if((i+1)!=totalColumns)cols+=", ";
            }
            rs = stmt.executeQuery("SELECT "+ cols +" FROM " + table);

            //Initialize 2D Array "records" with totalRows by totalColumns
            records = new String[totalRows][totalColumns];

            //Retrieve the record and store it to 2D Array "records"
            int row=0;
            while(rs.next()){                
                for(int col=0,index=1;col<totalColumns;col++,index++){
                    records[row][col] = rs.getObject(index).toString();
                }
                row++;
            }            
        }
        catch(Exception e){
            System.out.println("Read Error: " + e.getMessage());
        }
        return records;
    }  
    
    //Read Record Method with WHERE clause
    public static String[][] read(String table, String where){
        String[][] records = null;
        try{
            Methods.stmt = conn.createStatement();

            //Count total rows
            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM " + table + " WHERE " + where);
            int totalRows = rs.getInt(1);

            //Count total columns
            rs = stmt.executeQuery("SELECT * FROM " + table + " WHERE " + where);
            ResultSetMetaData rsmd = rs.getMetaData();
            int totalColumns = rsmd.getColumnCount();

            //Initialize 2D Array "records" with totalRows by totalColumns
            records = new String[totalRows][totalColumns];

            //Retrieve the record and store it to 2D Array "records"
            int row=0;
            while(rs.next()){                
                for(int col=0,index=1;col<totalColumns;col++,index++){
                    records[row][col] = rs.getObject(index).toString();
                }
                row++;
            }            
        }
        catch(Exception e){
            System.out.println("Read Error: " + e.getMessage());
        }
        return records;
    }       
    
    //Read Image Method
    public static byte[] read(String table, String column, int id){
        byte[] buffer = null;
        try{
            String query = "SELECT " + column +" FROM " + table + " WHERE EmployeeID=?"; 
            ResultSet rs = null;
            java.sql.PreparedStatement pstmt = null;            
             
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            
            rs = pstmt.executeQuery();

            while (rs.next()) {
                buffer = rs.getBytes("IDPic");
            }
        }
        catch(Exception e){
            System.out.println("Read Error: " + e.getMessage());
        }
        return buffer;
    }
    
    public static boolean update(String table, byte[] image, String column, int id){
    //byte[] buffer = null;
        boolean result = false;
        try{
            String query = "UPDATE " + table +" SET "+ column +"=? WHERE EmployeeID=" + id; 
            ResultSet rs = null;
            java.sql.PreparedStatement pstmt = null;            
            
            pstmt = conn.prepareStatement(query);
            pstmt.setBytes(1, image);
            
            pstmt.executeUpdate();
            System.out.println("Image saved to database successfully!");
            result = true;
//            while (rs.next()) {
//                buffer = rs.getBytes("image");
//            }
        }
        catch(Exception e){
            System.out.println("Read Error: " + e.getMessage());
        }
        return result;
    }
    public static String[][] search(String table, int value){
        String[][] records = null;
        try{
            Methods.stmt = conn.createStatement();

            //Count total rows
            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM " + table + " WHERE EmployeeID like "+value+"");
            int totalRows = rs.getInt(1);

            //Count total columns
            rs = stmt.executeQuery("SELECT EmployeeID, FirstName, LastName, Birthdate, Gender, Position FROM " + table + " WHERE EmployeeID like "+value+"");
            ResultSetMetaData rsmd = rs.getMetaData();
            int totalColumns = rsmd.getColumnCount();

            records = new String[totalRows][totalColumns];

            int row=0;
            while(rs.next()){                
                for(int col=0,index=1;col<totalColumns;col++,index++){
                    records[row][col] = rs.getObject(index).toString();
                }
                row++;
            }            
        }
        catch(Exception e){
            System.out.println("Read Error: " + e.getMessage());
        }
        return records;
    }
        public static String[][] searchproduct(String table, int value){
        String[][] records = null;
        try{
            Methods.stmt = conn.createStatement();

            //Count total rows
            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM " + table + " WHERE ProductID like "+value+"");
            int totalRows = rs.getInt(1);

            //Count total columns
            rs = stmt.executeQuery("SELECT ProductID, ProductName, Price_Piece, Pieces_Pack, Quantity FROM " + table + " WHERE ProductID like "+value+"");
            ResultSetMetaData rsmd = rs.getMetaData();
            int totalColumns = rsmd.getColumnCount();

            records = new String[totalRows][totalColumns];

            int row=0;
            while(rs.next()){                
                for(int col=0,index=1;col<totalColumns;col++,index++){
                    records[row][col] = rs.getObject(index).toString();
                }
                row++;
            }            
        }
        catch(Exception e){
            System.out.println("Read Error: " + e.getMessage());
        }
        return records;
    }
        public static String[][] searchsupply(String table, int value){
        String[][] records = null;
        try{
            Methods.stmt = conn.createStatement();

            //Count total rows
            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM " + table + " WHERE ProductID like "+value+"");
            int totalRows = rs.getInt(1);

            //Count total columns
            rs = stmt.executeQuery("SELECT ProductID, ProductName, Quantity, Price FROM " + table + " WHERE ProductID like "+value+"");
            ResultSetMetaData rsmd = rs.getMetaData();
            int totalColumns = rsmd.getColumnCount();

            records = new String[totalRows][totalColumns];

            int row=0;
            while(rs.next()){                
                for(int col=0,index=1;col<totalColumns;col++,index++){
                    records[row][col] = rs.getObject(index).toString();
                }
                row++;
            }            
        }
        catch(Exception e){
            System.out.println("Read Error: " + e.getMessage());
        }
        return records;
    } 
    
    public static void main(String[] args) {

    }
   
}
