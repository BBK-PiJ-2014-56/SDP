println "type something"
String s = System.console().readLine()
Boolean palindrome = true
for (x in 0 .. (s.size()-1)) {
    print s.substring(x, x+1)
}
for (x in (s.size()-1) .. 0) {
    print s.substring(x, x+1)
}
