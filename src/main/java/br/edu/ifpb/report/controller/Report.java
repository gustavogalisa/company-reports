package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DBConnector;

public abstract class Report {

    public void generate() {
        createDatabaseConnection();
        executeQuery();
        convertToFile();
    }

    private void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        DBConnector connector = createDatabaseConnector();
        connector.openConnection();
    }

    abstract DBConnector createDatabaseConnector();

    abstract void executeQuery();

    abstract void convertToFile();
}
