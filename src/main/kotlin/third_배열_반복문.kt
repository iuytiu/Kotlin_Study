//listOf - 값이 변경불가한 List
val listX = listOf(1, 2, 3, 4, 5)


//mutableListOf - 값을 변경가능한 List
val listO = mutableListOf(1, 2, 3, 4, 5)
fun 변경가능_리스트(){
    listO[5] = 6
    listO.add(7)
    listO.remove(7)
}


//Array 배열(값 변경가능) - 실질적으로 잘 사용안함(list > Array)
val array = arrayOf(1, 2, 3, 4, 5)
fun 배열(){
    array[5] = 6
    array.size      //Java의 array.length와 같음
}


//Try-Catch
fun Tru_Catch(){
    try{
        listO[10]
    } catch (e : Exception){
        print(e.message)        //실행 시 error 발생됨
    }
}


// 반복문

//Kotlin for문 = Java의 for문
fun for문() {
    for (i in 0..3) {     // 0 ~ 3까지(포함)
        print(i)
    }
}


//Java for-each문 = Kotlin for-each문
fun for_each문() {
    for (i in listX) {
        print(i)
    }
}


//Kotlin for-in문
fun for_in문() {
    listX.forEach { i ->
        print(i)
    }
}