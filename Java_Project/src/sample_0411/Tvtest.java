package sample_0411;

public class Tvtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv mytv = new Tv();
		Tv yourtv = new Tv();
		Tv testtv = mytv;
		
		

		mytv.channel = 18;
		mytv.volume = 20;
		mytv.onOff = false;
		
		//System.out.println(mytv.channel + " " + mytv.volume + " " + mytv.onOff);
		mytv.pr();

		yourtv.channel = 91;
		yourtv.volume = 13;
		yourtv.onOff = true;
		yourtv.volUp();
		//testtv = null;
		//System.out.println(yourtv.channel + " " + yourtv.volume + " " + yourtv.onOff);
		yourtv.pr();
		mytv.channel = 231;
		//System.out.println(testtv.channel + " " + testtv.volume + " " + testtv.onOff);\
		testtv.pr();

	}

}
