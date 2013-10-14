println "type something"
String s = System.console().readLine()
Boolean palindrome = true
for (x in 0 .. (s.size()-1)) {
    if (s.substring(x, x+1) == s.substring((s.size()-(x+1)), (s.size()-x))) {        
    } else { 
    palindrome = false
    }
}
if (palindrome == true){
    println "palindrome"
} else { 
    println "not palindrome"
}   