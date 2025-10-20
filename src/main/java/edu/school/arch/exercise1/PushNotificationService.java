package edu.school.arch.exercise1;
public class PushNotificationService extends NotificationService { protected Notifier createNotifier(){ return new PushNotifier(); } }
