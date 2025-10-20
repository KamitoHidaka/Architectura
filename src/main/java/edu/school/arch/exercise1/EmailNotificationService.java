package edu.school.arch.exercise1;
public class EmailNotificationService extends NotificationService { protected Notifier createNotifier(){ return new EmailNotifier(); } }
