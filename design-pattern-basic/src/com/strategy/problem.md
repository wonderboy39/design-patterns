#스트래티지 패턴이 적용되는 경우
유지보수를 할때, 기능을 추가해야 하는데 이 기능 추가가 현재 존재하는 모든 클래스에 적용해야 하는 경우가 있다. 이 경우 하나의 기능을 여러소스에 모두 copy & paste할수도 있다. 충분히 할 수 있다고 본다. 하지만 또 다시 그 기능을 수정하라고 한다면? 또 다시 해당되는 클래스들의 해당 부분을 모두 찾아서 고쳤다고 해보자. 그런데 또 다시 요구사항이 들어와서 다시 다른 방식으로 해달라고 한다. 그런데 또 다시 수정하라고 한다면?

엄청나게 빡칠(?)것이다. 깊은 분노를 가라앉히고 조금만 고민해보고, 인터넷 자료를 검색하다보면 스트래티지 패턴을 접할수 있을거라고 생각한다. Java쪽에서 일하게 된지는 오래되지는 않았지만, 스트래티지 패턴을 까먹었을 때를 대비해 정리해두려 한다.


#앞서 작성한 과일장수 예제에서 Strategy 패턴을 적용해야 하는 이유를 정리해보면 ...
이전에 작성했던 interface, abstract의 차이점을 정리하기 위해 사용한 예제는 Strategy패턴을 적용할 수 있다. 또한 printPrice()의 경우 개별 클래스에서 각자 작성할 필요가 없다(사과나 바나나 에는 각각의 이름을 부여하지 않고, 사과 몇개 주세요 이렇게 부르므로).

따라서 여기서 짚고 넘어갈 부분은
 1) printPrice()를 Fruits에서 일괄처리 하도록 변경
  (APPLE, BANANA마다 printPrice()를 변경할 경우 대응하기 어려워지므로)
 2) printDuty()를 Fruits에서 overriding할 경우 생길수 있는 문제점
을 정리해보도록 해야 할 듯하다.

이전 예제의 시나리오는 아래와 같다.
- 과일장수(main)에게 과일들이 있는데 그 과일들은 사과, 바나나, 망고다. 정말 간단한 예제여야 하므로 각각의 가격들을 출력하는 기능만이 있다. 그런데, 관세를 출력해주는 기능의 추가가 필요하다는 요구사항이 생겼다. 이에 대해서 정말 간단하게 DutyBehavior라는 인터페이스만을 생성했었다.

##1) printPrice()를 Fruits에서 일괄처리하도록 변경
Apple, Banana클래스에서 각각 printPrice()를 제거했다. 그 이유는 
 - 매번 과일의 종류가 추가될 때마다 printPrice()를 작성해주어야 한다는 점
 - 각 과일이 가진 일관된 출력방식, 서식이 달라질수 있다는 점 
 - 출력방식(vat포함출력 여부)등이 변경될 경우 Fruits를 extends한 모든 클래스의 printPrice()를 변경해야 한다는 점
때문이다.

위와 같은 이유로 코드를 수정하기로 했고 수정한 내용은 아래와 같다.
먼저 Fruits클래스는 아래와 같다.
```{.java}
public abstract class Fruits{
  private int price;
  private String name;
  public Fruits(){}
  public void setPrice ( final int price ){
    this.price = price;
  }
  public void getPrice (){
    return price;
  }
  public void setName( final String name ){
    this.name = name;
  }
  public void printPrice(){
    System.out.println(name + “ :: price == “ + String.valueOf(price));
  }
}
```
printPrice()메서드가 abstract로 되어있던 것을 abstract키워드를 제거하고 일반 메서드로 두었다. 이후 Apple, Banana가 다른 방식으로 출력하고 싶다면 각각의 클래스에서 overriding하면 된다. 

이제 Fruits를 상속받은 Apple 클래스의 내용을 살펴보자
```{.java}
public class Apple extends Fruits{
    public Apple(){
        setName(“APPLE”);
    }
    @Override
    public void printDuty(){
        System.out.println(“Duty Not Exists.”);
    }
}
```
Apple클래스에서는 자기 자신의 품목명만을 설정한다. 이전 예제에서 overriding하던 printPrice()는 제거했다. printDuty()에 작성한 코드는 유지보수상에 문제가 있다. 이 부분에 대해서는 이 글의 뒤에서 수정하고자 한다.(“2) printDuty()를 Fruits에서 overriding할 경우 생길수 있는 문제점”)

이와 같이 Banana클래스도 작성해보면 아래와 같다.
```{.java}
public class Banana extends Fruits{
    public Banana(){
        setName(“BANANA”);
    }
    @Override
    public void printDuty(){
        System.out.println(“Duty Exists.”);
    }
}
```
Banana클래스에서는 자기자신의 품목명만을 설정한다. Banana클래스 역시 overriding하던 printPrice()를 제거했다. 오버라이딩한 printDuty()는 문제가 있다. printDuty()의 오버라이딩으로 인한 문제는 위에서 언급했듯이 이 글의 뒤에서 정리해보고자 한다.

다음은 main()로직이다.
```{.java}
public class Main{
    public static void main(String [] args){
        Fruits apple = new Apple();
        apple.setPrice(500);
        apple.printPrice();
        apple.printDuty();

        System.out.println();

        Fruits banana = new Banana();
        banana.setPrice(1000);
        banana.printPrice();
        banana.printDuty();
    }
}
```
출력결과
APPLE :: price == 500
Duty Not Exists.

BANANA :: price == 1000
Duty Exists.

printPrice()를 overriding하게 되어서, Apple, Banana클래스를 수정하고자 할때 Apple, Banana클래스 각각에 오버라이딩된 printPrice()를 모두 수정해야 해서 생기는 문제는 해결됐다.

##2) printDuty()를 Fruits클래스를 extends한 클래스에서 overriding할 경우 생길수 있는 문제점
하지만, printDuty()에 문제가 있다. 만약 Mango라는 클래스가 추가된다고 해보자. Mango도 관세를 출력해야 할 것이다. 따라서 Mango클래스 내부에도 관세를 출력하는 구문을 넣는다고 해보자. 물론 소규모 업데이트에는 이렇게 하는 것이 가능하다. 하지만, Mango뿐만이 아니라 뒤이어서 엄청난 업데이트(호두,잣,밤,포도,체리 등등)를 해야할 필요가 있다면…

물론 일일이 입력해줄수 있다. 하지만 또 입력해놓은 부분에 대해서 수정해달라는 요구사항이 발생한다면? 난감한 상황이 될 것이다. 이러한 문제를 해결할 수 있는 방법을 알아보자

##3) Strategy 패턴 - printDuty()를 Fruits클래스를 extends한 클래스에서 overriding할 경우 생길 수 있는 문제점에 대한 해결책
Strategy 패턴을 사용하면, 상위클래스에서 추가하고자 하는 행위를 setter등을 통해 정의함으로서 기능의 추가로 인한 여러소스들을 수정할 필요를 많이 줄여준다.이에 대해서는 solution.md에 정리해놓도록 해야 할 듯 하다.
