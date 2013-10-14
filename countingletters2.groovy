println "type something"
String s = System.console().readLine()
println "Enter a letter"
String letter = System.console().readLine()
int count = 0 

for (x in 0 .. (s.size()-1)) {
    if (s.substring(x, x+1) == letter){
        count++
    }
}
println "you have " + count + " " + letter + "'s"