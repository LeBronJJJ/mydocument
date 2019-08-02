
public class Database {
    private Database(){

    }
    private static Database instance = new Database();
    private static Database getInstance(){
        return instance;
    }
}
