fun main() {
//    var streams = listOf("Lisa lab","Lovelace","AnitaB")
//    println(streams)
//    var colors = mutableListOf("Red","Blue","Black","Green")
//    println(colors)
//    colors.add("yellow")
//    println(colors)
//    colors.remove("Red")
//    println(colors)
////    streams.add()
////    var colours = mutableListOf<String>()
////    println(colours)
////    colours.add("Orange")
//    var nums = mutableListOf(21,20,19,19,18,22,20,23,25,19)
//    println(nums.count())
//    println(nums.maxOrNull())
//    println(nums.minOrNull())
//    println(nums.sum())
//    println(nums.average())
//    println(nums.first())
//    println(nums.last())
//    println(nums.get(5))
//    nums.get(8)
//    println(nums.indexOf(19))
//    println(nums.lastIndexOf(20))
//    println(nums.size)
//    println(nums.get(3))
//    println(nums.add(1,24))
//    println(nums)
//    var names = mutableListOf("Jack","Jill","James","Bill","Janet")
//   // names.forEach { name -> println(name) }
//    for (name in names){
//        println(name)
//        var sortedNames = names.sorted()
//        println(sortedNames)
       // var sortedNames = names.sortedDescending()
       // println(sortedNames)
       // var sortedNames = names.reversed()
        //println(sortedNames)
//    }
//    var x =Car("Jeep","Wrangler")
//    var y =Car("Mazda","Demio")
//    var z =Car("Nissan", "March")
//    var k =Car("Rabge Rover","Sport")
//    var cars = listOf<Car>(x,y,z,k)
//

    var kidsAges = listOf(4,6,3,12,13,7,12,15,16)
    var teenagers = kidsAges.filter { age-> age>12 }
    println(teenagers)

    //write a functinon that takes in a list of names and
// returns a list of names longer than 5 characters

    var a = person("Mercy",24)
    var b = person("Cheko",17)
    var c = person("Fardosa",30)
    var d = person("Gumato",12)
    var e = person("Wnjira",72)
    var people = listOf(a,b,c,d,e)
    var longNames = people.filter{person-> person.name.sortedNames}
    var longNames = people.sortedBy {person-> person.name}
    println(sortedPeople)
data class Person( var name: String, var age: Int)