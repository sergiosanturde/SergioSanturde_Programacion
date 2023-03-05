package database;

public interface SchemaBD {

    String URL_SERVER = "127.0.0.1:3306";
    String DB_NAME = "empresa";
    String TAB_USU = "usuario";
    String COL_ID = "id";
    String COL_NOMBRE_USU = "Nombre";
    String COL_APELLIDO_USU = "Apellido";
    String COL_TLF_USU = "Telefono";
    String COL_SUE_USU = "Sueldo";
    String COL_PAIS_USU = "Pais";
    String COL_PERF_USU = "Perfil";

    String TAB_PERF = "perfiles";
    String COL_ID_PERF = "id";
    String COL_NOMBRE_PERF = "Nombre";

}
