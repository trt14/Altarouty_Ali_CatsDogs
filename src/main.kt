


abstract class Animals(name: String ,age:Int) {

    abstract fun talk()
}

class Dogs(val name:String, val age:Int): Animals(name,age) {

    override fun talk() {
        println("$name : WOOF,age :$age")
    }
}
class Cats(val name:String, val age:Int): Animals(name,age) {

    override fun talk() {
        println("$name : MEOW,age :$age")
    }
}




fun main(args: Array<String>) {
//    val jack = Teacher("Jack Smith")
//    jack.displayJob("I'm a mathematics teacher.")
//    jack.displaySSN(23123)


    var Dogs_List= listOf(
        Dogs("Dog1", 3),
        Dogs("Dog2", 3),
        Dogs("Dog3", 3),
        Dogs("Dog4", 6),
        Dogs("Dog5", 8)

    )
    var Cats_List= listOf(
        Cats("Cat1", 3),
        Cats("Cat2", 5),
        Cats("Cat3", 2),
        Cats("Cat4", 6),
        Cats("Cat5", 8)

    )


    for(Cat in Cats_List){
        Cat.talk()
        for(dog in Dogs_List){
            if(Cat.age < dog.age){
                dog.talk()
            }
        }
    }
}
