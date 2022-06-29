class Hopimpa : Suit("Hopimpa") {
    private val totalPlayer = 3
    private val gameProp = arrayListOf<String>("hitam", "putih")
    private val confirmation = arrayListOf<String>("yes", "ya", "y")

    fun startGame(){
        val arrayResult = getInputResult()
        getResultGame(arrayResult)
        restartGame()
    }
    fun getInputResult() : List<String> {
        val array = arrayListOf<String>()
        for(index in 1..totalPlayer){
            do {
                println("Masukan untuk player $index")
                val hasilInput = readLine() ?: "0"
                val isContain = gameProp.filter { it.equals(hasilInput, ignoreCase = true) }.isEmpty()
                if(!isContain) array.add(hasilInput)
            } while (isContain)
        }

        return array
    }
    fun getResultGame(inputResult : List<String>){
        val hitam = inputResult.count { it.equals(gameProp[0], ignoreCase = true) }
        val putih = inputResult.count { it.equals(gameProp[1], ignoreCase = true) }

        when{
            hitam == 1 && putih > 1 -> resultGameWin(inputResult.indexOfFirst { it.equals("hitam",ignoreCase = true) }, "Tereliminasi!")
            putih == 1 && hitam > 1  -> resultGameWin(inputResult.indexOfFirst { it.equals("putih",ignoreCase = true) }, "Tereliminasi")
            else -> getDrawResult()
        }
    }
    override fun restartGame(){
        println("Restart Game ? [yes/no]")
        val restartGame = readLine() ?: "no"
        val confirm = confirmation.filter { it.equals(restartGame, ignoreCase = true) }.isNotEmpty()
        if(confirm) main()
    }

}