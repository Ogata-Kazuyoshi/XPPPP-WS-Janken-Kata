class Game {
    fun play(player1: Throw, player2: Throw): GameResult {
        when (player1.id - player2.id) {
            -1, 2 -> return GameResult.P1_WINS
            -2, 1 -> return GameResult.P2_WINS
            else -> return GameResult.TIE
        }
    }
}