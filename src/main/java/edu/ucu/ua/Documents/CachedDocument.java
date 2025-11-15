package edu.ucu.ua.Documents;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CachedDocument implements Document {
    private Document document;
    private String cacheKey;

    public String parse() {
        String cached = loadFromCache(cacheKey);

        if (cached != null) {
            return cached;
        }

        String result = document.parse();

        saveToCache(cacheKey, result);

        return result;
    }

    private String loadFromCache(String key) {return null;}

    private void saveToCache(String key, String val) {}
}
