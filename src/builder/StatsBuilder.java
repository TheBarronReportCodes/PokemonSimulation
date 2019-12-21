/**
 * 
 */
package builder;

/**
 * @author Apollo
 *
 */
public class StatsBuilder {
	/** 
	 * Created three main stats
	 */
		private int health;
		private int attack;
		private int defense;
		private int speed;
		
	/** 
	 * Default constructor
	 */
		public StatsBuilder() {
			this.randomHealth();
			this.randomAttack();
			this.randomDefense();
			this.randomSpeed();
		}
		
	/** 
	 * I want the stats to be random, same as any wild pokemon.
	 *  I want the 	max for any stat to be 100. 
	 */
		public void randomHealth() {
			this.health = (int) (this.health + 100 * Math.random());
		}
		public void randomAttack() {
			this.attack = (int) (this.attack + 100 * Math.random());
		}
		public void randomDefense() {
			this.defense = (int) (this.defense + 100 * Math.random());
		}
		public void randomSpeed() {
			this.speed = (int) (this.speed + 100 * Math.random());
		}
//		public int lifePoints() {
//			int lifePoints;
//			lifePoints = this.health - (this.attack - this.defense);
//			return lifePoints;
//		}
		
	/**
	 * 
	 * @return the random output value from the previous method
	 */
		public int getRandomHealth() {
			return this.health;
		}
		public int getRandomAttack() {
			return this.attack;
		}
		public int getRandomDefense() {
			return this.defense;
		}
		public int getRandomSpeed() {
			return this.speed;
		}
}
