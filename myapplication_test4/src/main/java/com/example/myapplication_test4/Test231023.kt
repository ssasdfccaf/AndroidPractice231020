package com.example.myapplication_test4




class Test231023 (val name:String, val age:Int, val email:String){
    //클래스 내부에는 주생성자 X
    //매개변수 val name:String, val age:Int, val email:String
    /* 변수선언 = var */

    constructor(name:String, age:Int, email:String, password: String) : this(name, age, email)

    var name3 : String = "최수연"
    var email3: String = "csy@naver.com"

    lateinit var name2: String //초기화를 미루겠다.(사용하는 시점에 초기화)
    var email2: String = "클래스 내부에서 선언만 X. 예외는 lateinit"
    val price : Int = 1000
}

class mutableListOf<T> {

}
open class SuperClass (val name: String, val email: String){
 //   val name : String = "최수연"

    fun sayHello() {
        println("클래스의 멤버 이름과 이메일 출력하기 : ${name}, ${email}")
    }

}

class SubClass : SuperClass("최수연", "csy@naver.com") {
    init{
        println("인스턴스 생성 때마다 자식 클래스 초기화")
    }
    val password: String =  "1234"
    fun printPassword() {
        println("password : ${password}")
    }
}


fun main() {

    // 널 허용 연산자
    var data: String? = "csy"

    val resultdata = data?.length ?: 0
    println("resultdata : ${resultdata}")

    val test11 : Test231023 = Test231023("최수연",40,"csy@naver.com","1234")
    val test12 : Test231023 = Test231023("최수연",40,"csy@naver.com","1234")
    val test13 : Test231023 = Test231023("최수연",40,"csy@naver.com","1234")
    val test14 : Test231023 = Test231023("최수연23",40,"csy@naver.com","1234")
    println("NonDataClass equals 확인 : ${test11.equals(test13)}")
    println("DataClass equals 확인 : ${test12.equals(test13)}")

    val test33 = SubClass();
    test33.printPassword()
    test33.sayHello()

    // => Init도 3번 생성됨
    val test1 : Test231023 = Test231023("최수연",40,"csy@naver.com","1234")
    val test23 : Test231023 = Test231023("최수연",40,"csy@naver.com","1234")
    val test3 : Test231023 = Test231023("최수연23",40,"csy@naver.com","1234")
//    test23.sayHello()
    println("비 데이터 클래스 toString 해보기 (의미없는 메모리 주소값 표기): " + test1.toString())

    test1.name2 = "초기값 할당 후 사용"
    val lateInitName = test1.name2; //사용하는 시점에 초기화
    println("lateInitName 사용 : " + lateInitName)

//    val array_0 = test1.data5.get(0)
//    test1.data5.set(0, "최수연 0")
//    println("array_0 : 의 값: " + array_0)


//    var mutableList :mutableListOf<Int>(10,20,30)
 /*   mutableList.set(4, 40)*/

//    class MyClass {
//
//        companion object {
//
//            var data = 10
//
//            fun some() {
//
//                println("컴패니언 object 테스트 ")
//
//            }
//
//        }

//    for (i in mutableList.indices){
//        println("리스트 가져오기 : ${mutableList.get(i)} ")
//    }

    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println("맵 가져오기 : ${map.get("one")} ")

    // 가변
    var map2 = mutableMapOf<String,String>(Pair("one", "hello"), "two" to "world")
    map2.set("3", "test")
    println("맵 가져오기 : ${map2.get("3")} ")

    println("when 테스트 ============= ")

   /* var data7 : Any = "hi"*/
    var data7 : Any = 3
    when (data7) {
        is String -> println("문자열 데이터다")
        in 1..10 -> println("숫자 데이터다")
        else -> {
            println("기타 데이터다")

        }
    }

    println("for 테스트 ============= ")
    var sum : Int = 0
    for ( i in 1 .. 10){

    }

    println("withIndex() ============= ) : ${sum}")

    var data10 = arrayOf<Int>(10,20,30)
    for ( (index,value) in data10.withIndex()){
        print(value)
        if (index !== data10.size -1) print(",")

    }
    println("sum의 합 구하는 테스트 : ${sum}")

    /*var listMuSample : MutableList<String> = Mu
    listMuSample.set(0, "최수연1")*/

    // 다른 변수에 재할당 ( 사용하는 시점에 초기화, 값도 할당됨 ( 표현식 )
//    var dat4_2 = test1.data4
//    println("dat4_2 : " +dat4_2)
//    println("dat4_2 문자열 내부에서 특정의 변수값 사용 ${dat4_2}: " )

    // 앱이 시작하면 순차적으로 초기화하여 사용,
    // 뒤늦게 초기화 사용 시점에 초기화하는 lateinit, by lazy -> 실제로 사용하는 것만 메모리에 로드
    val data4: Int by lazy {
        println("by lazy 사용, 뒤늦게 초기화")
        30
    }

    val data5 :Array<String> = Array(3,{"기본값"})

    var test2: User = User("최수연2","csy2@naver.com","1234")
    println("데이터 클래스 toString 해보기 (실제값 표기): " + test2.toString())
}