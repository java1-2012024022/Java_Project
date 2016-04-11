package sample_0411;

public class Tv {
	int channel;
	int volume;
	boolean onOff;

	void pr() {
		if(onOff==false){
			System.out.println("TV Die");
			return;	
		}
		System.out.println(channel + " " + volume + " " +onOff);
		
	}
	//int volumeUp(int up_data){
		//int vol=volume ;
		//vol += up_data ;
		//return vol ;
	void volUp(int up){
		if(onOff==false){
			System.out.println("TV Die");
			return;	
		}
	
		
		volume += up ;
	}
	void volUp(){
		if(onOff==false){
			System.out.println("TV Die");
			return;	
		}
	
		
		volume += 1 ;
	}
	

}
