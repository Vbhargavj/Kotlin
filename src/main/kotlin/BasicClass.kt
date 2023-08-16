
class BasicClass{ //this is primary constructor
//    class BasicClass Constructor(var a: Int) { this is also write as
    var b=1
    var p=1
    var q=1

    constructor(a:Int,c:Int){
        b=p
        q=c
    }
    constructor(a:Int,c:Int,d:Int){
        b=a
        p=c
        q=d
    }
    init{
        println("Basic object created the value of a is $b")
    }
    fun add(a:Int, b:Int): Int {
        return a+b
    }

}

fun main() {
    println("Starting")
//    val bc= BasicClass(1)
    val vbj= BasicClass(1,4,7)
    println(vbj.add(4,5))

}