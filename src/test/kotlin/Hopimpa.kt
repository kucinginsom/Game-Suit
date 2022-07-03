class Hopimpa(game: String = "Hopimpa") : Suit(game) {
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
        val (propHitam,PropPutih) = gameProp
        val hitam = inputResult.count { it.equals(propHitam, ignoreCase = true) }
        val putih = inputResult.count { it.equals(PropPutih, ignoreCase = true) }
        when{
            hitam == 1 && putih > 1 -> getResultGame(inputResult, propHitam)
            putih == 1 && hitam > 1  -> getResultGame(inputResult, PropPutih)
            else -> getDrawResult()
        }
    }
    fun getResultGame(inputResult : List<String>, prop : String){
        resultGameWin(inputResult.indexOfFirst { it.equals(prop,ignoreCase = true) }, "Tereliminasi!")
    }
    override fun getDrawResult(){
        println("Hasil: ")
        println("Tidak ada pemain yang tereliminasi")
    }
    override fun restartGame(){
        println("Restart Game ? [yes/no]")
        val restartGame = readLine() ?: "no"
        val confirm = confirmation.filter { it.equals(restartGame, ignoreCase = true) }.isNotEmpty()
        if(confirm) main()
    }
}