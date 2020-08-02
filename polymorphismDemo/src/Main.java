public class Main {

    public static void main(String[] args) {

//        FileLogger fileLogger = new FileLogger();
//        DatabaseLogger databaseLogger = new DatabaseLogger();
//        EmailLogger logger = new EmailLogger(); //Bu yukarıdaki class'lar ilede aşağıdaki verilere extends sayesinde log bloğuna ulaşabilirdik.
//        logger.Log("Email Log mesajı");

        //Aşağıdaki yapıdan da görüleceği üzere array yapısı inheritance içerinde de kullanılabilir.
        BaseLogger[] Loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
        //Sisteme sonda eklediğimiz Console class'ını bir yukardaki array yapısına enjekte ediyoruz.
        // Böylece sisteme plug and play yani tak çalıştır diyebiliriz.
        for (BaseLogger logger:Loggers){
            logger.log("Log mesajı");
        }
    }
}
