fun main(){
    val first_box = Box1<Int>(10)    //val first_box = Box(10) -> 타입추론으로 줄여쓰기 가능
    val second_box = Box1<String>("박스")

    println(first_box.value)
    println(second_box.value)
}

//value 형식 없을 경우 println(first_box.value) 작성불가
//class Box<T>(value : T){}


//value 형식 지정 시 println(first_box.value) 작성가능
//val = value 수정불가
class Box1<T>(val value : T)
//var = value 수정가능
class Box2<T>(var value : T)