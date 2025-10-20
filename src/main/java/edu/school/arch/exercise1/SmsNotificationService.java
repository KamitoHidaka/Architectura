package edu.school.arch.exercise1;
public class SmsNotificationService extends NotificationService { protected Notifier createNotifier(){ return new SmsNotifier(); } }
