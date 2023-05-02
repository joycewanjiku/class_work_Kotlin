fun main() {

    println(user("Lucy",23,"Kenya"))
    println(sum(34,56,78,90,))
    println(avarage(65,89,23,64,87))
}
//1. Create and invoke a function that takes in a users name, age, and nationality and
// prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)
//
fun user(name:String,age:Int,nationality:String){
  var details="Hello, my name is $name I am $age and I am from  $nationality"
    println(details)

}
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)

fun sum(num1:Int,num2:Int,num3:Int,num4: Int):Int{
    var numbers=num1+num2+num3+num4

    return numbers

}
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
  fun avarage(nums1:Int,nums2:Int,nums3:Int,nums4:Int,nums5:Int):Int {
    val number = nums1 + nums2 + nums3 + nums4+ nums5
    return number
}

//
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun person(name: String,age: Int,phoneNumber:String,email:String,weight:Double,citizenship:String){
   println ("$name")
    println ("$age")
    println ("$String")
    println ("$phoneNumber")
    println ("$email")



    println({$age})
}