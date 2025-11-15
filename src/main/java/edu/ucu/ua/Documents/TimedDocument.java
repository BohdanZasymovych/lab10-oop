package edu.ucu.ua.Documents;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimedDocument implements Document{
    private Document document;

    public String parse() {
        long startTime = System.currentTimeMillis();
        String content = document.parse();
        long endTime = System.currentTimeMillis();

        System.out.println("Parsing time: " + (endTime-startTime) + " ms");

        return content;
    }
}
