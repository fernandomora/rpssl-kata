package kata.rpssl

case class Game(score1: Int = 0, score2: Int = 0) {
  def play(weapon1: Weapon, weapon2: Weapon): Game = {
    if (weapon1 beats weapon2) Game(score1 + 1, score2)
    else if (weapon2 beats weapon1) Game(score1, score2 + 1)
    else this
  }
  def score: (Int, Int) = (score1, score2)
}


sealed abstract class Weapon {
  protected val beatedWeapons: Set[Weapon]
  def beats(weapon: Weapon): Boolean = beatedWeapons.contains(weapon)
}

case object Rock extends Weapon {
  override protected val beatedWeapons: Set[Weapon] = Set(Scissors, Lizzard)
}

case object Paper extends Weapon {
  override protected val beatedWeapons: Set[Weapon] = Set(Rock, Spock)
}

case object Scissors extends Weapon {
  override protected val beatedWeapons: Set[Weapon] = Set(Paper, Lizzard)
}

case object Spock extends Weapon {
  override protected val beatedWeapons: Set[Weapon] = Set(Rock, Scissors)
}

case object Lizzard extends Weapon {
  override protected val beatedWeapons: Set[Weapon] = Set(Spock, Paper)
}
