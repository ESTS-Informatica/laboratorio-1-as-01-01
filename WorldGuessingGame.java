
/**
 * Escreva a descrição da classe WorldGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class WorldGuessingGame
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
        private String hiddenWord;
        private String guessedWord;
        private int numberOfTries;
    
    /**
     * COnstrutor para objetos da classe WorldGuessingGame
     */
    public WorldGuessingGame()
    {
        hiddenWord="abc";
        guessedWord="   ";
        numberOfTries=0;
    }

    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public String getGuessedWord(){
        return guessedWord;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    public void showGuessedWord(){
        System.out.println("Guessed Word"+getGuessedWord());
    }
    
    
}
