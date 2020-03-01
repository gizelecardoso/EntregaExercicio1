
public class Teste {

	public static void main(String[] args) {
		
		AxeBehavior axe = new AxeBehavior();
		Troll troll = new Troll();
		
		System.out.printf("Troll: ");
		troll.setWeapon(axe);
		System.out.println();
		
		KnifeBehavior knife = new KnifeBehavior();
		King king = new King();
		
		System.out.printf("King: ");
		king.setWeapon(knife);
		System.out.println();
		
		
		BowAndArrowBehavior arrow = new BowAndArrowBehavior();
		Knight knight = new Knight();
		
		System.out.printf("Knight: ");
		knight.setWeapon(arrow);
		System.out.println();
		
		
		SwordBehavior sword = new SwordBehavior();
		Queen queen = new Queen();
		
		System.out.printf("Queen: ");
		queen.setWeapon(sword);
		System.out.println();
		
	
		

	}

}
