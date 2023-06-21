package com.example.ejercicio1_ajimenez.Configuracion;

public class Transacciones
{
    public static final String NameDatabase = "DB";

    public static final  String tablaResultado = "resultados";
    public static final String id = "id";
    public static final String num1 = "num1";
    public static final String num2 = "num2";
    public static final String resultado = "resultados";

    public static final String CreateTablePersona = "CREATE TABLE resultados"+
            "( id INTEGER PRIMARY KEY AUTOINCREMENT, num1 INTEGER, num2 INTEGER, resultado INTEGER)";

    public static final String DROPTablePersonas = "DROP TABLE IF EXISTS resultados";

    // DML
    public static final String SelectTablePersona = "SELECT * FROM " + Transacciones.tablaResultado;


}
