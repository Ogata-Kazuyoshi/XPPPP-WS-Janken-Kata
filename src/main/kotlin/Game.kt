class Game {
    fun play(player1: Throw, player2: Throw): GameResult {
        val result = (player1.id - player2.id + 3) % 3
        if (result == 2) {
            return GameResult.P1_WINS
        } else if (result == 1) {
            return GameResult.P2_WINS
        } else {
            return GameResult.TIE
        }
    }
}