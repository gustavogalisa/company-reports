package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DBConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends Report{

    DBConnector createDatabaseConnector() {

        return new MysqlDatabaseConnector();
    }

    public void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        createDatabaseConnector().executeQuery(query);
    }

    public void convertToFile() {
        System.out.println("Converting To PDF...");
    }
}
