

import model.Gosc;
import model.Pokoj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


public class DBConnect extends FramePensjonat {

    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:C:\\Users\\HP\\Documents\\NetBeansProjects\\Pensjonat\\src\\database\\pensjonat.db";

    
//    jdbc:sqlite:C:\\Users\\HP\\Documents\\NetBeansProjects\\Pensjonat\\src\\database\\pensjonat.db [pensjonat on Default schema]
    
    private Connection conn;
    private Statement stat;

    public DBConnect() {

        try {
            Class.forName(DBConnect.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("\nBrak sterownika JDBC!\n");
            e.printStackTrace();
        }

        try {

            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();

        } catch (SQLException e) {
            System.err.println("\nProblem z otwarciem połączenia do bazy danych!\n");
            e.printStackTrace();
        }

        createTables();

    }

    public boolean createTables() {

        String createGosc = "CREATE TABLE IF NOT EXISTS goscie (id_goscia INTEGER PRIMARY KEY AUTOINCREMENT," +
                "imie varchar(255), nazwisko varchar(255), pesel varchar(255), nrTelefonu varchar(255), email varchar(255))";

        String createPokoj = "CREATE TABLE IF NOT EXISTS pokoje (id_pokoju INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "typ varchar(255), czyZajety int, liczbaOsob int, liczbaLozek int, lozkoPodwojne int, czyKlimatyzacja int," +
                "czyLazienka int, cena int, powierzchnia int, wyposazenie varchar(255))";

        String createCheckIn = "CREATE TABLE IF NOT EXISTS checkin (id_checkin INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "id_goscia int, id_pokoju int)";

        String createCheckOut = "CREATE TABLE IF NOT EXISTS checkin (id_checkout INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "id_goscia int, id_pokoju int)";


        try {
            stat.execute(createPokoj);
            stat.execute(createGosc);
            stat.execute(createCheckIn);
            stat.execute(createCheckOut);

        } catch (SQLException e) {
            System.err.println("\nBłąd przy tworzeniu tabel!\n");
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public boolean insertGosc(String imie, String nazwisko, String pesel, String nrTelefonu, String email) {

        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into goscie values (NULL, ?,?,?,?,?);");
            prepStmt.setString(1, imie);
            prepStmt.setString(2, nazwisko);
            prepStmt.setString(3, pesel);
            prepStmt.setString(4, nrTelefonu);
            prepStmt.setString(5, email);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("\nBłąd przy wstawianiu Gościa!\n");
            e.printStackTrace();
            return false;
        }
        return true;


    }


    public boolean insertPokoj(int id, String typ, int czyZajety, int liczbaOsob, int liczbaLozek,
                               int lozkoPodwojne, int czyKlimatyzacja, int czyLazienka,
                               int cena, int powierzchnia, String wyposazenie) {

        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into pokoje values (NULL, ?,?,?,?,?,?,?,?,?,?);");
            prepStmt.setString(1, typ);
            prepStmt.setInt(2, czyZajety);
            prepStmt.setInt(3, liczbaOsob);
            prepStmt.setInt(4, liczbaLozek);
            prepStmt.setInt(5, lozkoPodwojne);
            prepStmt.setInt(6, czyKlimatyzacja);
            prepStmt.setInt(7, czyLazienka);
            prepStmt.setInt(8, cena);
            prepStmt.setInt(9, powierzchnia);
            prepStmt.setString(10, wyposazenie);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("\nBłąd przy wstawianiu Pokoju!\n");
            e.printStackTrace();
            return false;
        }
        return true;


    }


    public boolean insertCheckIn(int idGoscia, int idPokoju) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into checkin(NULL, ?, ?);");
            prepStmt.setInt(1, idGoscia);
            prepStmt.setInt(2, idPokoju);
            prepStmt.execute();

        } catch (SQLException e) {
            System.err.println("\nBłąd przy procedurze Check-In!\n");
            return false;
        }
        return true;
    }


    public boolean insertCheckOut(int idGoscia, int idPokoju) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into checkout(NULL, ?, ?);");
            prepStmt.setInt(1, idGoscia);
            prepStmt.setInt(2, idPokoju);
            prepStmt.execute();

        } catch (SQLException e) {
            System.err.println("\nBłąd przy procedurze Check-Out!\n");
            return false;
        }
        return true;
    }


    public List<Gosc> selectGosc() {
        List<Gosc> goscie = new LinkedList<Gosc>();

        try {
            ResultSet result = stat.executeQuery("SELECT * FROM goscie");
            int id;
            String imie, nazwisko, pesel, nrTelefonu, email;

            while (result.next()) {
                id = result.getInt("id_goscia");
                imie = result.getString("imie");
                nazwisko = result.getString("nazwisko");
                pesel = result.getString("pesel");
                nrTelefonu = result.getString("nrTelefonu");
                email = result.getString("email");
                goscie.add(new Gosc(id, imie, nazwisko, pesel, nrTelefonu, email));
            }


        } catch (SQLException e) {
            System.out.println("Problem przy przesłaniu gościa");
            e.printStackTrace();
            return null;
        }
        return goscie;
    }


    public List<Pokoj> selectPokoj() {
        List<Pokoj> pokoje = new LinkedList<Pokoj>();

        try {
            ResultSet result = stat.executeQuery("SELECT  * FROM pokoje");
            int id;
            String typ;
            int czyZajety;
            int liczbaOsob;
            int liczbaLozek;
            int lozkoPodwojne;
            int czyKlimatyzacja;
            int czyLazienka;
            int cena;
            int powierzchnia;
            String wyposazenie;

            while (result.next()) {

                id = result.getInt("id_pokoju");
                typ = result.getString("typ");
                czyZajety = result.getInt("czyZajety");
                liczbaOsob = result.getInt("liczbaOsob");
                liczbaLozek = result.getInt("liczbaLozek");
                lozkoPodwojne = result.getInt("lozkoPodwojne");
                czyKlimatyzacja = result.getInt("czyKlimatyzacja");
                czyLazienka = result.getInt("czyLazienka");
                cena = result.getInt("cena");
                powierzchnia = result.getInt("powierzchnia");
                wyposazenie = result.getString("wyposazenie");

                pokoje.add(new Pokoj(id, typ, czyZajety, liczbaOsob, liczbaLozek, lozkoPodwojne,
                        czyKlimatyzacja, czyLazienka, cena, powierzchnia, wyposazenie));

            }
        } catch (SQLException e) {
            System.err.println("\nProblem z przesłaniem pokoju");
            e.printStackTrace();
            return null;
        }
        return pokoje;

    }

    public  void closeConnection(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("\nProblem z zamknieciem polaczenia");
            e.printStackTrace();
        }

    }



}
