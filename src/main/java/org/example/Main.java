package org.example;

public class Main {
  public static void main(String[] args) {
    WordFrequencyAnalyzerClass analyzer = new WordFrequencyAnalyzerClass();
    String text = "The sun shines over the lake";
    System.out.println(analyzer.calculateHighestFrequency(text));
    System.out.println(analyzer.calculateFrequencyForWord(text, "the"));
    System.out.println(analyzer.calculateMostFrequentNWords(text, 3));
  }
}
