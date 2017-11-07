# Naive Bayesian Spam Filter 
- This is the implelemtnation of Naive Bayesian Spam Filter.
- Visit my [blog post](https://dafuqisthatblog.wordpress.com/2017/07/29/naive-bayesian-spam-filter/) for the theories behind.

## Basic info
- **OS**: Windows.
- **Language**: Java.
- **Third library**: Google Guava. The library is included in the repository. However you have to manually add the JAR file into the library yourself.
- **Java competency**: Experienced.
- **Prerequesties**: A machine that is able to run java programs.

## Insights:
- Conditional probabilities finally prove its usefulness. It's truly beautiful how theories play out so neatly in practice. Do not underestimate the power of statistic courses ( although they didn't help me much, lol ).

## What does this program do ?
- It takes in a training dataset and a text and produces a binary decision wether the text is ham or spam, the accuracy depends on the dataset.

## This project consists of two classes:
- **Word** is the class that represents a word. It records the frequency of each occurence classified as either spam or ham of the word. It also calculates the probability of that word being a spam or a ham if the parameter totHam and totSpam is passed into one of its function.
- **Bayes** is the class that takes care of reading in two arguments, the former is the training dataset and the latter is the text to be classified. It also takes all the sum of probabilities of all words to decide wether the text is ham or spam.

