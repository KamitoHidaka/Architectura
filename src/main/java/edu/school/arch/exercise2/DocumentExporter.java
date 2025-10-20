package edu.school.arch.exercise2;
public abstract class DocumentExporter { protected abstract Document createDocument(); public void export(String content){ Document d = createDocument(); d.render(content);} }
