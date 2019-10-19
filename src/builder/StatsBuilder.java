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
		private double health;
		private double attack;
		private double defense;
		private double speed;
	/** 
	 * Default constructor
	 */
		public StatsBuilder() {
			this.health = 0.0;
			this.attack = 0.0;
			this.defense = 0.0;
			this.speed = 0.0;
		}
	/** 
	 * I want the stats to be random, same as any wild pokemon.
	 *  I want the 	max for any stat to be 100. 
	 */
		public void randomHealth() {
			this.health = this.health + 100 * Math.random();
		}
		public void randomAttack() {
			this.attack = this.attack + 100 * Math.random();
		}
		public void randomDefense() {
			this.defense = this.defense + 100 * Math.random();
		}
		public void randomSpeed() {
			this.speed = this.speed + 100 * Math.random();
		}
	/**
	 * 
	 * @return the random output value from the previous method
	 */
		public double getRandomHealth() {
			return this.health;
		}
		public double getRandomAttack() {
			return this.attack;
		}
		public double getRandomDefense() {
			return this.defense;
		}
		public double getRandomSpeed() {
			return this.speed;
		}
}
