package tester;

import builder.StatsBuilder;

/**
 * @author Apollo
 *
 */
public class PokemonTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StatsBuilder pokemon1 = new StatsBuilder();
		pokemon1.randomSpeed();
		pokemon1.randomAttack();
		pokemon1.randomDefense();
		pokemon1.randomHealth();
		System.out.println(pokemon1.getRandomSpeed());
		System.out.println(pokemon1.getRandomAttack());
		System.out.println(pokemon1.getRandomDefense());
		System.out.println(pokemon1.getRandomHealth());
		


	}

}
