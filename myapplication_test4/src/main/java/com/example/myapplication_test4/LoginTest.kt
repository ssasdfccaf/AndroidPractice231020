package com.example.myapplication_test4

class LoginTest {

    companion object {
        fun loginLogic(member:Member){
            if(member.name.equals("admin") && member.password.equals("1234")){
                println("로그인 성공")
            } else {
                println("아이디 및 패스워드를 확인해주세요.")
            }
        }
    }
}