package World1;

import javax.swing.JOptionPane;



public class Combat{

	public void skeletonbattle(){
	
		String x = JOptionPane.showInputDialog(null, "what would you like to do? \n 1. attack \n 2. run ");
		
	while(Skeleton.health >= 0){ 
		if( x.equals ("1"))
		{
			
			if(Hero.speed > Skeleton.speed)
			{ 
				Skeleton.health -= Hero.attack;
			
		//	}else{ // skele is faster
		//		Hero.health -= Skeleton.attack;
		//	}
		}
			if( x.equals ("2"))
			{
				JOptionPane.showInputDialog(null, "You made it out with " + Hero.health);
			}
	}
	x = JOptionPane.showInputDialog(null, "what would you like to do again? \n 1. attack \n 2. run ");
}
}
}
