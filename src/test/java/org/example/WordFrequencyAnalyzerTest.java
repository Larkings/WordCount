package org.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WordFrequencyAnalyzerTest {
  WordFrequencyAnalyzerClass analyzer = new WordFrequencyAnalyzerClass();
  @Test
  public void testCalculateHighestFrequency() {
    String text = "hello Hello hello hello world";
    int highestFrequency = analyzer.calculateHighestFrequency(text);
    assertEquals(4, highestFrequency);
  }


  @Test
  public void testCalculateFrequencyForWord() {
    String text = "hallo Hello hallo hello world";
    int frequency = analyzer.calculateFrequencyForWord(text, "hello");
    assertEquals(2, frequency);
  }

  @Test
  public void testCalculateFrequencyForWord_NonexistentWord() {
    int frequency = analyzer.calculateFrequencyForWord("text", "nonexistent");
    assertFalse(frequency > 0);
  }

  @Test
  public void testCalculateMostFrequentNWords() {
    String text = "hello Hello hello hello world";
    List<WordFrequency> mostFrequentWords = analyzer.calculateMostFrequentNWords(text, 2);
    assertEquals(2, mostFrequentWords.size());
  }

}
