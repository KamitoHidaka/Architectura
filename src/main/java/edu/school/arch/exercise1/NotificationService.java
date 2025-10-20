package edu.school.arch.exercise1;
public abstract class NotificationService { protected abstract Notifier createNotifier(); public void notifyUser(String to,String subject,String body){ Notifier n = createNotifier(); n.send(to,subject,body);} }
