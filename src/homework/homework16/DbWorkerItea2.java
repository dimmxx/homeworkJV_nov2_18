package homework.homework16;

import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DbWorkerItea2 {

    private final static String ADD_SHAPE = "INSERT INTO mate (name, area, perimeter, user) VALUES (?, ?, ?, ?)";
    private final static String GET_SHAPE_ALL = "SELECT * FROM mate";
    private final static String COUNT_RECORDS = "SELECT COUNT (id) FROM MATE";

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL;

    private String USER;
    private String PASS;

    {
        try {
            USER = XmlController.readXML("creds.xml").getLogin();
            PASS = XmlController.readXML("creds.xml").getPassword();
            DB_URL = "jdbc:mysql://" + XmlController.readXML("creds.xml").getAddress();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection conn;
    private Statement st;

    public DbWorkerItea2() {
        try {
            Class.forName(JDBC_DRIVER).newInstance();
        } catch (Exception ex) {
            System.out.println("Connection error...");
        }

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public int CountRecords (){

        return 0;
    }

    public boolean addShape(ShapeClass shape) {
        try {
            PreparedStatement prs = conn.prepareStatement(ADD_SHAPE);
            prs.setString(1, shape.getName());
            prs.setString(2, String.valueOf(shape.getArea()));
            prs.setString(3, String.valueOf(shape.getPerimeter()));
            prs.setString(4, shape.getUser());
            prs.executeUpdate();
            prs.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<ShapeClass> getShapeAll() {
        ArrayList<ShapeClass> list = new ArrayList<>();
        String query = GET_SHAPE_ALL;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ShapeClass shape = new ShapeClass();
                shape.setId(Integer.parseInt(rs.getString(1)));
                shape.setName(rs.getString(2));
                shape.setArea(Double.parseDouble(rs.getString(3)));
                shape.setPerimeter(Double.parseDouble(rs.getString(4)));
                shape.setUser(rs.getString(5));
                list.add(shape);
            }
        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }
        //close();
        return list;
        
    }
}