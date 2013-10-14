int numberToGuess = Math.abs(1000 * Math.random())
Integer guess 
Integer counter = 0 

while (guess != numberToGuess) {
    println "Guess a number"
    String s = System.console().readLine()
    guess = Integer.parseInt(s)
    if (guess < numberToGuess){
    println "too low"
    counter++
    }
    if (guess > numberToGuess){
    println "too high"
    counter++
    }
}
counter++
println "correct! you took " + counter + " guesses"
