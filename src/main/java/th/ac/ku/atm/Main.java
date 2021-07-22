package th.ac.ku.atm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        atm.DataSourceFile dataSourceFile = new atm.DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);
//        atmUI.run();
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);
        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
