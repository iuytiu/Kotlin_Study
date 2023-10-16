package Doit_안드로이드_책

//======================================================================================================================

//06. 클래스 2

//======================================================================================================================

//9. 데이터 클래스 선언하기
//data : 데이터를 객체로 묶어서 사용할 때 쓰는 키워드
data class DataClass1(val name: String, val email: String, val age: Int)

//일반 클래스 선언
class NonDataClass1(val name: String, val email: String, val age: Int)

//======================================================================================================================

//10-1. 데이터 클래스 객체생성, 비교하기
//equals : 객체의 데이터가 같은지를 비교하는 함수
fun main1(){
    val nonData1 = NonDataClass1("sujin", "'sujin@mail.com", 20)
    val nonData2 = NonDataClass1("sujin", "'sujin@mail.com", 20)
    println("NonDataClass1 비교하기, ${nonData1.equals(nonData2)}")             //NonDataClass1, false

    val data1 = DataClass1("sujin", "'sujin@mail.com", 20)
    val data2 = DataClass1("sujin", "'sujin@mail.com", 20)
    println("DataClass1 비교하기, ${data1.equals(data2)}")                      //DataClass1, true
}

//10-2. 데이터 클래스에 equals 함수 사용
data class DataClass2(val name: String, val email: String, val age: Int){
    lateinit var address : String
    constructor(name: String, email: String, age: Int, address: String): this(name, email, age){
        this.address = address
    }
}

fun main2(){
    val obj1 = DataClass2("sujin", "sujin@mail.com", 20, "paju")
    val obj2 = DataClass2("sujin", "sujin@mail.com", 20, "seoul")
    println()
}


//======================================================================================================================




//======================================================================================================================





//======================================================================================================================




//======================================================================================================================




//======================================================================================================================
