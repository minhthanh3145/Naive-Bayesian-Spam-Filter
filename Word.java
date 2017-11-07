package bayes;

public class Word {
	String word;
	int spamCount;
	int hamCount;
	float spamRatio;
	float hamRatio;
	float probOfSpam;
	public Word(String w) {
		word = w;
		spamCount = 0;
		hamCount = 0;
	}
	
	public void spamCount(){spamCount++;}
	public void hamCount(){ hamCount++;}
	public void calculateProb(int totSpam, int totHam){
		spamRatio = spamCount / (float)totSpam;
		hamRatio = hamCount / (float)totHam;
		probOfSpam = spamRatio / (spamRatio + hamRatio);
		if(probOfSpam<0.01f) probOfSpam = 0.01f;
		if(probOfSpam>0.99f) probOfSpam = 0.99f;
	}
	public void setProbOfSpam(float prob){
		probOfSpam = prob;
	}
	public float getProbOfSpam(){ return probOfSpam;}

}
