package br.edu.ifpb.report.database;

public interface DBConnector {
    public void openConnection();
    public void executeQuery(String query);
}
