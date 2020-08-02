public class CustomerManager extends BaseLogger{
    public void add(){
        System.out.println("Müşteri eklendi");
        DatabaseLogger logger=new DatabaseLogger();
        logger.log("Log mesajı");
    }

}
