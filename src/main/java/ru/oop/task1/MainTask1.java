package ru.oop.task1;

/**
 * Задача: нужно добраться человеку на машине до заданного места.<br>
 * Но не всегда можно подъехать прямо к нужному месту, может понадобиться дойти пешком.<br>
 * Человек знает своё текущее местоположение (у него есть метод {@link Person#getPosition()}<br>
 * <p>
 * <ul>
 *   <li>Код не должен превышать 6 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(...)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask1 {

    /**
     * Переехать из текущего места в заданную точку
     * едем максимальное расстояние на машине, если не достигаем конечного результата, то идем пешком
     */
    public void moveTo(Person person, Position destination) {
        Drivable car = new Car(person, person.getPosition());
        Position pos = car.drive(person, destination);

        if (!pos.equals(destination)) {
            person.walk(destination);
        }

        assert person.getPosition() == destination;
    }
}
