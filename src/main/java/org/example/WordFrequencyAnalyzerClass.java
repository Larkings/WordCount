package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer{
  @Override
  public int calculateHighestFrequency(String text) {
    return getWordFrequencies(text).values().stream().max(Integer::compare).orElse(0);
  }


  @Override
  public int calculateFrequencyForWord(String text, String word) {
    return getWordFrequencies(text).getOrDefault(word.toLowerCase(), 0);
  }

  @Override
  public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
    Map<String, Integer> frequencies = getWordFrequencies(text);
    return frequencies.entrySet().stream()
      .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
      .limit(n)
      .map(entry -> new WordFrequencyClass(entry.getKey(), entry.getValue()))
      .collect(Collectors.toList());
  }

  private Map<String, Integer> getWordFrequencies(String text) {
    Map<String, Integer> frequencies = new HashMap<>();
    for (String word : text.split("\\W+")) {
      frequencies.put(word.toLowerCase(), frequencies.getOrDefault(word.toLowerCase(), 0) + 1);
    }
    return frequencies;
  }
}
