/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Random;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.sql.Connection;
import java.util.Arrays;

/**
 *
 * @author Jack
 */
//this class is to store any functions/methods i need throughout the runtime of the program
class Functions {

    public static String generatePassword(String p) {
        //strings below relate to which characters will go into the password
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";
        // appends the character to the length of PW_LENGTH
        final int PW_L = 10; //length of password is 10, as is for the VPN
        Random rnd = new SecureRandom();
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < PW_L; i++) {
            pass.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        String temp = pass.toString();
        return temp; //returns to Pass
    }

    //both methods below function near identically, just depends what statement is made 
    public static int saveFile(PreparedStatement ps, String file, String table) throws SQLException, IOException {

        ps.setString(1, null);
        ps.setString(2, table); //the table specified for when the user selects
        ps.setString(3, "X:\\My Documents\\NetBeansProjects\\SurreyPolice\\" + file + ".del"); //where the file will go
        ps.setString(4, ";");
        ps.setString(5, "%");
        ps.setString(6, null);
        return ps.executeUpdate();
    }

}

//here is a subclass
class CallCrime {

    //declare the variables as final
    private final int CRIME_ID;
    private final Date DATE;
    private final String REPORTED_FROM, LOCATION, OUTCOMES;

    public CallCrime(int crimeID, Date Date, String reportedFrom, String Location, String Outcomes) {
        //assigns the value of the parameter a to the field of the same name
        this.CRIME_ID = crimeID;
        this.DATE = Date;
        this.REPORTED_FROM = reportedFrom;
        this.LOCATION = Location;
        this.OUTCOMES = Outcomes;
    }

    //and then, return these values
    public int getCrimeID() {
        return CRIME_ID;
    }

    public Date getDate() {
        return DATE;
    }

    public String getreportedFrom() {
        return REPORTED_FROM;
    }

    public String getLocation() {
        return LOCATION;
    }

    public String getOutcomes() {
        return OUTCOMES;
    }
}

class CallPersons {

    private final int PERSON_ID;
    private final String FIRST_NAME, LAST_NAME, ETHNIC_MAKEUP, COUNTRY_OF_ORIGIN;
    private final Date DATE_OF_BIRTH;
    private final boolean PREV_CONVICTIONS;

    public CallPersons(int personID, String FirstName, String LastName, String EthnicMakeup, String CountryOfOrigin, Date DateOfBirth, boolean PrevConvictions) {
        this.PERSON_ID = personID;
        this.FIRST_NAME = FirstName;
        this.LAST_NAME = LastName;
        this.ETHNIC_MAKEUP = EthnicMakeup;
        this.COUNTRY_OF_ORIGIN = CountryOfOrigin;
        this.DATE_OF_BIRTH = DateOfBirth;
        this.PREV_CONVICTIONS = PrevConvictions;
    }

    public int getPersonID() {
        return PERSON_ID;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public String getEthnicMakeup() {
        return ETHNIC_MAKEUP;
    }

    public String getCountyOfOrigin() {
        return COUNTRY_OF_ORIGIN;
    }

    public Date getDateOfBirth() {
        return DATE_OF_BIRTH;
    }

    public boolean getPrevConvictions() {
        return PREV_CONVICTIONS;
    }
}

class CallOperations {

    private final int CRIME_ID, PERSON_ID;
    private final String REPORTED_FOR;
    private final boolean OPERATION;

    public CallOperations(int crimeID, int personID, String reportedFor, boolean Operation) {
        this.CRIME_ID = crimeID;
        this.PERSON_ID = personID;
        this.REPORTED_FOR = reportedFor;
        this.OPERATION = Operation;
    }

    public int getCrimeID() {
        return CRIME_ID;
    }

    public int getPersonID() {
        return PERSON_ID;
    }

    public String getreportedFor() {
        return REPORTED_FOR;
    }

    public boolean getOperation() {
        return OPERATION;
    }
}

class CallOfficers {

    private final int OFFICER_ID, CATAGORY_ID;
    private final String FIRST_NAME, LAST_NAME;

    public CallOfficers(int officerID, String firstName, String lastName, int catagoryID) {
        this.OFFICER_ID = officerID;
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.CATAGORY_ID = catagoryID;
    }

    public int getOfficerID() {
        return OFFICER_ID;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public int getCatagoryID() {
        return CATAGORY_ID;
    }
}

class CallRanks {

    private final String NAME;
    private final int TWO;

    public CallRanks(String name, int two) {
        this.NAME = name;
        this.TWO = two; //2 is the field used when displaying the query
    }

    public String getName() {
        return NAME;
    }

    public int getTwo() {
        return TWO;
    }

}

class CreateList {

    public static ArrayList<CallCrime> crimeList() {
        ArrayList<CallCrime> crimeList = new ArrayList<>(); //create the arraylist
        try {
            //host, pass and name relate to the login to the database. without this i cannot access the database (in return i cannot access the items needed)
            String host = "jdbc:derby://localhost:1527/surreypolice";
            String name = "surreypolice";
            String pass = "admin";
            Connection con = DriverManager.getConnection(host, name, pass); //connecting using host, username and password
            String query1 = "SELECT * FROM tblCrimes"; //the SQL query 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            CallCrime callcrime; //creates an object of CallCrime 
            while (rs.next()) {
                callcrime = new CallCrime(rs.getInt("crimeID"), rs.getDate("Date"), rs.getString("reportedFrom"), rs.getString("Location"), rs.getString("Outcomes"));
                crimeList.add(callcrime);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return crimeList;
    }

    public static ArrayList<CallPersons> personList() {
        ArrayList<CallPersons> personList = new ArrayList<>(); //create the arraylist
        try {
            //host, pass and name relate to the login to the database. without this i cannot access the database (in return i cannot access the items needed)
            String host = "jdbc:derby://localhost:1527/surreypolice";
            String name = "surreypolice";
            String pass = "admin";
            Connection con = DriverManager.getConnection(host, name, pass); //connecting using host, username and password
            String query2 = "SELECT * FROM tblPersons"; //the SQL query 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query2);
            CallPersons callpersons; //creates an object of CallPersons
            while (rs.next()) {
                callpersons = new CallPersons(rs.getInt("personID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("EthnicMakeup"), rs.getString("CountryOfOrigin"), rs.getDate("DateOfBirth"), rs.getBoolean("PrevConvictions"));
                personList.add(callpersons);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return personList;
    }

    public static ArrayList<CallOperations> operationList() {
        ArrayList<CallOperations> opList = new ArrayList<>(); //create the arraylist
        try {
            //host, pass and name relate to the login to the database. without this i cannot access the database (in return i cannot access the items needed)
            String host = "jdbc:derby://localhost:1527/surreypolice";
            String name = "surreypolice";
            String pass = "admin";
            Connection con = DriverManager.getConnection(host, name, pass); //connecting using host, username and password
            String query1 = "SELECT * FROM tblOperations"; //the SQL query 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            CallOperations calloperations; //creates an object of Calloperation
            while (rs.next()) {
                calloperations = new CallOperations(rs.getInt("crimeID"), rs.getInt("PersonID"), rs.getString("ReportedFor"), rs.getBoolean("Operation"));
                opList.add(calloperations);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return opList;
    }

    public static ArrayList<CallOfficers> officerList() {
        ArrayList<CallOfficers> offList = new ArrayList<>(); //create the arraylist
        try {
            //host, pass and name relate to the login to the database. without this i cannot access the database (in return i cannot access the items needed)
            String host = "jdbc:derby://localhost:1527/surreypolice";
            String name = "surreypolice";
            String pass = "admin";
            Connection con = DriverManager.getConnection(host, name, pass); //connecting using host, username and password
            String query1 = "SELECT * FROM tblOfficers"; //the SQL query 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            CallOfficers callofficers; //creates an object of Callofficers
            while (rs.next()) {
                callofficers = new CallOfficers(rs.getInt("officerID"), rs.getString("firstName"), rs.getString("lastName"), rs.getInt("catagory_ID"));
                offList.add(callofficers);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return offList;
    }

    public static ArrayList<CallRanks> rankList() {
        ArrayList<CallRanks> rankList = new ArrayList<>();
        try {
            String sql = "SELECT parent.name, COUNT(tblOfficers.firstname)" //count firstnames in officers
                    + "FROM tblNestedRanks AS node, tblNestedRanks AS parent, tblOfficers WHERE node.lft BETWEEN parent.lft " //tbl ranks is set as a node, and parent 
                    + "AND parent.rgt AND node.catagory_id = tblOfficers.catagory_id " //catagory_id for both are the same...
                    + "GROUP BY parent.name ";
            String host = "jdbc:derby://localhost:1527/surreypolice";
            String name = "surreypolice";
            String pass = "admin";
            Connection conn = DriverManager.getConnection(host, name, pass); //connect 
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            CallRanks callranks;
            while (rs.next()) {
                callranks = new CallRanks(rs.getString("Name"), rs.getInt("2")); //it's "2" due to the reason that doing this command in sql will display the second table as "2", hence the placement.
                rankList.add(callranks);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rankList;
    }
}

class CreateCrimes {

    //passed values go here
    public static int ExecPS(PreparedStatement queryCrimes, int id, java.sql.Date sdate, String reportedFrom, String location, String outcome) throws SQLException {
        //query to insert the values into the java strings
        queryCrimes.setInt(1, id);
        queryCrimes.setDate(2, sdate); //automatically sanitizes and adds quotes
        queryCrimes.setString(3, reportedFrom);
        queryCrimes.setString(4, location);
        queryCrimes.setString(5, outcome);
        return queryCrimes.executeUpdate();//returns the number of rows changed
    }
}

class CreatePersons {

    //passed values go here
    public static int ExecPS(PreparedStatement queryPersons, int id, String firstName, String lastName, java.sql.Date sdob, String ethnicity, String countryOfOrigin, boolean prevOperations) throws SQLException {
        //query to insert the values into the java strings
        queryPersons.setInt(1, id);
        queryPersons.setString(2, firstName); //automatically sanitizes and adds quotes
        queryPersons.setString(3, lastName);
        queryPersons.setDate(4, sdob);
        queryPersons.setString(5, ethnicity);
        queryPersons.setString(6, countryOfOrigin);
        queryPersons.setBoolean(7, prevOperations);
        return queryPersons.executeUpdate();//returns the number of rows changed
    }
}

class CreateOperations {

    //passed values go here
    public static int ExecPS(PreparedStatement queryOperations, int id, String arrestedFor, boolean operation) throws SQLException {
        //query to insert the values into the java strings
        queryOperations.setInt(1, id);
        queryOperations.setInt(2, id); //automatically sanitizes and adds quotes
        queryOperations.setString(3, arrestedFor);
        queryOperations.setBoolean(4, operation);
        return queryOperations.executeUpdate();//returns the number of rows changed
    }
}

class EditCrimes {

    //passed values go here
    public static int ExecPS(PreparedStatement queryCrimes, java.sql.Date sdate, String reportedFrom, String location, String outcome) throws SQLException {
        //query to insert the values into the java strings
        queryCrimes.setDate(1, sdate); //automatically sanitizes and adds quotes
        queryCrimes.setString(2, reportedFrom);
        queryCrimes.setString(3, location);
        queryCrimes.setString(4, outcome);
        return queryCrimes.executeUpdate();//returns the number of rows changed
    }
}

class EditPersons {

    //passed values go here
    public static int ExecPS(PreparedStatement queryPersons, String firstName, String lastName, java.sql.Date sdob, String ethnicity, String countryOfOrigin, boolean prevConvictions) throws SQLException {
        //query to insert the values into the java strings
        queryPersons.setString(1, firstName); //automatically sanitizes and adds quotes
        queryPersons.setString(2, lastName);
        queryPersons.setDate(3, sdob);
        queryPersons.setString(4, ethnicity);
        queryPersons.setString(5, countryOfOrigin);
        queryPersons.setBoolean(6, prevConvictions);
        return queryPersons.executeUpdate();//returns the number of rows changed
    }
}

class EditOperations {

    //passed values go here
    public static int ExecPS(PreparedStatement queryOperations, String arrestedFor, boolean operation) throws SQLException {
        //query to insert the values into the java strings
        queryOperations.setString(1, arrestedFor);
        queryOperations.setBoolean(2, operation);
        return queryOperations.executeUpdate();//returns the number of rows changed
    }
}

class JTextFieldLimit extends PlainDocument {

    private int limit;

    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }
        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}

class functstr {

    static int lengthLeft, lengthRight;

    public static void q(String[] a) {
        if (a.length < 1) {
            return; //if the length of the array is equal to one then return the value
        }
        String p = a[a.length - 1]; // p is the pivot of the sort

        lengthLeft = lengthRight = 0; //declaring left and right as 0
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].compareTo(p) <= p.length()) {
                lengthLeft++;
            } else {
                lengthRight++;
            }
        }

        String[] left = new String[lengthLeft];
        String[] right = new String[lengthRight];

        int x = 0;
        int y = 0;

        for (int k = 0; k < a.length - 1; k++) {
            if (a[k].compareTo(p) <= p.length()) {
                left[x++] = a[k];
            } else {
                right[y++] = a[k];
            }
        }

        q(left); //recursive
        q(right); //recursive

        int k = 0;

        for (x = 0; x < left.length; x++) {
            a[k++] = left[x];
        }
        a[k++] = p;

        for (x = 0; x < right.length; x++) {
            a[k++] = right[x];
        }

    }
}
class hash {
static int h (String string) {

   int hash = 0xAAAAAAAA;


   for (int i = 0; i < string.length(); i++) //from i to the screen length...
   {
      hash = ((hash << 5) ^ (hash >> 27)) ^ (string.charAt(i)); //shift bits left and right
      hash = ((hash << 7) ^ (hash >> 18)) ^ (string.charAt(i)); //shift then again
   }

   return hash;
}
}