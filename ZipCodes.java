import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ZipCodes {

	public static void main(String[] args) {
		 try {
			 
			 String FilePath="C:/Users/mdhoot/Desktop/ZipCode.txt";
				FileReader f=new FileReader(FilePath);
				BufferedReader bf=new BufferedReader(f);
				String zip=bf.readLine();
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 String url = "jdbc:sqlserver://;integratedSecurity=true;";
			 
			 Connection conn = DriverManager.getConnection(url);
			 	            Statement stmt = conn.createStatement();
	            ResultSet rs;
	 
	            rs = stmt.executeQuery(" select zipcode,City,State from Zip where zipcode=\'"+zip+"\'");
	            while ( rs.next() ) {
	                String city = rs.getString("City");
	                String state = rs.getString("State");
	                System.out.println(city+", "+state);
	            }
	            conn.close();
	        } catch (Exception e) {
	            System.err.println("Got an exception! ");
	            System.err.println(e.getMessage());
	            e.printStackTrace();
	        }

	}

}
