println "type something i will tell you how many e's"
String s = System.console().readLine()
int count = 0 

for (x in 0 .. (s.size()-1)) {
    if (s.substring(x, x+1) == "e"){
        count++
    }
}
println "you have " + count + " e's"