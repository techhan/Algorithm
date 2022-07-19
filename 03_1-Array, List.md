
# 배열과 리스트 (Array, List)

<br>

## 배열(Array)
- 메모리의 `연속 공간`에 값이 채워져 있는 형태의 자료구조
- 배열의 값은 `인덱스`를 통해 참조할 수 있음
- 선언한 자료형의 값만 저장 가능
- 배열을 생성한 후 새로운 값을 삽입하거나 특정 인덱스에 있는 값을 삭제하기 어렵다. 값을 삽입, 삭제하려면 해당 인덱스 주변에 있는 값을 이동시키는 과정이 필요하다.
- 배열의 크기는 최초 선언할 때 지정할 수 있으며, 그 이후에 크기를 늘리거나 줄일 수 없다.
- 구조가 간단하다.

<br><br>


## 리스트(List)
- 리스트는 값과 포인터를 묶은 `노드`라는 것을 포인터로 연결한 자료구조이다.
  -  노드 : 컴퓨터 과학에서 값, 포인터를 쌍으로 갖는 기초 단위를 부르는 말이다.
- 인덱스가 없으므로 값에 접근하려면 `Head 포인터`부터 순서대로 접근해야 한다. 그래서 값에 접근하는 속도가 느리다.
- `포인터`로 연결되어 있으므로 데이터를 삽입하거나 삭제하는 연산 속도가 빠르다.
- 선언할 때 크기를 별도로 지정하지 않아도 된다. 리스트의 크기는 정해져있지 않으며, 크기가 변하기 쉬운 데이터를 다룰 때 적절하다.
- 포인터를 저장할 공간이 필요하므로 배열보다 구조가 복잡하다.


<br><br>

## 숫자의 합 구하기 [백준_11720](https://www.acmicpc.net/problem/11720)

### 슈도코드 작성하기
1. N값 입력받기
2. 숫자 N개 입력받기
3. 한 줄로 입력받은 숫자들이 N개만큼 입력될 때까지 계속 입력받는다.
4. 입력받은 문자열을 char[] 배열에 저장한다.
5. int sum을 선언한다.
6. char[]에 대한 for문을 돌리면서 각 char 타입 요소를 int 타입형으로 변환하여 sum에 누적 저장한다. (ex.c - '0')
7. sum을 출력한다.

<br>

### Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "";
        do {
            str = sc.next();
        } while (str.length() != N);

        char[] charArr = str.toCharArray();

        int sum = 0;
        for (char c : charArr) {
            sum += c - '0';
        }

        System.out.println(sum);
    }
}
```

<img width="1164" alt="image" src="https://user-images.githubusercontent.com/70805241/179743835-333c4fdd-7bd0-4862-bbd8-77d8ad87e8e3.png">

<br>

### 한 마디
뭔가 프로그래머스에 길들여져있어서 그런가.. 예외처리부터 냅다 했는데 문제를 다시 읽어보니 예외가 발생하지 않는 상황이 전제로 깔려있었다. 예외 처리 생각을 안 해도 돼서 좋지만서도 뭔가 찝찝한 느낌...?! 그래도 백준에 왔으면 백준 법을 따라야지! 문제는 난이도가 많이 낮아 어렵지는 않았다!


<br><br>


## 평균 구하기 [백준_1546](https://www.acmicpc.net/problem/1546)

### 슈도코드 작성하기
1. N값 입력 받기
2. N값 길이를 가진 int[] 배열 선언하기
3. for문 돌면서 과목 점수 입력 받기
4. long max, sum 선언하기
5. 점수가 담긴 배열 길이만큼(N만큼) for문을 돌면서 최댓값과 누적 점수를 구해 각각 max, sum에 저장하기
6. 세준이의 이상한 계산 방식으로 구한 값을 출력하기

<br>

### Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        for(int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;
        for (int n : score) {
            if(max < n) {
                max = n;
            }
            sum += n;
        }
        
        System.out.println(sum * 100.0 / max / N);
    }
}
```
<img width="1159" alt="image" src="https://user-images.githubusercontent.com/70805241/179750256-3d9e702e-22e7-4337-b6e7-12f7d85a2ccb.png">


<br>

### 한 마디
난이도가 어렵지 않은 문제라 푸는데 어려움은 없었다. 다만 처음 제출했을 때는 틀렸었는데, 그 이유는 맨 마지막 출력문에서 100.0이 아닌 100으로 곱해가지고 소숫점이 없는 정수로 반환되어 답이 틀렸었다. 자료형을 항상 신경쓰자!

