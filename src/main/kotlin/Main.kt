fun main() {
    oddNumbers()
    println(peopleNames(arrayOf("Tuyishimire","Rachel","Hellen","Haila","Cathy")))
    serveDrinks(3)
    serveDrinks(15)
    serveDrinks(34)
    multipleNumbers()
}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers(){
for (num in 1..100){
    if (num %2 !=0){
        println(num)
    }
}

}

//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters

fun peopleNames(names:Array<String>):Int{
var u=0
    for (name in names){
        if ( name.length>5)
            u ++
    }

 return u
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
 fun serveDrinks(age:Int){
     when (age){
         in 0..6 -> println("Here is a glass of milk for you baby!")
         in 7..15 -> println("Fanta orange for you champion!")
         else -> println("High five, Coca cola for you!")
     }
 }
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

fun multipleNumbers(){
    for (num in 1 .. 100){
        if (num % 3 ==0 && num % 5 == 0){
            println("FizzBuzz")
        }
            else if (num % 3== 0){
                println("Fizz")
            }
        else  if (num % 5 == 0){
            println("Buzz")
        }
        else{
            println(num)
        }
    }
}
