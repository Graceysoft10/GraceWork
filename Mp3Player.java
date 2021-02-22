public class Mp3Player{

 private String playAudio;
 private String pauseAudio;
 private String nextAudio;
 private String previousAudio;
 private boolean IsOn;
 private int Volume;

public Mp3Player(String playAudio, String pauseAudio,String nextAudio,String previousAudio,boolean IsOn,int Volume){
	this.playAudio = playAudio;
	this.pauseAudio = pauseAudio;
	this.nextAudio = nextAudio;
	this.previousAudio = previousAudio;
	this.IsOn = IsOn;
	this.Volume = Volume;



}

public void playAudio(String playAudio){
	this.playAudio = playAudio;
}

public void pauseAudio(String pauseAudio){
	this.pauseAudio = pauseAudio;
}
public void nextAudio(String nextAudio){
	this.nextAudio = nextAudio;

}
public void previousAudio(String previousAudio){
	this.previousAudio = previousAudio;
}
public void IsOn(boolean isOn){
	IsOn = true;
}
public void Volume(int Volume){
	this.Volume = Volume;
}
	
public int increaseVolume(){
	return Volume;
}

public int decreaseVolume(){
	return Volume;
}
 










}




