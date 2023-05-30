# SoftWareEngineering
![SRP](https://github.com/CheongJuYUNSEONG/SoftWareEngineering/assets/122082360/84b9c261-52cf-42cf-8271-0cfb5ff04ba5)

SRP 단일 책임 원칙은 클래스를 변경해야 하는 이유는 단 하나여야 한다는 원칙으로 해당 코드에서 Car를 상속받은 전후모든 바퀴를 사용하는 클래스들이 상속받은 run 메서드만을 변경했다.
![OCP (1)](https://github.com/CheongJuYUNSEONG/SoftWareEngineering/assets/122082360/781633ce-9a6a-48c1-8bfb-2dda9b718367)

OCP 개방 폐쇄 원칙은 변경에는 닫혀 있어야 하고 확장에는 열려있어야 한다는 원칙으로 해당 코드에서 animal을 상속받은 객체들의 울음소리는 변경되지만 울음소리를 내는 방식은 hello로 폐쇄되어 변경되지 않는다.
![LSP](https://github.com/CheongJuYUNSEONG/SoftWareEngineering/assets/122082360/09598fc6-b86b-4d41-b139-0763ab25142b)


LSP 리스코프 교체 원칙은 상위클래스의 객체는 언제나 자신의 하위 클래스의 객체로 교체할 수 있어야 한다는 원칙으로 해당 코드에서 Lecturer_Before 클래스로 부터 상속받은 객체들에 값을 부여했을때 서로 다른 값을 출력한다. 이를 해결하기 위해서는 상위 클래스인 Lecturer 클래스를 추상 메소드로 변경해주면 된다.
![DIP](https://github.com/CheongJuYUNSEONG/SoftWareEngineering/assets/122082360/d93896b3-2823-4023-b1a0-16b63d536bf5)

DIP 의존관계 역전 원칙은 클라이언트는 구체 클래스가 아닌 추상클래스에 의존해야 한다는 원칙으로 해당 클래스를 보면 하위 클래스들이 상속받은 Games 상위 클래스가 추상 메서드로 만들어져 있는것을 확인 할 수 있다.
![ISP](https://github.com/CheongJuYUNSEONG/SoftWareEngineering/assets/122082360/1e145502-427d-4dfe-afee-1afbcc8ab331)

ISP 인터페이스 분리원칙은 클라이언트가 자신이 사용하지 않는 메서드와 의존관계를 맺으면 안된다는 원칙이다 그렇기 떄문에 해당 코드에서 S23은 call과 message만 상속받고 s21은 더 다양한 메서드를 상속받는다.
