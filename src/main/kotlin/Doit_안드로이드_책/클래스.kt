package Doit_안드로이드_책

//04. 클래스

//======================================================================================================================

//1. 클래스의 멤버(생성자, 변수, 함수, 클래스)
class 클래스의_생성자(){
    //변수
    var name = "sujin"

    //생성자
    constructor(name: String) : this() {
        this.name = name
    }

    //함수
    fun 생성자_사용하기1(){
        println("name : $name")
    }

    //클래스
    class 생성자_사용하기2{}
}

//======================================================================================================================

//2. 객체생성과 멤버접근
//클래스 이름과 같은 함수(이름)로 객체 생성함

//======================================================================================================================

//주 생성자(primary constructor)

//3. 주 생성자 선언
class Pctor1 constructor(){

    //constructor 생략된 생성자
    class Pctor2(){}

    //매개변수 없는 주 생성자 자동선언
    //주 생성자를 선언하지 않을 경우 컴파일러가 자동생성(선언)됨
    class Pctor3{}
}

//======================================================================================================================

//4. 주 생성자의 매개변수
class Pctor4(name: String, count: Int){}
val user = Pctor4("sujin", 10)

//======================================================================================================================

//5-1. 주 생성자의 본문 = inin영역
class Pctor5(name: String, count: Int){
    init {
        println("init 영역 출력 중...")  //init영역(주 생성자의 본문)
    }
}

//5-2. 주 생성자 선언, 클래스 본문(init 영역)작성 -> main함수 실행 -> init영역 자동실행
fun main(){
    val pctor5 = Pctor5("sujin", 10)
}

//5-3. init 영역에서 생성자 매개변수를 클래스 멤버변수로 선언하기
class Pcto6(name: String, count: Int){
    init {
        println("name")
    }
}

//======================================================================================================================

//6-1. 주 생성자의 매개변수(지역변수) 사용하기
class Pcto7(name: String, count: Int){

    //지역변수(생성자 매개변수 사용가능) = 생성자 호출 시 init영역에서 실행됨
    init{
        println("name : $name, count : $count")
    }

    //다른 함수에서는 생성자 매개변수(지역변수) 사용불가
    fun 생성자_매개변수_사용해보기1(){
        //println("name : $name, count : $count")   //에러발생
    }
}

//6-2. 주 생성자 매개변수 다른 함수에서(멤버변수로) 사용하기 1
class Pcto8(name: String, count: Int){

    //멤버변수 선언
    var name: String
    var count: Int

    //멤버변수에 생성자 매개변수값 대입
    init {
        this.name = name
        this.count = count
    }

    //멤버변수 선언 시 다른 함수에서 생성자 매개변수값 사용가능
    fun 생성자_매개변수_사용해보기2(){
        println("name : $name, count : $count")
    }
}

//6-3. 주 생성자 매개변수 다른 함수에서(멤버변수로) 간단하게 사용하기 2
class Pcto9(val name: String, val count: Int){
    fun 생성자_매개변수_사용해보기3(){
        println("name : $name, count : $count")
    }

    fun main(){
        val pcto9 = Pcto9("su", 20)
        pcto9.생성자_매개변수_사용해보기3()
    }
}

//======================================================================================================================

//부 생성자(secondary constructor) = 클래스 본문에 constructor 키워드 선언함수

//7. 부 생성자 선언
class Scto1 {
    constructor(name: String){
        println("부 생성자 부르기1")
    }

    constructor(name: String, count: Int){
        println("부 생성자 부르기2")
    }

    fun main(){
        val scto1 = Scto1("sujin")
        val scto2 = Scto1("sujin", 10)
    }
}

//======================================================================================================================

//주 생성자와 부 생성자 모두 선언 시 반드시 생성자끼리 연결필요
//this : 클래스 내에 주 생성자가 있을 경우 this()를 이용해 주 생성자 호출

//8-1. 부 생성자 1개에서 주 생성자 호출
class Scto3(name: String){
    constructor(name: String, count: Int): this(name){}

    fun main(){
        val scto3 = Scto3("sujin", 10)
    }

}

//8-2. 여러개의 부 생성자에서 생성자 연결
class  Scto4(name: String){
    constructor(name: String, count: Int): this(name){}
    constructor(name: String, count: Int, email: String): this(name, count){}

    fun main(){
        val scto4 = Scto4("sujin", 10, "sujin@gmail.com")
    }
}

//======================================================================================================================