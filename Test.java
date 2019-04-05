package Live;
import music.*;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable obj=new Veena();
		obj.play();
		Playable obj1=new Saxophone();
		obj1.play();
		
	}

}
