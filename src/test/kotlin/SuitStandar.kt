class SuitStandar : Suit("Suit Standar") {
    val JEMPOL = "jempol";
    val TELUNJUK = "telunjuk";
    val KELINGKING = "kelingking";

    fun startGame() {
        print("Nama Player 1: ")
        val playerOneName = readLine() ?: "Player 1";

        print("Nama Player 2: ")
        val playerTwoName = readLine() ?: "Player 2";

        println("***************************************************")
        println("Game suit dimulai, \u001b[31m${playerOneName?.uppercase()} vs ${playerTwoName?.uppercase()} \u001b[0m");
        println("***************************************************")

        var playerOneChoice = "";
        while (playerOneChoice == "" || !isValidInput(playerOneChoice)) {
            print("Giliran $playerOneName, pilih $JEMPOL, $TELUNJUK, $KELINGKING? ")
            val playerOneChoiceInput = readLine();
            if (playerOneChoiceInput != null) {
                playerOneChoice = playerOneChoiceInput.lowercase()
            }
        }

        var playerTwoChoice = "";
        while (playerTwoChoice == "" || !isValidInput(playerTwoChoice)) {
            print("Giliran $playerTwoName, pilih $JEMPOL, $TELUNJUK, $KELINGKING? ")
            val playerTwoChoiceInput = readLine();
            if (playerTwoChoiceInput != null) {
                playerTwoChoice = playerTwoChoiceInput.lowercase()
            }
        }

        getResult(playerOneChoice, playerTwoChoice, playerOneName, playerTwoName)

        print("Mau main lagi? (y/n) ")
        val shouldRestart = readLine();
        if (shouldRestart != null) {
            restartGame(shouldRestart)
        };
    }

    fun isValidInput(input:String): Boolean {
        if (input == JEMPOL || input == TELUNJUK || input == KELINGKING) {
            return true
        }
        return false
    }

    fun getResult(playerOneChoice: String, playerTwoChoice: String, playerOneName: String = "Plater 1", playerTwoName: String) {
        println("***************************")
        if (isDraw(playerOneChoice, playerTwoChoice)) {
            println("SERI")
        } else if (isPlayerOneWin(playerOneChoice, playerTwoChoice)) {
            println("${playerOneName.uppercase()} MENANG!")
        } else {
            println("${playerTwoName.uppercase()} MENANG!")
        }
        println("***************************")
    }

    fun isPlayerOneWin(playerOneChoice: String, playerTwoChoice: String): Boolean {
        if (playerOneChoice == JEMPOL && playerTwoChoice == TELUNJUK) {
            return true
        }

        if (playerOneChoice == TELUNJUK && playerTwoChoice == KELINGKING) {
            return true
        }

        if (playerOneChoice == KELINGKING && playerTwoChoice == JEMPOL) {
            return true
        }

        return false
    }

    fun isDraw(playerOneChoice: String, playerTwoChoice: String): Boolean {
        if (playerOneChoice == playerTwoChoice) {
            return true;
        }
        return false
    }

    fun restartGame(input: String) {
        if (input == "y") {
            startGame();
        } else {
            println("**********************************")
            println("Terimakasih! Sampai jumpa lagi :)")
            println("**********************************")

        }
    }

}