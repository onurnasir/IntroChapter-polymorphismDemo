public class DatabaseLogger extends BaseLogger {
    public void log(String message) { // Bu class, Filelogger ve EmailLogger classları bu bloklar ile override
        System.out.println("Logged to database:" + message);
    }
}