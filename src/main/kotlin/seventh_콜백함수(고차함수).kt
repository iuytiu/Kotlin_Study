fun main(){
    //코틀린에서 전달하는 인자가 함수인 한개만 있을 경우 () 생략가능
    //결과 : 함수시작!! / 함수호출 / 함수종료!!
    myFun1() {
        println("함수호출")
    }
    
    //결과 : Int값 가지고 함수시작!! / Int값 가진 함수호출 / Int값 가지고 함수종료!!
    myFun2(10) {
        println("Int값 가진 함수호출")
    }
}


//Java의 void = Kotlin의 Unit
fun myFun1(callback : () -> Unit){
    println("함수시작!!")
    callback()
    println("함수종료!!")
}

fun myFun2(a : Int, callback: () -> Unit){
    println("Int값 가지고 함수시작!!")
    callback()
    println("Int값 가지고 함수종료!!")
}