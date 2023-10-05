class third_반복문 {

    var var_list = listOf(1, 2, 3, 4, 5)

    //12-1. Kotlin for문 = Java의 for문
    fun for문(){
        for(i in 0..3){     // 0 ~ 3까지(포함)
            print(i)
        }
    }

    //12-2. Java for-each문 = Kotlin for-each문
    fun for_each문(){
        for(i in var_list){
            print(i)
        }
    }

    //12-3. Kotlin for-in문
    fun for_in문(){
        var_list.forEach{
            i -> print(i)
        }
    }



    //13.



}