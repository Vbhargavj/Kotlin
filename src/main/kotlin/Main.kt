class My{
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            println("My name is bhargav : ${add(4,5)}")
            println("My name is bhargav : ${add(6,2,2)}")
            var num=0;
//            if else
            if(num>0) println("Number is greater")
            else if (num<0) println("Number is lower")
            else println("Number is zero")

//            when like switch
            when(num){
                1-> println("1")
                0-> println("0 is string")
//                (num>10)-> println("Ss")===> give u error
            }

            when {
                num>10 -> println("This is bhargav")
                num<10 -> println("Note ")
            }

//            FOR LOOP
            for (i in 0..100 step 5){
                println(num++)
            }
            for (i in 10 downTo -10)
                println("VBJ")
            for (i in 1 until 4)
                println("BHARGAV")

//            ARRay
            val ary=ArrayList<Int>()
            ary.add(3)
            ary.add(4)
            ary.add(2)
            ary.add(1)
            ary.add(7)
            ary.add(89)
            ary.add(123)
            ary.add(7)
            ary.add(2)
            ary.add(0)
            for(i in ary)
                println(i)
            var i=0

            while (i<10){
                i++
                println(i)
            }

            do {
                i--
                println(i)
            }while (i!=0)

        }

        private fun add(a:Int, b:Int):Int{
            return a+b
        }
        private fun add(a:Int, b:Int,c:Int):Int{
            return a+b+c
        }


    }
}