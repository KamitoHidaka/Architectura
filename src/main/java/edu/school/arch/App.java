package edu.school.arch;

import edu.school.arch.exercise1.*;
import edu.school.arch.exercise2.*;

public class App {
    public static void main(String[] args){
        System.out.println("==== E1 ====");
        new NotificationClient().run(new EmailNotificationService());
        new NotificationClient().run(new SmsNotificationService());
        new NotificationClient().run(new PushNotificationService());
        System.out.println("==== E2 ====");
        new PdfExporter().export("Reporte de préstamos");
        new CsvExporter().export("user,book,daysLate\\nu1,book9,3");
    }
}
