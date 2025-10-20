package edu.school.arch.exercise1;
public class EmailNotifier implements Notifier { public void send(String to,String subject,String body){ System.out.println("[EMAIL] to="+to+" | subject="+subject+" | body="+body); } }
