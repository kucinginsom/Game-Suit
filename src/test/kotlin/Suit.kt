abstract class Suit(val game: String ) {
    init{
        println("Mulai Bermain: $game")
    }
    fun resultGameWin(player: Int, description: String){
        var playerWin = player+1
        playerWin = playerWin ?: 1
        println("Hasil: ")
        println("Pemain: $playerWin $description")
    }
    fun getDrawResult(){
        println("Hasil: ")
        println("DRAW")
    }
     abstract fun restartGame()

}
