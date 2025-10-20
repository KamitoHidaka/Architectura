package edu.school.arch.exercise1;
public class SmsNotifier implements Notifier { public void send(String to,String subject,String body){ System.out.println("[SMS] to="+to+" | msg="+body); } }
