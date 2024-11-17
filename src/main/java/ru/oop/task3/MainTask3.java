package ru.oop.task3;

import java.util.List;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code List.of(new Car(person), new Bus("43", person),
 *        new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(...)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3 {

    /**
     * Переехать из текущего места в заданную точку, можно использовать несколько видов транспорта
     *
     * @see Person - тот, кто хочет добраться
     * @see Position - конечная точка
     * @see List<Drivable> - список трансопртов, которые нужно использовать, для того чтобы добраться до конечной точки
     */
    public void moveTo(Person person, Position destination, List<Drivable> transports){
        Position currentPosition = person.getPosition();

        for (Drivable transport : transports) {
            if (!person.getPosition().equals(transport.getPosition())) {
                person.walk(transport.getPosition());
            }

            currentPosition = transport.drive(person, destination);

            if (currentPosition.equals(destination))
                break;
        }

        if (!currentPosition.equals(destination)) {
            person.walk(destination);
        }

        assert person.getPosition().equals(destination);
    }
}
