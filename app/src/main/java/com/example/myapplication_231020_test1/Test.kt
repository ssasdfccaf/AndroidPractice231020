package com.example.myapplication_231020_test1

class Test {

    }

// 함수 밖, 최상위 영역
val test1 = "test";
var test2 = null;
val test5:String = "";
/*  val test5:String = ""; 선언만 하면 오류O (?)
    IDE 사용 이유 : 작업의 편의성, 생산성 */

// lateinit var str;
// 늦은 초기화
val data1 : Int by lazy {
    println("순서3in lazy")
    10
}
fun main() {
    println("순서1 main 먼저 실행")
    println("순서2 lazy 호출 확인: " + data1 )
    val test3:String;
    var test4:String;
    val test5:String;
    var test6:String;

}
    // var 변수, val 상수 -> var 변수명 : 타입 = 값;
    // 변경 되지 않는 상수를 주로 사용, 변경되는 부분은 var 사용
    var name = "c"; //문자열 출력
    var name2 : String = "c2";
    var age : Int = 10;
    var age2 = 10;

    // 모든 타입이 참조형(객체)
    // 자바 기본(형) 타입 8가지, 그 외 참조형
    println("이름 : " + name)
    println("hello android by kotlin")
}
