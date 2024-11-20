package ru.oop.task3;

/**
 * Объект, который может ехать
 */
public interface Drivable extends Positioned {

    /**
     * Доезжаем до конечной точки, если мы можем добраться до неё
     *
     * @param position - Куда мы должны доехать
     * @param person - водитель
     * @return - точка, до которой удалось доехать
     */
    Position drive(Person person, Position position);
}