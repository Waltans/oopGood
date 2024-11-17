# Задачи на понимание ООП

## Задача 1:
Нужно добраться человеку на машине до заданного места.<br>
Но не всегда можно подъехать прямо к нужному месту, может понадобиться дойти пешком.<br>
Человек знает своё текущее местоположение (у него есть метод <i>person.getPosition()</i>)<br>

* Код не должен превышать 6 строк
* Запрещено реализовывать конструкторы и методы, кроме `moveTo(...)`
* Запрещено добавлять новые методы в класс Main
* Запрещено использовать статические методы
* <b>Разрешено</b> создавать новые классы и интерфейсы

[Реализовать метод moveTo в классе MainTask1](src/main/java/ru/oop/task1/MainTask1.java)

## Задача 2:
Добраться человеку до заданного места.<br>
Притом он может поехать не только на машине, а на автобусе,
метро, велосипеде или любом другом виде транспорта.<br>
Транспорт может задаваться, например, как `new Car(person)` или `new Bus("43", person)` и т.п.<br>
Стоит учесть что до некоторых видов транспорта нужно дойти пешком.<br>
И не всегда можно подъехать прямо к нужному месту, может понадобиться дойти пешком.<br>
Человек знает своё текущее местоположение (у него есть метод Person.getPosition()<br>
<b>Подсказка</b>: появился интерфейс <i>Positioned</i>, его можно использовать для чего-то ещё
* Код не должен превышать 7 строк
* Запрещено реализовывать конструкторы и методы, кроме `moveTo(...)`
* Запрещено добавлять новые методы в класс Main
* Запрещено использовать статические методы
* <b>Разрешено</b> создавать новые классы и интерфейсы

[Реализовать метод moveTo в классе MainTask2](src/main/java/ru/oop/task2/MainTask2.java)

## Задача 3:
То же самое, что и задача 2, но добраться нужно с пересадками<br>
Можно определить транспортные средства списком:<br>
<code>List.of(new Car(person), new Bus("43", person), new Bus("50", person));</code>
* Код не должен превышать <b>12 строк</b>
* Запрещено реализовывать конструкторы и методы, кроме `moveTo(...)`
* Запрещено добавлять новые методы в класс Main
* Запрещено использовать статические методы
* <b>Разрешено</b> создавать новые классы и интерфейсы

[Реализовать метод moveTo в классе MainTask3](src/main/java/ru/oop/task3/MainTask3.java)#   o o p G o o d  
 