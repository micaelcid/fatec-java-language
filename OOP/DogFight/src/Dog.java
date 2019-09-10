public class Dog {
  String name;
  String breed;
  int healthPoints;
  int attackPoints;

  public Dog(String name, String breed, int lifePoints, int attackPoints) {
    this.name = name;
    this.breed = breed;
    this.healthPoints = lifePoints;
    this.attackPoints = attackPoints;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }

  public int getAttackPoints() {
    return attackPoints;
  }

  public void setAttackPoints(int attackPoints) {
    this.attackPoints = attackPoints;
  }

  public void barks(){
    System.out.println(getName() + " barks.");
  }

  public void bites(Dog dog){
    if(dog.getHealthPoints() == 0){
      System.out.println(dog.getName() + " is already dead, but " + getName() + " bites it anyway.");
      return;
    }

    int remainingHealth = dog.getHealthPoints() - getAttackPoints();
    dog.setHealthPoints(remainingHealth);

    if(remainingHealth > 0){
      String biteMessage = dog.getName() + " has been bitten by " + getName() + " and lost " + getAttackPoints() + " HP";
      System.out.println(biteMessage);
    }
    else {
      System.out.println(dog.getName() + " died.");
    }
  }
}
