package ru.oop.task2;

/**
 * Объект, который может ехать
 */
public interface Drivable extends Positioned {

    /**
     * Едем до конечной точки, если мы можем добраться до неё
     *
     * @param position - Куда мы должны доехать
     * @param person - водитель
     * @return - точка, до которой удалось доехать
     */
    Position drive(Person person,Position position);
}