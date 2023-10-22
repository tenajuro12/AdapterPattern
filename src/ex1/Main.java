package ex1;

import ex1.AdapterPostgreToJS;

public class Main {
    public static void main(String[] args) {
        PostgreSQLCode postgreSQL= new AdapterPostgreToJS();
        postgreSQL.select();
        postgreSQL.update();
        postgreSQL.delete();
    }
}