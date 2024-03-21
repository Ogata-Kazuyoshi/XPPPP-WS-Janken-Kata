import Game
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GameTest {
    @Nested
    inner class P1_WINS {
        @Test
        fun rockVersusScissorsResultsInPlayer1Win() {
            val result = Game().play(Throw.ROCK, Throw.SCISSORS)
            assertEquals(GameResult.P1_WINS, result)
        }

        @Test
        fun scissorsVersusPaperResultsInPlayer1Win() {
            val result = Game().play(Throw.SCISSORS, Throw.PAPER)
            assertEquals(GameResult.P1_WINS, result)
        }
        @Test
        fun paperVersusRockResultsInPlayer1Win() {
            val result = Game().play(Throw.PAPER, Throw.ROCK)
            assertEquals(GameResult.P1_WINS, result)
        }
    }

    @Nested
    inner class P2_WINS {
        @Test
        fun scissorsVersusRocksResultsInPlayer2Win() {
            val result = Game().play(Throw.SCISSORS, Throw.ROCK)
            assertEquals(GameResult.P2_WINS, result)
        }
        @Test
        fun paperVersusScissorsResultsInPlayer2Win() {
            val result = Game().play(Throw.PAPER, Throw.SCISSORS)
            assertEquals(GameResult.P2_WINS, result)
        }
        @Test
        fun rockVersusPaperResultsInPlayer2Win() {
            val result = Game().play(Throw.ROCK, Throw.PAPER)
            assertEquals(GameResult.P2_WINS, result)
        }

    }

    @Nested
    inner class TIE {
        @Test
        fun paperVersusPaperResultsInTie() {
            val result = Game().play(Throw.PAPER, Throw.PAPER)
            assertEquals(GameResult.TIE, result)
        }

        @Test
        fun scissorsVersusScissorsResultsInTie() {
            val result = Game().play(Throw.SCISSORS, Throw.SCISSORS)
            assertEquals(GameResult.TIE, result)
        }

        @Test
        fun rockVersusRockResultsInTie() {
            val result = Game().play(Throw.ROCK, Throw.ROCK)
            assertEquals(GameResult.TIE, result)
        }

    }
}


