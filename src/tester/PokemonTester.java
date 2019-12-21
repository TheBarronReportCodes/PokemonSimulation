package tester;

import builder.StatsBuilder;

/**
 * @author Apollo
 *
 */
public class PokemonTester {
	private StatsBuilder pokemon1;
	private StatsBuilder pokemon2;
	
	/**
	 * creates tester Objects
	 * creates the default stats of each new pokemon
	 */
	public PokemonTester() {
		this.pokemon1 = new StatsBuilder();
		this.pokemon2 = new StatsBuilder();
	}
	
	/**
	 *Generates new stats 
	 */
	public void runTests() {
		System.out.printf("Pokemon speed %d \n", pokemon1.getRandomSpeed());
		System.out.printf("Pokemon attack %d \n", pokemon1.getRandomAttack());
		System.out.printf("Pokemon defense %d \n", pokemon1.getRandomDefense());
		System.out.printf("Pokemon health %d \n", pokemon1.getRandomHealth());
		
		System.out.println();

		System.out.printf("Pokemon speed %d \n", pokemon2.getRandomSpeed());
		System.out.printf("Pokemon attack %d \n", pokemon2.getRandomAttack());
		System.out.printf("Pokemon defense %d \n", pokemon2.getRandomDefense());
		System.out.printf("Pokemon health %d \n", pokemon2.getRandomHealth());
	}

}
