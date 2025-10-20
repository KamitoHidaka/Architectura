package edu.school.arch.exercise1;
public class PushNotifier implements Notifier { public void send(String to,String subject,String body){ System.out.println("[PUSH] to="+to+" | title="+subject+" | body="+body); } }
