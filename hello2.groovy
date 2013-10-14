Integer number

List l = [] // list is initially empty

Boolean flag = true // no numbers

while (true){
    number = getIntegerWithPrompt("Please enter a +ve number (end with minus one): ")

    if (number == -1) break // exit on reading -1
    flag = false
    
    l.add(number)    
}

if (flag)
    println "No numbers entered"
else {
    //println l.sort()
    println l
    println "The result of reversing the list is " + revForward(l)
    /*
    println "The smallest number is " + l[0] //l.getAt(0)
    println "The largest number is " + l[size(l)-1] //l.last()
    Integer sum = sumOfIntegerList(l)
    println "The sum of the numbers in the list is " + sum //l.sum()
    println "The number of values read is " + size(l)
    println "The average of the numbers in the list is " + sum / size(l)
    println "The median value is " + median(l)
    */
}

List revForward(List l){
    List result = []
    
    while(l != []){
        head = l.head()
        println "The head is " + head + " of type " + head.getClass()
        println "The result before adding the head is " + result
        temp = [head]
        temp.add(result) // goes very wrong - why?
        result = temp
        println "The result after adding the head is " + result
        l = l.tail()
        println "... and now l is the tail " + l
    }
    return result
}

Double median(List l){
    Integer length = l.size()
    Integer middle
    middle = length / 2
    if (length % 2 > 0) { // odd
        return l[middle]
    } else {
        return (l[middle-1] + l[middle]) / 2
    }
}

Integer size(List l){
    Integer count = 0
    while (l != []) {
        l = l.tail()
        count++        
    }
    return count
}

Integer sumOfIntegerList(List l){
    Integer sum = 0
    Integer counter = 0
    Integer sizeOfList = l.size()
    while(counter < sizeOfList){
        sum += l[counter] // you might see [counter++]
        counter++
    }
    return sum
}
/*
Integer sumOfIntegerList(List l){
    Integer sum = 0
    for (x in l) 
        sum+=x   
    return sum
}
*/

Integer getIntegerWithPrompt(String prompt){
    print prompt
    // read in the value
    String str = System.console().readLine()
    return Integer.parseInt(str)
}
