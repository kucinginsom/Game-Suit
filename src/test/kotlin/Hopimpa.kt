class Hopimpa : Suit("Hopimpa") {

    fun startGame(){
        val totalPlayer = 3
        getInputResult(totalPlayer)
    }
    fun getInputResult(player:Int = 2){
        val array = arrayListOf<String>()
        for(index in 1..player){
            println("masukan untuk player $index")
            val hasilInput = readLine() ?: "0"
            array.add(hasilInput)
        }
        getResultGame(array)
    }

    fun getResultGame(inputResult : List<String>){
        val hitam = inputResult.count { it.equals("hitam", ignoreCase = true) }
        val putih = inputResult.count { it.equals("putih", ignoreCase = true) }

        when{
            hitam == 1 && putih > 1 -> resultGameWin(inputResult.indexOf("hitam"), "Tereliminasi!")
            putih == 1 && hitam > 1  -> resultGameWin(inputResult.indexOf("putih"), "Tereliminasi")
            hitam == 3 -> getDrawResult()
            putih == 3 -> getDrawResult()
            else -> println("NO RESULT !")
        }

    }

    fun getDrawResult(){
        println("Hasil: ")
        println("DRAW")
    }
}