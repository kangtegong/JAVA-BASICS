# JAVA - BASICS
# 자바소개

프로그램은 작업 지시서와 같다
프로그램 안에는 컴퓨터에게 작업을 지시하는 명령어가 들어 있다

**자바 언어 :** 1991년 썬마이크로시스템즈 제임스 고슬링
자바 프로그램의 실행과정 : JVM 상에서 동작하므로 OS별 호환성 좋음
**자바의 종류 :** JAVA SE (Standard Edition), JAVA EE (Enterprise Edition), JAVA ME (Micro Edition) 등등
**자바 개발도구 :** JRE (Java Runtime Environment), JDK(Java Development Kit)

----

자바 프로그램 개발 단계

	에디터(.java) ->  컴파일러(.class) ->  
	클래스 적재기 / 바이트 코드 적재기 (메인메모리) -> JVM

환경 변수 설정하기 - (생략)
 
**[sth.java]파일**은 

    javac sth.java

 명령어로 컴파일 (클래스 파일로 변환)

**[sth.class]파일**은 

    java sth 

명령어로 클래스 파일 실행 (JVM으로 실행)

-----

이클립스 사용, 설치, 실행, … , 프로젝트 생성, 클래스 생성 (패키지= 클래스모임) 등등등은 생략

**자바로 만들 수 있는 것:** 자바 어플리케이션, 자바 애플릿, 자바 서블릿, 안드로이드 애플리케이션

-----

# 자바 프로그래밍 기초

자바 프로그램의 일반적인 구조
    public  class  클래스이름{
    
    public  static  void  main(String[] args[]){
    
    // Codes Here
    
    System.out.println("출력");
    
	    }
    }

## 클래스 

클래스는 객체지향 언어의 기본적인 빌딩 블록

### 소스 파일과 클래스 이름

소스 안에 public 클래스가 있다면 반드시 소스 파일의 이름은 public 클래스의 이름과 일치해야 한다. 

하나의 소스파일에 두 개의 public class가 있다면 컴파일 오류

	Public class는 오직 하나, 파일 이름과 동일하게!
----

**주석 표기법 :**  **/* 주석 */**  or  *// 주석*

----
### 변수, 변수선언, 변수 이름 규칙

#### 1. 자료형, 자료형의 종류

   **기초형 자료형 (실제 값 저장) :** 

정수형[byte, short, int, long], 실수형[float, bouble], 논리형[boolean], 문자형[char]

**참조형 자료형 (실제 객체를 가리키는 주소 저장) :** 

클래스, 인터페이스, 배열

---
#### 2. 기초형 자료형의 각각의 설명과 크기, 범위 (생략) 

#### 3. 리터럴

   리터럴 : 소스코드에 쓰여 있는 값

   **정수형 리터럴의 진법 표현** : 10진수, 8진수(0), 16진수(0x), 2진수(0b)

   **실수형 리터럴 :** 일반 표기법, 지수 표기법 (1.234E+2)

   부동 소수점형 리터럴은 double형이 기본이다. 12.3F (-> 변환)

   **문자형 :** 2바이트 유니코드

   **논리형 :** 참거짓

   **기호상수 :** 상수 = 프로그램이 실행되는 동안 값이 변하지 않는 수 또는 불가능한 수

   

> 리터럴도 상수의 일종이다

**final 키워드** :  리터럴을 기호상수로 나타내기 (final double PI = 3.1)

----

### 문자열

#### String(문자열 = 유니코드 문자들의 집합)

String 클래스를 이용하여 문자열 나타내기

    String  str1 = "Hello";

str은 String 형 타입의 객체
String형 객체들을 + 연산자를 이용하여 더하면 문자열이 더해진다


### 형변환

자동 형변환 : double sum = 1.3 + 12 à 12 double됨

강제 형변환 = int로 선언된 x를 (double) x 이러면 double됨

사용자로부터 값 입력받기 : **Scanner Class 사용**

    import java.util.*; // Scanner 클래스  포함
    
    // import java.util.Scanner;
    
    Scanner  input1 = new  Scanner(System.in);
    
    System.out.print("문장입력");
    
    String  line = input.nextLine();

#### Scanner의 다양한 메소드들

1. nextInt() // 입력을 정수로 반환

2. nextDouble() // 입력을 실수로

3. nextLine() // 한 줄 문자열

4. next() // 한 단어

---
### 수식과 연산자

산술 연산자 : + - * / %

증감 연산자 : ++x  x++  --x  --x

관계 연산자 : == != > < >= <=

논리 연산자 : && || !

비트 연산자 : ~ & ^ | << >> >>>

---
# 선택과 반복

1. If-else문
2. 다중 if~else문
3. switch문

---

## Switch문 
JDK 7 부터는 switch문의 제어식으로 String 객체를 사용할 수 있음 
(e.g. switch(month) )

C언어와 너무 유사하므로 생략

## while문

## do-while문 
일단 실행 먼저 한 번 해 봐야 하는 상황에 유리

## for문 
 `for(초기식; 조건식; 증감식){ 반복문장; }` 
 … 약간 파이썬이랑 비슷

for문 안의 초기식에서 제어변수 선언 가능 
`for(int i=1; i<=10; i++)` 
이런 식으로..

## break문, continue문

## 배열

배열을 만드는 절차 : 배열 참조변수 선언, **new 연산자**를 이용해 생성

    int[] s = new  int[10];
    
    int[] scores = {12, 12, 12};
    
    String[] toppings = {"ab", "bc", "de"};

## for- each루프

    for(변수  :  배열){
    
    // 배열의  각  요소가  변수에  하나씩  대입되며  반복
    
    }
    
    int [] list = {1,2,3,4,5};
    
    for(int  element  : list) {
    
    System.out.println(element);
    
    }

### 난수 생성

    Math.random() // 0.0~1.0 사이의  실수형  난수  발생
    
    int(Math.random()) // 0~1 사이의  정수형  난수  발생
    
    int(Math.random()*100) // 0~100 사이의  정수형  난수  발생


