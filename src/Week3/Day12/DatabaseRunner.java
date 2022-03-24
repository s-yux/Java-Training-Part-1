package Week3.Day12;

interface Database1 {
    void connect();
    void close();
}

interface Database2{
    void add();
    void update();
}

class FirestoreDB implements Database1 {

    @Override
    public void connect() {
        System.out.println("Firestore DB connection established");
    }

    @Override
    public void close() {
        System.out.println("Firestore DB connection closed.");
    }
}

class MySqlDB implements Database1 {

    @Override
    public void connect() {
        System.out.println("MySql DB connection established");
    }

    @Override
    public void close() {
        System.out.println("MySql DB connection closed.");
    }
}

class BestDatabase implements Database1, Database2{

    @Override
    public void connect() {
        System.out.println("Best database connecting...");
    }

    @Override
    public void close() {
        System.out.println("Best database closing...");
    }

    @Override
    public void add() {
        System.out.println("Best database adding...");
    }

    @Override
    public void update() {
        System.out.println("Best database updating...");
    }
}

class Data {
    void grant(Database1 db) {
        db.connect();
        db.close();
    }
}

public class DatabaseRunner {
    public static void main(String[] args) {
//        FirestoreDB firestoreDB = new FirestoreDB();
//        MySqlDB mySqlDB = new MySqlDB();
//
//        Data data = new Data();
//        data.grant(firestoreDB);
//        data.grant(mySqlDB);

        BestDatabase bestDatabase = new BestDatabase();
        bestDatabase.connect();
        bestDatabase.add();
        bestDatabase.update();
        bestDatabase.close();
    }
}

