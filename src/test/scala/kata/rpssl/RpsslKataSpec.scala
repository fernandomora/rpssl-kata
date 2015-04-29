package kata.rpssl

import org.scalatest.ShouldMatchers
import org.scalatest.FlatSpec

class RpsslKataSpec extends FlatSpec with ShouldMatchers {

  behavior of "A Rock, paper, scissors (spock, lizzard) game"

  it should "start with zero score for each player" in {
    Game() shouldEqual Game(0,0)
  }

  it should "preserve same score when move result in draw/tie" in {
    Game(3,4).play(Rock,Rock).score should equal(3,4)
  }

  it should "increase score of player 1 if he beats player 2" in {
    Game(0,0).play(Paper,Rock) shouldEqual Game(1,0)
    Game(1,2).play(Scissors,Paper) shouldEqual Game(2,2)
    Game(2,4).play(Rock,Scissors) shouldEqual Game(3,4)
  }

  it should "increase score of player 2 if he beats player 1" in {
    Game(3,4).play(Rock,Paper) shouldEqual Game(3,5)
    Game(1,2).play(Paper,Scissors) shouldEqual Game(1,3)
    Game(0,0).play(Scissors,Rock) shouldEqual Game(0,1)
  }

  it should "increase score of player 1 if he beats player 2 with extended weapons" in {
    Game(3,4).play(Paper,Spock) shouldEqual Game(4,4)
    Game(1,2).play(Scissors,Lizzard) shouldEqual Game(2,2)
    Game(0,0).play(Rock,Lizzard) shouldEqual Game(1,0)
  }

  it should "increase score of player 2 if he beats player 1 with extended weapons" in {
    Game(3,4).play(Spock,Paper) shouldEqual Game(3,5)
    Game(1,2).play(Lizzard,Scissors) shouldEqual Game(1,3)
    Game(0,0).play(Lizzard,Rock) shouldEqual Game(0,1)
  }

}
