fun main(args: Array<String>) {
    var a : String? = null
    println(a?.length)
    println( if(a!=null ) a.length else 0)
    println( a?.length ?: 0)
}



fun String.doSmth(index: Int): Unit{
    println("asdfasdf")
}




class Test{
    companion object {
        val i : Int =0
        fun add(a : Int, b : Int): Int {
            return a + b
        }
    }
}