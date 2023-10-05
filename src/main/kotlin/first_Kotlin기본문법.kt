import java.util.*
import kotlin.random.Random

//기본적으로 Kotlin은 맨 마지막에 ; 작성안함
//1. 출력구문
fun 출력구문(){
    println("줄 바꿈 있는 출력")
    print("줄 바꿈 없는 출력형")
    println("(줄바꿈 확인중)")
}



//2-1. var(변수) - 다른 값으로 재대입 가능
//변수선언 시 별도의 타입지정 필요없음 -> 코틀린은 타입추론 가능
fun 변수1(){
    var var_i1 = 10
    var var_name1 = "Kim SuJin"
    var var_point1 = 20.5

    var_i1 = 15
}

//2-2. var - 퍼런스 타입(첫글자 대문자) = 명시적 타입지정
fun 변수2(){
    var var_i2 : Int = 10                   //Int = 레퍼런스 타입(명시적 타입지정)
    var var_l2 : Long = 20L                 //Long = 레퍼런스 타입(명시적 타입지정)
    var var_name2 : String = "Kim SuJin"    //String = 레퍼런스 타입(명시적 타입지정)
    var var_point2 : Double = 24.6          //Double = 레퍼런스 타입(명시적 타입지정)
}



//3-1. val(상수) - 다른 값으로 재대입 불가능(컴파일 시 에러발생)
fun 상수1(){
    val val_num1 = 10
    //val_num1 = 70 -> 컴파일 시 에러발생
}

//3-2. Top Level val(최상위 상수) - 클래스 바깥에서 선언가능
val val_num2 = 20

//3-3. compile-time constants(컴파일 타임 상수) - 메인보다 우선 컴파일 되며 성능우위 가짐
const val val_num3 = 30     //클래스 안에서 선언 시 에러발생



//4. Type Casting(형변환) - 타입이 다를 경우 to[Type]() 실시
fun 형변환(){
    var var_i3 = 10
    var var_l3 = 20L
    var var_name3 = ""

    var_i3 = var_l3.toInt()         //Int로 변환해서 값 넣음
    var_i3 = var_name3.toInt()
    var_l3 = var_i3.toLong()        //Long으로 변환해서 값 넣음
    var_name3 = var_i3.toString()   //String으로 변환해서 값 넣음
}



//5. String(문자형)
fun 문자형(){
    var var_name4 = "Kim SuJin"

    //대문자, 소문자 변환
    print(var_name4.uppercase())    //대문자 변환
    print(var_name4.lowercase())    //소문자 변환

    //특정 위치 문자열 가져오기
    print(var_name4[0])

    //String Interpolation(문자열 결합방법)
    print("제 이름을 영어로 하면 $var_name4 입니다")    //양쪽 공백필수
    print("제 이름을 영어로 하면 ${var_name4}입니다")   //{} 사용 시 수식,붙여쓰기 사용가능
}



//6. max, min
fun 숫자_구하기(){
    var var_min = 10
    var var_max = 20

    //Java 내장함수 - import java.lang.Integer
    print(Math.max(var_min, var_max))
    print(Math.min(var_min, var_max))

    //Kotlin 내장함수
    print(kotlin.math.max(var_min, var_max))
    print(kotlin.math.min(var_min, var_max))
}



//7. Random(Kotlin 내장함수 - import kotlin.random.Random)
fun 랜덤값_구하기(){
    var randomNumber1 = Random.nextInt(0, 100)          //0 ~ 99 랜덤값 출력
    var randomNumber2 = Random.nextDouble(0.0, 1.0)     //0.0 ~ 9.9 랜덤값 출력
}



//8. 키보드 입력받기(Java 내장함수 - import java.util)
//Kotlin에서 사용불가 키워드는 앞뒤로 백틱(`)을 쓰면 사용가능
fun 키보드_입력받기(){
    var var_read = Scanner(System.`in`)

    var_read.nextInt()  //숫자 입력받기
    var_read.next()     //문자 입력받기
}