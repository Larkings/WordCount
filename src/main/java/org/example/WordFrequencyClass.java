package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WordFrequencyClass implements WordFrequency{
  private final String word;
  private final int frequency;
}
