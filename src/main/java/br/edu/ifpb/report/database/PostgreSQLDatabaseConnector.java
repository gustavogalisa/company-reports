package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector implements DBConnector{

    public void openConnection() {
        System.out.println("Create postgres connetion");
    }
    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }
}
